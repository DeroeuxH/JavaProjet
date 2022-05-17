package Controller;

import javax.swing.*;
import javax.swing.event.MouseInputListener;

import java.awt.*;
import java.awt.event.*;
import Model.Hotel;
import Model.Chambre;
import Model.Type;
import Vue.MainVue;

public class Ctrl implements ActionListener {

    //gestion Chambres
    public static void addChambreButtonClicked(ActionEvent e, Hotel h){
        JFrame frame = new JFrame();
        int num = h.getVectorChambre().size()+1;
        int etg = Integer.parseInt(JOptionPane.showInputDialog(frame,"Veuillez entrer le numéro d'étage sous forme numérique"));
        int prx = Integer.parseInt(JOptionPane.showInputDialog(frame,"Veuillez entrer le prix sous forme numérique"));
        Type t = null;
        String tString = "init";
        for (int i =0; i!=1;) {
            tString = JOptionPane.showInputDialog(frame,"Veuillez entrer le type");
            if (tString.equals("NORMAL")) {i=1; t = Type.valueOf("NORMAL");}
            else if (tString.equals("SIMPLE")) {i=1;t = Type.valueOf("SIMPLE");}
            else if (tString.equals("DOUBLE")) {i=1;t = Type.valueOf("DOUBLE");}
            else if (tString.equals("PRESIDENTIELLE")) {i=1;t = Type.valueOf("PRESIDENTIELLE");}
            else JOptionPane.showMessageDialog(frame,"le type entré n'est pas correct, veuillez écrire: NORMAL,SIMPLE,DOUBLE ou PRESIDENTIELLE");
        }
        h.addChambre(num,etg,prx,t);
        System.out.println(num+" "+etg+" "+prx+" "+t);
        for (int i=0; i<h.getVectorChambre().size();i++){
            System.out.println(h.getVectorChambre().get(i));
        }
    }

    public static void modChambreButtonClicked(ActionEvent e, Hotel h){
        JFrame frame = new JFrame();
        int mod = Integer.parseInt(JOptionPane.showInputDialog(frame,"Veuillez entrer le numéro de chambre que vous souhaitez modifier sous forme numérique"))-1;
        Chambre c = h.getVectorChambre().get(mod);
        int prx = Integer.parseInt(JOptionPane.showInputDialog(frame,"Veuillez entrer le nouveau prix sous forme numérique"));
        Type t = null;
        String tString = "init";
        for (int i =0; i!=1;) {
            tString = JOptionPane.showInputDialog(frame,"Veuillez entrer le nouveau type parmi: NORMAL,SIMPLE,DOUBLE ou PRESIDENTIELLE");
            if (tString.equals("NORMAL")) {i=1; t = Type.valueOf("NORMAL");}
            else if (tString.equals("SIMPLE")) {i=1;t = Type.valueOf("SIMPLE");}
            else if (tString.equals("DOUBLE")) {i=1;t = Type.valueOf("DOUBLE");}
            else if (tString.equals("PRESIDENTIELLE")) {i=1;t = Type.valueOf("PRESIDENTIELLE");}
            else JOptionPane.showMessageDialog(frame,"le type entré n'est pas correct, veuillez écrire: NORMAL,SIMPLE,DOUBLE ou PRESIDENTIELLE");
        }
        System.out.println(prx+" "+t);
        c.setPrix(prx);
        c.setType(t);
        System.out.println(h.getVectorChambre().get(mod).numero);
        System.out.println(h.getVectorChambre().get(mod).etage);
        System.out.println(h.getVectorChambre().get(mod).prix);
        System.out.println(h.getVectorChambre().get(mod).type);
    }

    //Gestion Clients
    public static void addClientButtonClicked(ActionEvent e,Hotel h){
        JFrame frame = new JFrame();
        String n = JOptionPane.showInputDialog(frame,"Veuillez entrer le nom du nouveau client");
        String p = JOptionPane.showInputDialog(frame,"Veuillez entrer le prénom du nouveau client");
        h.addClient(n, p);
    }

    public static void delClientButtonClicked(ActionEvent e,Hotel h){
        JFrame frame = new JFrame();
        String n = JOptionPane.showInputDialog(frame,"Veuillez entrer le  nom du  client à supprimer");
        String p = JOptionPane.showInputDialog(frame,"Veuillez entrer le  prénom du  client à supprimer");
        for (int i=0; i<h.getVectorClient().size();i++){
            if (h.getVectorClient().get(i).nom.equals(n) && h.getVectorClient().get(i).prenom.equals(p)){
                h.getVectorClient().remove(i);
                System.out.println("Client supprimé avec succès");
                JOptionPane.showMessageDialog(frame,"Client supprimé avec succès");
                break;
            }
            else if (i == h.getVectorClient().size()-1){
                System.out.println("Le client demander n'a pas pû être supprimé");
                JOptionPane.showMessageDialog(frame,"Le client demander n'a pas pû être supprimé");
            }
        }
    }

    //gestion réservations
    public static void addReservationButtonClicked(ActionEvent e,Hotel h){

    }

    public static void modReservationButtonClicked(ActionEvent e,Hotel h){

    }

    //gestion séjour
    public static void addSejourButtonClicked(ActionEvent e,Hotel h){

    }

    public static void addExtraButtonClicked(ActionEvent e,Hotel h){

    }

    // rappel: facturation = (prix chambre * (fn-dbt)) + (parcourir le résultat de Extra.getExtra() 
    // et pour chaque indice faire (listeExtra[i].getPrix() * getQte)

    public static void factureButtonClicked(ActionEvent e){

    }


    //nécessaire pour pas d'erreur mais inutile
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}