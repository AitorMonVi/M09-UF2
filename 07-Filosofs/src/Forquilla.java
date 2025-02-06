/* */

public class Forquilla {
    // atributos
    private int numero;
    private boolean enUs;

    // constructor
    public Forquilla(int numero) {
        setNumero(numero);
        setEnUs(false);
    }

    // getter y setter
    public int getNumero() { return this.numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public boolean getEnUs() { return this.enUs; }
    public void setEnUs(boolean canvi) { this.enUs = canvi; }
}
