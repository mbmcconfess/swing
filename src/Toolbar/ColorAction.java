package Toolbar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ColorAction extends AbstractAction {

    public ColorAction(String name, Icon icon, Color c){
        putValue(Action.NAME, name);
        putValue(Action.SMALL_ICON, icon);
        putValue(Action.SHORT_DESCRIPTION, name + " background");
        putValue("Color", c);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Color c = (Color)getValue("Color");
        ToolBarFrame.panel.setBackground(c);
    }
}
