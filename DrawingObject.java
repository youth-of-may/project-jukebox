/**
 * This is a template for a Java file.
	
	@author Princess May Giron (232869), Jienzel Christenzen H. Chua (231567)
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
 * This interface served as the backbone of the program. It served as a blueprint that contained the methods necessary to the program. We also added an additional method returnClassName to perform additional "operations" to the program.
 **/
import java.awt.*;
public interface DrawingObject {
    void draw(Graphics2D g2d);
    void adjustX(double distance);
    double getX();
    String returnClassName();

}
