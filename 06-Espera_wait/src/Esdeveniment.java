/* */

import java.util.ArrayList;

public class Esdeveniment {
    // propiedades
    private ArrayList<Assistent> assistents;
    private int placesDisponibles;

    public Esdeveniment(int places) {
        this.placesDisponibles = places;
        this.assistents = new ArrayList<Assistent>(places);
    }

    public Boolean placesLliures() {
        if (placesDisponibles>0) return true;
        else return false;
    }

    public void ferReserva(Assistent assistent) {
        assistents.add(assistent);
        placesDisponibles--;
        System.out.printf("%s ha fet una reserva. Places disponibles: %d%n", assistent.getName(), placesDisponibles);
    }

    public void cancelaReserva(Assistent assistent) {
        for(int i=0; i<assistents.size(); i++) {
            if(assistents.indexOf(assistent)!=-1) {
                assistents.remove(assistents.indexOf(assistent));
                placesDisponibles++;
                notifyAll();
                System.out.printf("%s ha cancel·lat una reserva. Places disponibles: %d%n", assistent.getName(), placesDisponibles);
            }
            else System.out.printf("%s no ha pogut cancel·lar una reserva inexistent. Places disponibles: %d%n", assistent.getName(), placesDisponibles);
        }
    }
}