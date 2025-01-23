/* */

public class Associacio {
    // variables globales
    private static final int NUM_SOCIS = 1000;
    
    // propiedades
    private Soci[] socis = new Soci[NUM_SOCIS];

    // constructor
    public Associacio() {
        for(int i=0; i<socis.length; i++) {
            socis[i] = new Soci("Soci " + i);
        }
    }

    // metodos
    public void iniciaCompteTempsSocis() {
        for(int i=0; i<socis.length; i++) {
            socis[i].start();
        }
    }

    public void esperaPeriodeSocis()throws InterruptedException {
        for (Soci soci : socis) {
            soci.join();
        }
    }

    public void mostraBalancComptes() {
        System.out.println(Compte.getInstance().toString());
    }

    // main
    public static void main(String[] args) {
        Associacio associacio = new Associacio();
        
       try {
        associacio.iniciaCompteTempsSocis();
        
        associacio.esperaPeriodeSocis();

        associacio.mostraBalancComptes();
       } catch (Exception e) {
            e.printStackTrace();
       }
    }
}