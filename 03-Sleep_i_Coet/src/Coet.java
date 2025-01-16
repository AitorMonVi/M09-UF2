/* */

public class Coet {
    private static Motor[] motores = new Motor[4];

    public static void passaAPotencia(int p) throws Exception {
            if(p>10 || p<0) throw new Exception("Potencia no valida");
            else {
                for(Motor motor : motores) {
                    motor.setPotencia(p);
                }
            } 
    }

    private static void arranca() throws Exception {
        for(Motor motor : motores) {
            motor.start();
        }
    }

    private static boolean continua() {
        return motores[0].isAlive();
    }

    public static void main(String[] args) throws Exception {
        int potencia;
        try {potencia = Integer.parseInt(Entrada.readLine());} 
        catch(NumberFormatException e) { potencia = -1; }
        for(int i=0; i<motores.length; i++) {
            motores[i] = new Motor("Motor " + i, potencia);
        }
        // iniciamos los motores
        arranca();

        while(continua()) {
            try {potencia = Integer.parseInt(Entrada.readLine());} 
            catch(NumberFormatException e) { potencia = -1; }
            passaAPotencia(potencia);
            if(potencia==0) break;
        }
    }
}