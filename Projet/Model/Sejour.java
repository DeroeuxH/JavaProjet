package Model;
import java.time.*;
import java.util.*;

public class Sejour {

    public Sejour(Reservation rsv) {
        res = rsv;
        debut = res.debut;
        fin = res.fin;
        numero = res.numero;
    }

    public LocalDate debut, fin;
    public int numero;
    public Reservation res;
    public Vector<Extra> listeExtra = new Vector<Extra>();

    public void addSjr() {

    }

}