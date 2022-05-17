package Controller;

import javax.swing.*;
import javax.swing.event.MouseInputListener;

import java.awt.*;
import java.awt.event.*;
import Model.Hotel;
import Model.Chambre;
import Model.Type;
import Vue.MainVue;

public class Ctrl implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

    public void addChambreButtonClicked(ActionEvent e){
        JFrame frame = new JFrame();
        int num = Integer.parseInt(JOptionPane.showInputDialog(frame,"Veuillez entrer le numéro de chambre sous forme numérique"));
        int etg = Integer.parseInt(JOptionPane.showInputDialog(frame,"Veuillez entrer le numéro d'étage sous forme numérique"));
        int prx = Integer.parseInt(JOptionPane.showInputDialog(frame,"Veuillez entrer le prix sous forme numérique"));
        String t;
        for (int i =0; i!=1;) {
            if (JOptionPane.showInputDialog(frame,"Veuillez entrer le type").equals("NORMAL")) {i=1;  t = "NORMAL";}
            else if (JOptionPane.showInputDialog(frame,"Veuillez entrer le type").equals("SIMPLE")) {i=1; t = "SIMPLE";}
            else if (JOptionPane.showInputDialog(frame,"Veuillez entrer le type").equals("DOUBLE")) {i=1; t = "DOUBLE";}
            else if (JOptionPane.showInputDialog(frame,"Veuillez entrer le type").equals("PRESIDENTIELLE")) {i=1; t = "PRESIDENTIELLE";}
            else JOptionPane.showMessageDialog(frame,"le type entré n'est pas correct, veuillez écrire: NORMAL,SIMPLE,DOUBLE ou PRESIDENTIELLE");
        }
        Chambre(num,etg,prx,t);
    }
}