/* */

import java.util.Random;

public class Assistent extends Thread {
    // propiedades
    private Esdeveniment esdeveniment;
    private Random random;

    public Assistent(String nombre, Esdeveniment esdeveniment) {
        super(nombre);
        this.esdeveniment = esdeveniment;
        this.random = new Random();
    }

    public void run() {
        while (true) {
            if (random.nextInt(100)>=49) {
                synchronized (this) {
                    while (!esdeveniment.placesLliures()) {
                        try { wait(); }
                        catch (InterruptedException e) {}
                    }
                }

                synchronized (esdeveniment) {
                    esdeveniment.ferReserva(this);
                }
            } else {
                synchronized (esdeveniment) {
                    esdeveniment.cancelaReserva(this);
                }
            }
            try { sleep(random.nextInt(1000)); }
            catch (InterruptedException e) {}
        }
    }
}