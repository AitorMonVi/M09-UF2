/* */

import java.util.Random;

public class DormAleatori extends Thread {
    
    // atributos
    private long inici;
    private Random random;
    
    // constrcutor
    public DormAleatori(String nombre) {
        super(nombre);
        this.inici = System.currentTimeMillis();
        random = new Random();
    }

    public void run() {
        int intervalo;
        for(int i=0; i<10; i++) {
            intervalo = random.nextInt(1000) + 1;
            System.out.printf("%-4s (%d) a dormir %3dms total %4d%n", getName(), i, intervalo, (System.currentTimeMillis()-inici));
            try {
                sleep(intervalo);
            } catch (InterruptedException ignore) {}
        }
    }

    public static void main(String[] args) {
        DormAleatori joan = new DormAleatori("Joan");
        DormAleatori pep = new DormAleatori("Pep");

        joan.start();
        pep.start();

        System.out.println("-- Fi de main -----------");
    }

}