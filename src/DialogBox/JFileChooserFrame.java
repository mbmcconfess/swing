package DialogBox;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageFilter;
import java.io.File;

public class JFileChooserFrame extends JFrame {
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 400;
    public static JLabel label;
    public static JFileChooser chooser;
    private FileIconView iconview;
    private ImageFilter imgfilter;

    public JFileChooserFrame(){
        setTitle("FileChooserTest");
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu menu = new JMenu("File");
        menuBar.add(menu);
        JMenuItem openItem = new JMenuItem("Open");
        menu.add(openItem);
        openItem.addActionListener(new FileOpenListener());
        JMenuItem exitItem = new JMenuItem("Exit");
        menu.add(exitItem);
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        label = new JLabel();
        add(label);

        chooser = new JFileChooser();

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image files", "jpg", "jpeg", "gif","png");
        iconview = new FileIconView(filter, new ImageIcon(getClass().getResource("icon.png")));
        chooser.setFileFilter(filter);

        chooser.setAccessory(new ImagePreviewer(chooser));
    }

    private class FileOpenListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            chooser.setCurrentDirectory(new File("."));
            int result = chooser.showOpenDialog(JFileChooserFrame.this);

            if(result == JFileChooser.APPROVE_OPTION ){
                String name = chooser.getSelectedFile().getPath();
                label.setIcon(new ImageIcon(name));
            }
        }
    }
}


