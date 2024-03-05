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
 * This class was used to create the toolbox similar to the toolbox found in Minecraft.
 **/
import java.util.*;
import java.awt.*;
import java.awt.geom.*;
public class ToolBox implements DrawingObject{
    private double x, y, width, height;
    private ArrayList<MenuBox> boxes;
    private String className;

    public ToolBox(double x, double y, double size) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        className = "ToolBox";
        boxes = new ArrayList<>();
        boxes.add(new MenuBox(x+ 0,y,size/10));
        boxes.add(new MenuBox(x+ 50,y,size/10));
        boxes.add(new MenuBox(x+ 100,y,size/10));
        boxes.add(new MenuBox(x+ 150,y,size/10));
        boxes.add(new MenuBox(x+ 200,y,size/10));
        boxes.add(new MenuBox(x+ 250,y,size/10));
        boxes.add(new MenuBox(x+ 300,y,size/10));
        boxes.add(new MenuBox(x+ 350,y,size/10));
        boxes.add(new MenuBox(x+ 400,y,size/10));
        boxes.add(new MenuBox(x+ 450,y,size/10));
        

    }
    public String returnClassName () {
        return className;
    }
    public MenuBox returnMenuBox (int index) {
        return boxes.get(index);
    }
    public void draw(Graphics2D g2d) {
        
        
        for (MenuBox m : boxes) {
            m.draw(g2d);
        }

        
    }
    public void adjustX(double distance) {

    }
    public double getX() {
        return x;
    }
}