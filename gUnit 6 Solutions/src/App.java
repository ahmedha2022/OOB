import food.Chocolate;
import food.Coffee;
import food.Food;
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
		 
		
		//TODO 05: create a new class called Chocolate and make it inherit from Food (did any errors appear?)
		 
		
		/**
		 * TODO 08: create a new class called Coffee and make it inherit from Food
		 *  //  Place the class in the package food
		 */
		
		//TODO 11: create a new Food object..what happens?
		//Food f1 = new Food(30);
		
		//TODO 12: create a new Chocolate object
		Chocolate ch1 = new Chocolate(4.5, "Galaxy", 9, 2025);
		
		//TODO 13: create a new Coffee object
		Coffee co1 = new Coffee(30, "Capuuccino", 17, 10, 2020);
		
		/**
		 * TODO 14: create an interface called Perishable (it means it expires)
		 * 
		 */
		
		//TODO 24 Create a store object st1
		
		Store st1 = new Store("Bokhalid's store");
		
		//TODO 25 Add all the Glasses and Food objects you created above to the Store
		st1.addPricedItem( m1 );
		st1.addPricedItem( s1 );
		st1.addPricedItem(s2 );
		st1.addPricedItem( ch1 );
		st1.addPricedItem( co1 );
		//TODO 26: Print the total price of all items (use your work from todo 22)
		System.out.println("Total price of items: " + st1.getTotalItemsPrice());
		
		//TODO 28: Print the expiry of all store items that can expire (use your work from todo 24)
		st1.printAllExpiries();
		
	}


}
