import java.util.*;
import java.awt.*;
import java.awt.geom.*;
public class ThreeDDisc implements DrawingObject{
    private double x, y, width, height;
    private String className;
    private Color color;
    

    public ThreeDDisc(double x, double y, double width, double height, Color color) {
       this.x =x;
       this.y = y;
       this.width = width;
       this.height = height;
       this.color = color;
       className = "ThreeDDisc";
        

    }
    public String returnClassName () {
        return className;
    }
   
    public void draw(Graphics2D g2d) {
        
        
        Rectangle firstRectangle = new Rectangle(x, y, width, height, new Color(82,81,82));
        firstRectangle.draw(g2d);

        Rectangle firstDetailRectangle = new Rectangle(x+15, y+65, width-30, height-50, new Color(33,33,33));
        firstDetailRectangle.draw(g2d);

        Rectangle secondDetailRectangle = new Rectangle(x+15, y-15, width-30, height-50, new Color(33,33,33));
        secondDetailRectangle.draw(g2d);

        Rectangle secondRectangle = new Rectangle(x+35, y-30, width -75, height+60, new Color(33,33,33));
        secondRectangle.draw(g2d);

        

        Rectangle thirdRectangle = new Rectangle(x-25, y+25, width + 50, height -50,new Color(44,44,44));
        thirdRectangle.draw(g2d);

        Rectangle thirdDetailRectangle = new Rectangle(x-15, y+15, width + 50, height -50, new Color(33,33,33));
        thirdDetailRectangle.draw(g2d);

        Rectangle fourthDetailRectangle = new Rectangle(x-15, y+35, width + 50, height -50,new Color(33,33,33));
        fourthDetailRectangle.draw(g2d);
        
        //for the box at the middle

        Square s1 = new Square(x+60, y+30, 50, color);
        s1.draw(g2d);
        /* 
        figure out how to add an outline to the toolbox
        g2d.setStroke(new BasicStroke(4));
        g2d.setColor(Color.BLUE);
        Rectangle2D.Double outline = new Rectangle2D.Double(x,y, width, height);
        g2d.fill(outline);

        */
    }
    public void changeColor(Color c) {
        color = c;
    }
    public void adjustX(double distance) {
        x+=distance;
    }
    public double getX() {
        return x;
    }
    
}