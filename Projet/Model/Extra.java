package Model;

import java.util.*;

public class Extra {

    public Extra(Produit p, int qte) {
        nom = p.nom;
        quantite = qte;
    }

    public String nom;
    public int quantite;

    public Vector<Extra> listeExtra = new Vector<Extra>();

    public String getNom() {
        return nom;
    }

    public int getQte() {
        return quantite;
    }

    public Vector<Extra> getVectorExtra() {
        return listeExtra;
    }

}