package glasses;

public class SunGlasses extends Glasses {

	 private String color;
	 private String shape;
	 
	 public SunGlasses(double price, String frameColor, String brand, String color, String shape)
	 {
		 super(price, frameColor, brand);
		 this.color = color;
		 this.shape = shape;
	 }
	 
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
	 
	 @Override
		public String toString()
		{
			String strFromParent = super.toString();
			return "SunGlass:\n\t" + strFromParent + "\n\tColor: " + color + " Shape: " + shape + " Full Price: " + getFullPrice();
		}

	 public String getShadeColor()
	 {
		 return color;
	 }
}
