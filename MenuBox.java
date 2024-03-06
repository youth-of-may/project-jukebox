/**
 * This is a template for a Java file.
	
	@author Princess May Giron (232869), Jienzel Christenzen H. Chua (231567)
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
 * This class was used to create the boxes with discs found in the toolbox.
 **/
import java.awt.*;
import java.awt.geom.*;
import java.util.*;
public class MenuBox implements DrawingObject {
    private double x,  y, size;
    private static int count = 0;
    private ArrayList<Color> colorList;
    private Square outerS, middleS;
    private Disc disc;
    private boolean selected;
    private Color shadow,innerBox;
    private String className;
    /**
		 * The constructor of this class has several parameters: x, y, and its size. It also instantiated the variables selected, className, colorList, innerBox,outerS, middleS, and disc here. It called the method addCount at the end of it. 
		 **/
    public MenuBox(double x, double y, double size) {
         
        this.x = x;
        this.y = y;
        this.size = size;
        selected = false;
        className = "MenuBox";
        


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

        innerBox = new Color(39,34,12);

        outerS = new Square(x,y,size, new Color(169,171,168));
        middleS = new Square(x+5, y+4.5, size*0.85, new Color(92,92,92));
        disc = new Disc(x+10, y+15, 0.40, colorList.get(count));
        addCount();
    }
    /**
         * This method returns the name of the class. This method was used in the SceneCanvas class.
         **/
    public String returnClassName () {
        
        return className;
    } 
    /**
         * This method was used to keep track of the number of discs made.
          **/
    private static void addCount() {
       
        count++;
    }
    /**
         * This method is part of the DrawingObject interface. It was used to create and draw the graphics of this class.
         **/
    public void draw(Graphics2D g2d){
        
        double tentativeY = y;
        float thickness = 4;

        //declare a lighter color for the shadow/for the thingy behind the discs
        outerS.draw(g2d);
        middleS.draw(g2d);
        

        Rectangle2D.Double r1 = new Rectangle2D.Double(x+8,y+8.5, size *.70, size *.70);
        g2d.setColor(innerBox);
        g2d.fill(r1);

        y+=3;
        //color highlighted
        if(selected){
        g2d.setColor(new Color(68,11,11));
        g2d.fill(r1);
        shadow = new Color(218,165,32);
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
        }
        disc.draw(g2d);

       

         y = tentativeY;

        //for the border
        Line topBorder = new Line(x,y,x+size,y,thickness, Color.GRAY);
        topBorder.draw(g2d);

        Line bottomBorder = new Line(x,y+size,x+size,y+ size,thickness, new Color(70,73,67));
        bottomBorder.draw(g2d);

        Line leftBorder = new Line(x,y,x,y+ size,thickness, new Color(70,73,67));
        leftBorder.draw(g2d);

        Line rightBorder = new Line(x+size,y,x+size,y+ size,thickness, new Color(70,73,67));
        rightBorder.draw(g2d);

        
    }
    /**
         * This method can be used to adjust x. It has an parameter distance that will be added to x whenever this method is called.
         **/
    public void adjustX(double distance){
        
            x+= distance;
    }
    /**
         * This method returns a double. It returns the instance x of the class.
         **/
    public double getX(){
        
        return x;
    }
    /**
         * This method was used to change the selected variable to true. 
         **/
    public void selectBox() {
        
        selected = true;
    }
    /**
         * This method was used to change selected to false.
         **/
    public void resetSelect () {
        
        selected = false;
    }
    /** 
     * This method returns selected. 
    **/
    public boolean returnSelected() {
        return selected;
    }
    
}