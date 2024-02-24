To Do:

1. Two more classes for basic shapes (triangle, pentagon, octagon, etc.)
2. At least two (2) more classes that create composite shapes — a composite shape is onethat is created using a  combination of two or more instances of your basic shape classes. For example, you can create a Sun class, and inside that class, there is a Circle object (from the class that you created) for the sun's center, and a few Line objects (also from the class that you created) for the rays. Instead of using the Ellipse2D.Double and Line2D.Double classes, you must make use of your own Circle class and Line class for it to be considered a composite shape. You are allowed to augment them with any of the java.awt.geom classes, as long as you make use of at least two (2) of your own basic shape classes.
3. Elements
4. Figure out how we can incorporate a JButton (how it will function) to our program (The basic requirement for the animation is that you have one (1) button that, every time it is clicked, will move the objects in the scene. However, you are free to animate your project in different ways (e.g. clicking on the drawing instead of a JButton, continuous animation without any buttons, animation using keyboard keys, mouse assisted animation, etc.))
5. Javadoc comments - (kahit sa huli na)


Notes:

1. SceneCanvas.java
- where we will draw the elements of the animated scene
- the elements should be added/instantiated inside the constructor
2. SceneFrame.java
- contains the JFrame of the GUI
3. SceneStarter.java
- contains the main method that will instantiate the SceneFrame class


Grading
Provided that there are no errors, you will receive a maximum grade of 80 points (high C+) for fulfilling the
requirements stated above. For the possibility of earning a higher grade, create a project that shows a
deeper understanding of the lessons so far.
Some concrete examples of what you can do to possibly earn a higher grade are:
● implement listener interfaces other than the ActionListener interface
● create animation that is continuous (i.e. no need to repeatedly click)
● implement something that is unique or challenging
Quality of code shall also be taken into consideration. This includes, but is not limited to:
● formatting for clarity and readability
● using appropriate identifiers (names for fields, methods, and classes)
● maintaining consistency with naming schemes and conventions
● eliminating redundancy


Other listener interfaces include:
1. Actionlistener
2. AdjustmentListener
3. ComponentListener
4. ContainerListener
5. FocusListener
6. ItemListener
7. KeyListener
8. MouseListener
9. MouseMotionListener
10. MouseWheelListener
11. TextListener

link: https://www.startertutorials.com/corejava/event-listener-interfaces.html