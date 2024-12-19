/* */

public class Futbolista extends Thread {
    // variables globales
    private static final int N_JUGADORES = 11;
    private static final int N_TIRADES = 11;
    private static final float PROBABILIDAD = 0.5f;

    // atributos
    private int ngols;
    private int ntirades;

    // constructor
    public Futbolista(String nombre) {
        super(nombre);
        this.ngols = 0;
        this.ntirades = 0;
    }

    public int getGols() { return ngols; }
    public int getTirades() { return ntirades; }

    public void run() {
        for(int i=0; i<N_TIRADES; i++) {
            if((float)Math.random() > PROBABILIDAD) this.ngols++;
            ntirades++;
        }
    }

    // metodos static
    public static void main(String[] args) {
        String[] nombres = {"Piqué", "Vinicius", "Torres", "Ramos", "Ronaldo", "Lewan", "Belli", "Arnau", "Aspas", "Messi", "Mbappé"};
        Futbolista[] futbolistas = new Futbolista[N_JUGADORES];
        for(int i=0; i<nombres.length; i++) {
            futbolistas[i] = new Futbolista(nombres[i]);
            futbolistas[i].start();
        }
        // mostramos estadisticas
        System.out.println("""
Inici dels xuts --------------------
Fi dels xuts -----------------------
--- Estadístiques ------""");
        for(Futbolista futbolista : futbolistas) {
            try {
                futbolista.join();
                System.out.println(futbolista.getName() + " -> " + futbolista.getGols() + " gols de " + futbolista.getTirades() + " tirades");
            } catch (InterruptedException e) {
                System.out.println("Error esperando a " + futbolista.getName());
            }
        }
    }
}