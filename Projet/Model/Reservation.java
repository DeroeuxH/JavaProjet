import java.util.*;
import java.time.*;

public class Reservation {

    public Reservation(LocalDate dbt, LocalDate fn, Client ct, Sejour sej, Receptionniste rec, Chambre chb) {
        if (isfree() == true) {
            debut = dbt;
            fin = fn;
            clt = ct;
            sjr = sej;
            rcp = rec;
            chbr = chb;
            numero = chbr.numero;
        }
    }

    public LocalDate debut, fin;
    public int numero;
    public Client clt;
    public Sejour sjr;
    public Receptionniste rcp;
    public Chambre chbr;

    public boolean isfree() { // parcours liste res
        for (int i = 0; i < chbr.listRes.size(); i++) {
            LocalDate dbt = chbr.listRes.get(i).debut;
            LocalDate fn = chbr.listRes.get(i).fin;
            if (isIntersect(dbt, fn) == true) {
                return false;
            }
        }
        return true;
    }

    public void annulation() {

    }

    public boolean isIntersect(LocalDate dbt, LocalDate fn) { // verifie si intervale donné ne sont pas compatible yeah
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
}