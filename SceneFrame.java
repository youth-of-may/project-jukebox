import java.awt.*;

import javax.swing.*;

public class SceneFrame {
    private JFrame frame;
    private SceneCanvas canvas;
    private JButton playButton, test, stopButton;
    private JLabel invisibleLabel;
    public SceneFrame() {
        frame = new JFrame();
        canvas = new SceneCanvas();
        canvas.setPreferredSize(new Dimension(800,600));
        playButton = new JButton("Play");
        
        invisibleLabel = new JLabel();
        invisibleLabel.setOpaque(true);
        invisibleLabel.setBackground(new Color(47,33,19));

        test = new JButton();
        test.setOpaque(true);
        //test.setContentAreaFilled(false);
        test.setBackground(new Color(47,33,19));
        test.setBorderPainted(false);

        stopButton = new JButton("Stop");
        

    }
    public void setUpGUI() {
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1,4));
        bottomPanel.add(test);
        bottomPanel.add(playButton);
        bottomPanel.add(stopButton);
        bottomPanel.add(invisibleLabel);


        canvas.setUpKeyBindings(test,canvas);
        canvas.setUpKeyBindings(stopButton,canvas);
        canvas.setUpPlayListener(playButton);
        canvas.setUpStopListener(stopButton);
        frame.setTitle("Midterm Project - Chua - Giron");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(canvas, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }
    
}
