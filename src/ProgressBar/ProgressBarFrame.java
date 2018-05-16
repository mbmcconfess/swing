package ProgressBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgressBarFrame extends JFrame {
    private Timer activityMonitor;
    private JButton startButton;
    private JProgressBar progressBar;
    private JTextArea textArea;
    private SimulatedActivity activity;
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    public ProgressBarFrame(){
        setTitle("ProgressBAr");
        setSize(WIDTH,HEIGHT);
        Container contentPane = getContentPane();
        textArea = new JTextArea();
        JPanel panel = new JPanel();
        startButton = new JButton("Start");
        progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        panel.add(startButton);
        panel.add(progressBar);
        contentPane.add(new JScrollPane(textArea), BorderLayout.CENTER);
        contentPane.add(panel, BorderLayout.SOUTH);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                progressBar.setMaximum(1000);
                activity = new SimulatedActivity(1000);
                activity.start();
                activityMonitor.start();
                startButton.setEnabled(false);
            }
        });

        activityMonitor = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int current = activity.getCurrent();

                textArea.append(current + "\n");
                progressBar.setValue(current);

                if(current == activity.getTarget()){
                    activityMonitor.stop();
                    startButton.setEnabled(true);
                }
            }
        });
    }

}
