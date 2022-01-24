package lab4;

public class Ex1a_Person {

	// TODO 1 CREATE FIELDS OF THE CALSS AND MAKE ALL OF THEM PRIVATE
	private String firstName;
	private String lastName;
	private int age;
	private double weight;
	private double height;

	// TODO 2 MAKE A FIRST CONSTRUCTOR JUST ACCPET THREE PARAMETERS
	public Ex1a_Person(String firstName, String lastName, int age) {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
	}

	// TODO 3 MAKE A SECOND CONSTRUCTOR JUST ACCEPT FIVTH PARAMETERS
	public Ex1a_Person(String firstName, String lastName, int age, double weight, double height) {
		this(firstName, lastName, age);
		this.weight = weight;
		setHeight(height);
	}

	// TODO 4 MAKE A GET METHOD TO RETURN THE FIRST NAME
	public String getFirstName() {
		return firstName;
	}

	// TODO 5 MAKE A SET METHOD TO SET THE FIRST NAME
	public void setFirstName(String first) {
		firstName = first;
	} // end method setFirstName

	// TODO 6 MAKE A GET METHOD TO RETUN THE LLAST NAME
	public String getLastName() {
		return lastName;
	} // end method getLastName

	// TODO 7 MAKE A METHOD TO SET THE LASTNAME
	public void setLastName(String last) {
		lastName = last;
	} // end method setLastName

	// TODO 8 MAKE A METHOD TO RETURN THE AGE
	public int getAge() {
		return age;
	}

	// TODO 9 MAKE A METHOD TO SET THE AGE
	public void setAge(int years) {
		if (years > 0)
			age = years;
		else
			System.out.println("age cannot be negative");
	} // end method setAge

	// TODO 10 MAKE A METHOD TO RETURN THE WEIGHT
	public double getWeight() {
		return weight;
	}

	// TODO 11 MAKE A METHOD TO SET THE WEIGHT
	public void setWeight(double weight) {
		this.weight = weight;
	}

	// TODO 12 MAKE A METHOD TO GET THE HEIGHT
	public double getHeight() {
		return height;
	}

	// TODO 10 MAKE A METHOD TO SET THE WEIGHT
	public void setHeight(double height) {
		this.height = height;
	}

	// TODO 11 MAKE
	public double getBMI() {
		if (weight > 0 && height > 0)
			return weight / Math.pow(height, 2);
		else
			return 0;
	}

	// some class's notes
	public void justInfo(String justInfo) {
		// static variables and methods used when there are something is common between
		// all the objects
		// for example if i want to count the persons objects that created each time so
		// here the count is common between all objects,
		// and it could be change unlike final or constance variables it cannot be
		// changed
		// constructor overloading

	}
}