package glasses;

public class MedicalGlasses extends Glasses  {

	private double leftMag; // -6 to 6
	private double rightMag; // any value between -6 to 6
	 
	public MedicalGlasses(double price, String frameColor, String brand, double leftMag, double rightMag)
	{
		super(price, frameColor, brand);
		this.leftMag = leftMag;
		this.rightMag= rightMag;
		
	}
		 
	@Override
	public double getFullPrice()
	{
		
double finalPrice = super.getFullPrice();
		
		// The most farsighted and most nearsighted person would add a price of 200.
		
		finalPrice += Math.abs(  (leftMag/6.0)*200 );
		finalPrice += Math.abs( (rightMag/6.0)*200 );
		return finalPrice;
		
	}


	@Override
	public String toString()
	{
		String strFromParent = super.toString();
		return "Medical Glass:\n\t" + strFromParent + "\n\t Left Mag: " + leftMag + " Right Mag: " + rightMag + " Full Price: " + getFullPrice();
	}
}
