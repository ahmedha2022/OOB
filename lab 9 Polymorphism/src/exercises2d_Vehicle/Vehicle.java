package exercises2d_Vehicle;

import exercises2a_Interface.Cleanable;
import java.time.LocalDate;

public class Vehicle implements Cleanable{
	private String palteNumber;
	private int wheels;
	private int weight;
	private LocalDate regestirationDate;
	private int cleaningCount;


	public Vehicle(String palteNumber, int wheels, int weight, LocalDate regestirationDate, int cleaningCount) {
		super();
		this.palteNumber = palteNumber;
		this.wheels = wheels;
		this.weight = weight;
		this.regestirationDate = regestirationDate;
		this.cleaningCount = cleaningCount;
	}

	public String getPalteNumber() {
		return palteNumber;
	}

	public void setPalteNumber(String palteNumber) {
		this.palteNumber = palteNumber;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public LocalDate getRegestirationDate() {
		return regestirationDate;
	}

	public void setRegestirationDate(LocalDate regestirationDate) {
		this.regestirationDate = regestirationDate;
	}

	public int getCleaningCount() {
		return cleaningCount;
	}

	public void setCleaningCount(int cleaningCount) {
		this.cleaningCount = cleaningCount;
	}

	
	
	
	@Override
	public String toString() {
		return "Vehicle [palteNumber=" + palteNumber + ", wheels=" + wheels + ", weight=" + weight
				+ ", regestirationDate=" + regestirationDate + ", cleaningCount=" + cleaningCount + "]";
	}



	@Override
	public int getFree(String name) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public double getCleaningAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
