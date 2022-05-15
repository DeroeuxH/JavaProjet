package Model;
import java.util.*;

public class Extra {

    public Extra(int qte, Sejour sej) {
        quantite = qte;
        sjr = sej;
    }

    public int quantite;
    public Sejour sjr;

    public Vector<Produit> listeExtra = new Vector<Produit>();

    public void addPdt(Produit p) {
        listeExtra.add(p);
    }

}