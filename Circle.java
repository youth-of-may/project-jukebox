import java.awt.*;
public class Circle implements DrawingObject {
    private double x, y, size;
    private Color color;

    public Circle(double x, double y, double size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    public void draw(Graphics2D g2d){

    }
    public void adjustX(double distance) {

    }
    public double getX(){
        return x;
    }
}
