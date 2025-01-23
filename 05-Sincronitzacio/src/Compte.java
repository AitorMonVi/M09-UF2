/* */

public class Compte {
    private static Compte compte;
    // propiedades
    private float saldo;

    // constructor
    private Compte() {}

    @Override
    public String toString() {
        return String.format("Saldo: %.2f", saldo);
    }

    // getter y setter
    public float getSaldo() { return this.saldo; }

    public void setSaldo(float saldo) { this.saldo = saldo; }

    public static Compte getInstance() { 
        if(compte == null) compte = new Compte();
        return compte;
    }
}