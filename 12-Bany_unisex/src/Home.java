/* */

public class Home extends Thread {
    // propiedades
    private BanyUnisex bany;

    // constructor
    public Home(String nombre, BanyUnisex bany) {
        super(nombre);
        this.bany = bany;
    }
}