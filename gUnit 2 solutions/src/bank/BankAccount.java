package bank;

public class BankAccount {
	//TODO 1: create two public instance variables "owner" (String) and "balance" (double) for the bank account
	public String owner;
	public double balance;

	//TODO 11: create a custom constructor to initialize owner and balance
	// Q: will there be errors inside your App.java? Why do we have an error and how to fix it?
	public BankAccount(String owner, double balance)
	{
		this.owner = owner;
		this.balance = balance;
	}
	
	//we created the below constructor as part of Todo 11 (to keep our code in todo 5 working)
	public BankAccount()
	{
		
	}
	
	

	//TODO 2: create a method to deposit money into the account
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	//TODO 3: create a method to withdraw money from the account
	public void withdraw(double amount)
	{
		if (amount <= balance )
			balance -= amount;
		else System.out.println("SORRY MAN, you don't have that much money!");
		
	}
	
	//TODO 4: create a method to return a String describing the account
	public String getInfo()
	{
		return "Owner: " + owner + " Balance: " + balance;
	}
	
	
	//TODO 13: create a static method that will convert any amount from QAR to USD.
	public static double convertToUSD(double amount)
	{
		double ans = amount/3.65;
		return ans;
	}
}
