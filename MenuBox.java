import java.awt.*;
import java.awt.geom.*;
public class MenuBox implements DrawingObject {
    private double x,  y, size;
    private Color color;
    private Square outerS, middleS, innerS;
    public MenuBox(double x, double y, double size) {
        this.x = x;
        this.y = y;
        this.size = size;
        outerS = new Square(x,y,size, new Color(169,171,168));
        middleS = new Square(x+5, y+4.5, size*0.85, new Color(92,92,92));
        innerS = new Square(x+8,y+8.5, size *.70, new Color(39,29,6));
    }
    public void draw(Graphics2D g2d){
        outerS.draw(g2d);
        middleS.draw(g2d);
        innerS.draw(g2d);

        //for the border
        Line topBorder = new Line(x,y,x+size,y,4, Color.BLACK);
        topBorder.draw(g2d);

        Line bottomBorder = new Line(x,y+size,x+size,y+ size,4, new Color(70,73,67));
        bottomBorder.draw(g2d);

        Line leftBorder = new Line(x,y,x,y+ size,4, new Color(70,73,67));
        leftBorder.draw(g2d);

        Line rightBorder = new Line(x+size,y,x+size,y+ size,4, new Color(70,73,67));
        rightBorder.draw(g2d);
    }
    public void adjustX(double distance){

    }
    public double getX(){
        return x;
    }
    public void selectBox() {

        //figure out how to enlarge square when selected
    }
}