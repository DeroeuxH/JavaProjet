package Vue;

import java.awt.*;
import javax.swing.*;

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

        JComponent classList = new JList<>();
        //classList 

        JPanel contentPane = (JPanel) main.getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(mainToolBar,BorderLayout.NORTH);
        //contentPane.add(paneClass,BorderLayout.WEST);
        contentPane.add(classList,BorderLayout.WEST);
    }
}