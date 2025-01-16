/* */

import java.util.Random;

public class Motor extends Thread {
    
    // atributos
    private int pot_objectiu;
    private int pot_actual;
    private Random random;

    // constructor
    public Motor(String nombre, int potencia) {
        super(nombre);
        this.pot_objectiu = potencia;
        this.pot_actual = 0;
        this.random = new Random();
    }

    public void setPotencia(int p) throws Exception { 
        if(p>10 || p<0) throw new Exception("Potencia no valida");
        else this.pot_objectiu=p; 
    }

    public void run() {
        while(true) {
            while(pot_actual!=pot_objectiu) {
                if(pot_actual>pot_objectiu) decrementa(); 
                else if(pot_actual<pot_objectiu) incrementa();
            }
            if(pot_actual==0) break;
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignore) {}
        }
    }

    public void incrementa() {
        int espera = (random.nextInt(2) + 1) * 1000;
        // modificamos
        pot_actual++;
        if(pot_actual==pot_objectiu) System.out.printf("%s: FerRes. Objectiu: %2d Actual: %2d%n", getName(), pot_objectiu, pot_actual);
        else System.out.printf("%s: Incre. Objectiu: %2d Actual: %2d%n", getName(), pot_objectiu, pot_actual);
        try {
        sleep(espera);
        } catch (InterruptedException ignore) {}
    }

    public void decrementa() {
        int espera = (random.nextInt(2) + 1) * 1000;
        // modificamos
        pot_actual--;
        if(pot_actual==pot_objectiu) System.out.printf("%s: FerRes. Objectiu: %2d Actual: %2d%n", getName(), pot_objectiu, pot_actual);
        else System.out.printf("%s: Decre. Objectiu: %2d Actual: %2d%n", getName(), pot_objectiu, pot_actual);
        try {
        sleep(espera);
        } catch (InterruptedException ignore) {}
    }
}