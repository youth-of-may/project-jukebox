/*
 * Instantiate the elements here. Event listeners should also be found here.
 */

 //this is where we will draw the elements of the animated scene
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class SceneCanvas extends JComponent{
    private ArrayList<DrawingObject> elements;
    public SceneCanvas() {
        elements = new ArrayList<DrawingObject>();
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
