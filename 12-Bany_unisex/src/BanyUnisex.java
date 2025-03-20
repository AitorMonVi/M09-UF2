/* */

import java.util.concurrent.locks.ReentrantLock;

public class BanyUnisex {
    // variables globales
    public static final int BANY_BUIT = 0;
    public static final int BANY_AMB_HOMES = 1;
    public static final int BANY_AMB_DONES = 2;
    
    public static final int CAPACITAT_MAX = 3;

    // propiedades
    private int estatActual;
    private int ocuapants;
    // TODO: añadir variable capacidad (semaforo)
    private ReentrantLock lockEstat;

    public void entraHome() {}

    public void surtHome() {}
    
    public void entraDona() {}

    public void surtDona() {}

    public static void main(String[] args) {
        BanyUnisex banyUnisex = new BanyUnisex();
        Home[] homes = new Home[5];
        Dona[] donas = new Dona[5];
        // cremos 5 hombre y 5 mujeres
        for (int i=0; i<5; i++) {
            homes[i] = new Home("Home-"+i, banyUnisex);
            donas[i] = new Dona("Dona-"+i, banyUnisex);
        }
        // los inicializamos
        for (int i=0; i<5; i++) {
            homes[i].start();
            donas[i].start();
        }
    }
}