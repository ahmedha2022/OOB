package apples;

public class Runner {

	public static void main(String [] args)
	{
		Apple a1 = new Apple(55.4, "green");
		
		
		a1.color = "red";
		System.out.println("The weight is: " + a1.weight);
		System.out.println("The color is: " + a1.color);
	}
}
