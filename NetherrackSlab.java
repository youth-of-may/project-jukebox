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
 * This class is used to create the netherrack slab, it makes use of rectangles, paths, and lines
 **/
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
/**
	netherrackslab implements the drawingobject interface and instantiates the variables
**/
	public class NetherrackSlab implements DrawingObject {
	
	private double x, y, x2, y2;
	private String className;
	/**
		gives the value to the variables
	**/
		public NetherrackSlab(double x, double y, double x2, double y2){
		this.x = x;
        	this.y = y;
		this.x2 = x2;
		this.y2 = y2;
		className = "NetherrackSlab";
	}
	/**
		gives the name of the class
	**/
		public String returnClassName () {
        	return className;
    }
	/**
		draws out the netherrack slab
	**/
		public void draw(Graphics2D g2d){
		
		//Main body of the netherrack slab
		Rectangle r1 = new Rectangle(x,y+50,x2,y2,new Color(29,13,14));
		r1.draw(g2d);
		
		//Upper angle of the netherrack slab
		Path2D.Double line = new Path2D.Double();
		line.moveTo(50,500+50);
		line.lineTo(150,380+50);
		line.lineTo(300,380+50);
		line.lineTo(300,500+50);
		line.closePath();
		g2d.draw(line);
		g2d.fill(line);
		
		//Details of the netherrack slab
		Line l0 = new Line(x+5,y+50,300,y+50,5,new Color(9,5,6));
		l0.draw(g2d);
		
		Line l1 = new Line(x+50,y+50,200,380+50,5,new Color(9,5,6));
		l1.draw(g2d);
		
		Line l2 = new Line(x+100,y+50,250,380+50,5,new Color(9,5,6));
		l2.draw(g2d);
		
		Line l3 = new Line(x+150,y+50,300,380+50,5,new Color(9,5,6));
		l3.draw(g2d);
		
		Line hori = new Line(x+25,y+20,x+70,y+20,5,new Color(9,5,6));
		hori.draw(g2d);
		
		Line hori2 = new Line(x+85,y-50,x+135,y-50,5,new Color(9,5,6));
		hori2.draw(g2d);
		
		Line hori3 = new Line(x+70,y+30,x+120,y+30,5,new Color(9,5,6));
		hori3.draw(g2d);
		
		Line hori4 = new Line(x+110,y-25,x+160,y-25,5,new Color(9,5,6));
		hori4.draw(g2d);
		
		Line hori5 = new Line(x+140,y-60,x+190,y-60,5,new Color(9,5,6));
		hori5.draw(g2d);
		
		Line hori6 = new Line(x+90,y,x+140,y,5,new Color(9,5,6));
		hori6.draw(g2d);
		
		Line hori7 = new Line(x+150,y-10,x+200,y-10,5,new Color(9,5,6));
		hori7.draw(g2d);
		
		Line hori8 = new Line(x+210,y-20,x+260,y-20,5,new Color(9,5,6));
		hori8.draw(g2d);
		
		Line verti = new Line(x+50,y+50,x+50,y+100,5,new Color(9,5,6));
		verti.draw(g2d);
		
		Line verti2 = new Line(x+100,y+50,x+100,y+100,5,new Color(9,5,6));
		verti2.draw(g2d);
		
		Line verti3 = new Line(x+150,y+50,x+150,y+100,5,new Color(9,5,6));
		verti3.draw(g2d);
		
		Line verti4 = new Line(x+200,y+50,x+200,y+100,5,new Color(9,5,6));
		verti4.draw(g2d);
	}
		/**
				changes the x value
		**/
		public void adjustX(double distance){
			x += distance;
	}
		/**
				gives the x value
		**/
		public double getX(){
		return x;
	}
}
