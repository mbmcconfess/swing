package LayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderLayoutFrame extends JFrame implements ActionListener {
    private JButton buttons[];
    private static final String[] names = {"Hide North","Hide South","Hide East","Hide West","Hide Center"};
    private BorderLayout layout;

    public BorderLayoutFrame(){
        super("Border Layout Frame");
        layout = new BorderLayout(5,5);
        setLayout(layout);
        buttons = new JButton[names.length];

        for(int count=0; count<names.length; count++){
            buttons[count] =  new JButton(names[count]);
            buttons[count].addActionListener(this);
        }

        add(buttons[0],BorderLayout.NORTH);
        add(buttons[1],BorderLayout.SOUTH);
        add(buttons[2],BorderLayout.EAST);
        add(buttons[3],BorderLayout.WEST);
        add(buttons[4],BorderLayout.CENTER);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(JButton button: buttons){
            if(e.getSource() == button){
                button.setVisible(false);
            }else{
                button.setVisible(true);
            }
        }
    }
}
