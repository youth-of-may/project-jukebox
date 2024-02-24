import java.awt.*;

import javax.swing.*;

public class SceneFrame {
    private JFrame frame;
    private SceneCanvas canvas;
    public SceneFrame() {
        frame = new JFrame();
        canvas = new SceneCanvas();
        canvas.setPreferredSize(new Dimension(800,600));

    }
    public void setUpGUI() {
        frame.setTitle("Midterm Project - Chua - Giron");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
}
