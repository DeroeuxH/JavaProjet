package Model;

public class Produit {

    public Produit(String n, int prx, int qte) {
        nom = n;
        prix = prx;
        quantite = qte;
    }

    public String nom;
    public int prix, quantite;

    public String getName() {
        return nom;
    }

    public int getPrix() {
        return prix;
    }

    public int getQte() {
        return quantite;
    }
}