package TreeFrame;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TreeFrame extends JFrame {
    private JTextField textField;
    private JTree tree;

    public TreeFrame(){
        super("Testing Tree");
        setLayout(new BorderLayout());
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options");
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
        top.add(a);
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
        a.add(a1);
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
        a.add(a2);
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
        top.add(b);
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
        b.add(b1);
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
        b.add(b2);
        DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("B3");
        b.add(b3);

        tree = new JTree(top);
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane scrollPane = new JScrollPane(tree, v, h);
        add(scrollPane, BorderLayout.CENTER);
        textField = new JTextField("", 20);
        add(textField, BorderLayout.SOUTH);

        tree.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                doMouseClicked(e);
            }
        });

    }

    void doMouseClicked(MouseEvent e){
        TreePath tp = tree.getPathForLocation(e.getX(),e.getY());
        if(tp != null){
            textField.setText(tp.toString());
        }else {
            textField.setText("");
        }
    }
}
