/* */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Estanc extends Thread {
    // atributos
    private List<Tabac> tabacs;
    private List<Paper> papers;
    private List<Llumi> llumis;

    private Random rnd;
    private boolean cont;

    public Estanc() {
        this.tabacs = new ArrayList<>();
        this.papers = new ArrayList<>();
        this.llumis = new ArrayList<>();

        this.rnd = new Random();
        this.cont = true;
    }

    public void nouSubministrament() {
        int material = rnd.nextInt(3);
        switch (material) {
            case 0 : { addTabac(new Tabac()); break; }
            case 1 : { addPaper(new Paper()); break; }
            case 2 : { addLlumi(new Llumi()); break; }
        }
    }

    // añaden un elemento a la lista
    public void addTabac(Tabac tabac) {
        System.out.println("Afegint Tabac");

        tabacs.add(tabac);
        synchronized (this) {
            notifyAll();
        }
    }

    public void addPaper(Paper paper) {
        System.out.println("Afegint Paper");

        papers.add(paper);
        synchronized (this) {
            notifyAll();
        }
    }

    public void addLlumi(Llumi llumi) {
        System.out.println("Afegint Llumí");
        
        llumis.add(llumi);
        synchronized (this) {
            notifyAll();
        }
    }

    // si existe un elemento en la lista lo quitan y lo devuelven
    public Tabac venTabac() {
        if (tabacs.size() != 0) {
            Tabac tabac = tabacs.get(tabacs.size()-1);
            tabacs.remove(tabacs.size()-1);
            // devolvemos el tabaco que hemos eliminado de la lista
            return tabac;
        } else return null;
    }

    public Paper venPaper() {
        if (papers.size() != 0) {
            Paper paper = papers.get(papers.size()-1);
            papers.remove(papers.size()-1);
            // devolvemos el papel que hemos eliminado de la lista
            return paper;
        } else return null;
    }

    public Llumi venLlumi() {
        if (llumis.size() != 0) {
            Llumi llumi = llumis.get(llumis.size()-1);
            llumis.remove(llumis.size()-1);
            // devolvemos la cerilla que hemos eliminado de la lista
            return llumi;
        } else return null;
    }

    // para el metodo de ejecucion
    public void tancarEstanc() {
        cont = false;
    }

    // metodo de ejecucion
    public void run() {
        System.out.println("Estanc obert");
        while (cont) {
            nouSubministrament();

            try {
                Thread.sleep(rnd.nextLong(500, 1500));
            } catch (InterruptedException e) {}
        }
        System.out.println("Estanc tancat");
    }
}