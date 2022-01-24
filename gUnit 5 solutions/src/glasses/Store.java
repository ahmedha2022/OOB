package glasses;

import java.util.ArrayList;

public class Store {
	/*
	 * TODO 14: create a Store class that has the following:
	 *  - name (String)
	 *  - ArrayList to hold medical and sun glasses (call it glassAList)
	 *
	 *	Copy the following todos inside that class:
	 	
	*/
	
	private String name;
	public ArrayList<Glasses> glassAList = new ArrayList<Glasses>();
	
	
	//TODO 14a: create a constructor for the Store
	public Store(String name)
	{
		this.name = name;
	}
	//TODO 14b: create an addGlass method that will add a glass to the ArrayList
	public void addGlass( Glasses x )
	{
		glassAList.add( x );
	}
	
	//TODO 17: create a method that will get either Sunglasses or MedicalGlasses given by index
	public Glasses getGlass(int index)
	{
		return glassAList.get(index);
	}
	
	//TODO 20: make a method that will display the colors of all SUN Glasses in the store.
	//		   hint: you will need to use the getter you made in todo 19.
	public void displayColors()
	{
		System.out.println("\nDISPLAYING COLORS:");
		for (int i = 0 ; i< glassAList.size(); i++)
		{
			Glasses temp = glassAList.get(i);
			if (temp instanceof SunGlasses)
				System.out.println(((SunGlasses) temp).getColor());
		}
			
	}
	
}
