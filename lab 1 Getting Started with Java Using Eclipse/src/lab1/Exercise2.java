package lab1;

import java.util.Scanner;//2.1

public class Exercise2 {

	public static void main(String[] args)

	{
		//TODO 1 CREATE A SCANNER OBJECT AND NAMING IT CIN
		Scanner cin = new Scanner(System.in);// 2.2

		//TODO 2 PRINT A SENTECE TO GET A VALUE FROM THE USER
		System.out.println("Enter your name please: ");
		
		//TODO 3 WRITE A LINE CAN LET THE USER TO ENTER A VALUE FROM THE KEYBOARD FROM A STRING TYPE
		//String Name = cin.nextLine(); // use to take the full line AND MORE ONE WORDS
		
		
		cin.nextLine();

//		System.out.println("Your name is: " + Name);
//
//		System.out.println("Enter your lastname please: ");
//		String lastname = cin.next();
//		cin.nextLine();// if u try to read many interges after each other then reading a text it won't
//						// work
//		// because text has its own line so we should clear the byte so the rest of
//		// stuff here
//		// usually used after reading numbers and to clear
//		System.out.println("Your lastname is: " + lastname);
//
//		System.out.println("Enter your full name please: ");
//		String fullName = cin.next();
//		System.out.println("Your full name is: " + fullName);

		cin.close();// 2.5
	}

}
