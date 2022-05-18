package Model;

import java.time.LocalDate;
import java.util.*;

public class AgentEntretien extends Personne {

    public AgentEntretien(String n, String p) {
        super(n, p);
    }

    public Vector<Intervention> listeInter = new Vector<Intervention>();

    public void addInter(LocalDate d, Chambre c) {
        listeInter.add(new Intervention(d, this, c));
    }

    public String getName() {
        return nom;
    }

    public String getFirstName() {
        return prenom;
    }

    public Vector<Intervention> getListe() {
        return listeInter;
    }
}