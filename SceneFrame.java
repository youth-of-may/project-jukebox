/**
 * This is a template for a Java file.
	
	@author Princess May Giron (232869)
	@version 06 March 2024
	
	I have not discussed the Java language code in my program 
	with anyone other than my instructor or the teaching assistants 
	assigned to this course.

	I have not used Java language code obtained from another student, 
	or any other unauthorized source, either modified or unmodified.

	If any Java language code or documentation used in my program 
	was obtained from another source, such as a textbook or website, 
	that has been clearly noted with a proper citation in the comments 
	of my program.
 */
/**
 * A JFrame was created in this class. An instance of SceneCanvas was also created.
 **/
import java.awt.*;

import javax.swing.*;
import java.io.*;

public class SceneFrame {
    private JFrame frame;
    private SceneCanvas canvas;
    private JButton playButton, test, stopButton;
    private JLabel invisibleLabel;
    private Font minecraft;
    public SceneFrame() {
        
        //add a new font 

        try {
            minecraft = Font.createFont(Font.TRUETYPE_FONT, new File("minecraft_font.ttf")).deriveFont(14f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("minecraft_font.ttf")));

        }
        catch (IOException | FontFormatException e) {

        }
        frame = new JFrame();
        canvas = new SceneCanvas();
        canvas.setPreferredSize(new Dimension(800,600));
        playButton = new JButton("Play");
        playButton.setBackground(new Color(198,198,198));
        playButton.setForeground(new Color(76,76,76));
        playButton.setFocusPainted(false);
        playButton.setFont(minecraft);
        playButton.setBorder(BorderFactory.createRaisedBevelBorder());
        
        
        invisibleLabel = new JLabel();
        invisibleLabel.setOpaque(true);
        invisibleLabel.setBackground(new Color(47,33,19));

        test = new JButton();
        test.setOpaque(true);
        //test.setContentAreaFilled(false);
        test.setBackground(new Color(47,33,19));
        test.setBorderPainted(false);

        stopButton = new JButton("Stop");
        stopButton.setBackground(new Color(198,198,198));
        stopButton.setForeground(new Color(76,76,76));
        stopButton.setFont(minecraft);
        stopButton.setBorder(BorderFactory.createRaisedBevelBorder());

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
