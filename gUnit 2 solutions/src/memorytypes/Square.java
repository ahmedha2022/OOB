package memorytypes;
/*
 * A simple square class.
 * Try to locate the instance, local, and static variables.
 */
public class Square {

	public static int squareCount = 0;
	
	private int width;
	
	
	public Square(int width)
	{
		System.out.println("WIDTH IN THE BEGINNING WAS: " + this.width);
		this.width = width;
		squareCount++;
		
	}
	public void printSquare()
	{
		int area = width * width;
		System.out.println("area is = " + area);
	}

	public int getWidth()
	{
		
		return width;
	}
	
	public void setWidth(int width)
	{
		if (width > 0)
		this.width = width;
		else System.out.println("You're an Idiot!");
	}
	
	
	
}
