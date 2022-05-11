import java.awt.*;
import javax.swing.*;

class hwSwing {
    public static void main(String args[]){
        JFrame main = new JFrame("Menu Principal");
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //main.setPreferredSize(new Dimension(1280,720) );
        main.setSize(new Dimension(1280,720));
        main.setLocationRelativeTo(null);
        main.setVisible(true);

        JToolBar mainToolBar = new JToolBar();
        mainToolBar.add (new JButton("Personnel"));
        mainToolBar.add (new JButton("Chambre"));
        mainToolBar.add (new JButton("Réservation"));
        mainToolBar.add (new JButton("?"));
        mainToolBar.add (new JButton("??"));

        JPanel contentPane = (JPanel) main.getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(mainToolBar,BorderLayout.NORTH);
    }
}