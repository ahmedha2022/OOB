package memorytypes;
/*
 * A class that creates Square objects and interacts with them.
 * Try to simulate placement of variables in memory for this program.
 */

public class Runner {
	
	static Square s2;
	public static void main(String[] args) {
		createSquares();
		
		//Notice that the variable square count is accessed using the class name directly
		System.out.println("Number of Squares: " + Square.squareCount);
	}
	
	public static void createSquares()
	{
		Square s1;
		
		
		s1 = new Square(2);
		
		s1.setWidth(-5);
		System.out.println("The width of s1 is " + s1.getWidth());
		
		//s2 = new Square(4);
		
		s1.printSquare();
		System.out.println("My s1 has: " + s1);
		System.out.println("My s2 has: " + s2);
		
	}
	
	

}
