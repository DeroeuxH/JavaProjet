package Vue;

import javax.swing.*;

import org.w3c.dom.events.MouseEvent;

import java.awt.*;
import java.awt.event.*;

import Model.AgentEntretien;
import Model.Chambre;
import Model.Hotel;
import Model.Receptionniste;
import Model.Type;
import Controller.Ctrl;

public class MainVue extends Ctrl implements ActionListener{

    JFrame mainJFrame = new JFrame("Menu Principal");
    JPanel mainPanel = (JPanel) mainJFrame.getContentPane();
    
    //Jbouton Main 
    JButton buttonCbr = new JButton("Chambre");
    JButton buttonRes = new JButton("Reservation");
    JButton buttonClt = new JButton("Client");
    JButton buttonSej = new JButton("Séjour");
    JButton buttonPer = new JButton("Personnel");

    //Jboutton neutre
    JButton Ajouter  = new JButton("Ajouter");
    JButton Consulter  = new JButton("Consulter");
    JButton Supprimer  = new JButton("Supprimer");
    JButton Retour = new JButton("Retour");
    JButton AgentEntretien = new JButton("Agent d'entretien");
    JButton Receptionniste = new JButton("Receptionniste");

    

    public MainVue(){
        mainJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainJFrame.setSize(new Dimension(1280, 720));
        mainJFrame.setLocationRelativeTo(null);
        mainJFrame.setVisible(true);
        mainPanel.setLayout(new GridLayout(5,0));
        mainJFrame.add(mainPanel);
        //
        mainPanel.add(buttonClt);
        mainPanel.add(buttonCbr);
        mainPanel.add(buttonRes);
        mainPanel.add(buttonSej);
        mainPanel.add(buttonPer);
    }
    public void Chambre(){
        //reset du menu
        mainPanel.removeAll();
        mainPanel.setLayout(new GridLayout(4,0));
        //affichage des bouttons 
        mainPanel.add(Ajouter);
        mainPanel.add(Consulter);
        mainPanel.add(Supprimer);
        mainPanel.add(Retour);
        //ajout des controleur

    }

    public void Reservation(){
        //reset du menu
        mainPanel.removeAll();
        mainPanel.setLayout(new GridLayout(4,0));
        //affichage des bouttons 
        mainPanel.add(Ajouter);
        mainPanel.add(Consulter);
        mainPanel.add(Supprimer);
        mainPanel.add(Retour);
        //ajout des controleur

    }

    public void Client(){
        //reset du menu
        mainPanel.removeAll();
        mainPanel.setLayout(new GridLayout(4,0));
        //affichage des bouttons 
        mainPanel.add(Ajouter);
        mainPanel.add(Consulter);
        mainPanel.add(Supprimer);
        mainPanel.add(Retour);
        //ajout des controleur

    }

    public void Sejour(){
        //reset du menu
        mainPanel.removeAll();
        mainPanel.setLayout(new GridLayout(4,0));
        //affichage des bouttons 
        mainPanel.add(Ajouter);
        mainPanel.add(Consulter);
        mainPanel.add(Supprimer);
        mainPanel.add(Retour);
        //ajout des controleur

    }

    public void Personnel(){
        //reset du menu
        mainPanel.removeAll();
        mainPanel.setLayout(new GridLayout(2,0));
        //affichage des bouttons 
        mainPanel.add(AgentEntretien);
        mainPanel.add(Receptionniste);
        //ajout des controleur

    }

    public void AgentEntretien(){
        //reset du menu
        mainPanel.removeAll();
        mainPanel.setLayout(new GridLayout(4,0));
        //affichage des bouttons 
        mainPanel.add(Ajouter);
        mainPanel.add(Consulter);
        mainPanel.add(Supprimer);
        mainPanel.add(Retour);
        //ajout des controleur

    }

    public void Receptionniste(){
        //reset du menu
        mainPanel.removeAll();
        mainPanel.setLayout(new GridLayout(4,0));
        //affichage des bouttons 
        mainPanel.add(Ajouter);
        mainPanel.add(Consulter);
        mainPanel.add(Supprimer);
        mainPanel.add(Retour);
        //ajout des controleur

    }

    public void main(String Args[]) {
        //Hotel de test
        Hotel hotel = new Hotel("chezmoi", "le bahut");

        new MainVue();
        /*
        //Chambre
        JButton addChambreButton = new JButton("Ajouter Chambre");
        addChambreButton.addActionListener((e) -> addChambreButtonClicked(e));
        mainJPanel.add(addChambreButton);
        JButton modChambreButton = new JButton("Modifier Chambre");
        modChambreButton.addActionListener((e) -> modChambreButtonClicked(e));
        mainJPanel.add(modChambreButton);
        //variable création de chambre 
        JTextField numCbr = new JTextField();
        JTextField etageCbr = new JTextField();
        JTextField prixCbr = new JTextField();
        JTextField type = new JTextField();*/
    }
}