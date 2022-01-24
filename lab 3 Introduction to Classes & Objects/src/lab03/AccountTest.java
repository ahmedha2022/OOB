/*
before we were used the the scanner class to enter our values 
because the variables were public and we can access them immediately withpur using geter and setter		  
so we first used set method to edit the instance variable and then re calling it after it had been changed but set method by using 
get method
	 
*/

package lab03;

public class AccountTest {
	public static void main(String args[]) {

		/*
		 * Account account1 = new Account();
		 * 
		 * System.out.println(account1); System.out.println(account1.getName());
		 * 
		 * Scanner dataInput = new Scanner(System.in);
		 * System.out.println("Enter the account name: "); String inputName =
		 * dataInput.nextLine(); account1.setName(inputName);
		 * System.out.println(account1.getName());
		 * 
		 * account1.setName("Khalid");
		 * 
		 * System.out.println(account1); System.out.println(account1.getName());
		 * 
		 * ----------------------------------------------------------
		 */
        //TODO 11 CREATING A NEW ACCOUNT OBJECT AND PUTTING THE INTIAL VALUES
		Account account2 = new Account("Ahmad", 10000.50);
		
		//TODO 12 PRINT THE NAME
		System.out.println(account2);//HERE WILL PRINT THE OBJECT'S ADDRESS IF U DONT PUT A toString method inside account class
		
		//TODO 13 PRINT THE NAME AND BALANCE
		System.out.println(account2.getName() + " " + account2.getBalance());

		//TODO 14 INTIALIZING DEPOSIT AND WITHDRAW  
		account2.deposit(-5000);
		account2.withdraw(11000);
		account2.withdraw(-11000);
		account2.deposit(0.50);
		
		//TODO 15 PRINT THE NAMES AND BALANCE
		System.out.println(account2.getName() + " " + account2.getBalance());
		account2.withdraw(1);
		System.out.println(account2.getName() + " " + account2.getBalance());

	}
}