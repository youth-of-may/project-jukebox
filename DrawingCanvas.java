import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class DrawingCanvas extends JComponent {
	
	public DrawingCanvas(){
		
	}
	
	@Override
	protected void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		
		Rectangle2D.Double d1 = new Rectangle2D.Double(250,0,250,500);
		g2d.setColor(Color.BLACK);
		g2d.fill(d1);
		
		Rectangle2D.Double d2 = new Rectangle2D.Double(100,50,550,400);
		g2d.setColor(Color.BLACK);
		g2d.fill(d2);

		Rectangle2D.Double d3 = new Rectangle2D.Double(50,100,650,300);
		g2d.setColor(Color.BLACK);
		g2d.fill(d3);
		
		Rectangle2D.Double d4 = new Rectangle2D.Double(0,150,750,200);
		g2d.setColor(Color.BLACK);
		g2d.fill(d4);
		
		Rectangle2D.Double d5 = new Rectangle2D.Double(250,50,250,400);
		g2d.setColor(new Color(64,64,64));
		g2d.fill(d5);
		
		Rectangle2D.Double d6 = new Rectangle2D.Double(100,100,550,300);
		g2d.setColor(new Color(64,64,64));
		g2d.fill(d6);
		
		Rectangle2D.Double d7 = new Rectangle2D.Double(50,150,650,200);
		g2d.setColor(new Color(64,64,64));
		g2d.fill(d7);
		
		Rectangle2D.Double in = new Rectangle2D.Double(300,150,150,150);
		g2d.setColor(Color.YELLOW);
		g2d.fill(in);
		
		Rectangle2D.Double in2 = new Rectangle2D.Double(250,200,50,50);
		g2d.setColor(Color.YELLOW);
		g2d.fill(in2);
		
		Rectangle2D.Double in3 = new Rectangle2D.Double(350,200,50,50);
		g2d.setColor(Color.BLACK);
		g2d.fill(in3);
		
		Rectangle2D.Double in4 = new Rectangle2D.Double(300,250,150,50);
		g2d.setColor(Color.WHITE);
		g2d.fill(in4);
		
		Rectangle2D.Double in5 = new Rectangle2D.Double(400,200,100,50);
		g2d.setColor(Color.WHITE);
		g2d.fill(in5);
		
		Rectangle2D.Double det = new Rectangle2D.Double(50,300,50,50);
		g2d.setColor(new Color(38,38,38));
		g2d.fill(det);
		
		Rectangle2D.Double det2 = new Rectangle2D.Double(100,350,150,50);
		g2d.setColor(new Color(38,38,38));
		g2d.fill(det2);
		
		Rectangle2D.Double det3 = new Rectangle2D.Double(250,400,250,50);
		g2d.setColor(new Color(38,38,38));
		g2d.fill(det3);
		
		Rectangle2D.Double det4 = new Rectangle2D.Double(500,350,150,50);
		g2d.setColor(new Color(38,38,38));
		g2d.fill(det4);
		
		Rectangle2D.Double det5 = new Rectangle2D.Double(650,300,50,50);
		g2d.setColor(new Color(38,38,38));
		g2d.fill(det5);
		
		Rectangle2D.Double bit = new Rectangle2D.Double(100,200,50,50);
		g2d.setColor(new Color(81,81,81));
		g2d.fill(bit);
		
		Rectangle2D.Double bit2 = new Rectangle2D.Double(150,150,100,50);
		g2d.setColor(new Color(81,81,81));
		g2d.fill(bit2);
		
		Rectangle2D.Double bit3 = new Rectangle2D.Double(150,250,50,50);
		g2d.setColor(new Color(81,81,81));
		g2d.fill(bit3);
		
		Rectangle2D.Double bit4 = new Rectangle2D.Double(300,100,50,50);
		g2d.setColor(new Color(81,81,81));
		g2d.fill(bit4);
		
		Rectangle2D.Double bit5 = new Rectangle2D.Double(250,300,100,50);
		g2d.setColor(new Color(81,81,81));
		g2d.fill(bit5);
		
		Rectangle2D.Double bit6 = new Rectangle2D.Double(400,100,100,50);
		g2d.setColor(new Color(81,81,81));
		g2d.fill(bit6);
		
		Rectangle2D.Double bit7 = new Rectangle2D.Double(400,300,50,50);
		g2d.setColor(new Color(81,81,81));
		g2d.fill(bit7);
		
		Rectangle2D.Double bit8 = new Rectangle2D.Double(500,250,100,50);
		g2d.setColor(new Color(81,81,81));
		g2d.fill(bit8);
		
		Rectangle2D.Double bit9 = new Rectangle2D.Double(550,150,50,50);
		g2d.setColor(new Color(81,81,81));
		g2d.fill(bit9);
		
		Rectangle2D.Double bit10 = new Rectangle2D.Double(600,200,50,50);
		g2d.setColor(new Color(81,81,81));
		g2d.fill(bit10);
	}
}