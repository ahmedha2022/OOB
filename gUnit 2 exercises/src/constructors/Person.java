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

		
		//TODO 5: print the details of the person you created in todo 4
		// Take note of the values displayed for age, quid and gpa.

		
		//TODO 7: create another new person called "Fatima" with phone number 66666228
		//        using your constructor from todo 6. 
       Person p2 = new Person("fatima",66666228);
		
		//TODO 8: display the person "Fatima"'s details. What are the values of age, quid and gpa? 
        System.out.print(p2);
		
		//TODO 9: can you change the constructor in todo 6 such that it uses the default constructor?
		//	      hint: use the word "this"
	
		//TODO 10: display the person "Fatima" details to make sure gpa, quid, and age are using the default values (-1).
		
	
	}
	public Person()//default constructors that will call intial just values // a real not visible constrcotr
	{
		name = "DEFAULT";
		phoneNo = -1;
		age = -1;
		quid = -1;
		gpa = -1.0f;
	}
	
	//TODO 6: create a new constructor that takes only the name and phoneNo of a person
	// Run the program after doing todo 7 and 8, what are the values of the other variables? Are they zeros or -1?
	
	public Person(String name , int phoneNo)// no relationships between this parameters and filds
	{
		this();
		this.name=name;
		this.phoneNo=phoneNo;	
	}

	
	/*
	  down convert it to string by using toString method
	   and it has to be string and public used to print the objects and one be should in the class
    */
	
	public String toString()//convert it to string by using toString method and it has to be string and public used to print the objects and one be should in the class
	{
		return "Name: " + name +
				" Phone no: " + phoneNo +
				" Age: " + age +
				" QUID: " + quid +
				" GPA: " + gpa;
				
	}

}
