/* */

import java.util.LinkedList;

public class Barberia extends Thread {
    // variables globales
    public static Barberia barberia;

    // propiedades
    private LinkedList<Client> salaEspera;
    private int maxCadires;
    public final Object condBarber = new Object();

    // constructor
    public Barberia(int cadires) {
        super();

        this.maxCadires = cadires;
        this.salaEspera = new LinkedList<>();
    }

    public Client seguentClient() {
        if (salaEspera.size() == 0) return null;
        // guardamos el primero
        Client client = salaEspera.get(0);
        salaEspera.remove(0);

        // despues de sacarlo de la lista lo devolemos
        return client;
    }

    public void entrarClient(Client client) {
        if (salaEspera.size() <= maxCadires) {
            salaEspera.add(client);

            System.out.printf("Client %s en espera%n", client.getNombre());
            synchronized(condBarber) {
                condBarber.notifyAll();
            }
        } else System.out.printf("No queden cadires, client %s se'n va%n", client.getNombre());
    }

    public void run() {
        int id = 1;
        for(int j=0; j<2; j++) {
            for(int i=0; i<10; i++) {
                entrarClient(new Client(id));
                try { Thread.sleep(500); }
                catch (InterruptedException e) {}

                // aumentamos el id
                id++;
            }
            // esperamos 10s antes de dejar entrar mas clientes
            try { Thread.sleep(10000); }
            catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) {
        barberia = new Barberia(3);
        Barber barber = new Barber("Pepe");

        barber.start();
        barberia.start();
    }
}