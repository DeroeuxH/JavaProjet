package Model;

import java.time.*;

public class Reservation {

    public Reservation(LocalDate dbt, LocalDate fn, Client ct, Receptionniste rcpst, Chambre chb) {
        debut = dbt;
        fin = fn;
        clt = ct;
        rcp = rcpst;
        chbr = chb;
        numero = chbr.numero;
        
    }

    public LocalDate debut, fin;
    public int numero;
    public Client clt;
    public Receptionniste rcp;
    public Chambre chbr;

    public boolean isfree() { // parcours liste res
        for (int i = 0; i < chbr.listeRes.size(); i++) {
            LocalDate dbt = chbr.listeRes.get(i).debut;
            LocalDate fn = chbr.listeRes.get(i).fin;
            if (isIntersect(dbt, fn)) {
                return false;
            }
        }
        return true;
    }

    private boolean isIntersect(LocalDate dbt, LocalDate fn) { // verifie si intervale donné ne sont pas compatible
        if (dbt.isAfter(debut) && dbt.isBefore(fin))
            return true;
        if (fn.isAfter(debut) && fn.isBefore(fin))
            return true;
        if (debut.isAfter(dbt) && debut.isBefore(fn))
            return true;
        if (fin.isAfter(dbt) && fin.isBefore(fn))
            return true;
        return false;
    }

    public LocalDate getFin() {
        return fin;
    }

    public LocalDate getDeb() {
        return debut;
    }

    public int getNum() {
        return numero;
    }

    public Client getClient() {
        return clt;
    }

    public Receptionniste getReceptionniste() {
        return rcp;
    }

    public Chambre getChambre() {
        return chbr;
    }
}