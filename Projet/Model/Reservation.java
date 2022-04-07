
import java.util.*;

public class Reservation {

    public Reservation(Date dbt, Date fn, Client ct, Sejour sej, Receptionniste rec, Chambre chb) {
        if (isfree(dbt, fn) == true) {
            debut = dbt;
            fin = fn;
            clt = ct;
            sjr = sej;
            rcp = rec;
            chbr = chb;
            numero = chbr.numero;
        }
    }

    public Date debut, fin;
    public int numero;
    public Client clt;
    public Sejour sjr;
    public Receptionniste rcp;
    public Chambre chbr;

    public boolean isfree(Date dbt, Date fn) { // parcours liste res
        return false;
    }

    public void annulation() {

    }

    public boolean isIntersect(Date dbt, Date fn){ // verifie si intervale donné ne sont pas compatible yeah :)
        return false;
    }
}