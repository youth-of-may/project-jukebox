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