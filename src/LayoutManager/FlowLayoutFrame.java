package LayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FlowLayoutFrame extends JFrame{
    private JButton leftBtn;
    private JButton rightBtn;
    private JButton centerBtn;
    private FlowLayout layout;
    private Container cont;

    public FlowLayoutFrame(){
        super("FlowLayout Demo");

        layout = new FlowLayout();

        cont  = getContentPane();
        setLayout(layout);

        leftBtn = new JButton("Left");
        add(leftBtn);
        leftBtn.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        layout.setAlignment(FlowLayout.LEFT);
                        layout.layoutContainer(cont);
                    }
                }
        );

        centerBtn = new JButton("Center");
        add(centerBtn);
        centerBtn.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        layout.setAlignment(FlowLayout.CENTER);
                        layout.layoutContainer(cont);
                    }
                }
        );

        rightBtn = new JButton("Right");
        add(rightBtn);
        rightBtn.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        layout.setAlignment(FlowLayout.RIGHT);
                        layout.layoutContainer(cont);
                    }
                }
        );

    }

}
