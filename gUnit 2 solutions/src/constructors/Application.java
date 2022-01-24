package constructors;
/*
 * A program that shows an example of using a default constructor (empty parameters)
 * and a custom one that takes in two parameters (width and height).
 */
public class Application {

	public static void main(String[] args) {
		

		//TODO 2: create a new Rectangle (SQUARE) using your work from todo 1
		// initialize the above Rectangle using the value 6 (for width and height)
		Rectangle sq1 = new Rectangle(6);
		
		//TODO 3: display the rectangle you created in todo 2 above using the dispRect method from the Rectangle class.
		sq1.displayRect();
	}

}
