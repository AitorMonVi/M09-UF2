# Comportament 1

El primer comportament iniciem els fils habenti asignat un nom
a cadacun i despres els comencem a executar.

El codi es el següent:

```
public class Principal {
    public static void main(String[] args) {
        Fil juan = new Fil("Juan");
        Fil pepe = new Fil("Pepe");

        juan.start();
        pepe.start();

        System.out.println("Termina thread main");
    }
}
```

Resultat de la execucio del codi:
```
Termina thread main
Juan 1
Juan 2
Juan 3
Juan 4
Juan 5
Pepe 1
Juan 6
Pepe 2
Pepe 3
Pepe 4
Pepe 5
Juan 7
Pepe 6
Pepe 7
Juan 8
Juan 9
Pepe 8
Pepe 9
Termina el fil Pepe
Termina el fil Juan
```

# Comportament 2

El segon comportament iniciem els fils habenti asignat un nom
a cadacun pero avanç d'inicialitzarlos els asignem diferents
prioritats per a que un dels dos rebi més recursos.

El codi es el següent:

```
public class Principal {
    public static void main(String[] args) {
        Fil juan = new Fil("Juan");
        Fil pepe = new Fil("Pepe");

        juan.setPriority(9);
        pepe.setPriority(1);

        juan.start();
        pepe.start();

        System.out.println("Termina thread main");
    }
}
```

Resultat de la execucio del codi:
```
Termina thread main
Juan 1
Pepe 1
Juan 2
Juan 3
Juan 4
Juan 5
Juan 6
Juan 7
Juan 8
Pepe 2
Pepe 3
Pepe 4
Pepe 5
Pepe 6
Juan 9
Pepe 7
Termina el fil Juan
Pepe 8
Pepe 9
Termina el fil Pepe
```

# Comportament 3

El tercer comportament iniciem els fils habenti asignat un nom
a cadacun pero els programem tal i que es vagin intercalant.

El codi es el següent:

```
public class Principal {
    public static void main(String[] args) {
        Fil juan = new Fil("Juan");
        Fil pepe = new Fil("Pepe");

        juan.start();
        pepe.start();

        System.out.println("Termina thread main");
    }
}
```
```
public class Fil extends Thread {
    public Fil(String name) {
        super(name);
    }
    
    public void run() {
        for(int i=1; i<=10; i++) {
            if(i==10) System.out.println("Termina el fil " + getName());
            else System.out.println(getName() + " " + i);
            try {
                sleep(1000);
            } catch (InterruptedException ignore) {}
        }
    }
}
```

Resultat de la execucio del codi:
```
Termina thread main
Pepe 1
Juan 1
Pepe 2
Juan 2
Pepe 3
Juan 3
Pepe 4
Juan 4
Juan 5
Pepe 5
Juan 6
Pepe 6
Juan 7
Pepe 7
Juan 8
Pepe 8
Pepe 9
Juan 9
Termina el fil Juan
Termina el fil Pepe
```