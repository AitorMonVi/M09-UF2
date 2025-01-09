/* */

import java.util.Random;

public class Motor extends Thread {
    
    // atributos
    private int pot_objectiu;
    private int pot_actual;
    private Random random;

    // constructor
    public Motor(String nombre) {
        super(nombre);
        this.pot_objectiu = 0;
        this.pot_actual = 0;
        this.random = new Random();
    }

    public void setPotencia(int p) throws Exception { 
        if(p>10 || p<0) throw new Exception("Potencia no valida");
        else this.pot_objectiu=p; 
    }

    public void run() {
        while(pot_actual!=pot_objectiu) {
            int espera = (random.nextInt(2) + 1) * 1000;
            if(pot_actual>pot_objectiu) {
                pot_actual--;
                System.out.printf("%s: Decre. Objectiu: %2d Actual: %2d%n", getName(), pot_objectiu, pot_actual);
                try {
                    sleep(espera);
                } catch (InterruptedException ignore) {}
            } else {
                pot_actual++;
                System.out.printf("%s: Incre. Objectiu: %2d Actual: %2d%n", getName(), pot_objectiu, pot_actual);
                try {
                    sleep(espera);
                } catch (InterruptedException ignore) {}
            }
        }
        System.out.printf("%s: FerRes. Objectiu: %2d Actual: %2d%n", getName(), pot_objectiu, pot_actual);
    }
}