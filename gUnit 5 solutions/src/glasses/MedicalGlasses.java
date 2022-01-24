
package glasses;
public class MedicalGlasses extends Glasses{

	//TODO 06a: create instance variables that describe medical glasses.
	private double leftMag; // -6 to 6
	private double rightMag; // any value between -6 to 6
	
	//TODO 06b: create a constructor to initialize the instance variables.
	public MedicalGlasses(double price, String frameType, String brand, double leftMag, double rightMag)
	{
		
		super( price, frameType, brand );
		this.leftMag = leftMag;
		this.rightMag = rightMag;
		
	}
	
		 
	//TODO 11a: Override the method getFullPrice with a new one of your own.//
	@Override
	public double getFullPrice() 

	{
		double finalPrice = super.getFullPrice();
		
		// The most farsighted and most nearsighted person would add a price of 200.
		
		finalPrice += Math.abs(  (leftMag/6.0)*200 );
		finalPrice += Math.abs( (rightMag/6.0)*200 );
		return finalPrice;
		
	}
	
	//TODO 13a: create a toString method
	@Override
	public String toString()

	{
		String strFromParent = super.toString();
		return "Medical Glass:\n\t" + strFromParent + "\n\t Left Mag: " + leftMag + " Right Mag: " + rightMag + " Full Price: " + getFullPrice();
	}
	

}