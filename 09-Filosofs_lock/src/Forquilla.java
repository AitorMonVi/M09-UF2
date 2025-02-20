/* */

import java.util.concurrent.locks.ReentrantLock;

public class Forquilla {
    // atributos
    private int numero;
    private ReentrantLock lock;

    // constructor
    public Forquilla(int numero) {
        this.numero = numero;
        this.lock = new ReentrantLock(true);
    }

    // getter y setter
    public int getNumero() { return this.numero; }

    public void agafar() {
        lock.lock();
    }

    public void deixar() {
        if (lock.isHeldByCurrentThread()) {
            lock.unlock();
        }
    }

}