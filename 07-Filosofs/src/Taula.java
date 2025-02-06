/* */

public class Taula {
    // atributos
    private Filosof[] filosofs;
    private Forquilla[] forquillas;

    // constructor
    public Taula(int comensals) {
        this.filosofs = new Filosof[comensals];
        this.forquillas = new Forquilla[comensals];

        for (int i=0; i<forquillas.length; i++) {
            this.forquillas[i] = new Forquilla(i);
        }

        for (int i=0; i<filosofs.length; i++) {
            String nombre = "fil" + i;

            Forquilla esquerra = this.forquillas[i];
            Forquilla dreta;
            if (i == (filosofs.length - 1)) dreta = this.forquillas[0];
            else dreta = this.forquillas[i+1];

            this.filosofs[i] = new Filosof(nombre, dreta, esquerra);
        }
    }

    public void showTaula() {
        for (Filosof filosof : filosofs) {
            System.out.printf("Comensal: %s esq:%d dret:%d%n", filosof.getName(), filosof.getNumeroEsquerra(), filosof.getNumeroDreta());
        }
        System.out.println("------------------------------");
    }

    public void cridarATaula() {
        for (int i=0; i<filosofs.length; i++) {
            filosofs[i].start();;
        }
    }

    // main
    public static void main(String[] args) {
        Taula taula = new Taula(4);

        taula.showTaula();
        taula.cridarATaula();
    }
}