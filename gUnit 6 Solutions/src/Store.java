

import java.util.ArrayList;

import food.Chocolate;
import interfaces.Perishable;
import interfaces.Priced;

public class Store {
	private String name;
	
	//TODO 17: Add an array to store glasses and food items (what should we do? see Todo 18-21 first)
	ArrayList<Priced> arr = new ArrayList<Priced>();
	
	public Store(String name)
	{
		this.name = name;
		
	}
	
	/**
	 * TODO 18: create a new interface called Priced (means has a price)
	 * 
	 * //TODO 19: create an abstract method called getPrice() that returns (double)
	 */

	//TODO 22: create a method called addPricedItem() to add any item to the store
	
	public void addPricedItem(Priced p )
	{
		arr.add(p);
	}
	//TODO 23: create a method called getTotalItemsPrice that returns the 
	//         sum of the price of all items in this store
	
	public double getTotalItemsPrice()
	{
		double sum = 0;
		for (Priced p : arr)
			sum += p.getPrice();
		
		return sum;
	}
	
	//TODO 27: create a method called printAllExpiries() that will print the 
	//         expiry dates of the items in this store
	
	public void printAllExpiries()
	{
		
		for (Priced p : arr)
			if (p instanceof Perishable )
			{
				System.out.println("Current item: " + ((p instanceof Chocolate) ? "Chocolate":"Coffee"));
				System.out.println("Expiry is: " + ((Perishable)p).getExpiry() );
			}
	}
	
}
