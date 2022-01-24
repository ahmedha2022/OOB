
/*Write an application that prints the month of the year depending on the value of an integer
variable month
 * 
 * 
 * 
 */

package lab2;

import java.util.Scanner;

public class Exercise5b {
	public static void main(String[] args) {
		// TODO 1 CREATING A SCANNER OBJECCT
		Scanner cin = new Scanner(System.in);

		// TODO 2 ASKING THE USER TO ENTER THE MONTH
		System.out.println("Enter the first letters of the month please THE FIRST LETTER IS CAPITAL LETTER: ");

		// TODO 3 VALIDATE THE USER'S VALUE
		String month = cin.nextLine();
		// cin.nextLine();// if u want to let the user put an enter and making another
		// line

		// TODO 4 MAKING A SWITCH STAMENTS BECAUSE WE'LL HAVE A LIST OF CONDITIONS
		switch (month) {

		// TODO 5 LIST THE MONTHS
		case "January.":
			System.out.println("1.");
			break;
		case "Feb.":
			System.out.println("2.");
			break;
		case "Mar.":
			System.out.println("3.");
			break;
		case "Apr.":
			System.out.println("4.");
			break;
		case "May.":
			System.out.println("5.");
			break;
		case "Jun.":
			System.out.println("6.");
			break;
		case "Jul.":
			System.out.println("7.");
			break;
		case "Aug.":
			System.out.println("8.");
			break;
		case "Sep.":
			System.out.println("9");
			break;
		case "Oct.":
			System.out.println("10.");
			break;
		case "Nov.":
			System.out.println("11.");
			break;
		case "Dec.":
			System.out.println("12.");
			break;
		default:
			System.out.println(" there's a mistake.");
		}
		cin.close();
	}
}
