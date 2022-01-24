package glasses;

public class MedicalGlasses extends Glasses {
	// TODO 06a: create instance variables that describe medical glasses

	private double leftMag; // -6 to 6
	private double rightMag; // any value between -6 to 6

	// TODO 06b: create a constructor to initialize the instance variables.

	public MedicalGlasses(double price, String frameType, String brand, double rightMag, double leftMag) {
		super(price, frameType, brand);
		this.rightMag = rightMag;
		this.leftMag = leftMag;

	}

	// TODO 11a: Override the method getFullPrice with a new one of your own.
	// we wanna get the price from the parent and we wanna add if ur eys +-6 we
	// ganna add 200 and +- 100
	@Override
	public double getFullPrice() {

		double finalPrice = super.getFullPrice();// getting the price from the parent
		finalPrice += Math.abs((leftMag / 6.0) * 200);
		finalPrice += Math.abs((rightMag / 6.0) * 200);

		return finalPrice;
	}

	/// TODO 13a: create a toString method
	@Override
	public String toString()

	{
		String strFromParent = super.toString();
		return "Medical Glass:\n\t" + strFromParent + "\n\t Left Mag: " + leftMag + " Right Mag: " + rightMag + " Full Price: " + getFullPrice();
	}
	

}
