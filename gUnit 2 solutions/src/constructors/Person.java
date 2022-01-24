package constructors;

public class Person {

	private String name;
	private int phoneNo;
	private int age;
	private int quid;
	private float gpa;
	
	public static void main(String[] args)
	{
		//TODO 4: create a new person object using the default constructor
		Person p1 = new Person();
		
		//TODO 5: print the details of the person you created in todo 4
		// Take note of the values displayed for age, quid and gpa.
		System.out.println( p1 );
		
		//TODO 7: create another new person called "Fatima" with phone number 66666228
		//        using your constructor from todo 6. 
		Person p2 = new Person("Fatima", 66666123);
		
		//TODO 8: display the person "Fatima"'s details. What are the values of age, quid and gpa? 
		System.out.println( p2 );
		
		//TODO 9: can you change the constructor in todo 6 such that it uses the default constructor?
		//	      hint: use the word "this"
	
		//TODO 10: display the person "Fatima" details to make sure gpa, quid, and age are using the default values (-1).
		
	
	}
	public Person()
	{
		name = "DEFAULT";
		phoneNo = -1;
		age = -1;
		quid = -1;
		gpa = -1.0f;
	}
	
	
	//TODO 6: create a new constructor that takes only the name and phoneNo of a person
	// Run the program after doing todo 7 and 8, what are the values of the other variables? Are they zeros or -1?
	public Person(String name, int phoneNo)
	{
		this();
		this.name = name;
		this.phoneNo = phoneNo;
		
	}
	
	public String toString()
	{
		return "Name: " + name +
				" Phone no: " + phoneNo +
				" Age: " + age +
				" QUID: " + quid +
				" GPA: " + gpa;
				
	}

}
