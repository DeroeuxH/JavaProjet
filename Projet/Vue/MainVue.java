package Vue;

import java.awt.*;
import java.util.Vector;

import javax.swing.*;

import Model.Chambre;
import Model.Hotel;
import Model.Type;

class hwSwing {

    public static void main(String args[]){
        JFrame main = new JFrame("Menu Principal");
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setSize(new Dimension(1920,1080));
        main.setLocationRelativeTo(null);
        main.setVisible(true);

        JToolBar mainToolBar = new JToolBar();
        JComponent réceptionniste = new JButton("Réceptionniste");
        JComponent agentEntretien = new JButton("Agent Entretien");
        JComponent chambre = new JButton("Chambre");
        JComponent réservation = new JButton("Réservation");
        mainToolBar.add (réceptionniste);
        mainToolBar.add (agentEntretien);
        mainToolBar.add (chambre);
        mainToolBar.add (réservation);

        DefaultListModel<Chambre> classDefaultListModel = new DefaultListModel<>();

        Hotel hotel = new Hotel("chezmoi", "le bahut");
        hotel.getVectorChambre().add(new Chambre("Chambre 1", 1, 0, 50, Type.NORMAL));
        hotel.getVectorChambre().add(new Chambre("Chambre 2", 2, 0, 75, Type.DOUBLE));
        hotel.getVectorChambre().add(new Chambre("Chambre 3", 3, 0, 100, Type.SIMPLE));

        for (int i=0; i<hotel.getVectorChambre().size();i++){
            classDefaultListModel.add(  i, hotel.getVectorChambre().get(i));
            System.out.println(classDefaultListModel.get(i));
        }

        JComponent classJList = new JList(classDefaultListModel);

        JPanel contentPane = (JPanel) main.getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(mainToolBar,BorderLayout.NORTH);
        //contentPane.add(paneClass,BorderLayout.WEST);
        contentPane.add(classJList,BorderLayout.WEST);
        System.out.println(classJList.isShowing());
    }
}