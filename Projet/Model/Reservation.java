
import java.util.*;

public class Reservation {

    public Reservation(Date dbt, Date fn, Client ct, Sejour sej,Receptionniste rec,Chambre chb) {
        debut=dbt;
        fin=fn;
        clt=ct;
        sjr=sej;
        rcp=rec;
        chbr=chb;
        numero=chbr.numero;
    }

    public Date debut;

    public Date fin;

    public int numero;

    public Client clt;

    public Sejour sjr;

    public Receptionniste rcp;

    public Chambre chbr;

    public void setDebut() {

    }

    public void setFin() {

    }

    public void isfree(Date debut, Date fin) {

    }

    public void add(int numero, Date set_debut, Date set_fin) {

    }

    public void annulation() {

    }

    public void setNum() {

    }

}