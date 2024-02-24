import java.awt.*;
public abstract class DrawingObject {
    abstract void draw(Graphics2D g2d);
    abstract void adjustX(double distance);
    abstract double getX();
}
