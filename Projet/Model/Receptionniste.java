package Model;
import java.util.*;

public class Receptionniste extends Personne {

    public Receptionniste(String n, String p) {
        super(n, p);
    }

    public Vector<Reservation> listeRes = new Vector<Reservation>();

    public void addRes() {
    }

}