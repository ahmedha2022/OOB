package part1;

public class Ex1a_SavingAccount {
	private int accountNo;
	private double balance;
	private Date openDate;
	private static double interestRate;
	private static int noOfObjects;

	public Ex1a_SavingAccount(int accountNo, double balance, Date openDate) {
		this(accountNo, balance);
		this.openDate = openDate;
	}

	public Ex1a_SavingAccount(int accountNo, double balance) {
		
		this.accountNo = accountNo;
		this.balance = balance;
		openDate = new Date(1,1,2010);//depricated
	//	LocalDate date = new LocalDate(1,1,2020);
		noOfObjects++;

	}

	public Date getOpenDate() {
		return openDate;
	}

	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static double getInterestRate() {
		return interestRate;
	}
	public static void setInterestRate(double interestRate) {
		Ex1a_SavingAccount.interestRate = interestRate;
	}

	
	public String toString() {
		return "Account No.: " + accountNo + "\nBalance: " + balance +
				"\nInterest rate: " + interestRate + "\nOpen date: " + openDate + ", No. of Objects created: " + noOfObjects;
	}

}
