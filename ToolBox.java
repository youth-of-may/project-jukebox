import java.util.*;
import java.awt.*;
import java.awt.geom.*;
public class ToolBox implements DrawingObject{
    private double x, y, width, height;
    private ArrayList<MenuBox> boxes;

    public ToolBox(double x, double y, double size) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        boxes = new ArrayList<>();
        boxes.add(new MenuBox(0,0,100));
        boxes.add(new MenuBox(100,0,100));

    }
    public void draw(Graphics2D g2d) {
        
        for (MenuBox m : boxes) {
            m.draw(g2d);
        }
        

        /* 
        figure out how to add an outline to the toolbox
        g2d.setStroke(new BasicStroke(4));
        g2d.setColor(Color.BLUE);
        Rectangle2D.Double outline = new Rectangle2D.Double(x,y, width, height);
        g2d.fill(outline);

        */
    }
    public void adjustX(double distance) {

    }
    public double getX() {
        return x;
    }
}