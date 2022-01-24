import glasses.MedicalGlasses;
import glasses.SunGlasses;

public class App {

	public static void main(String[] args) {
		new App(); // this will call the constructor of App below

	}
	
	public App()
	{
		
		MedicalGlasses m1 = new MedicalGlasses(250, "plastic", "Rayban", -6, -6);
		SunGlasses s1 = new SunGlasses(400, "metal", "Police", "Black", "circle");
		SunGlasses s2 = new SunGlasses(140, "metal", "Gucci", "Green", "Circle");
		/*
		 * TODO 01: create an abstract class called Food and place it in the package food
		 *  //TODO 16: make the class use the interface Perishable and fix all errors correctly
		 *  //TODO 21: make the class use the interface Priced and fix all errors.
		 *  
		 *   //TODO 02: put an instance variable called price (double).
		 *   
		 *   //TODO 03: create a constructor that initializes all variables. (do we need constructors for abstract classes?)
		 *   
		 *   //TODO 04: create an abstract method called getCalories();
		 */
		
		/**
		 * TODO 05: create a new class called Chocolate and make it inherit from Food (did any errors appear?)
		 *  //  Place the class in the package food
		 *  
		 *   //TODO 06: add the instance variable "name" (String)
		 *   
		 *   //TODO 07: add a constructor that will initialize all instance variables.
		 */
		
		/**
		 * TODO 08: create a new class called Coffee and make it inherit from Food
		 *  //  Place the class in the package food
		 *  
		 *  //TODO 09: add the instance variable type (String)
		 *  
		 *  //TODO 10: create a constructor that will initialize all instance variables
		 */
		
		//TODO 11: create a new Food object..what happens?
		
		//TODO 12: create a new Chocolate object
		//TODO 13: create a new Coffee object
		
		
		/**
		 * TODO 14: create an interface called Perishable (it means it expires)
		 * 
		 *  //TODO 15: add an abstract method called getExpiry() that returns "expired" label String
		 */
		
		//TODO 24 Create a store object st1
		
		
		//TODO 25 Add all the Glasses and Food objects you created above to the Store
		
		//TODO 26: Print the total price of all items (use your work from todo 22)
		
		//TODO 28: Print the expiry of all store items that can expire (use your work from todo 24)
	}


}
