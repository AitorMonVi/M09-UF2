/* */

import java.util.Random;

public class Barber extends Thread {
    // propiedades
    private Barberia barberia = Barberia.barberia;
    private Object condBarber = barberia.condBarber;
    private Random rnd;

    // constructor
    public Barber(String nombre) {
        super(nombre);
        this.rnd = new Random();
    }

    @Override
    public void run() {
        while (true) {
            Client client = barberia.seguentClient();
            if (client!=null) {
                System.out.printf("Li toca al client %s%n", client.getNombre());

                talla();
                client.tallarseElCabell();
            } else {
                System.out.printf("Ningú en espera%n");
                System.out.printf("Barber %s dormint%n", getName());

                synchronized(condBarber) {
                    try { condBarber.wait(); }
                    catch (InterruptedException e) {}
                }
            }
        }
    }

    public void talla() {
        long extra = rnd.nextLong(100);
        try {
            Thread.sleep(900 + extra);
        } catch (InterruptedException e) {}
    }
}