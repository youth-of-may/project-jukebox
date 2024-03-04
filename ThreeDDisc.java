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
        
        
        Rectangle firstRectangle = new Rectangle(x, y, width, height, color);
        firstRectangle.draw(g2d);

        Rectangle firstDetailRectangle = new Rectangle(x+15, y+65, width-30, height-50, Color.GREEN);
        firstDetailRectangle.draw(g2d);

        Rectangle secondDetailRectangle = new Rectangle(x+15, y-15, width-30, height-50, Color.GREEN);
        secondDetailRectangle.draw(g2d);

        Rectangle secondRectangle = new Rectangle(x+35, y-30, width -75, height+60, Color.BLACK);
        secondRectangle.draw(g2d);

        

        Rectangle thirdRectangle = new Rectangle(x-25, y+25, width + 50, height -50, Color.BLUE);
        thirdRectangle.draw(g2d);

        Rectangle thirdDetailRectangle = new Rectangle(x-15, y+15, width + 50, height -50, Color.BLACK);
        thirdDetailRectangle.draw(g2d);

        Rectangle fourthDetailRectangle = new Rectangle(x-15, y+35, width + 50, height -50, Color.YELLOW);
        fourthDetailRectangle.draw(g2d);
        
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