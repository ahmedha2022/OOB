package glasses;

public class Glasses {

	// TODO 01: create "private" instance variables that describe all glasses

	private double price;
	private String frameType;
	private String brand;

	// TODO 02: create a constructor to initialize all the instance variables.
	public Glasses(double price, String frameType, String brand) {

		this.price = price;
		this.frameType = frameType;
		this.brand = brand;
	}

	// TODO 03: create a getFullPrice function that will just return the price
	public double getFullPrice() {

		return price;
	}

	// TODO 11c: what happens if you make this method private? protected?

	// TODO 04: create a toString method
	public String toString() {

		return "base price is " + price + " brand " + brand + "frame type " + frameType;
	}

}

// TODO 05a: create the following sub-classes of Glasses: - Medical Glasses -
// Sun Glasses
