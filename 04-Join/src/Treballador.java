/* */

import java.util.Random;

public class Treballador extends Thread {
    // atributs
    private int sou_anual_brut;
    private int edat_actual;
    private int edat_inici_treball;
    private int edat_fi_treball;
    private float cobrat;
    private Random rnd;

    // constructor
    public Treballador(String nombre, int sou, int edat_fi, int edat_inici) {
        super(nombre);
        this.sou_anual_brut = sou;
        this.edat_fi_treball = edat_fi;
        this.edat_inici_treball = edat_inici;
        this.edat_actual = 0;
        this.cobrat = 0.0f;
        this.rnd = new Random();
    }

    public float getCobrat() { return this.cobrat; }
    public int getEdat() { return this.edat_actual; }

    public void cobra() { this.cobrat+=(this.sou_anual_brut / 12f); }

    public void pagaImpostos() {
        float impostos = (this.sou_anual_brut / 12f) * 0.24f; 
        this.cobrat-=impostos;
    }

    @Override
    public void run() {
        while(edat_actual!=edat_fi_treball) {   
            edat_actual++;
            if(edat_actual>=edat_inici_treball) {
                for(int i=0; i<12; i++) {
                    cobra();
                    espera();
                    pagaImpostos();
                    espera();
                }
            }
        }
        System.out.printf("%-10s -> edat: %d / total: %.2f%n", getName(), this.edat_actual, this.cobrat);
    }

    public void espera() {
        int espera = rnd.nextInt(10) + 1;
        try {
            Thread.sleep(espera);
        } catch(InterruptedException e) {}
    }
}