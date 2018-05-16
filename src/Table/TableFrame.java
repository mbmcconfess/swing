package Table;

import javax.swing.*;
import java.awt.*;

public class TableFrame extends JFrame {
    public  TableFrame(){
        super("Testing Table");
        setLayout(new BorderLayout());
        final String[] colHeads = { "Name", "Phone", "Fax"};
        final Object[][] data  = {
                {"Sarbagya", "654654", "65466"},
                {"Sarbagya", "654654", "65466"},
                {"Sarbagya", "654654", "65466"},
                {"Sarbagya", "654654", "65466"},
                {"Sarbagya", "654654", "65466"},
                {"Sarbagya", "654654", "65466"},
                {"Sarbagya", "654654", "65466"},
                {"Sarbagya", "654654", "65466"},
                {"Sarbagya", "654654", "65466"},
                {"Sarbagya", "654654", "65466"},
                {"Sarbagya", "654654", "65466"},
                {"Sarbagya", "654654", "65466"},
                {"Sarbagya", "654654", "65466"},
                {"Sarbagya", "654654", "65466"},
                {"Sarbagya", "654654", "65466"},
                {"Sarbagya", "654654", "65466"}
        };
        JTable table = new JTable(data, colHeads);
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane scrollPane = new JScrollPane(table, v, h);
        add(scrollPane, BorderLayout.CENTER);



        JProgressBar pb = new JProgressBar();
        pb.setValue(60);
        pb.setStringPainted(true);
        add(pb, BorderLayout.SOUTH);

        String items[] = {"Apple", "Mango", "Banana"};
        JList list = new JList(items);
        list.setBorder(BorderFactory.createLineBorder(Color.blue));
        add(list, BorderLayout.WEST);



    }
}
