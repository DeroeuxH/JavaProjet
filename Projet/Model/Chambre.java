package Model;
import java.util.*;
import java.time.*;

public class Chambre {

    public Chambre(String n, int num, int etg, int prx, Type typ) {
        nom = n;
        numero = num;
        etage = etg;
        prix = prx;
        type = typ;

    }

    String nom;
    public int numero, etage, prix;
    public Type type;
    public Vector<Reservation> listRes = new Vector<Reservation>();
    public Vector<Intervention> listeChambre = new Vector<Intervention>();

    public void addRes(LocalDate dbt, LocalDate fn, Client ct, Sejour sej, Receptionniste rcpst) {

        Reservation res = new Reservation(dbt, fn, ct, sej, rcpst, Chambre.this);
        res.isfree();
        listRes.add(res);
        ct.addRes(res);
    }

    public void annulRes(LocalDate dbt, LocalDate fn) {
        for (int i = 0; i < listRes.size(); i++) {
            if (listRes.get(i).debut.equals(dbt) && listRes.get(i).fin.equals(fn))
                listRes.remove(i);
        }
    }
}