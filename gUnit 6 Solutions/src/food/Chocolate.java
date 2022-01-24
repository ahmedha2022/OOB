package food;

public class Chocolate extends Food{

	//TODO 06: add the instance variable "name" (String)
	private String name;
	private int month;
	private int year;
	
	
	 //TODO 07: add a constructor that will initialize all instance variables.
	
	public Chocolate(double price, String name, int month, int year)
	{
		super(price);
		this.name = name;
		this.month = month;
		this.year = year;
	}
	  //TODO 05: create a new class called Chocolate and make it inherit from Food (did any errors appear?)
	   //  Place the class in the package food
	   
	
	
	@Override
	public double getCalories() {
		
		switch(name)
		{
		case "Twix":
			return 1000;
		case "Galaxy":
			return 216;
		case "Oreo":
			return 500;
		case "Toblerone":
			return 423;
		}
		System.out.println("WRONG CHOCOLATE");
		return -1;
	}



	@Override
	public String getExpiry() {
		
		return "Expiration: " + month + "-" + year;
	}
	    
	    
	   
	 	
	
}
