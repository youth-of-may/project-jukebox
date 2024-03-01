import java.awt.*;
import java.awt.geom.*;
import java.util.*;
public class MenuBox implements DrawingObject {
    private double x,  y, size;
    private static int count = 0;
    private ArrayList<Color> colorList;
    private Square outerS, middleS, innerS;
    private Disc disc;
    private boolean selected;
    public MenuBox(double x, double y, double size) {
        this.x = x;
        this.y = y;
        this.size = size;
        selected = false;

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
        innerS = new Square(x+8,y+8.5, size *.70, new Color(39,34,12));
        disc = new Disc(x+10, y+15, 0.40, colorList.get(count));
        addCount();
    }
    private static void addCount() {
        //to keep track of number of discs made
        count++;
    }
    public void draw(Graphics2D g2d){
        double tentativeY = y;
        float thickness = 4;

        //declare a lighter color for the shadow/for the thingy behind the discs
        outerS.draw(g2d);
        middleS.draw(g2d);
        innerS.draw(g2d);

        y+=3;
        //color highlighted
        
        Color shadow = new Color(53,46,15);
        //shadows behind the discs
        Line layer1 = new Line((x+20), y+12, x+30, y+12, 4, shadow);
        layer1.draw(g2d);

        Line layer2 = new Line((x+13), y+15, x+35, y+15, 4, shadow);
        layer2.draw(g2d);
        
        Line layer3 = new Line((x+10), y+20, x+40, y+20, 4, shadow);
        layer3.draw(g2d);
        disc.draw(g2d);

        Line layer4 = new Line((x+10), y+23, x+40, y+23, 4, shadow);
        layer4.draw(g2d);

        Line layer5 = new Line((x+13), y+28, x+35, y+28, 4, shadow);
        layer5.draw(g2d);

        Line layer6 = new Line((x+20), y+31, x+30, y+31, 4, shadow);
        layer6.draw(g2d);

        Line layer7 = new Line((x+20), y+32, x+30, y+32, 4, shadow);
        layer7.draw(g2d);

        disc.draw(g2d);

        /*
         * innerS = new Square(x+8,y+8.5, size *.70, new Color(39,29,6));
         */
        /*
         * 
         */

         y = tentativeY;

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
        selected = true;
    }
}