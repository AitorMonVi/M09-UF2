/* */

import java.util.Random;

public class Filosof extends Thread {
    // atributos
    private int numero;
    private Forquilla dreta;
    private Forquilla esquerra;

    private int gana;
    private Random random;

    // constructor
    public Filosof(int numero, String nombre, Forquilla dreta, Forquilla esquerra) {
        super(nombre);

        this.numero = numero;
        this.dreta = dreta;
        this.esquerra = esquerra;
        this.gana = 0;
        this.random = new Random();
    }

    // getter
    public int getNumeroDreta() { return dreta.getNumero(); }
    public int getNumeroEsquerra() { return esquerra.getNumero(); }

    // metodos clase
    public void menjar() {
        while (!agafarForquilles()) {
            gana();
        }

        System.out.printf("Filòsof: %s menja%n", getName());

        try {
            Thread.sleep(random.nextLong(1000, 2000));
        } catch (InterruptedException e) {}
        
        this.gana = 0;

        deixarForquilles();

        System.out.printf("Filòsof: %s ha acabat de menjar%n", getName());
    }

    public void pensar() {
        System.out.printf("Filòsof: %s pensant%n", getName());

        try {
            Thread.sleep(random.nextLong(1000, 2000));
        } catch (InterruptedException e) {}
    }
    
    public void run() {
        while (true) {
            menjar();

            pensar();
        }
    }

    // otros metodos
    public void gana() {
        // espera 0.5s a 1s
        try {
            Thread.sleep(random.nextLong(500, 1000));
        } catch (InterruptedException e) {}

        gana++;

        System.out.printf("Filòsof: %s gana=%d%n", getName(), gana);
    }

    public boolean agafarForquilles() {
        synchronized (this) {
            while (!agafaForquillaEsquerra()) {
                try { wait(); }
                catch (InterruptedException e) {}
            }
        }

        if (!agafaForquillaDreta()) {
            deixarForquillaEsquerra();
            System.out.printf("Filòsof: %s deixa l'esquerra(%d) i espera (dreta ocupada)%n", getName(), getNumeroEsquerra());
            return false;
        }

        return true;
    }

    public boolean agafaForquillaEsquerra() {
        synchronized (esquerra) {
            if (esquerra.getPropietari()==-1) {
                esquerra.setPropietari(numero);
                System.out.printf("Filòsof: %s agafa la forquilla esquerra %d%n", getName(), getNumeroEsquerra());
                return true;
            }
        }
        return false;
    }

    public boolean agafaForquillaDreta() {
        synchronized (dreta) {
            if (dreta.getPropietari()==-1) {
                dreta.setPropietari(numero);
                System.out.printf("Filòsof: %s agafa la forquilla dreta %d%n", getName(), getNumeroDreta());
                return true;
            }
        }
        return false;
    }

    public void deixarForquillaEsquerra() {
        synchronized (esquerra) {
            if (esquerra.getPropietari()==numero) {
                esquerra.setLliure();
            }
        }
    }

    public void deixarForquillaDreta() {
        synchronized (dreta) {
            if (dreta.getPropietari()==numero) {
                dreta.setLliure();
            }
        }
    }

    public void deixarForquilles() {
        deixarForquillaEsquerra();
        deixarForquillaDreta();
    }

}