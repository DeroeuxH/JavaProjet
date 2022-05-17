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
        addChambreButton.addActionListener(ActionEvent e);
        mainJPanel.add(addChambreButton);
        JButton delChambreButton = new JButton("Supprimer Chambre");
        addChambreButton.addActionListener();
        mainJPanel.add(delChambreButton);
        

        //Receptionniste
        JButton addReceptionnisteButton = new JButton("Ajouter Receptionniste");
        mainJPanel.add(addReceptionnisteButton);
        JButton delReceptionnisteButton = new JButton("Supprimer Receptionniste");
        mainJPanel.add(delReceptionnisteButton);

        //Agent Entretien
        JButton addAgentEntretienButton = new JButton("Ajouter AgentEntretien");
        mainJPanel.add(addAgentEntretienButton);
        JButton delAgentEntretienButton = new JButton("Supprimer AgentEntretien");
        mainJPanel.add(delAgentEntretienButton);

        //Reservation
        JButton addReservationButton = new JButton("Ajouter Reservation");
        mainJPanel.add(addReservationButton);
        JButton delReservationButton = new JButton("Supprimer Reservation");
        mainJPanel.add(delReservationButton);
    }
}