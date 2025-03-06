/* */

public class Client {
    // atributos
    private String nombre;

    // constructor
    public Client(int id) {
        this.nombre = String.format("Client-%d", id);
    }

    public String getNombre() {return this.nombre; }

    public void tallarseElCabell() {
        System.out.printf("Tallant cabell a %s%n", nombre);
    }
}