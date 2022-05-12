package Model;
import java.util.*;

public class Produit {

    public Produit(String n, int prx, int qte) {
        nom = n;
        prix = prx;
        quantite = qte;
    }

    public String nom;
    public int prix, quantite;

    public Vector<Extra> listePdt = new Vector<Extra>();

}