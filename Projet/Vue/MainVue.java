package Vue;

import javax.swing.*;

import org.w3c.dom.events.MouseEvent;

import java.awt.*;
import java.awt.event.*;
import Model.Chambre;
import Model.Hotel;
import Model.Type;
import Controller.Ctrl;

public class MainVue extends Ctrl {

    // Hotel de test
    Hotel hotel = new Hotel("chezmoi", "le bahut");

    // Main Frame
    JFrame mainJFrame = new JFrame("Menu Principal");
    // MainPanel
    JPanel mainJPanel = (JPanel) mainJFrame.getContentPane();
    // création des boutons
    JButton chambre = new JButton("Chambre");
    JButton reservation = new JButton("Reservation");
    JButton sejour = new JButton("Sejour");
    JButton client = new JButton("Client");
    JButton personnel = new JButton("Personnel");
    JButton retour = new JButton("Retour en arrière");

    public MainVue() {

        mainJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainJFrame.setSize(new Dimension(1280, 720));
        mainJFrame.setLocationRelativeTo(null);
        mainJFrame.setVisible(true);

        mainJPanel.setLayout(new GridLayout(5, 1, 5, 40));

        // Ajout des boutons au menu
        mainJPanel.add(client);
        mainJPanel.add(chambre);
        mainJPanel.add(reservation);
        mainJPanel.add(sejour);
        mainJPanel.add(personnel);
        // ajout des contrôleurs sur les boutons
        client.addActionListener((e) -> vueClient());
        chambre.addActionListener((e) -> vueChambre());
        reservation.addActionListener((e) -> vueReservation());
        sejour.addActionListener((e) -> vueSejour());
        personnel.addActionListener((e) -> vuePersonnel());
    }

    public void nouveauMenu() {
        mainJPanel.removeAll();
        mainJPanel.repaint();
        mainJPanel.revalidate();

        mainJPanel.setLayout(new GridLayout(5, 1, 5, 40));

        // Ajout des boutons au menu
        mainJPanel.add(client);
        mainJPanel.add(chambre);
        mainJPanel.add(reservation);
        mainJPanel.add(sejour);
        mainJPanel.add(personnel);
        // ajout des contrôleurs sur les boutons
        client.addActionListener((e) -> vueClient());
        chambre.addActionListener((e) -> vueChambre());
        reservation.addActionListener((e) -> vueReservation());
        sejour.addActionListener((e) -> vueSejour());
        personnel.addActionListener((e) -> vuePersonnel());
    }

    public void vueClient() {
        // reset du JPanel
        mainJPanel.removeAll();
        mainJPanel.repaint();
        mainJPanel.revalidate();
        mainJPanel.setLayout(new GridLayout(3, 1, 5, 40));
        //
        JButton addClientButton = new JButton("Ajouter Client");
        JButton delClientButton = new JButton("Supprimer Client");

        mainJPanel.add(addClientButton);
        mainJPanel.add(delClientButton);
        mainJPanel.add(retour);
        //
        addClientButton.addActionListener((e) -> addClientButtonClicked(e, hotel));
        delClientButton.addActionListener((e) -> delClientButtonClicked(e, hotel));
        retour.addActionListener((e) -> nouveauMenu());
    }

    public void vueChambre() {
        // reset du JPanel
        mainJPanel.removeAll();
        mainJPanel.repaint();
        mainJPanel.revalidate();
        mainJPanel.setLayout(new GridLayout(3, 1, 5, 40));
        //
        JButton addChambreButton = new JButton("Ajouter Chambre");
        JButton modChambreButton = new JButton("Modifier Chambre");
        //
        mainJPanel.add(addChambreButton);
        mainJPanel.add(modChambreButton);
        mainJPanel.add(retour);
        //
        addChambreButton.addActionListener((e) -> addChambreButtonClicked(e, hotel));
        modChambreButton.addActionListener((e) -> modChambreButtonClicked(e, hotel));
        retour.addActionListener((e) -> nouveauMenu());

    }

    public void vueReservation() {
        // reset du JPanel
        mainJPanel.removeAll();
        mainJPanel.repaint();
        mainJPanel.revalidate();
        mainJPanel.setLayout(new GridLayout(4, 1, 5, 40));

        // Reservation
        JButton addReservationButton = new JButton("Ajouter Réservation");
        JButton modReservationButton = new JButton("Modifier Réservation");
        JButton delReservationButton = new JButton("Supprimer Réservation");

        mainJPanel.add(addReservationButton);
        mainJPanel.add(modReservationButton);
        mainJPanel.add(delReservationButton);
        mainJPanel.add(retour);

        addReservationButton.addActionListener((e) -> addReservationButtonClicked(e, hotel));
        modReservationButton.addActionListener((e) -> modReservationButtonClicked(e, hotel));
        delReservationButton.addActionListener((e) -> delReservationButtonClicked(e, hotel));
        retour.addActionListener((e) -> nouveauMenu());

    }

    public void vueSejour() {
        // reset du JPanel
        mainJPanel.removeAll();
        mainJPanel.repaint();
        mainJPanel.revalidate();
        mainJPanel.setLayout(new GridLayout(4, 1, 5, 40));

        //
        JButton addSejourButton = new JButton("Ajouter Séjour");
        JButton addExtraButton = new JButton("Ajouter Extra");
        JButton askFacturatioButton = new JButton("Demander Facturation");

        mainJPanel.add(addSejourButton);
        mainJPanel.add(addExtraButton);
        mainJPanel.add(askFacturatioButton);
        mainJPanel.add(retour);

        addSejourButton.addActionListener((e) -> addSejourButtonClicked(e, hotel));
        addExtraButton.addActionListener((e) -> addExtraButtonClicked(e, hotel));
        askFacturatioButton.addActionListener((e) -> factureButtonClicked(e, hotel));
        retour.addActionListener((e) -> nouveauMenu());

    }

    public void vuePersonnel() {
        mainJPanel.removeAll();
        mainJPanel.repaint();
        mainJPanel.revalidate();
        mainJPanel.setLayout(new GridLayout(3, 1, 5, 40));

        JButton receptionniste = new JButton("Receptionniste");
        JButton agent = new JButton("Agent d'entretien");

        mainJPanel.add(receptionniste);
        mainJPanel.add(agent);
        mainJPanel.add(retour);

        receptionniste.addActionListener((e) -> vueReceptionniste());
        agent.addActionListener((e) -> vueAgent());
        retour.addActionListener((e) -> nouveauMenu());

    }

    public void vueReceptionniste() {
        mainJPanel.removeAll();
        mainJPanel.repaint();
        mainJPanel.revalidate();
        mainJPanel.setLayout(new GridLayout(3, 1, 5, 40));
        // 
        JButton addReceptionnisteButton = new JButton("Ajouter Réceptionniste");
        JButton delReceptionnisteButton = new JButton("Supprimer Réceptionniste");
        
        mainJPanel.add(addReceptionnisteButton);
        mainJPanel.add(delReceptionnisteButton);
        mainJPanel.add(retour);
        
        addReceptionnisteButton.addActionListener((e) -> addReceptionnisteButtonClicked(e, hotel));
        delReceptionnisteButton.addActionListener((e) -> delReceptionnisteButtonClicked(e, hotel));
        retour.addActionListener((e) -> vuePersonnel());

    }

    public void vueAgent() {
        mainJPanel.removeAll();
        mainJPanel.repaint();
        mainJPanel.revalidate();
        mainJPanel.setLayout(new GridLayout(4, 1, 5, 40));
        // 
        JButton addAgentButton = new JButton("Ajouter Agent d'entretien");
        JButton delAgentButton = new JButton("Supprimer Agent d'entretien");
        JButton addInterButton = new JButton("Ajouter une Intervention");
        
        mainJPanel.add(addAgentButton);
        mainJPanel.add(delAgentButton);
        mainJPanel.add(addInterButton);
        mainJPanel.add(retour);
        
        addAgentButton.addActionListener((e) -> addAgentButtonClicked(e, hotel));
        delAgentButton.addActionListener((e) -> delAgentButtonClicked(e, hotel));
        addInterButton.addActionListener((e) -> addInterButtonClicked(e, hotel));
        retour.addActionListener((e) -> vuePersonnel());

    }

    public static void main(String Args[]) {
        new MainVue();
    }
}