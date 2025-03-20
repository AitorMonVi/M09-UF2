/* */

public class Dona extends Thread {
    // propiedades
    private BanyUnisex bany;

    // constructor
    public Dona(String nombre, BanyUnisex bany) {
        super(nombre);
        this.bany = bany;
    }

    // metodo de ejecucion
    public void run() {
        // TODO: intentar entrar al lavabo
    }
}