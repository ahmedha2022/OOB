package bank;
public class App {
	/*
	 * The class that calls all of our testing code below.
	 */
	private String done = "Program is done!";
	public App() {
		

		//TODO 5: create a new bank account (hint: using default/empty constructor)

		BankAccount myAccount = new BankAccount();
		
		//TODO 6: change the owner name to "Ahmad Davidson"
		myAccount.owner = "Ahmad Davidson";
		
		//TODO 7: change the balance to 40
		myAccount.balance = 40;
		
		//TODO 8:  deposit into the account 600
		myAccount.deposit(600);
		
		//TODO 9: withdraw from account 500
		myAccount.withdraw(500);
		
		//TODO 10: display account information
		System.out.println( myAccount.getInfo() );
		
		//TODO 12: create a new BankAccount using your work from todo 11
		
		BankAccount acc1 = new BankAccount("Assem", 1000);
		
		//TODO 14: display the balance of the account you created in todo 5 in USD
		System.out.println("The amount in USD is: " +  BankAccount.convertToUSD(  myAccount.balance  )  );
		
		//TODO 15: display 6000 riyals in USD using your work from todo 13
		// hint: do you see why you do not need to create a BankAccount to do this?
		
		System.out.println("6000 QAR in USD is: " + BankAccount.convertToUSD(6000));
		
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
