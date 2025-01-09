/* */

public class Coet {
    private static boolean exit = false;
    private static Motor[] motores = new Motor[4];
    private static int potencia;

    private static void arranca() {
        System.out.println("Passant a potència " + potencia);
        for(Motor motor : motores) {
            if(!motor.isAlive()) motor.start();
        }
    } 

    public static void main(String[] args) throws Exception {
        for(int i=0; i<motores.length; i++) {
            motores[i] = new Motor("Motor "+i);
        }
        while(!exit) {
            try {potencia = Integer.parseInt(Entrada.readLine());} 
            catch(NumberFormatException e) { potencia = -1; }
            for(Motor motor : motores) {
                motor.setPotencia(potencia);
            }
            arranca();
            if(potencia == 0) exit = true;
        }
    }
}