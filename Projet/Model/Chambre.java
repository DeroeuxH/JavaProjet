package Model;

import java.util.*;
import java.time.*;

public class Chambre {

    public Chambre() {
        numero = 0;
        etage = 0;
        prix = 0;
        type = Type.NORMAL;

    }

    public Chambre(int num, int etg, int prx, Type typ) {
        numero = num;
        etage = etg;
        prix = prx;
        type = typ;

    }

    public int numero, etage, prix;
    public Type type;
    public Vector<Reservation> listeRes = new Vector<Reservation>();
    public Vector<Intervention> listeChambre = new Vector<Intervention>();

    public String addRes(LocalDate dbt, LocalDate fn, Client ct, Receptionniste rcpst) {

        Reservation res = new Reservation(dbt, fn, ct, rcpst, this);
        if (res.isfree()) {
            listeRes.add(res);
            ct.addRes(res);
            rcpst.addRes(res);
            return "Réservation créé";
        } else
            return "Echec création de réservation: la chambre n'est pas libre pour la date demandé";
    }

    public String annulRes(LocalDate dbt, LocalDate fn) {
        for (int i = 0; i < listeRes.size(); i++) {
            if (listeRes.get(i).debut.equals(dbt) && listeRes.get(i).fin.equals(fn)) {
                listeRes.remove(i);
                return "Réservation supprimée";
            }
        }
        return "Echec de suppression de réservation: aucune réservation correspondant à la date trouvé";
    }

    public int getNum() {
        return numero;
    }

    public int getEtg() {
        return etage;
    }

    public int getPrix() {
        return prix;
    }

    public Type getType() {
        return type;
    }

    public Vector<Intervention> getInter() {
        return listeChambre;
    }

    public Vector<Reservation> getRes() {
        return listeRes;
    }

    public void setNum(int x) {
        numero = x;
    }

    public void setEtg(int x) {
        etage = x;
    }

    public void setPrix(int x) {
        prix = x;
    }

    public void setType(Type x) {
        type = x;
    }
}