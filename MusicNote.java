import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class MusicNote extends JComponent {
	
	public MusicNote(){
		
	}
	
	@Override
	protected void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
	
		Square s1 = new Square(100,0,50,new Color(98,179,164));
		s1.draw(g2d);
		
		Square s2 = new Square(150,0,50,new Color(82,145,136));
		s2.draw(g2d);
		
		Square s3 = new Square(100,50,50,new Color(98,179,164));
		s3.draw(g2d);
		
		Square s4 = new Square(150,50,50,new Color(58,105,95));
		s4.draw(g2d);
		
		Square s5 = new Square(200,50,50,new Color(80,146,134));
		s5.draw(g2d);
		
		Square s6 = new Square(100,100,50,new Color(98,179,164));
		s6.draw(g2d);
		
		Square s7 = new Square(200,100,50,new Color(44,81,74));
		s7.draw(g2d);
		
		Square s8 = new Square(100,150,50,new Color(80,146,134));
		s8.draw(g2d);
		
		Square s9 = new Square(100,200,50,new Color(80,146,134));
		s9.draw(g2d);
		
		Square s10 = new Square(100,250,50,new Color(80,146,134));
		s10.draw(g2d);
		
		Square s11 = new Square(0,300,50,new Color(134,243,222));
		s11.draw(g2d);
		
		Square s12 = new Square(50,300,50,new Color(98,179,164));
		s12.draw(g2d);
		
		Square s13 = new Square(100,300,50,new Color(58,105,95));
		s13.draw(g2d);
		
		Square s14 = new Square(0,350,50,new Color(58,105,95));
		s14.draw(g2d);
		
		Square s15 = new Square(50,350,50,new Color(44,81,74));
		s15.draw(g2d);
		
		Square s16 = new Square(100,350,50,new Color(44,81,74));
		s16.draw(g2d);
	}	
}
