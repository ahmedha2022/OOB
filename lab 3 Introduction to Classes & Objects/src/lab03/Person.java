package lab03;

public class Person {
	private String firstName;
	private String lastName;
	private int age;

	public Person() {
		// the defalut constructor
		// System.out.println("i am called \n");
		// so construcotr useed to intialize variables from the begining
		this.firstName = "some defalut value";

	}

	public Person(String first, String last, int years) {
		firstName = first;
		lastName = last;
		if (years > 0)
			age = years;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String first) {
		firstName = first;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String last) {
		lastName = last;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int years) {
		if (years > 0)
			age = years;
	}
}