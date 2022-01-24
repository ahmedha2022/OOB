package part1;

public class Ex1b_SavingAccountTest {

	public static boolean sameDay(Ex3_Customer cust1, Ex3_Customer cust2)
	{
		String date1 = cust1.getAccount().getOpenDate().toString();
		String date2 = cust2.getAccount().getOpenDate().toString();
		
		if(date1.equals(date2))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		Ex3_Customer cust1 = new Ex3_Customer(1, "Ahmad", new Ex1a_SavingAccount(1, 1000, new Date(10,11,2021)));//?
		Ex3_Customer cust2 = new Ex3_Customer(2, "Mohammad", new Ex1a_SavingAccount(2, 2000, new Date(10,12,2021)));
		
		System.out.println(sameDay(cust1, cust2));

		}

}
