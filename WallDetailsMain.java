import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class WallDetailsMain implements DrawingObject{
	private double x,y;
	private String className;
	
	public WallDetailsMain(double x, double y){
		this.x = x;
		this.y = y;
		className = "WallDetailsMain";
	}
	public String returnClassName () {
        return className;
    }
	public void draw(Graphics2D g2d){
		
		//Collection of all the wood details so that it may be used on both walls
		Rectangle rec = new Rectangle(x+20,y+140,10,70,new Color(43,33,21));
		rec.draw(g2d);
		
		Rectangle rec2 = new Rectangle(x+35,y+320,10,70,new Color(43,33,21));
		rec2.draw(g2d);
		
		WallDetails wd = new WallDetails(x+200,y+310);
		wd.draw(g2d);
		
		WallDetails wd2 = new WallDetails(x+160,y+310);
		wd2.draw(g2d);
		
		WallDetails wd3 = new WallDetails(x+190,y+330);
		wd3.draw(g2d);
		
		WallDetails wd4 = new WallDetails(x+50,y+320);
		wd4.draw(g2d);
		
		WallDetails wd5 = new WallDetails(x+50,y+220);
		wd5.draw(g2d);
		
		WallDetails wd6 = new WallDetails(x+30,y+350);
		wd6.draw(g2d);
		
		WallDetails wd7 = new WallDetails(x+10,y+250);
		wd7.draw(g2d);
		
		WallDetails wd8 = new WallDetails(x+30,y+450);
		wd8.draw(g2d);
		
		WallDetails wd9 = new WallDetails(x+(-10),y+190);
		wd9.draw(g2d);
		
		WallDetails wd10 = new WallDetails(x+70,y+370);
		wd10.draw(g2d);
		
		WallDetails wd11 = new WallDetails(x+10,y+180);
		wd11.draw(g2d);
		
		WallDetails wd12 = new WallDetails(x+30,y+500);
		wd12.draw(g2d);
		
		WallDetails wd13 = new WallDetails(x+10,y+450);
		wd13.draw(g2d);
		
		WallDetails wd14 = new WallDetails(x+30,y+400);
		wd14.draw(g2d);
		
		WallDetails wd15 = new WallDetails(x+20,y+380);
		wd15.draw(g2d);
		
		WallDetails2 det = new WallDetails2(x+(-5),y+160);
		det.draw(g2d);
		
		WallDetails2 det2 = new WallDetails2(x+(-5),y+270);
		det2.draw(g2d);
		
		WallDetails2 det3 = new WallDetails2(x+35,y+350);
		det3.draw(g2d);
		
		WallDetails2 det4 = new WallDetails2(x+200,y+320);
		det4.draw(g2d);
		
		WallDetails2 det5 = new WallDetails2(x+250,y+290);
		det5.draw(g2d);
	}
	
	public void adjustX(double distance){
	
	}
	
	public double getX(){
		return x;
	}
}
