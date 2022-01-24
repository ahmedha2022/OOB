package bank;

public class BankAccount {
	// beacuse u make ur own construcator java wont make a default one so u need to
	// make one by ur seld uf udont use other constructors

	// TODO 1: create two public instance variables "owner" (String) and "balance"
	// (double) for the bank account
	public double balance;
	public String owner;

	// TODO 11: create a custom constructor to initialize owner and balance
	public BankAccount() {
		this.owner = "im default";
		this.balance = 0;

	}

	// Q: will there be errors inside your App.java? Why do we have an error and how
	// to fix it?
	public BankAccount(double balance, String owner)// here we need to intialze the paras what the things constructoe
													// will thake
	{
		this.balance = balance; // here i m using the fiels which are using in the whole project and all the
								// time , which will change by the constructos values that i will enter
		this.owner = owner; // WHEN USING THIS WILL REFER TO THE ATTRIBUTTES

	}

	// TODO 2: create a method to deposit money into the account
	public void deposit(double amount)// void does not return anything whiche means expects to take a value from the
										// user
	{
		balance += amount; // balance= balacne + amount

	}

	// TODO 3: create a method to withdraw money from the account
	public void withdaw(double amount) {
		if (amount <= balance)
			balance -= amount;
		else
			System.out.print("you dont have that much money\n");
	}

	// TODO 4: create a method to return a String describing the account
	public String info() {
		return "owner  " + owner + "  balcnce  " + balance;
	}

	// TODO 13: create a static method that will convert any amount from QAR to USD.

	public static double convertToUsd(double amount) {
		double ans = amount / 3.65;
		return ans;

	}

}
