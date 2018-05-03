package Toolbar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ToolBarFrame extends JFrame {
    public  static final int DEFAULT_WIDTH = 300;
    public  static final int DEFAULT_HEIGHT = 300;
    public static JPanel panel;
    public  ToolBarFrame(){
        setTitle("ToolBArTest");
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);

        panel = new JPanel();
        add(panel, BorderLayout.CENTER);

        Action blueAction = new ColorAction("Blue", new ImageIcon(getClass().getResource("blue-ball.gif")), Color.BLUE);
        Action yellowAction = new ColorAction("Yellow", new ImageIcon(getClass().getResource("yellow-ball.gif")), Color.YELLOW);
        Action redAction = new ColorAction("Red", new ImageIcon(getClass().getResource("red-ball.gif")), Color.RED);

        Action exitAction = new AbstractAction("Exit", new ImageIcon(getClass().getResource("exit.gif"))) {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };

        exitAction.putValue(Action.SHORT_DESCRIPTION, "Exit");

        JToolBar bar = new JToolBar();
        bar.add(blueAction);
        bar.add(yellowAction);
        bar.add(redAction);
        bar.addSeparator();
        bar.add(exitAction);
        add(bar, BorderLayout.NORTH);

        JMenu menu = new JMenu("Color");
        menu.add(yellowAction);
        menu.add(blueAction);
        menu.add(redAction);
        menu.add(exitAction);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);
        setJMenuBar(menuBar);

    }

}
