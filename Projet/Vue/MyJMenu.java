package Vue;

import java.awt.*;
import javax.swing.*;

public class MyJMenu {

	public static void main(String[] args) {

		// création d'une fenêtre JFrame
		JFrame fen = new JFrame("Interface Hôtel");
		JPanel panel = new JPanel();
		// création d'un panneau (JPanel)
		panel.setLayout(null);
		fen.setSize((new Dimension(1280,720)));
		fen.setContentPane(panel);

		// création de la barre des menus
		JMenuBar myMenuBar = new JMenuBar();

		// Ajout de la barre de menus au JPanel
		panel.add(myMenuBar);

		// Positionnement de la barre des menus avec la m"thode setBounds()
		myMenuBar.setBounds(0, 0, 1280, 30);

		// Création du menu Personnel
		JMenu menuPersonnel = new JMenu("Personnel");
		JMenu menuChambre = new JMenu("Chambre");
		JMenu menuReservation = new JMenu("Réservation");

		// Ajout de menu à la barre des menus
		myMenuBar.add(menuPersonnel);
		myMenuBar.add(menuChambre);
		myMenuBar.add(menuReservation);
		fen.setVisible(true);

		// Création des boutons des sous menus
		JMenuItem menuReceptionniste = new JMenuItem("Receptionniste");
		JMenuItem menuAgentEntretien = new JMenuItem("Agent d'entretien");
		JMenuItem menuConsulter = new JMenuItem("Consulter");
		JMenuItem menuReserver = new JMenuItem("Réserver");
		JMenuItem menuAjouter = new JMenuItem("Ajouter");
		JMenuItem menuSupprimer = new JMenuItem("Supprimer");

		// Ajout des boutons aux sous menus
		menuPersonnel.add(menuReceptionniste);
		menuPersonnel.add(menuAgentEntretien);
		menuChambre.add(menuConsulter);
		menuChambre.add(menuReserver);
		menuReservation.add(menuAjouter);
		menuReservation.add(menuSupprimer);

	}
}