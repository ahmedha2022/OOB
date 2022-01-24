package food;

import interfaces.Perishable;
import interfaces.Priced;

public abstract class Food implements Perishable, Priced{
	
	
	 //TODO 16: make the class use the interface Perishable and fix all errors correctly
	 //TODO 21: make the class use the interface Priced and fix all errors.
	   
	 //TODO 02: put an instance variable called price (double).
	 private double price;
	 
	 public Food()
	 {
		 
	 }
	 //TODO 03: create a constructor that initializes all variables. (do we need constructors for abstract classes?)
	 public Food(double price)
	 {
		 this.price = price;
	 }
	 
	 //TODO 04: create an abstract method called getCalories();
	 public abstract double getCalories();
	 
	
	 @Override
	 public double getPrice()
	 {
		 return price;
	 }
	 
}
