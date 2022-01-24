package glasses;

import interfaces.Priced;

public class Glasses implements Priced{
//TODO 20: make the class use the interface Priced and fix all errors 
//         (you need to think of which way is the best way)
	private double price;
	private String frameColor;
	private String brand;
	
	public Glasses(double price, String frameColor, String brand)
	{
		this.price = price;
		this.frameColor = frameColor;
		this.brand = brand;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public String toString()
	{
		return "Brand: " + brand + " Frame color: " + frameColor;
		
	}
	
}


