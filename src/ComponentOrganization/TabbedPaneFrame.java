package ComponentOrganization;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabbedPaneFrame extends JFrame {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;
    private static final String BorderLayout = null;

    public TabbedPaneFrame(){
        setTitle("TabbedPaneTest");
        setSize(WIDTH,HEIGHT);
        final JTabbedPane tabbedPane = new JTabbedPane();

        ImageIcon icon = new ImageIcon(getClass().getResource("yellow-ball.gif"));
        tabbedPane.addTab("Mercury", icon, null);
        tabbedPane.addTab("Venus", icon, null);
        tabbedPane.addTab("Earth", icon, null);
        tabbedPane.addTab("Mars", icon, null);
        tabbedPane.addTab("Jupiter", icon, null);
        tabbedPane.addTab("Saturn", icon, null);
        tabbedPane.addTab("Uranus", icon, null);
        tabbedPane.addTab("Neptune", icon, null);
        tabbedPane.addTab("Pluto", icon, null);
        getContentPane().add(tabbedPane, "Center");
        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                if (tabbedPane.getSelectedComponent() == null) {
                    int n = tabbedPane.getSelectedIndex();
                    String title = tabbedPane.getTitleAt(n);
                    ImageIcon planetIcon = new ImageIcon(getClass().getResource(title + ".gif"));
                    tabbedPane.setComponentAt(n, new JLabel(planetIcon));
                    tabbedPane.setIconAt(n, new ImageIcon(getClass().getResource("red-ball.gif")));
                }
            }
        });
        JPanel buttonPanel = new JPanel();
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton wrapButton = new JRadioButton("wrap tabbed pane");
        wrapButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    tabbedPane.setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
                }
        });

        buttonPanel.add(wrapButton);
        buttonGroup.add(wrapButton);
        wrapButton.setSelected(true);
        JRadioButton scrollButton = new JRadioButton("scroll tab");
        scrollButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
                }

        });
        buttonPanel.add(scrollButton);
        buttonGroup.add(scrollButton);
        getContentPane().add(buttonPanel, java.awt.BorderLayout.SOUTH);
    }

}
