package constructors;

public class Rectangle {

	public int width;
	public int height;
	
	public Rectangle()
	{
		System.out.println("DEFAULT (EMPTY) CONSTRUCTOR");
		width = 1;
		height = 1;
	}
	
	public Rectangle(int width, int height)
	{
		System.out.println("My CONSTRUCTOR with two parameters");
		this.width = width;
		this.height = height;
	}
	
	//TODO 1: create a new constructor that takes only one parameter "width"
		//The constructor should set both the width and height to the taken parameter "width"
		//Can you re-use a previous constructor? how? (hint: use "this")
		//Q1: how is the program output going to change before and after re-using another constructor?
	public Rectangle(int x)
	{
		this(x, x);
	}
	
	public void displayRect()
	{
		System.out.println("width = " + width + " height = " + height);
	}
}













