/*
 * Create a class called Employee that includes three pieces of information as instance variables—a first
name (type String), a last name (type String) and a monthly salary (type double). Your class should have
a constructor that initializes the three instance variables. Provide a set and a get method for each instance
variable. If the monthly salary is not positive, set it to 0.0. Write a test application named EmployeeTest
that demonstrates class Employee’s capabilities. Create two Employee objects and display the yearly
salary for each Employee. Then give each Employee a 10% raise and display each Employee’s yearly
salary again.
 * 
 * 
 * 
 */

package lab03;

//TODO 1 CREATING AN EMPLOYEE CLASS
public class Employee {

//TODO 2 PUTTING THE ATTRIBUTES
	private String fName;
	private String lName;
	private double salary;

//TODO 3 MAKING A CONSTRUCTOR HAVING THE THREE ATTRIBUTES
	public Employee(String fName, String lName, double salary) {

		this.fName = fName;
		this.lName = lName;
		setSalary(salary);
	}

//TODO 4 MAKING A GET METHOD TO RETRUN THE FIRST NAME AFTER INTIALIZING IT
	public String getfName() {
		return fName;
	}

//TODO 5 MAKING A METHOD TO SET THE LAST NAME 	
	public void setfName(String fName) {
		this.fName = fName;
	}

//TODO 6 MAKING A METHOD TO GET LAST NAME
	public String getlName() {
		return lName;
	}

//TODO 7 MAKING A METHOD TO SET LAST NAME
	public void setlName(String lName) {
		this.lName = lName;
	}

//TODO 8 MAKING A METOD TO GET THE SALARY	
	public double getSalary() {
		return salary;
	}

//TODO 9 MAKING A METHOD TO SET THE SALARY
	public void setSalary(double salary) {
		if (salary > 0)
			this.salary = salary;
	}

}
