package bank;
public class App {
	/*
	 * The class that calls all of our testing code below.
	 */
	private String done = "Program is done!";
	public App() {
		

		//TODO 5: create a new bank account (hint: using default/empty constructor)
		
BankAccount account1 = new BankAccount(); // BY DEFAULT JAVA CREATE A DEFULET CONSTRUCTOR IF THE USER DID NOT IF HE DID THEN IT WILL ERASE THE DEFAULT ONE 
//CONSTRUCTORS CANNOT TAKE THE SAME NUMER AND TYPES OF VARIABLES , SO WE CANNOT MAKE AN OVERLOADING FUNCTION


		
		//TODO 6: change the owner name to "Ahmad Davidson"
account1.owner="ahmed";
		
		//TODO 7: change the balance to 40
account1.balance=40;

		
		//TODO 8:  deposit into the account 600
account1.deposit(600);
		
		//TODO 9: withdraw from account 500
account1.withdaw(500);
		
		//TODO 10: display account information
System.out.print(account1.info()+"\n");
		
		//TODO 12: create a new BankAccount using your work from todo 11
BankAccount account2 = new BankAccount(12,"ahmed");


		
		//TODO 14: display the balance of the account you created in todo 5 in USD
		
		


		//TODO 15: display 6000 riyals in USD using your work from todo 13
		// hint: do you see why you do not need to create a BankAccount to do this?
		
		
		
		System.out.println(done);
		
		
	}

	
	public static void main(String[] args) {
		/* TODO 16: look at the comment below and ask yourself what is the difference between
					using "new App()" and just putting all the runner code inside the main method?
		*/

		// This creates a new object of the App class which will call the App Class constructor above.
		new App(); 
		//notice we did not assign the new App to any variable.
		//but it still calls the constructor above.
	}
}
