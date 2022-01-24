package lab03;

/*
 
 to access the data inside the private class u need to generate getters and setters
 
 public String getName() here it's a way to get the name of the private class it's not void method so u need to write return type 
 {
 
 return name; 
 }
 
 public void setName(String name) here it's a way to modify the instance variable in the class from other class because it's a hidden class
  and because it's not return any thing will write a void method 
 but it is taking from user , so inside the brackets the user must pass inside 
 the value that expeected to enter and i put there a value from string type 
 so the user will give me a name and i will set this name to the instance variables
 {
 this.name=name
 
 }
 
 encapsulation means encupsalted all the variables inside the class
 
 */

//TODO 1 CREATE AN ACCOUNT CLASS AND PUT THEIR ATTRIBUTES
public class Account {

	private String name; // instance variable, Data members, Att.
	private double balance;

	// TODO 2 MAKING A DEFALUT CONSTRUCTOR
	public Account() {
		name = "Not yet intialized.";
	}

	// TODO 3 MAKING A FULLY PARAMISED CONSTRUCTOR
	public Account(String name, double balance) {
		this.name = name;
		// this.balance = balance;

		// TODO 4 MAKING THE BALANCE IS GREATER THAN OR EQUAL ZERO
		setBalance(balance);
	}

// TODO 5 MAKE A GETTER METHOD TO GET THE BAALNCE AFTER SETTING IT
	public double getBalance() {
		return balance;
	}

//TODO 6 EDIT THE BALANCE AND MAKING IT JUST ACCEPTING THE POS NUMBERS 
	public void setBalance(double balance) {
		if (balance >= 0)
			this.balance = balance;
		else
			System.out.println("Invalid balance");
	}

//TODO 7 MAKE A GETTER METHOD TO GET  THE NAME AFTER SETTING IT
	public String getName() { // This method will return "read" the name of the object.
		return name;
	}

// TODO 8 MAKE A SET METHOD A NAME AND CONNECT IT WITH THE ATTIBUTES
	public void setName(String name) { // This method will change "write" the name of the object.
		this.name = name;
	}

//TODO 9 MAKE A DEPOSIT METHOD 
	public void deposit(double amount) {
		if (amount > 0)
			balance += amount;
		else
			System.out.println("Invalid deposit.");
	}

//TODO 10 MAKE A WITHDRAW METHOD 
	public void withdraw(double amount) {
		if (amount <= 0)
			System.out.println("Invalid withdraw amount.");
		else if (amount <= balance)
			balance -= amount;
		else
			System.out.println("No enough balance.");
	}
}
