/**
 * This is a template for a Java file.
	
	@author Princess May Giron (232869)
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
 * This class was used to create the 3D wood found at the bottom part of the elongated window.
 **/
import java.awt.*;
import java.awt.geom.*;
public class ThreeDWood implements DrawingObject{
    private String shadow;
    private double x, y, height, width;
    private String className;
    public ThreeDWood(String shadow, double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.shadow = shadow;
        className = "ThreeDWood";
    }
    public String returnClassName () {
        return className;
    }

    public void draw(Graphics2D g2d) {

       
        Path2D.Double rightWood = new Path2D.Double();
        rightWood.moveTo(470,175);
        rightWood.lineTo(675,175);
        rightWood.lineTo(675, 350);
        rightWood.lineTo(470,350);
        g2d.setColor(new Color(27,26,13));
        g2d.fill(rightWood);

        Rectangle r1right = new Rectangle(480, 190, 185, 115, new Color(66,50,27));
        r1right.draw(g2d);

        Rectangle r2right = new Rectangle(490, 198, 165, 100, new Color(44,32,16));
        r2right.draw(g2d);

        Rectangle r3right = new Rectangle(500, 205, 145, 85, new Color(64,46,25));
        r3right.draw(g2d);

        Rectangle r4right = new Rectangle(510, 212, 125, 70, new Color(54,38,22));
        r4right.draw(g2d);

        Rectangle r5right = new Rectangle(525, 219, 95, 55, new Color(42,30,18));
        r5right.draw(g2d);

        Rectangle r6right = new Rectangle(540, 226, 65, 40, new Color(79,59,32));
        r6right.draw(g2d);

        Path2D.Double leftWood = new Path2D.Double();
        leftWood.moveTo(150, 175);
        leftWood.lineTo(150, 320);
        leftWood.lineTo(325,320);
        leftWood.lineTo(325,175);
        leftWood.closePath();
        g2d.setColor(new Color(27,26,13));
        g2d.fill(leftWood);

        Rectangle r1left = new Rectangle(163, 190, 150, 115, new Color(66,50,27));
        r1left.draw(g2d);
        
        Rectangle r2left = new Rectangle(170, 198, 135, 100, new Color(44,32,16));
        r2left.draw(g2d);

        Rectangle r3left = new Rectangle(177, 205, 120, 85, new Color(64,46,25));
        r3left.draw(g2d);

        Rectangle r4left = new Rectangle(184, 212, 105, 70, new Color(54,38,22));
        r4left.draw(g2d);

        Rectangle r5left = new Rectangle(192, 219, 90, 55, new Color(42,30,18));
        r5left.draw(g2d);

        Rectangle r6left = new Rectangle(204, 226, 65, 40, new Color(79,59,32));
        r6left.draw(g2d);



    }
    public void adjustX(double distance) {

    }
    public double getX() {
        return x;
    }
}
