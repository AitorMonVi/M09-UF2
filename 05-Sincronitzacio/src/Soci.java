/* */

import java.util.Random;

public class Soci extends Thread {
    // variables globales
    private static final float APORTACIO = 10f;
    private static final int ESPERA_MAX = 100; 
    private static final int MAX_ANYS = 10; 

    // propiedades
    private Compte compte;
    private Random random;

    // constructor
    public Soci(String nombre) {
        super(nombre);
        this.compte = Compte.getInstance();
        this.random = new Random();
    }

    // getter y setter
    public Compte getCompte() { return this.compte; }

    // metodo ejecucion
    public void run() {
        for (int j=0; j<MAX_ANYS; j++) {
            for (int i=0; i<12; i++) {
                if (i%2==0) {
                    compte.setSaldo(compte.getSaldo() + APORTACIO);
                }
                else {
                    compte.setSaldo(compte.getSaldo() - APORTACIO);
                }
                // esperamos
                try { sleep(random.nextInt(ESPERA_MAX)); }
                catch (InterruptedException ignore) {}
            }
        }
    }
}