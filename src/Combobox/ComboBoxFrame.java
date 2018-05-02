package Combobox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.ByteOrder;

public class ComboBoxFrame extends JFrame {
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;
    private JComboBox faceCombo;
    private JLabel label;
    private static final int DEFAULT_SIZE = 12;

    public ComboBoxFrame(){
        setTitle("ComboBoxTest");
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);

        label = new JLabel("the quick brown fox jumps over the lazy dog.");
        label.setFont(new Font("Serif",Font.PLAIN,DEFAULT_SIZE));
        add(label,BorderLayout.CENTER);

        faceCombo = new JComboBox();
        faceCombo.setEditable(true);
        faceCombo.addItem("Serif");
        faceCombo.addItem("SansSerif");
        faceCombo.addItem("Monospace");
        faceCombo.addItem("Dialog");
        faceCombo.addItem("DialogInput");

        faceCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setFont(new Font((String) faceCombo.getSelectedItem(),Font.PLAIN,DEFAULT_SIZE));
            }
        });
        JPanel comboPanel = new JPanel();
        comboPanel.add(faceCombo);
        add(comboPanel, BorderLayout.SOUTH);

    }


}
