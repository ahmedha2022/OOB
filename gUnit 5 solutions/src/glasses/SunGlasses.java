package glasses;

public class SunGlasses extends Glasses {

	//TODO 07a: create instance variables that describe sun glasses.
		 //			 start by adding color (String) as a "private" variable.
		 
		private String color;
		private String shape; // "cat eye", "circle", "square", "triangle" (not very popular)
		
		 //TODO 07b: create a constructor to initialize the instance variables.
		public SunGlasses(double price, String frameType, String brand, String color, String shape)
		{
			super(price, frameType, brand);
			this.color = color;
			this.shape = shape;
		}
		 //TODO 11b: Override the method getFullPrice with a new one of your own.
		@Override
		public double getFullPrice()
		{
			double finalPrice = super.getFullPrice();
			
			switch(color)
			{
			case "Black":
				finalPrice += 200;
				break;
			case "Blue":
				finalPrice += 70;
				break;
			case "Green":
				finalPrice += 50;
				break;
			case "Mirror":
				finalPrice += 3000;
				break;
			}
			
			switch(shape)
			{
			case "cat eye":
				finalPrice += 100;
				break;
			case "circle":
				finalPrice += 30;
				break;
			case "square":
				finalPrice += 60;
				break;
			case "triangle":
				finalPrice += 40000;
				break;
			}
			
			
			
			return finalPrice;
		}
		 
		 //TODO 13b: create a toString method, then re-run the program, what do you see in the output?
		 // 		 Notice that you did not have to change anything to display the overridden version of toString()
		@Override
		public String toString()
		{
			String strFromParent = super.toString();
			return "SunGlass:\n\t" + strFromParent + "\n\tColor: " + color + " Shape: " + shape + " Full Price: " + getFullPrice();
		}
		 //TODO 19: create a getter for the color instance variable.
		
		public String getColor()
		{
			return color;
		}
}
