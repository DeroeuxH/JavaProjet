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

    public LocalDate getDeb() {
        return debut;
    }

    public LocalDate getFin() {
        return fin;
    }

    public int getNum() {
        return numero;
    }

    public Reservation getRes() {
        return res;
    }

    public Vector<Extra> getExtra() {
        return listeExtra;
    }

}