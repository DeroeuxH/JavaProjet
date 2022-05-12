package Model;
import java.util.*;

public class AgentEntretien extends Personne {

    public AgentEntretien(String n, String p) {
        super(n, p);
    }

    public Vector<Intervention> listeInter = new Vector<Intervention>();

    public void addInter() {

    }

}