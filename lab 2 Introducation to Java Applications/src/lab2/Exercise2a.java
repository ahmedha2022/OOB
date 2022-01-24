package lab2;

import java.util.Scanner;

public class Exercise2a {
	public static void main(String[] args) {
		
		// TODO 1 CREATING A SCANNER OBJECT
		Scanner cin = new Scanner(System.in);

		// TODO 2 DEMAND FROM THE USER TO ENTER NUMBER
		System.out.println("Enter mark (an integer):");

		// TODO 3 INTIALIZING THE USER VALUE
		int mark = cin.nextInt();

		// TODO 4 SPECFIGING OR LET THE COMPILER SELECT THE CORRECT ANSER FROM THE USER'S VALUE
		if ((mark / 20) >= 3)
			System.out.println("Pass");// FIRST DECISION
		else
			System.out.println("Fail");// SECOND DECISION

		// TODO 5 CLOSING THE SCANNER OBJECT
		cin.close();
	}
}
