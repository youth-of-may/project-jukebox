/*
 * Instantiate the elements here. Event listeners should also be found here.
 */

 //this is where we will draw the elements of the animated scene
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.*;
public class SceneCanvas extends JComponent{
    private ArrayList<DrawingObject> elements;
    public SceneCanvas() {
        elements = new ArrayList<DrawingObject>();
        elements.add(new Background());
        //testing out toolbox
        //elements.add(new GradientBackground());
        elements.add(new ThreeDWood("shadow", 100, 100, 100, 100));

        
        elements.add(new NetherrackSlab(50,500,250,100));
		
		//elements.add(new Wood(500,425,200));
        //elements.add(new Jukebox(300,375,200));

        elements.add(new GlassPane(338,190,110));
        elements.add(new ElongatedWindow(475,75,200,100));
        elements.add(new ElongatedWindow(125,75,200,100));
        //elements.add(new GlassPane());
        
        
        
        //elements.add(new GlassPane(100,0,50,50));
        //elements.add(new Outline());
        //elements.add(new Disc(100,100, 100,100, Color.RED));
        
        elements.add(new DiscFrame(335, 45, 130));
        elements.add(new Disc(362, 85, 1, Color.RED));
        elements.add(new Wood(500,425,200));
        elements.add(new Jukebox(300,375,200));
        elements.add(new ToolBox(150, 500, 500));
            /*
     * Add the elements inside the constructor as well
     */
    
    }

    /*
     * In your code, you must have at least one (1) loop that iterates
through this ArrayList to repeatedly execute instructions affecting the shapes. For example, you
can have a for loop inside the paintComponent method that calls your custom draw method on all
of the shapes in the list.
     */
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        for (DrawingObject drawingObj : elements) {
            drawingObj.draw(g2d);
        }
        
    }
    
}
