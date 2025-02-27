/* */

import java.util.Random;

public class Fumador extends Thread {
    // atributos
    private int id;
    private Tabac tabac;
    private Paper paper;
    private Llumi llumi;

    private Estanc estanc;
    private int fumades;
    private Random rnd;

    // constructor
    public Fumador(int id, Estanc estanc) {
        this.id = id;
        this.estanc = estanc;

        this.fumades = 0;
        this.rnd = new Random();
    }

    public void fuma() {
        if (tabac!=null && paper!=null && llumi!=null) {
            tabac = null;
            paper = null;
            llumi = null;
            // espera de 0,5s a 1s fumando
            try {
                Thread.sleep(rnd.nextLong(500, 1500));
            } catch (InterruptedException e) {}
            
            fumades++;

            System.out.printf("Fumador %d ha fumat %d vegades%n", id, fumades);
        }
    }

    public void compraTabac() {
        System.out.printf("Fumador %d comprant Tabac%n", id);

        Tabac tabac = null;
        synchronized (estanc) {
            while ((tabac = estanc.venTabac())==null) {
                // si no hay espera ha que vuelvan a subministrar
                try {
                    estanc.wait();
                } catch (InterruptedException e) {}                
            }
        }
        if (tabac!=null) this.tabac = tabac;
    }

    public void compraPaper() {
        System.out.printf("Fumador %d comprant Paper%n", id);

        Paper paper = null;
        synchronized (estanc) {
            while ((paper = estanc.venPaper())==null) {
                // si no hay espera ha que vuelvan a subministrar
                try {
                    estanc.wait();
                } catch (InterruptedException e) {}
            }
        }
        if (paper!=null) this.paper = paper;
    }

    public void compraLlumi() {
        System.out.printf("Fumador %d comprant Llumí%n", id);

        Llumi llumi = null;
        synchronized (estanc) {
            while ((llumi = estanc.venLlumi())==null) {
                // si no hay espera ha que vuelvan a subministrar
                try {
                    estanc.wait();
                } catch (InterruptedException e) {}
            }
        }
        if (llumi!=null) this.llumi = llumi;
    }

    // metodo de ejecucion
    public void run() {
        while (fumades<3) {
            compraTabac();
            compraPaper();
            compraLlumi();

            fuma();
        }
    }
}