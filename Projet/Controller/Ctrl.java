package Controller;

import javax.management.modelmbean.ModelMBeanNotificationInfo;
import javax.swing.*;
import javax.swing.event.MouseInputListener;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;

import Model.Hotel;
import Model.Receptionniste;
import Model.Sejour;
import Model.Chambre;
import Model.Client;
import Model.Type;
import Vue.MainVue;

public class Ctrl implements ActionListener {

    // gestion Chambres
    public static void addChambreButtonClicked(ActionEvent e, Hotel h) {
        JFrame frame = new JFrame();
        int num = h.getVectorChambre().size() + 1;
        int etg = Integer
                .parseInt(JOptionPane.showInputDialog(frame, "Veuillez entrer le numéro d'étage sous forme numérique"));
        int prx = Integer.parseInt(JOptionPane.showInputDialog(frame, "Veuillez entrer le prix sous forme numérique"));
        Type t = null;
        String tString = "init";
        for (int i = 0; i != 1;) {
            tString = JOptionPane.showInputDialog(frame, "Veuillez entrer le type");
            if (tString.equals("NORMAL")) {
                i = 1;
                t = Type.valueOf("NORMAL");
            } else if (tString.equals("SIMPLE")) {
                i = 1;
                t = Type.valueOf("SIMPLE");
            } else if (tString.equals("DOUBLE")) {
                i = 1;
                t = Type.valueOf("DOUBLE");
            } else if (tString.equals("PRESIDENTIELLE")) {
                i = 1;
                t = Type.valueOf("PRESIDENTIELLE");
            } else
                JOptionPane.showMessageDialog(frame,
                        "le type entré n'est pas correct, veuillez écrire: NORMAL,SIMPLE,DOUBLE ou PRESIDENTIELLE");
        }
        h.addChambre(num, etg, prx, t);
        System.out.println(num + " " + etg + " " + prx + " " + t);
        for (int i = 0; i < h.getVectorChambre().size(); i++) {
            System.out.println(h.getVectorChambre().get(i));
        }
    }

    public static void modChambreButtonClicked(ActionEvent e, Hotel h) {
        JFrame frame = new JFrame();
        int mod = Integer.parseInt(JOptionPane.showInputDialog(frame,
                "Veuillez entrer le numéro de chambre que vous souhaitez modifier sous forme numérique")) - 1;
        Chambre c = h.getVectorChambre().get(mod);
        int prx = Integer
                .parseInt(JOptionPane.showInputDialog(frame, "Veuillez entrer le nouveau prix sous forme numérique"));
        Type t = null;
        String tString = "init";
        for (int i = 0; i != 1;) {
            tString = JOptionPane.showInputDialog(frame,
                    "Veuillez entrer le nouveau type parmi: NORMAL,SIMPLE,DOUBLE ou PRESIDENTIELLE");
            if (tString.equals("NORMAL")) {
                i = 1;
                t = Type.valueOf("NORMAL");
            } else if (tString.equals("SIMPLE")) {
                i = 1;
                t = Type.valueOf("SIMPLE");
            } else if (tString.equals("DOUBLE")) {
                i = 1;
                t = Type.valueOf("DOUBLE");
            } else if (tString.equals("PRESIDENTIELLE")) {
                i = 1;
                t = Type.valueOf("PRESIDENTIELLE");
            } else
                JOptionPane.showMessageDialog(frame,
                        "le type entré n'est pas correct, veuillez écrire: NORMAL,SIMPLE,DOUBLE ou PRESIDENTIELLE");
        }
        System.out.println(prx + " " + t);
        c.setPrix(prx);
        c.setType(t);
        System.out.println(h.getVectorChambre().get(mod).numero);
        System.out.println(h.getVectorChambre().get(mod).etage);
        System.out.println(h.getVectorChambre().get(mod).prix);
        System.out.println(h.getVectorChambre().get(mod).type);
    }

    // Gestion Clients
    public static void addClientButtonClicked(ActionEvent e, Hotel h) {
        JFrame frame = new JFrame();
        String n = JOptionPane.showInputDialog(frame, "Veuillez entrer le nom du nouveau client");
        String p = JOptionPane.showInputDialog(frame, "Veuillez entrer le prénom du nouveau client");
        h.addClient(n, p);
    }

    public static void delClientButtonClicked(ActionEvent e, Hotel h) {
        JFrame frame = new JFrame();
        String n = JOptionPane.showInputDialog(frame, "Veuillez entrer le  nom du  client à supprimer");
        String p = JOptionPane.showInputDialog(frame, "Veuillez entrer le  prénom du  client à supprimer");
        for (int i = 0; i < h.getVectorClient().size(); i++) {
            if (h.getVectorClient().get(i).nom.equals(n) && h.getVectorClient().get(i).prenom.equals(p)) {
                h.getVectorClient().remove(i);
                System.out.println("Client supprimé avec succès");
                JOptionPane.showMessageDialog(frame, "Client supprimé avec succès");
                break;
            } else if (i == h.getVectorClient().size() - 1) {
                System.out.println("Le client demandé n'existe pas et n'a donc pas été supprimé");
                JOptionPane.showMessageDialog(frame, "Le client demandé n'existe pas et n'a donc pas été supprimé");
            }
        }
    }

    // gestion Réceptionniste
    public static void addReceptionnisteButtonClicked(ActionEvent e, Hotel h) {
        JFrame frame = new JFrame();
        String n = JOptionPane.showInputDialog(frame, "Veuillez entrer le nom du nouveau réceptionniste");
        String p = JOptionPane.showInputDialog(frame, "Veuillez entrer le prénom du nouveau réceptionniste");
        h.addReceptionniste(n, p);
    }

    public static void delReceptionnisteButtonClicked(ActionEvent e, Hotel h) {
        JFrame frame = new JFrame();
        String n = JOptionPane.showInputDialog(frame, "Veuillez entrer le  nom du  réceptionniste à supprimer");
        String p = JOptionPane.showInputDialog(frame, "Veuillez entrer le  prénom du  réceptionniste à supprimer");
        for (int i = 0; i < h.getVectorReceptionniste().size(); i++) {
            if (h.getVectorReceptionniste().get(i).nom.equals(n)
                    && h.getVectorReceptionniste().get(i).prenom.equals(p)) {
                h.getVectorReceptionniste().remove(i);
                System.out.println("Réceptionniste supprimé avec succès");
                JOptionPane.showMessageDialog(frame, "Réceptionniste supprimé avec succès");
                break;
            } else if (i == h.getVectorReceptionniste().size() - 1) {
                System.out.println("Le réceptionniste demandé n'existe pas et n'a donc pas été supprimé");
                JOptionPane.showMessageDialog(frame,
                        "Le réceptionniste demandé n'existe pas et n'a donc pas été supprimé");
            }
        }
    }

    // gestion Agent d'entretien
    public static void addAgentButtonClicked(ActionEvent e, Hotel h) {
        JFrame frame = new JFrame();
        String n = JOptionPane.showInputDialog(frame, "Veuillez entrer le nom du nouvel Agent d'entretien");
        String p = JOptionPane.showInputDialog(frame, "Veuillez entrer le prénom du nouvel Agent d'entretien");
        h.addAgentEntretien(n, p);
    }

    public static void delAgentButtonClicked(ActionEvent e, Hotel h) {
        JFrame frame = new JFrame();
        String n = JOptionPane.showInputDialog(frame, "Veuillez entrer le  nom de l'agent d'entretien à supprimer");
        String p = JOptionPane.showInputDialog(frame, "Veuillez entrer le  prénom de l'agent d'entretien à supprimer");
        for (int i = 0; i < h.getVectorAgentEntretien().size(); i++) {
            if (h.getVectorAgentEntretien().get(i).nom.equals(n) && h.getVectorAgentEntretien().get(i).prenom.equals(p)) {
                h.getVectorAgentEntretien().remove(i);
                System.out.println("L'agent d'entretien supprimé avec succès");
                JOptionPane.showMessageDialog(frame, "L'agent d'entretien supprimé avec succès");
                break;
            } else if (i == h.getVectorAgentEntretien().size() - 1) {
                System.out.println("L'agent d'entretien demandé n'existe pas et n'a donc pas été supprimé");
                JOptionPane.showMessageDialog(frame,"L'agent d'entretien demandé n'existe pas et n'a donc pas été supprimé");
            }
        }
    }

    public static void addInterButtonClicked(ActionEvent e, Hotel h){
        JFrame frame = new JFrame();
        String n = JOptionPane.showInputDialog(frame, "Veuillez entrer le  nom de l'agent d'entretien");
        String p = JOptionPane.showInputDialog(frame, "Veuillez entrer le  prénom de l'agent d'entretien");
        for (int i = 0; i < h.getVectorAgentEntretien().size(); i++) {
            if (h.getVectorAgentEntretien().get(i).nom.equals(n) && h.getVectorAgentEntretien().get(i).prenom.equals(p)) {
               int a = Integer.parseInt(JOptionPane.showInputDialog(frame, "Veuillez entrer le numéro de la chambre")) -1;
               Chambre c = h.getVectorChambre().get(a);
               LocalDate dbt = LocalDate.parse(JOptionPane.showInputDialog(frame, "Veuillez entrer la date (année-mois-jour) de début du séjour sous ce format: 2020-01-08"));
               h.getVectorAgentEntretien().get(i).addInter(dbt, c);
                break;
            } else if (i == h.getVectorAgentEntretien().size() - 1) {
                System.out.println("L'agent d'entretien demandé n'existe pas ");
                JOptionPane.showMessageDialog(frame,"L'agent d'entretien demandé n'existe pas");
            }
        }
    }

    // gestion réservations
    public static void addReservationButtonClicked(ActionEvent e, Hotel h) {
        JFrame frame = new JFrame();
        int chambre = Integer.parseInt(JOptionPane.showInputDialog(frame,
                "Veuillez entrer le numéro de la chambre que vous souhaitez réserver"));
        Chambre c = h.getVectorChambre().get(chambre);
        String result;
        String receptionniste = JOptionPane.showInputDialog(frame, "Veuillez entrer le nom du réceptionniste");
        Receptionniste rcpst = null;
        for (int i = 0; i < h.getVectorReceptionniste().size(); i++) {
            if (h.getVectorReceptionniste().get(i).nom.equals(receptionniste)) {
                rcpst = h.getVectorReceptionniste().get(i);
                break;
            } else if (i == h.getVectorReceptionniste().size() - 1) {
                JOptionPane.showMessageDialog(frame, "Erreur le réceptionniste n'existe pas");
                return;
            }
        }
        String nClient = JOptionPane.showInputDialog(frame, "Veuillez entrer le nom du client");
        String pClient = JOptionPane.showInputDialog(frame, "Veuillez entrer le prénom du client");
        Client ct = null;
        for (int i = 0; i < h.getVectorClient().size(); i++) {
            if (h.getVectorClient().get(i).nom.equals(nClient) && h.getVectorClient().get(i).prenom.equals(pClient)) {
                ct = h.getVectorClient().get(i);
                break;
            } else if (i == h.getVectorReceptionniste().size() - 1) {
                JOptionPane.showMessageDialog(frame, "Erreur le client n'existe pas");
                return;
            }
        }
        LocalDate dbt = LocalDate.parse(JOptionPane.showInputDialog(frame,
                "Veuillez entrer la date (année-mois-jour) de début du séjour sous ce format: 2020-01-08"));
        LocalDate fn = LocalDate.parse(JOptionPane.showInputDialog(frame,
                "Veuillez entrer la date (année-mois-jour) de fin du séjour sous ce format: 2020-01-08"));
        result = c.addRes(dbt, fn, ct, rcpst);
        JOptionPane.showMessageDialog(frame, result);
    }

    public static void modReservationButtonClicked(ActionEvent e, Hotel h) {
        JFrame frame = new JFrame();
        String result;
        int chambre = Integer.parseInt(JOptionPane.showInputDialog(frame,
                "Veuillez entrer le numéro de la chambre pour laquelle vous souhaitez modifier la réservation"));
        Chambre c = h.getVectorChambre().get(chambre);
        LocalDate dbt = LocalDate.parse(JOptionPane.showInputDialog(frame,
                "Veuillez entrer la date (année-mois-jour) de début du séjour sous ce format: 2020-01-08"));
        LocalDate fn = LocalDate.parse(JOptionPane.showInputDialog(frame,
                "Veuillez entrer la date (année-mois-jour) de fin du séjour sous ce format: 2020-01-08"));
        for (int i = 0; i < c.listeRes.size(); i++) {
            if (c.listeRes.get(i).debut.equals(dbt) && c.listeRes.get(i).fin.equals(fn)) {
                JOptionPane.showMessageDialog(frame, "La réservation a bien été trouvé");
            } else if (i == c.listeRes.size() - 1) {
                JOptionPane.showMessageDialog(frame, "La réservation demandé n'existe pas");
                return;
            }
        }
        JOptionPane.showMessageDialog(frame, "Vous allez à présent procéder à la modification");
        dbt = LocalDate.parse(JOptionPane.showInputDialog(frame,
                "Veuillez entrer la date (année-mois-jour) de début du séjour sous ce format: 2020-01-08"));
        fn = LocalDate.parse(JOptionPane.showInputDialog(frame,
                "Veuillez entrer la date (année-mois-jour) de fin du séjour sous ce format: 2020-01-08"));

        String receptionniste = JOptionPane.showInputDialog(frame, "Veuillez entrer le nom du réceptionniste");
        Receptionniste rcpst = null;
        for (int i = 0; i < h.getVectorReceptionniste().size(); i++) {
            if (h.getVectorReceptionniste().get(i).nom.equals(receptionniste)) {
                rcpst = h.getVectorReceptionniste().get(i);
                break;
            } else if (i == h.getVectorReceptionniste().size() - 1) {
                JOptionPane.showMessageDialog(frame, "Erreur le réceptionniste n'existe pas");
                return;
            }
        }
        String nClient = JOptionPane.showInputDialog(frame, "Veuillez entrer le nom du client");
        String pClient = JOptionPane.showInputDialog(frame, "Veuillez entrer le prénom du client");
        Client ct = null;
        for (int i = 0; i < h.getVectorClient().size(); i++) {
            if (h.getVectorClient().get(i).nom.equals(nClient) && h.getVectorClient().get(i).prenom.equals(pClient)) {
                ct = h.getVectorClient().get(i);
                break;
            } else if (i == h.getVectorReceptionniste().size() - 1) {
                JOptionPane.showMessageDialog(frame, "Erreur le client n'existe pas");
                return;
            }
        }
        result = c.addRes(dbt, fn, ct, rcpst);
        JOptionPane.showMessageDialog(frame, result);
    }

    public static void delReservationButtonClicked(ActionEvent e, Hotel h) {
        JFrame frame = new JFrame();
        int chambre = Integer.parseInt(JOptionPane.showInputDialog(frame,
                "Veuillez entrer le numéro de la chambre pour laquelle vous souhaitez annuler une réservation"));
        Chambre c = h.getVectorChambre().get(chambre);
        LocalDate dbt = LocalDate.parse(JOptionPane.showInputDialog(frame,
                "Veuillez entrer la date (année-mois-jour) de début du séjour sous ce format: 2020-01-08"));
        LocalDate fn = LocalDate.parse(JOptionPane.showInputDialog(frame,
                "Veuillez entrer la date (année-mois-jour) de fin du séjour sous ce format: 2020-01-08"));
        String result = c.annulRes(dbt, fn);
        JOptionPane.showMessageDialog(frame, result);
    }

    // gestion séjour
    public static void addSejourButtonClicked(ActionEvent e, Hotel h) {

    }

    public static void addExtraButtonClicked(ActionEvent e, Hotel h) {

    }

    // rappel: facturation = (prix chambre * (fn-dbt)) + (parcourir le résultat de
    // Extra.getExtra()
    // et pour chaque indice faire (listeExtra[i].getPrix() * getQte)

    public static void factureButtonClicked(ActionEvent e, Hotel h) {

    }

    // nécessaire pour pas d'erreur mais inutile
    @Override
    public void actionPerformed(ActionEvent e) {

    }

}