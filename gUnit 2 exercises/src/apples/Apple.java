package apples;
/*
 * Practice class for modifying access modifiers
 */
public class Apple {

	//TODO 1: change the access modifier of variable "weight" to package (default)
	
	// Q1: What happens to Runner.java the package apples.big?
	// Q2: What if we move Runner.java to package apples?
	 double weight; // if u put default access modifier will not be visible to other package u need to put it same package
	
	//TODO 2: change the access modifier of variable "color" to private
	// Q1: What happens inside Runner.java now? Can you suggest a fix?
	public final String color;//here it will be visible in the same class if u put private and if u put final which means once who intialze the variable it is not allowed to change it by using word final
	
	//TODO 3: Make the variable "color" also final.
	// Q1: What happens inside Runner.java now?
	 
	
	public Apple(double weight, String color)
	{
		this.weight = weight;
		this.color = color;
	}
	

}
