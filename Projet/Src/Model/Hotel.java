package Model;

import java.util.*;

public class Hotel {
    String adress, nom;
    Vector<Client> listeClient = new Vector<Client>();
    Vector<Chambre> listeChambre = new Vector<Chambre>();
    Vector<AgentEntretien> listeAgeEnt = new Vector<AgentEntretien>();
    Vector<Receptionniste> listeRcpst = new Vector<Receptionniste>();
    Vector<Produit> listeProduit = new Vector<Produit>();

    public Hotel(String adr, String n) {
        adress = adr;
        nom = n;
    }

    public void addChambre(int num, int etg, int prx, Type typ) {
        listeChambre.add(new Chambre(num, etg, prx, typ));
    }

    public void addClient(String n, String p) {
        listeClient.add(new Client(n, p));
    }

    public void addAgentEntretien(String n, String p) {
        listeAgeEnt.add(new AgentEntretien(n, p));
    }

    public void addReceptionniste(String n, String p) {
        listeRcpst.add(new Receptionniste(n, p));
    }

    public void addProduit(String n, int prx, int qte) {
        listeProduit.add(new Produit(n, prx, qte));
    }

    public Hotel getHotel() {
        return this;
    }

    public Vector<Client> getVectorClient() {
        return listeClient;
    }

    public Vector<Chambre> getVectorChambre() {
        return listeChambre;
    }

    public Vector<AgentEntretien> getVectorAgentEntretien() {
        return listeAgeEnt;
    }

    public Vector<Receptionniste> getVectorReceptionniste() {
        return listeRcpst;
    }

    public Vector<Produit> getVectorProduit() {
        return listeProduit;
    }
}