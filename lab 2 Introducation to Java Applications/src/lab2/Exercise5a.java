/**
 * 
 * Modify the previous application to such that it reads the name of the month and prints its
number. [Hint: use a String variable]
 */

package lab2;

import java.util.Scanner;

public class Exercise5a {
	public static void main(String[] args) {
		// TODO 1 CREATING SCANNER OBJECT
		Scanner cin = new Scanner(System.in);

		// TODO 2 ASKING THE USER TO ENTER A VALUE
		System.out.println("Enter the month please: ");

		// TODO 3 VALIDATE THE USER VALUE
		int month = cin.nextInt();

		// TODO 4 BEAUSE WE WILL USE A LIST OF MONTHS SO THE BEST CHOICE USING A SWITCH
		// STATMENT SO WILL WE PUT THE MONTH INSIDE THE WITCH TO WITCH INTEGERS
		switch (month) {

		// TODO 1 PUTTING THIS CASE AND ITS SATEMENT
		case 1:
			System.out.println("January.");
			break;

		// TODO 2 PUTTING THIS CASE AND ITS SATEMENT

		case 2:
			System.out.println("February.");
			break;

		// TODO 3 PUTTING THIS CASE AND ITS SATEMENT

		case 3:
			System.out.println("March.");
			break;

		// TODO 4 PUTTING THIS CASE AND ITS SATEMENT

		case 4:
			System.out.println("April.");
			break;

		// TODO 5 PUTTING THIS CASE AND ITS SATEMENT

		case 5:
			System.out.println("May.");
			break;

		// TODO 6 PUTTING THIS CASE AND ITS SATEMENT

		case 6:
			System.out.println("June.");
			break;

		// TODO 7 PUTTING THIS CASE AND ITS SATEMENT

		case 7:
			System.out.println("July.");
			break;

		// TODO 8 PUTTING THIS CASE AND ITS SATEMENT

		case 8:
			System.out.println("August.");
			break;

		// TODO 9 PUTTING THIS CASE AND ITS SATEMENT

		case 9:
			System.out.println("September.");
			break;

		// TODO 10 PUTTING THIS CASE AND ITS SATEMENT

		case 10:
			System.out.println("October.");
			break;

		// TODO 11 PUTTING THIS CASE AND ITS SATEMENT

		case 11:
			System.out.println("November.");
			break;

		// TODO 12 PUTTING THIS CASE AND ITS SATEMENT

		case 12:
			System.out.println("decmper.");
			break;

		// TODO 12 PUTTING THIS DEFALUT AND ITS SATEMENT IF NO CASES MATH

		default:
			System.out.println("PLEASE RUN AGAIN AND PUT FROM 1-12.");
			break;
		}
		cin.close();
	}

}
