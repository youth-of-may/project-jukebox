import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Snowfall implements DrawingObject{
	private double x,y;
	private String className;
	
	public Snowfall(double x, double y){
		this.x = x;
		this.y = y;
		className = "Snowfall";
	}
	public String returnClassName () {
        return className;
    }
	
	public void draw(Graphics2D g2d){
		
		//Collection of 4 snows to create an effect of multiple snowflakes
		Snow sw = new Snow(x,y);
		sw.draw(g2d);
		
		Snow sw2 = new Snow(x+20, y+30);
		sw2.draw(g2d);
		
		Snow sw3 = new Snow(x+40, y+20);
		sw3.draw(g2d);
		
		Snow sw4 = new Snow(x-10, y+30);
		sw4.draw(g2d);
	}
	
	public void adjustX(double distance){
		
	}
	
	public double getX(){
		return x;
	}
}
