package DialogBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutDialog extends JDialog {
    public AboutDialog(JFrame owner){
        super(owner, "About Dialog Test", true);

        add(new JLabel("<html><body><h1><i>Core Java</i></h1><hr>By Sarbagya Dhaubanjar</body></html>",SwingConstants.CENTER));

        JButton ok = new JButton("OK");
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JPanel panel = new JPanel();
        panel.add(ok);
        add(panel, BorderLayout.SOUTH);
        setSize(400,300);

    }
}
