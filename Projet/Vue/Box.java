package Vue;
import java.awt.*;
import javax.swing.*;

public class Box
{
    public static void main(String[] args)
  {
    JFrame frame = new JFrame();
    JPanel contentPane = (JPanel) frame.getContentPane();

    JButton btn1 = new JButton("test1");
    JButton btn2 = new JButton("test2");

    contentPane.add(btn1, FlowLayout.LEFT);
    contentPane.add(btn2, FlowLayout.RIGHT);

    frame.setSize(300,300);
    frame.setVisible(true);
  }
}