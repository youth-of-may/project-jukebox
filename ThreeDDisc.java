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
 * This class was used to create the disc that can be found at the bottom left side of the window. Its constructor asks for five parameters.
 **/
import java.util.*;
import java.awt.*;
import java.awt.geom.*;
public class ThreeDDisc implements DrawingObject{
    private double x, y,tempY, width, height;
    private String className;
    private Color color;
    
     /**
		 * The constructor of this class has several parameters: x, y, width, height, and its color. It also instantiated the variables tempY and className in the constructor. 
		 **/
    public ThreeDDisc(double x, double y, double width, double height, Color color) {
       this.x =x;
       this.y = y;
       this.width = width;
       this.height = height;
       this.color = color;
       className = "ThreeDDisc";
       tempY = y;
        

    }
    /**
         * This method returns the name of the class. This method was used in the SceneCanvas class.
         **/
    public String returnClassName () {
        return className;
    }
   /**
         * This method is part of the DrawingObject interface. It was used to create and draw the graphics of this class.
         **/
    public void draw(Graphics2D g2d) {
        
        
        Rectangle firstRectangle = new Rectangle(x, y, width, height, new Color(27,27,27));
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

        

        //for the details
        Rectangle detail1 = new Rectangle(x+70, y-25, width- 140, height-90, Color.GRAY);
        detail1.draw(g2d);

        Rectangle detail2 = new Rectangle(x+25, y, width- 160, height-90, new Color(140,140,140));
        detail2.draw(g2d);

        Rectangle detail3 = new Rectangle(x+80, y+15, width- 160, height-90, new Color(27,27,27));
        detail3.draw(g2d);
        //for the box at the middle
       

        Square s1 = new Square(x+60, y+30, 50, color);
        s1.draw(g2d);

        Square s2 = new Square(x+73, y+43, 25,new Color(27,27,27));
        s2.draw(g2d);
        
        

    }
    /** 
     * This method can be used to change the color of the middle part of the disc. 
    **/
    public void changeColor(Color c) {
        color = c;
    }
    /**
         * This method can be used to adjust x. It has an parameter distance that will be added to x whenever this method is called.
         **/

    public void adjustX(double distance) {
        x+=distance;
    }
    /**
         * This method returns a double. It returns the instance x of the class.
         **/
    public double getX() {
        return x;
    }
    /**
     * This method can be used to move up the disc. 
     **/
    public void moveUp(double y) {
        this.y -=y;
    }
    /**
     * This method can be used to move down the disc.
     *  **/
    public void moveDown(double y) {
        this.y +=y;
    }
    /**
     * This method can be used to reset the y variable of the disc. 
     **/
    public void resetY() {
        y = tempY;
    }
    
}