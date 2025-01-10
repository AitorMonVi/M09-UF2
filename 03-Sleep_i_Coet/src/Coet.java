/* */

public class Coet {
    private static boolean exit = false;
    private static Motor[] motores = new Motor[4];
    private static int potencia;

    private static void arranca() throws Exception {
        System.out.println("Passant a potència " + potencia);
        for(int i = 0; i < motores.length; i++) {
            if (motores[i] != null && motores[i].isAlive()) motores[i].setPotencia(potencia);
            else {
                int actual = 0;
                if(motores[i]!=null) actual = motores[i].getPotencia();
                motores[i] = new Motor("Motor "+i);
                motores[i].setPotencia(potencia);
                motores[i].setPotenciaActual(actual);
                motores[i].start();
            }
        }
    } 

    public static void main(String[] args) throws Exception {
        while(!exit) {
            try {potencia = Integer.parseInt(Entrada.readLine());} 
            catch(NumberFormatException e) { potencia = -1; }
            arranca();
            if(potencia == 0) exit = true;
        }
    }
}