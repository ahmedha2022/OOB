package glasses;

public class SunGlasses extends Glasses {
	// TODO 07a: create instance variables that describe sun glasses.// start by
	// adding color (String) as a "private" variable.

	private String color;
	private String shape;

	// TODO 07b: create a constructor to initialize the instance variables.
	public SunGlasses(double price, String frameType, String brand, String color, String shape) {
		super(price, frameType, brand);
		this.shape = shape;
		this.color = color;
	}

	// TODO 11b: Override the method getFullPrice with a new one of your own.
	@Override
	public double getFullPrice() {

		double finalPrice = super.getFullPrice();// getting the price from the parent

		switch (color) {
		case "black":
			finalPrice += 200;
			break;
		case "blue":
			finalPrice += 70;
			break;
		case "green":
			finalPrice += 20;
			break;
		case "Mirroe":
			finalPrice += 3000;
			break;

		}

		switch (shape) {
		case "cat eye":
			finalPrice += 100;
			break;
		case "circle":
		case "Circle":
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

// TODO 13b: create a toString method, then re-run the program, what do you see
// in the output?
// Notice that you did not have to change anything to display the overridden
// version of toString()

	@Override
	public String toString() {
		String strFromParent = super.toString();
		return "SunGlass:\n\t" + strFromParent + "\n\tColor: " + color + " Shape: " + shape + " Full Price: "
				+ getFullPrice();
	}

// TODO 19: create a getter for the color instance variable.
	public String getColor() {

		return color;
	}

}
