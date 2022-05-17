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
        return listRes;
    }

    public void setNum(int x){
        numero=x;
    }
    public void setEtg(int x){
        etage=x;
    }
    public void setPrix(int x){
        prix=x;
    }
    public void setType(Type x){
        type=x;
    }
}