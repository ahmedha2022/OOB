package qa.edu.qu.cmps251.fileio;

import java.io.Serializable;

/**
 * A class that represent Person with name, and age.
 * Notice that the class implements Serializable in order to be able to
 * write it directly to files.
 * 
 * @author Abdulaziz Al-Ali
 *
 */
public class Person implements Serializable{
	private String name;
	private int age;
	private Car car;
	public Person(String name, int age, Car car) {
		this.name = name;
		this.age = age;
		this.car = car;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public Car getCar()
	{
		return car;
	}
}
