
import java.util.*;

public class Sejour {

    public Sejour(Reservation rsv) {
        res = rsv;
        debut = res.debut;
        fin = res.fin;
        numero = res.numero;
    }

    public Date debut;

    public Date fin;

    public int numero;

    public Reservation res;

    public Vector<Extra> listeExtra = new Vector<Extra>();

    public void addSjr() {

    }

}