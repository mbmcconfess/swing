package Radio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonFrame extends JFrame {
    private final static int DEFAULT_WIDTH = 500;
    private final static int DEFAULT_HEIGHT = 200;
    private JLabel label;
    private JPanel buttonPanel;
    private ButtonGroup group;
    private static final int DEFAULT_SIZE = 12;

    public RadioButtonFrame(){
        setTitle("RadioButtonTest");
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);

        label = new JLabel("The quick brown fox jumps over the lazy dog.");
        label.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
        add(label,BorderLayout.CENTER);
        buttonPanel = new JPanel();
        group = new ButtonGroup();

        addRadioButton("Small",8);
        addRadioButton("Medium",12);
        addRadioButton("Large",18);
        addRadioButton("Extra Large",36);

        add(buttonPanel,BorderLayout.SOUTH);
    }
    public void addRadioButton(String name, final int size){
        boolean selected = size == DEFAULT_SIZE;
        JRadioButton button = new JRadioButton(name,selected);
        group.add(button);
        buttonPanel.add(button);

        ActionListener listner = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setFont(new Font("Serif", Font.PLAIN, size));
            }
        };

        button.addActionListener(listner);
    }


}
