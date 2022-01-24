package qa.edu.qu.cmps251.fileio;

import java.io.Serializable;

public class Car implements Serializable{

	private String brand;
	
	public Car(String brand)
	{
		this.brand = brand;
	}
	
	public String getBrand()
	{
		return brand;
	}
}
