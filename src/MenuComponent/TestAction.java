package MenuComponent;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class TestAction extends AbstractAction {

    public TestAction(String name){
        super(name);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(getValue(NAME) + " selected.");
    }
}
