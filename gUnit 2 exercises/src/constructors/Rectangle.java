package constructors;

public class Rectangle {

	public int width;
	public int height;

	public Rectangle()// the default constructor which we create insted of ajva and we need to put
						// intial valus
	{

		System.out.println("DEFAULT (EMPTY) CONSTRUCTOR");
		width = 1;
		height = 1;
	}

	public Rectangle(int width, int height) {
		this();
		System.out.println("My CONSTRUCTOR with two parameters");
		this.width = width;
		this.height = height;
	}

	// TODO 1: create a new constructor that takes only one parameter "width" -->
	// The constructor should set both the width and height to the taken parameter
	// "width"
	// Can you re-use a previous constructor? how? (hint: use "this")
	// Q1: how is the program output going to change before and after re-using
	// another constructor?
	/*
	 * a constructor to calculate square there are two methods first methods is
	 * creating a normal one without calling other constructor and creating
	 * variables by my self second method is creating is creating a constructor
	 * calaculating the rectangle by calling another constructor using this with
	 * paranthese and the parameters that will u put in the paranthese will decide
	 * wich constructr will be used
	 * 
	 * 
	 * 
	 * 
	 * /*first method public Rectangle(int width) { this.width =width; height=width;
	 * 
	 * 
	 * }
	 */
	// seoncd method

	public Rectangle(int width) {
		this(width, width);
		// here if i wanna use height i dont need to use this because i alreadr didnt
		// intialize it in the parameter
		// and if i wanna use it i just can do it like that height = width;

	}

	public void displayRect() {
		System.out.println("width = " + width + " height = " + height);
	}
}
