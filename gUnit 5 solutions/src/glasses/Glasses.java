package glasses;

public class Glasses {

	//TODO 01: create "private" instance variables that describe all glasses
	//         start by removing the comment from the variable below
	
	private double price;
	private String frameType; // can be either "plastic", or "metal"
	private String brand;
	
	//TODO 02: create a constructor to initialize all the instance variables.
	public Glasses(double price, String frameType, String brand)
	{
		this.price = price;
		this.frameType = frameType;
		this.brand = brand;
	}
	
	//TODO 03: create a getFullPrice function that will just return the price
	// 		TODO 11c: what happens if you make this method private? protected?
	
	public double getFullPrice()
	{
		return price;
	}
	
	//TODO 04: create a toString method
	public String toString() {
		return "Base-Price is: " + price + " Brand: " + brand + " Frame type: " + frameType; 
	}
	
}

/*
 * TODO 05: create the following sub-classes of Glasses:
 * 	- Medical Glasses
 *  - Sun Glasses
 *  
 *  Now copy the todo items to each class respectively:
 * 
 *  MedicalGlasses:
	 
 * 
 * 	SunGlasses:
 	 

 */

