package Choice;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.Dictionary;
import java.util.Hashtable;

public class SliderTestFrame extends JFrame {
    public static final int DEFAULT_WIDTH = 350;
    public static final int DEFAULT_HEIGHT = 450;

    private JPanel sliderPanel;
    private JTextField textField;
    private ChangeListener listner;

    public SliderTestFrame(){
        setTitle("SliderTest");
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        sliderPanel = new JPanel();
        sliderPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        listner = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider source = (JSlider) e.getSource();
                textField.setText("" + source.getValue());
            }
        };

        JSlider slider = new JSlider();
        addSlider(slider,"Plain");

        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        addSlider(slider,"Ticks");

        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setSnapToTicks(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        addSlider(slider,"Snap to Ticks");

        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setPaintTrack(false);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        addSlider(slider,"No Track");

        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setInverted(true);
        addSlider(slider,"Inverted");

        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        addSlider(slider,"Labels");

        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);

        Dictionary<Integer,Component> labelTable = new Hashtable<Integer, Component>();
        labelTable.put(0, new JLabel("A"));
        labelTable.put(20, new JLabel("B"));
        labelTable.put(40, new JLabel("C"));
        labelTable.put(60, new JLabel("D"));
        labelTable.put(80, new JLabel("E"));
        labelTable.put(100, new JLabel("F"));

        slider.setLabelTable(labelTable);
        addSlider(slider,"Custom Labels");

        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setSnapToTicks(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        labelTable= new Hashtable<Integer, Component>();

        labelTable.put(0, new JLabel(createImageIcon("as.png","Facebook")));
        labelTable.put(20, new JLabel(createImageIcon("bs.png","Linkedin")));
        labelTable.put(40, new JLabel(createImageIcon("cs.png","SnapChat")));
        labelTable.put(60, new JLabel(createImageIcon("ds.png", "Instagram")));
        labelTable.put(80, new JLabel(createImageIcon("es.png","Youtube")));
        labelTable.put(100, new JLabel(createImageIcon("fs.png", "Twitter")));
        slider.setLabelTable(labelTable);
        addSlider(slider, "Icon Labels");


        textField = new JTextField();
        add(sliderPanel, BorderLayout.CENTER);
        add(textField, BorderLayout.SOUTH);
    }

    public void addSlider(JSlider s, String desc){
        s.addChangeListener(listner);
        JPanel panel = new JPanel();
        panel.add(s);
        panel.add(new JLabel(desc));
        sliderPanel.add(panel);
    }

    /** Returns an ImageIcon, or null if the path was invalid. */
    protected ImageIcon createImageIcon(String path,  String description) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

}
