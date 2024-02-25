import java.awt.*;
import java.awt.geom.*;
import java.util.*;
public class MenuBox implements DrawingObject {
    private double x,  y, size;
    private static int count = 0;
    private ArrayList<Color> colorList;
    private Square outerS, middleS, innerS;
    private Disc disc;
    public MenuBox(double x, double y, double size) {
        this.x = x;
        this.y = y;
        this.size = size;

        //adding colors to the list
        colorList = new ArrayList<>();
        colorList.add(Color.YELLOW);
        colorList.add(Color.RED);
        colorList.add(Color.BLUE);
        colorList.add(Color.GREEN);
        colorList.add(new Color(203,108,230));
        colorList.add(new Color(255,145,77));
        colorList.add(new Color(140,82,255));
        colorList.add(new Color(255,215,205));
        colorList.add(new Color(201,250,219));
        colorList.add(new Color(230,156,143));

        outerS = new Square(x,y,size, new Color(169,171,168));
        middleS = new Square(x+5, y+4.5, size*0.85, new Color(92,92,92));
        innerS = new Square(x+8,y+8.5, size *.70, new Color(39,29,6));
        disc = new Disc(x+8, y+13, 0.45, colorList.get(count));
        addCount();
    }
    private static void addCount() {
        //to keep track of number of discs made
        count++;
    }
    public void draw(Graphics2D g2d){
        float thickness = 4;
        outerS.draw(g2d);
        middleS.draw(g2d);
        innerS.draw(g2d);
        
        disc.draw(g2d);

        //for the border
        Line topBorder = new Line(x,y,x+size,y,thickness, Color.BLACK);
        topBorder.draw(g2d);

        Line bottomBorder = new Line(x,y+size,x+size,y+ size,thickness, new Color(70,73,67));
        bottomBorder.draw(g2d);

        Line leftBorder = new Line(x,y,x,y+ size,thickness, new Color(70,73,67));
        leftBorder.draw(g2d);

        Line rightBorder = new Line(x+size,y,x+size,y+ size,thickness, new Color(70,73,67));
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