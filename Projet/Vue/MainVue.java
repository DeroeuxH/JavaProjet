package Vue;

import javax.swing.*;

import org.w3c.dom.events.MouseEvent;

import java.awt.*;
import java.awt.event.*;
import Model.Chambre;
import Model.Hotel;
import Model.Type;
import Controller.Ctrl;

public class MainVue extends Ctrl{

    public static void main(String Args[]) {
        //Hotel de test
        Hotel hotel = new Hotel("chezmoi", "le bahut");

        //Main Frame
        JFrame mainJFrame = new JFrame("Menu Principal");
        mainJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainJFrame.setSize(new Dimension(1280, 720));
        mainJFrame.setLocationRelativeTo(null);
        mainJFrame.setVisible(true);

        //MainPanel
        JPanel mainJPanel = (JPanel) mainJFrame.getContentPane();
        mainJPanel.setLayout(new GridLayout(0,2,5,40));

        //Chambre
        JButton addChambreButton = new JButton("Ajouter Chambre");
        addChambreButton.addActionListener((e) -> addChambreButtonClicked(e, hotel));
        mainJPanel.add(addChambreButton);
        JButton modChambreButton = new JButton("Modifier Chambre");
        modChambreButton.addActionListener((e) -> modChambreButtonClicked(e, hotel));
        mainJPanel.add(modChambreButton);

        //Client
        JButton addClientButton = new JButton("Ajouter Client");
        addClientButton.addActionListener((e) -> addClientButtonClicked(e, hotel));
        mainJPanel.add(addClientButton);
        JButton delClientButton = new JButton("Supprimer Client");
        delClientButton.addActionListener((e) -> delClientButtonClicked(e, hotel));
        mainJPanel.add(delClientButton);

        //Reservation
        JButton addReservationButton = new JButton("Ajouter Réservation");
        addReservationButton.addActionListener((e) -> addReservationButtonClicked(e, hotel));
        mainJPanel.add(addReservationButton);
        JButton modReservationButton = new JButton("Modifier Réservation");
        modReservationButton.addActionListener((e) -> modReservationButtonClicked(e, hotel));
        mainJPanel.add(modReservationButton);

        //Séjour
        JButton addSejourButton = new JButton("Ajouter Séjour");
        addSejourButton.addActionListener((e) -> addSejourButtonClicked(e, hotel));
        mainJPanel.add(addSejourButton);
        //Extra
        //Facturation
    }
}