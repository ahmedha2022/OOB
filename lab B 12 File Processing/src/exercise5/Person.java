package exercise5;

import java.io.Serializable;// allows to serialize objects, change to bytes
import java.util.Arrays;

public class Person implements Serializable{
	private String name;
	private String[] hobbies;

	public Person(String name, String[] hobbies) {
		super();
		this.name = name;
		this.hobbies = hobbies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", hobbies=" + Arrays.toString(hobbies) + "]";
	}

}
