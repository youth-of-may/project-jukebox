import java.awt.*;

import javax.swing.*;

public class SceneFrame {
    private JFrame frame;
    private SceneCanvas canvas;
    private JButton playButton, pauseButton;
    public SceneFrame() {
        frame = new JFrame();
        canvas = new SceneCanvas();
        canvas.setPreferredSize(new Dimension(800,600));
        playButton = new JButton("Play");
        pauseButton = new JButton("Stop");

    }
    public void setUpGUI() {
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1,2));
        bottomPanel.add(playButton);
        bottomPanel.add(pauseButton);


        canvas.setUpListener(playButton);
        frame.setTitle("Midterm Project - Chua - Giron");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(canvas, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }
    
}
