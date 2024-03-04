import java.util.*;
import java.awt.*;
import java.awt.geom.*;
public class ThreeDDisc implements DrawingObject{
    private double x, y, width, height;
    private Color color;
    

    public ThreeDDisc(double x, double y, double width, double height, Color color) {
       this.x =x;
       this.y = y;
       this.width = width;
       this.height = height;
       this.color = color;
        

    }
   
    public void draw(Graphics2D g2d) {
        
        
        

        
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