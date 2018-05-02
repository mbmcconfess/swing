package Choice;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderFrame extends JFrame {
    public static final int DEFAULT_WIDTH = 600;
    public static final int DEFAULT_HEIGHT = 200;
    private JPanel demoPanel;
    private JPanel buttonPanel;
    private ButtonGroup group;

    public BorderFrame(){
        setTitle("BorderTest");
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);

        demoPanel = new JPanel();
        buttonPanel = new JPanel();
        group = new ButtonGroup();

        addBorder("Lowered bevel", BorderFactory.createLoweredBevelBorder());
        addBorder("Lowered bevel", BorderFactory.createRaisedBevelBorder());
        addBorder("Etched", BorderFactory.createEtchedBorder());
        addBorder("Line", BorderFactory.createLineBorder(Color.blue));
        addBorder("Matte", BorderFactory.createMatteBorder(10,10,10,10,Color.blue));
        addBorder("Empty", BorderFactory.createEmptyBorder());

        Border etched = BorderFactory.createEtchedBorder();
        Border titled = BorderFactory.createTitledBorder(etched, "Border Types");
        buttonPanel.setBorder(titled);

        setLayout(new GridLayout(2,1));
        add(buttonPanel);
        add(demoPanel);

    }

    private void addBorder(String buttonName,final Border b) {
        JRadioButton button = new JRadioButton(buttonName);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                demoPanel.setBorder(b);
            }
        });

        group.add(button);
        buttonPanel.add(button);
    }
}
