/* */

import java.util.Random;

public class Filosof extends Thread {
    // atributos
    private Forquilla dreta;
    private Forquilla esquerra;

    private int gana;
    private Random random;

    // constructor
    public Filosof(String nombre, Forquilla dreta, Forquilla esquerra) {
        super(nombre);

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
        while (true) {
            // intenta coger la forquilla izquirda
            if (!esquerra.getEnUs()) {
                esquerra.setEnUs(true);
                System.out.printf("Filòsof: %s agafa la forquilla esquerra %d%n", getName(), getNumeroEsquerra());

                // como hemos cogido la izquierda intentamos coger la derecha
                if (!dreta.getEnUs()) {
                    dreta.setEnUs(true);
                    System.out.printf("Filòsof: %s agafa la forquilla dreta %d%n", getName(), getNumeroDreta());

                    // come de 1s a 2s
                    System.out.printf("Filòsof: %s menja%n", getName());

                    try {
                        Thread.sleep(random.nextLong(1000, 2000));
                    } catch (InterruptedException e) {}
                    
                    this.gana = 0;

                    dreta.setEnUs(false);
                    esquerra.setEnUs(false);

                    System.out.printf("Filòsof: %s ha acabat de menjar%n", getName());

                    break;                    
                } else {
                    esquerra.setEnUs(false);

                    System.out.printf("Filòsof: %s deixa l'esquerra(%d) i espera (dreta ocupada)%n", getName(), getNumeroEsquerra());

                    gana();
                }
    
            } else gana();
        }
    }

    public void gana() {
        // espera 0.5s a 1s
        try {
            Thread.sleep(random.nextLong(500, 1000));
        } catch (InterruptedException e) {}

        gana++;

        System.out.printf("Filòsof: %s gana=%d%n", getName(), gana);
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
}
