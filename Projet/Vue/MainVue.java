package Vue;

import javax.swing.*;
import java.awt.*;
import Model.Hotel;
import Controller.Ctrl;

public class MainVue extends Ctrl {

    public static void main(String Args[]) {

        // Hotel de test
        Hotel hotel = new Hotel("chezmoi", "le bahut");
        // Chaque chambre sera approvisionné de 10qté
        // Pour chaque qté donné à extra, la supprimer de produit
        hotel.addProduit("Cola", 3, 1000);
        hotel.addProduit("Bière", 4, 10000);
        hotel.addProduit("Eau gazeuse", 2, 2000);
        // Hotel de test

        // Main Frame
        JFrame mainJFrame = new JFrame("Menu Principal");
        mainJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainJFrame.setSize(new Dimension(1280, 720));
        mainJFrame.setLocationRelativeTo(null);
        mainJFrame.setVisible(true);

        // MainPanel
        JPanel mainJPanel = (JPanel) mainJFrame.getContentPane();
        mainJPanel.setLayout(new GridLayout(0, 2, 5, 40));

        // Chambre
        JButton addChambreButton = new JButton("Ajouter Chambre");
        addChambreButton.addActionListener((e) -> addChambreButtonClicked(e, hotel));
        mainJPanel.add(addChambreButton);
        JButton modChambreButton = new JButton("Modifier Chambre");
        modChambreButton.addActionListener((e) -> modChambreButtonClicked(e, hotel));
        mainJPanel.add(modChambreButton);

        // Client
        JButton addClientButton = new JButton("Ajouter Client");
        addClientButton.addActionListener((e) -> addClientButtonClicked(e, hotel));
        mainJPanel.add(addClientButton);
        JButton delClientButton = new JButton("Supprimer Client");
        delClientButton.addActionListener((e) -> delClientButtonClicked(e, hotel));
        mainJPanel.add(delClientButton);

        // Receptionniste
        JButton addReceptionnisteButton = new JButton("Ajouter Réceptionniste");
        addReceptionnisteButton.addActionListener((e) -> addReceptionnisteButtonClicked(e, hotel));
        mainJPanel.add(addReceptionnisteButton);
        JButton delReceptionnisteButton = new JButton("Supprimer Réceptionniste");
        delReceptionnisteButton.addActionListener((e) -> delReceptionnisteButtonClicked(e, hotel));
        mainJPanel.add(delReceptionnisteButton);

        // Agent Entretien
        JButton addAgentButton = new JButton("Ajouter Agent d'entretien");
        addAgentButton.addActionListener((e) -> addAgentButtonClicked(e, hotel));
        mainJPanel.add(addAgentButton);
        JButton delAgentButton = new JButton("Supprimer Agent d'entretien");
        delAgentButton.addActionListener((e) -> delAgentButtonClicked(e, hotel));
        mainJPanel.add(delAgentButton);
        JButton addInterButton = new JButton("Ajouter Intervention pour Agent d'entretien");
        addInterButton.addActionListener((e) -> addInterButtonClicked(e, hotel));
        mainJPanel.add(addInterButton);

        // Reservation
        JButton addReservationButton = new JButton("Ajouter Réservation");
        addReservationButton.addActionListener((e) -> addReservationButtonClicked(e, hotel));
        mainJPanel.add(addReservationButton);
        JButton modReservationButton = new JButton("Modifier Réservation");
        modReservationButton.addActionListener((e) -> modReservationButtonClicked(e, hotel));
        mainJPanel.add(modReservationButton);
        JButton delReservationButton = new JButton("Supprimer Réservation");
        delReservationButton.addActionListener((e) -> delReservationButtonClicked(e, hotel));
        mainJPanel.add(delReservationButton);

        // Séjour
        JButton addSejourButton = new JButton("Ajouter Séjour");
        addSejourButton.addActionListener((e) -> addSejourButtonClicked(e, hotel));
        mainJPanel.add(addSejourButton);
        // Extra
        JButton addExtraButton = new JButton("Ajouter Extra");
        addExtraButton.addActionListener((e) -> addExtraButtonClicked(e, hotel));
        mainJPanel.add(addExtraButton);
        // Facturation
        JButton askFacturationButton = new JButton("Demander Facturation");
        askFacturationButton.addActionListener((e) -> factureButtonClicked(e, hotel));
        mainJPanel.add(askFacturationButton);
    }
}