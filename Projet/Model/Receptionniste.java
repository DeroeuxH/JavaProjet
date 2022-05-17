package Model;

import java.util.*;

public class Receptionniste extends Personne {

    public Receptionniste(String n, String p) {
        super(n, p);
    }

    public Vector<Reservation> listeRes = new Vector<Reservation>();

    public void addRes() {
    }

    public String getName() {
        return nom;
    }

    public String getFirstName() {
        return prenom;
    }

    public Vector<Reservation> getRes() {
        return listeRes;
    }

}