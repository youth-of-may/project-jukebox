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

        /* 
        x = 505;
        y = 165;
        Square firstLayer = new Square(x,y, 5, new Color(182,137,70));
        Square secondLayer = new Square(x, y, 20, new Color(45, 34,16));
        Square thirdLayer = new Square(x,y, 40, new Color(54,38,22));
        Square fourthLayer = new Square(x, y, 80, new Color(55,39,23));
        Square fifthLayer = new Square(x,y, 160, new Color(64,45,26));
        

        //draw the squares
        fifthLayer.draw(g2d);
        fourthLayer.draw(g2d);
        thirdLayer.draw(g2d);
        secondLayer.draw(g2d);
        firstLayer.draw(g2d);

        //draw the shadows
        Path2D.Double left = new Path2D.Double();
        left.moveTo(x,y);
        left.lineTo(x-20, y-5);
        left.closePath();

        if (shadow.equals("left")) {

        }
        
        
        
        
         */
        //Square sixthLayer = new Square();
        //Square seventhLayer = new Square();
        //Square eightLayer = new Square();

        /* Coordinates
         * filler1.moveTo(490, 175);
        filler1.lineTo(477, 190);
        filler1.lineTo(477, 313);
        filler1.lineTo(490, 375);
         */
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

        

        

/*  Coordinates for mid part
 * Path2D.Double midPlank = new Path2D.Double();
        midPlank.moveTo(350,75);
        midPlank.lineTo(350,210);
        midPlank.lineTo(475, 210);
        midPlank.lineTo(475,75);
        midPlank.closePath();
        g2d.draw(midPlank);
*/
        


    }
    public void adjustX(double distance) {

    }
    public double getX() {
        return x;
    }
}
