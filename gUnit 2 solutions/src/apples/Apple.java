package apples;
/*
 * Practice class for modifying access modifiers
 */
public class Apple {

	//TODO 1: change the access modifier of variable "weight" to package (default)
	// Q1: What happens to Runner.java the package apples.big?
	// Q2: What if we move Runner.java to package apples?
	double weight;
	
	//TODO 2: change the access modifier of variable "color" to private
	// Q1: What happens inside Runner.java now? Can you suggest a fix?
	public String color;
	
	//TODO 3: Make the variable "color" also final.
	// Q1: What happens inside Runner.java now?
	
	// Answer: if we make color variable final, then we cannot change its value after object creation 
	
	public Apple(double weight, String color)
	{
		this.weight = weight;
		this.color = color;
	}
	

}
