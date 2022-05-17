package Vue;

import java.awt.*;
import javax.swing.*;
import Model.Chambre;
import Model.Hotel;
import Model.Type;

public class MainVue {

    public static void main(String Args[]) {
        JFrame mainJFrame = new JFrame("Menu Principal");
        mainJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainJFrame.setSize(new Dimension(1920, 1080));
        mainJFrame.setLocationRelativeTo(null);
        mainJFrame.setVisible(true);

        JToolBar mainToolBar = new JToolBar();
        JButton réceptionniste = new JButton("Réceptionniste");
        JButton agentEntretien = new JButton("Agent Entretien");
        JButton chambre = new JButton("Chambre");
        JButton réservation = new JButton("Réservation");
        mainToolBar.add(réceptionniste);
        mainToolBar.add(agentEntretien);
        mainToolBar.add(chambre);
        mainToolBar.add(réservation);

        DefaultListModel<Chambre> classDefaultListModel = new DefaultListModel<>();

        Hotel hotel = new Hotel("chezmoi", "le bahut");
        hotel.getVectorChambre().add(new Chambre(1, 0, 50, Type.NORMAL));
        hotel.getVectorChambre().add(new Chambre(2, 0, 75, Type.DOUBLE));
        hotel.getVectorChambre().add(new Chambre(3, 0, 100, Type.SIMPLE));

        for (int i = 0; i < hotel.getVectorChambre().size(); i++) {
            classDefaultListModel.add(i, hotel.getVectorChambre().get(i));
            System.out.println(classDefaultListModel.get(i));
        }

        JComponent classJList = new JList(classDefaultListModel);

        JPanel mainJPanel = (JPanel) mainJFrame.getContentPane();
        mainJPanel.setLayout(new BorderLayout());
        mainJPanel.add(mainToolBar, BorderLayout.NORTH);
        // contentPane.add(paneClass,BorderLayout.WEST);
        mainJPanel.add(classJList, BorderLayout.WEST);
        System.out.println(classJList.isShowing());

        // Seconde fenêtre pour ajouter un objet
        JFrame addJFrame = new JFrame("Ajouter une Chambre");
        addJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addJFrame.setSize(new Dimension(1280, 720));
        addJFrame.setLocationRelativeTo(null);
        addJFrame.setLayout(new BorderLayout());

        JPanel addJPanel = (JPanel) addJFrame.getContentPane();
        addJPanel.setLayout(new BorderLayout());

        JPanel addJPanelSouth = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        JPanel addJPanelCenter = new JPanel(new GridLayout(4, 1, 0, 0));
        JPanel addJPanelFlow1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
        JPanel addJPanelFlow2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
        JPanel addJPanelFlow3 = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
        JPanel addJPanelFlow4 = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));

        JButton confirmer = new JButton("confirmer");
        confirmer.setSize(100, 25);

        JTextField numero = (new JTextField("Numéro: "));
        JTextField numeroinput = new JTextField("");
        numeroinput.setColumns(4);

        JTextField etage = (new JTextField("Etage: "));
        JTextField etageinput = (new JTextField(""));
        etageinput.setColumns(4);

        JTextField prix = (new JTextField("Prix: "));
        JTextField prixinput = (new JTextField(""));
        prixinput.setColumns(5);

        JTextField type = (new JTextField("Type: "));
        JTextField typeinput = (new JTextField(""));
        typeinput.setColumns(13);

        addJPanelFlow1.add(numero);
        addJPanelFlow1.add(numeroinput);
        addJPanelFlow2.add(etage);
        addJPanelFlow2.add(etageinput);
        addJPanelFlow3.add(prix);
        addJPanelFlow3.add(prixinput);
        addJPanelFlow4.add(type);
        addJPanelFlow4.add(typeinput);

        addJPanel.add(addJPanelSouth, BorderLayout.SOUTH);
        addJPanelSouth.add(confirmer);
        addJPanel.add(addJPanelCenter, BorderLayout.CENTER);
        addJPanelCenter.add(addJPanelFlow1);
        addJPanelCenter.add(addJPanelFlow2);
        addJPanelCenter.add(addJPanelFlow3);
        addJPanelCenter.add(addJPanelFlow4);
        addJFrame.setVisible(true);
    }
}