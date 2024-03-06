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
 * This class is used to make the wood block and its details, it makes use of squares, rectangles, paths, and lines
 **/
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
/**
	wood implements the drawing interface and instantiates variables
**/
	public class Wood implements DrawingObject{ 
	private double x, y, size;
	private String className;
	/**
		gives values to the variables
	**/
		public Wood(double x, double y, double size){
		this.x = x;
		this.y = y;
		this.size = size;
		className = "Wood";
	}
	/**
		returns the name of the class
	**/
		public String returnClassName () {
       		return className;
    }
	/**
		draws out the wood block
	**/
		public void draw(Graphics2D g2d){
		
		//Main body of the wood block
		Square w = new Square(x-10,y,size+40,new Color(43,31,17));
		w.draw(g2d);
		
		//Top angle of the wood block
		Path2D.Double line4 = new Path2D.Double();
		line4.moveTo(x-10,y);
		line4.lineTo(475,300+25);
		line4.lineTo(670,300+25);
		line4.lineTo(720,y-5);
		line4.closePath();
		g2d.setColor(new Color(43,31,17));
		g2d.fill(line4);
		g2d.draw(line4);
		
		//Details of the wood block
		Rectangle r1 = new Rectangle(x+25,y+125,15,30,new Color(35,28,12));
		r1.draw(g2d);
		
		Rectangle r2 = new Rectangle(x+40,y+90,15,45,new Color(35,28,12));
		r2.draw(g2d);
		
		Rectangle r3 = new Rectangle(x+25,y+35,15,60,new Color(35,28,12));
		r3.draw(g2d);
		
		Rectangle r4 = new Rectangle(x+10,y+60,15,60,new Color(35,28,12));
		r4.draw(g2d);
		
		Rectangle r5 = new Rectangle(x+70,y+15,15,30,new Color(35,28,12));
		r5.draw(g2d);
		
		Rectangle r6 = new Rectangle(x+85,y+25,15,45,new Color(35,28,12));
		r6.draw(g2d);
		
		Rectangle r7 = new Rectangle(x+70,y+35,15,45,new Color(35,28,12));
		r7.draw(g2d);
		
		Rectangle r8 = new Rectangle(x+55,y+125,15,60,new Color(35,28,12));
		r8.draw(g2d);
		
		Rectangle r9 = new Rectangle(x+55,y+55,15,30,new Color(35,28,12));
		r9.draw(g2d);
		
		Rectangle r10 = new Rectangle(x+115+15,y+125,15,30,new Color(35,28,12));
		r10.draw(g2d);
		
		Rectangle r11 = new Rectangle(x+130+15,y+90,15,45,new Color(35,28,12));
		r11.draw(g2d);
		
		Rectangle r12 = new Rectangle(x+115+15,y+35,15,60,new Color(35,28,12));
		r12.draw(g2d);
		
		Rectangle r13 = new Rectangle(x+100+15,y+60,15,60,new Color(35,28,12));
		r13.draw(g2d);
		
		Rectangle r14 = new Rectangle(x+160+15,y+15,15,30,new Color(35,28,12));
		r14.draw(g2d);
		
		Rectangle r15 = new Rectangle(x+175+15,y+25,15,45,new Color(35,28,12));
		r15.draw(g2d);
		
		Rectangle r16 = new Rectangle(x+160+15,y+35,15,45,new Color(35,28,12));
		r16.draw(g2d);
		
		Rectangle r17 = new Rectangle(x+145+15,y+125,15,60,new Color(35,28,12));
		r17.draw(g2d);
		
		Rectangle r18 = new Rectangle(x+145+15,y+55,15,30,new Color(35,28,12));
		r18.draw(g2d);
		
		Line l0 = new Line(x,y,723,y,5,new Color(35,28,12));
		l0.draw(g2d);
		
		Line l1 = new Line(x+35,y-50,x+50,y-25,15,new Color(35,28,12));
		l1.draw(g2d);
		
		Line l2 = new Line(x+75,y-70,x+90,y-45,15,new Color(35,28,12));
		l2.draw(g2d);
		
		Line l3 = new Line(x+100,y-90,x+115,y-65,15,new Color(35,28,12));
		l3.draw(g2d);
		
		Line l4 = new Line(x+140,y-60,x+155,y-35,15,new Color(35,28,12));
		l4.draw(g2d);
		
		Line l5 = new Line(x,y-60,x+15,y-35,15,new Color(35,28,12));
		l5.draw(g2d);
		
		Line l6 = new Line(x+10,y-90,x+25,y-65,15,new Color(35,28,12));
		l6.draw(g2d);
		
		Line l7 = new Line(x+45,y-70,x+60,y-45,15,new Color(35,28,12));
		l7.draw(g2d);
		
		Line l8 = new Line(x+150,y-90,x+165,y-65,15,new Color(35,28,12));
		l8.draw(g2d);
		
		Line l9 = new Line(x+100,y-60,x+115,y-35,15,new Color(35,28,12));
		l9.draw(g2d);
		
		Line l10 = new Line(x+85,y-30,x+100,y-5,15,new Color(35,28,12));
		l10.draw(g2d);
	}
	/**
		adjusts the x value
	**/	
		public void adjustX(double distance){
		x += distance;
	}
	/**
		gets the x value
	**/
		public double getX(){
		return x;
	}
}
