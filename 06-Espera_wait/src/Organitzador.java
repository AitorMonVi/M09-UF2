/* */

public class Organitzador {
    // variables globales
    private static Esdeveniment esdeveniment = new Esdeveniment(5);
    private static Assistent[] assistents = new Assistent[10];
    
    public static void iniciaAssistent() {
        for(int i=0; i<assistents.length; i++) {
            assistents[i] = new Assistent("Assistent-"+i, esdeveniment);
        }
    }
    public static void main(String[] args) {
        iniciaAssistent();

        for(int i=0; i<assistents.length; i++) {
            assistents[i].start();
        }
    }
}