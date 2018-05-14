package ListFrame;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class ListFrame extends JFrame {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;
    private JList wordList;
    private JLabel label;
    private String prefix = "The ";
    private String suffix = "fox jumps over the lazy dog.";

    public ListFrame(){
        setTitle("ListTest");
        setSize(WIDTH, HEIGHT);
        String[] words =
                {
                        "quick", "brown", "hungry", "wild", "silent", "huge", "private", "abstract", "static", "final"
                };
        wordList = new JList(words);
        JScrollPane scrollPane = new JScrollPane(wordList);
        JPanel p = new JPanel();
        p.add(scrollPane);
        wordList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Object[] values = wordList.getSelectedValues();
                StringBuffer text = new StringBuffer(prefix);
                for(int i=0; i<values.length; i++){
                    String word = (String)values[i];
                    text.append(word);
                    text.append(" ");
                }
                text.append(suffix);
                label.setText(text.toString());
            }
        });
        java.awt.Container contentPane = getContentPane();
        contentPane.add(p, BorderLayout.SOUTH);
        label = new JLabel((prefix + suffix));
        contentPane.add(label, BorderLayout.CENTER);
    }

}
