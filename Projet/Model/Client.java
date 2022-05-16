package Model;
import java.util.*;

public class Client extends Personne {

    public Client(String n, String p) {
        super(n, p);
    }

    public Vector<Reservation> listeRes = new Vector<Reservation>();

    public void addRes(Reservation r){
        listeRes.add(r);
    }

    public void supprRes(Reservation r) {
        listeRes.remove(r);
        r.chbr.annulRes(r.debut, r.fin);
    }

    public Client getClient(){
        return this;
    }

    public String getName(){
        return nom;
    }

    public String getFirstName(){
        return prenom;
    }

    public Vector<Reservation> getRes(){
        return listeRes;
    }

}