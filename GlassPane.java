import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class GlassPane extends JComponent {
	
	public GlassPane(){
		
	}
	
	@Override
	protected void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		
		Square m1 = new Square(0,0,50,new Color(165,188,185));
		m1.draw(g2d);
		
		Square m2 = new Square(50,0,50,new Color(165,188,185));
		m2.draw(g2d);
		
		Square m3 = new Square(100,0,50,new Color(165,188,185));
		m3.draw(g2d);
		
		Square m4 = new Square(150,0,50,new Color(165,188,185));
		m4.draw(g2d);
		
		Square m5 = new Square(200,0,50,new Color(165,188,185));
		m5.draw(g2d);
		
		Square m6 = new Square(250,0,50,new Color(165,188,185));
		m6.draw(g2d);
		
		Square m7 = new Square(300,0,50,new Color(165,188,185));
		m7.draw(g2d);
		
		Square m8 = new Square(350,0,50,new Color(165,188,185));
		m8.draw(g2d);
		
		Square m9 = new Square(400,0,50,new Color(165,188,185));
		m9.draw(g2d);
		
		Square m10 = new Square(450,0,50,new Color(165,188,185));
		m10.draw(g2d);
		
		Square m11 = new Square(500,0,50,new Color(165,188,185));
		m11.draw(g2d);
		
		Square m12 = new Square(550,0,50,new Color(165,188,185));
		m12.draw(g2d);
		
		Square m13 = new Square(600,0,50,new Color(165,188,185));
		m13.draw(g2d);
		
		Square m14 = new Square(650,0,50,new Color(165,188,185));
		m14.draw(g2d);
		
		Square m15 = new Square(700,0,50,new Color(165,188,185));
		m15.draw(g2d);
		
		Square m16 = new Square(750,0,50,new Color(138,165,172));
		m16.draw(g2d);
		
		Square d1 = new Square(0,50,50,new Color(165,188,185));
		d1.draw(g2d);
		
		Square d2 = new Square(0,100,50,new Color(165,188,185));
		d2.draw(g2d);
		
		Square d3 = new Square(0,150,50,new Color(165,188,185));
		d3.draw(g2d);
		
		Square d4 = new Square(0,200,50,new Color(165,188,185));
		d4.draw(g2d);
		
		Square d5 = new Square(0,250,50,new Color(165,188,185));
		d5.draw(g2d);
		
		Square d6 = new Square(0,300,50,new Color(165,188,185));
		d6.draw(g2d);
		
		Square d7 = new Square(0,350,50,new Color(165,188,185));
		d7.draw(g2d);
		
		Square d8 = new Square(0,400,50,new Color(165,188,185));
		d8.draw(g2d);
		
		Square d9 = new Square(0,450,50,new Color(165,188,185));
		d9.draw(g2d);
		
		Square d10 = new Square(0,500,50,new Color(165,188,185));
		d10.draw(g2d);
		
		Square d11 = new Square(0,550,50,new Color(165,188,185));
		d11.draw(g2d);
		
		Square d12 = new Square(0,600,50,new Color(136,167,170));
		d12.draw(g2d);
		
		Square d13 = new Square(0,650,50,new Color(165,188,185));
		d13.draw(g2d);
		
		Square d14 = new Square(0,700,50,new Color(136,167,170));
		d14.draw(g2d);
		
		Square d15 = new Square(0,750,50,new Color(136,167,170));
		d15.draw(g2d);
		
		Square i1 = new Square(100,200,50,new Color(132,167,169));
		i1.draw(g2d);
		
		Square i2 = new Square(150,150,50,new Color(162,186,185));
		i2.draw(g2d);
		
		Square i3 = new Square(200,100,50,new Color(168,186,185));
		i3.draw(g2d);
		
		Square i4 = new Square(650,600,50,new Color(167,189,186));
		i4.draw(g2d);
		
		Square i5 = new Square(600,650,50,new Color(167,189,186));
		i5.draw(g2d);
		
		Square r1 = new Square(750,50,50,new Color(138,165,172));
		r1.draw(g2d);
		
		Square r2 = new Square(750,100,50,new Color(97,139,144));
		r2.draw(g2d);
		
		Square r3 = new Square(750,150,50,new Color(97,139,144));
		r3.draw(g2d);
		
		Square r4 = new Square(750,200,50,new Color(97,139,144));
		r4.draw(g2d);
		
		Square r5 = new Square(750,250,50,new Color(110,153,160));
		r5.draw(g2d);
		
		Square r6 = new Square(750,300,50,new Color(97,139,144));
		r6.draw(g2d);
		
		Square r7 = new Square(750,350,50,new Color(110,153,160));
		r7.draw(g2d);
		
		Square r8 = new Square(750,400,50,new Color(110,153,160));
		r8.draw(g2d);
		
		Square r9 = new Square(750,450,50,new Color(110,153,160));
		r9.draw(g2d);
		
		Square r10 = new Square(750,500,50,new Color(110,153,160));
		r10.draw(g2d);
		
		Square r11 = new Square(750,550,50,new Color(110,153,160));
		r11.draw(g2d);
		
		Square r12 = new Square(750,600,50,new Color(110,153,160));
		r12.draw(g2d);
		
		Square r13 = new Square(750,650,50,new Color(110,153,160));
		r13.draw(g2d);
		
		Square r14 = new Square(750,700,50,new Color(135,167,175));
		r14.draw(g2d);
		
		Square r15 = new Square(750,750,50,new Color(135,167,175));
		r15.draw(g2d);
		
		Square r16 = new Square(700,750,50,new Color(135,167,175));
		r16.draw(g2d);
		
		Square b1 = new Square(650,750,50,new Color(113,150,161));
		b1.draw(g2d);
		
		Square b2 = new Square(600,750,50,new Color(113,150,161));
		b2.draw(g2d);
		
		Square b3 = new Square(550,750,50,new Color(113,150,161));
		b3.draw(g2d);
		
		Square b4 = new Square(500,750,50,new Color(113,150,161));
		b4.draw(g2d);
		
		Square b5 = new Square(450,750,50,new Color(113,150,161));
		b5.draw(g2d);
		
		Square b6 = new Square(400,750,50,new Color(113,150,161));
		b6.draw(g2d);
		
		Square b7 = new Square(350,750,50,new Color(113,150,161));
		b7.draw(g2d);
		
		Square b8 = new Square(300,750,50,new Color(113,150,161));
		b8.draw(g2d);
		
		Square b9 = new Square(250,750,50,new Color(113,150,161));
		b9.draw(g2d);
		
		Square b10 = new Square(200,750,50,new Color(113,150,161));
		b10.draw(g2d);
		
		Square b11 = new Square(150,750,50,new Color(135,163,172));
		b11.draw(g2d);
		
		Square b12 = new Square(100,750,50,new Color(113,150,161));
		b12.draw(g2d);
		
		Square b13 = new Square(50,750,50,new Color(135,163,172));
		b13.draw(g2d);
		
		Square b14 = new Square(0,750,50,new Color(135,163,172));
		b14.draw(g2d);
	}
}