import javax.swing.*;
import java.awt.*;

public class MyJPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,500);
        frame.setTitle("Sarbagya's Panel");

        Container c = frame.getContentPane();
        c.setBackground(Color.blue);
        c.setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.red);
        panel.setBounds(100,100,250,250);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.yellow);
        panel2.setBounds(100,100,75,75);
        panel.add(panel2);

        JButton btn = new JButton("Ok");
        JButton btnC = new JButton("Cancel");
        panel2.add(btn);
        panel2.add(btnC);

        c.add(panel);
    }
}
