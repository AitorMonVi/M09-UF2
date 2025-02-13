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
            while (esquerra.getPropietari()!=-1) {
                try { wait(); }
                catch (InterruptedException e) {}
            }
        }

        agafaForquillaEsquerra();

        if (dreta.getPropietari()==-1) agafaForquillaDreta();
        else {
            deixarForquilles();
            System.out.printf("Filòsof: %s deixa l'esquerra(%d) i espera (dreta ocupada)%n", getName(), getNumeroEsquerra());
            return false;
        }

        return true;
    }

    public void agafaForquillaEsquerra() {
        synchronized (esquerra) {
            esquerra.setPropietari(numero);
        }
        System.out.printf("Filòsof: %s agafa la forquilla esquerra %d%n", getName(), getNumeroEsquerra());
    }

    public void agafaForquillaDreta() {
        synchronized (dreta) {
            dreta.setPropietari(numero);
        }
        System.out.printf("Filòsof: %s agafa la forquilla dreta %d%n", getName(), getNumeroDreta());
    }

    public void deixarForquilles() {
        synchronized (esquerra) {
            if (esquerra.getPropietari()==numero) {
                esquerra.setLliure();
                esquerra.notifyAll();
            }
        }
        synchronized (dreta) {
            if (dreta.getPropietari()==numero) {
                dreta.setLliure();
                dreta.notifyAll();
            }
        }
    }

}