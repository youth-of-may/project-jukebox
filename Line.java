import java.awt.*;
public class Line extends DrawingObject {
    private double x1, y1, x2, y2, thickness;
    private Color color;

    public Line(double x1, double y1, double x2, double y2, double thickness, Color color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.thickness  = thickness;
        this.color = color;
    }

    public void draw(Graphics2D g2d){

    }
    public void adjustX(double distance) {

    }
    public double getX(){
        return x2;
    }
}
