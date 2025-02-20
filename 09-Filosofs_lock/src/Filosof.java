/* */

import java.util.Random;

public class Filosof extends Thread {
    // atributos
    private Forquilla dreta;
    private Forquilla esquerra;

    private long iniciGana;
    private long fiGana;
    private int gana;

    private Random random;

    // constructor
    public Filosof(int numero, String nombre, Forquilla dreta, Forquilla esquerra) {
        super(nombre);

        this.dreta = dreta;
        this.esquerra = esquerra;
        this.random = new Random();
    }

    // getter
    public int getNumeroDreta() { return dreta.getNumero(); }
    public int getNumeroEsquerra() { return esquerra.getNumero(); }

    // metodos clase
    public void menjar() {
        agafarForquilles();

        System.out.printf("Filòsof: %s menja amb gana %d%n", getName(), calcularGana());

        try {
            Thread.sleep(random.nextLong(1000, 2000));
        } catch (InterruptedException e) {}

        deixarForquilles();

        System.out.printf("Filòsof: %s ha acabat de menjar%n", getName());
    }

    public void pensar() {
        System.out.printf("Filòsof: %s pensant%n", getName());

        try {
            Thread.sleep(random.nextLong(1000, 2000));
        } catch (InterruptedException e) {}

        resetGana();
    }
    
    public void run() {
        resetGana();
        while (true) {
            menjar();
            pensar();
        }
    }

    // otros metodos
    public int calcularGana() {
        this.gana = (int) (this.fiGana - this.iniciGana) / 1000;
        return this.gana;
    }

    public void resetGana() {
        this.iniciGana = System.currentTimeMillis();
        this.gana = 0;
    }

    public void agafarForquilles() {
        agafaForquillaEsquerra();
        agafaForquillaDreta();

        this.fiGana = System.currentTimeMillis();

        System.out.printf("Filòsof: %s té forquilles esq(%d) dreta(%d)%n", getName(), getNumeroEsquerra(), getNumeroDreta());
    }

    public void agafaForquillaEsquerra() {
        esquerra.agafar();
    }

    public void agafaForquillaDreta() {
        dreta.agafar();
    }

    public void deixarForquilles() {
        dreta.deixar();
        esquerra.deixar();

        System.out.printf("Filòsof: %s deixa les forquilles%n", getName());
    }
}