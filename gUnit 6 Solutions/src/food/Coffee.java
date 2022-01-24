package food;

public class Coffee extends Food {
	
	  //TODO 08: create a new class called Coffee and make it inherit from Food
	   //  Place the class in the package food
	   
	   //TODO 09: add the instance variable type (String)
	   public String type;
	   private int day;
	   private int month;
	   private int year;
	
	
	   //TODO 10: create a constructor that will initialize all instance variables
	   public Coffee(double price, String type, int day, int month, int year)
	   {
		   super(price);
		   this.type = type;
		   this.day = day;
		   this.month = month;
		   this.year = year;
	   }
	   
	   @Override
		public double getCalories() {
			switch(type)
			{
			case "Americano":
			case "Turkish":
				return 0;
			case "Latte":
				return 300;
			case "Spanish Latte":
				return 600;
			case "Capuuccino":
				return 250;
			}
			
			System.out.println("WRONG COFFEE TYPE");
			return -1;
			
		}

	@Override
	public String getExpiry() {
		return "Expiration: " + day + "-"+ month + "-" + year;
	}
}
