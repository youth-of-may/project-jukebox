import java.awt.*;
import java.awt.geom.*;
public class ThreeDWood implements DrawingObject{
    private String shadow;
    private double x, y, height, width;
    public ThreeDWood(String shadow, double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.shadow = shadow;
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
        rightWood.moveTo(490,175);
        rightWood.lineTo(675,175);
        rightWood.lineTo(675, 350);
        rightWood.lineTo(490,350);
        g2d.setColor(new Color(27,26,13));
        g2d.fill(rightWood);
/* */
        Path2D.Double rightWood2 = new Path2D.Double();
        rightWood2.moveTo(510, 195);
        rightWood2.moveTo(685, 195);
        rightWood2.moveTo(685,330);
        //rightWood2.moveTo(510,330);
        g2d.setColor(Color.RED);
        g2d.fill(rightWood2);


    }
    public void adjustX(double distance) {

    }
    public double getX() {
        return x;
    }
}
