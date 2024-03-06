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
 * This class contains a main method that was used to instantiate the SceneFrame class. It also calls the setUpGUI method of it.
 **/
public class SceneStarter {
	/**
	 * The main method was used to instantiate the SceneFrame class. This was the start of it all. the program won't function without this.
	 *  **/
    public static void main(String args[]) {
        SceneFrame s = new SceneFrame();
        s.setUpGUI();
    }
}
