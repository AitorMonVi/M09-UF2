/* */

public class Forquilla {
    // atributos
    private int numero;
    private int propietari;
    
    private final int LLIURE = -1;

    // constructor
    public Forquilla(int numero) {
        setNumero(numero);
        setPropietari(LLIURE);
    }

    // getter y setter
    public int getNumero() { return this.numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public int getPropietari() { return this.propietari; }
    public void setPropietari(int propietari) { this.propietari = propietari; }

    public void setLliure() { this.propietari = LLIURE; }

}
