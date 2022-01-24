package model;

public class Truck extends Vehicle{
	
	public Truck () {}
	private double load;
	
	public Truck (int wheels , int weight , double load) {
		super(wheels,weight);
		this.load=load;
		
		
	}

	public double getWheelLoad() {
		return (load+getWeight())/getWheels();
	}

	
	public void setLoad(double load) {
		this.load = load;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n load : " + load;
	}
	@Override
	public String getAsCSV() {
		
		return super.getAsCSV() ;
	}
	

}
