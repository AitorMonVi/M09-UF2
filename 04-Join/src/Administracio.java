/* */

public class Administracio {
    // variables globales
    public static final int NUM_POBLACIO_ACTIVA = 50;
    private Treballador[] poblacio_activa = new Treballador[NUM_POBLACIO_ACTIVA];

    // constructor
    public Administracio() {
        for(int i=0; i<poblacio_activa.length; i++) {
            poblacio_activa[i] = new Treballador("Ciutadà "+i, 25000, 65, 20);
        }
    }

    public static void main(String[] args) {
        Administracio administracio = new Administracio();
        for(Treballador treballador : administracio.poblacio_activa) {
            treballador.start();
        }
        for(Treballador treballador : administracio.poblacio_activa) {
            try {
                treballador.join();
            } catch(InterruptedException e) {}
        }
    }
}