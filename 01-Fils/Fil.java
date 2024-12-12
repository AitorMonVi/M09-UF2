/* */

public class Fil extends Thread {
    // creamos el constructor
    public Fil(String name) {
        super(name);
    }
    
    public void run() {
        for(int i=1; i<=10; i++) {
            if(i==10) System.out.println("Termina el fil " + getName());
            else System.out.println(getName() + " " + i);
            try {
                sleep(1000);
            } catch (InterruptedException ignore) {}
        }
    }
}