package qa.edu.qu.unit01;

/* Program to read in a country name and print out
 * the capital city.  Very limited list of cities
 * is included.
 */

import java.util.Scanner;

public class SwitchTester {
	public SwitchTester() {
		Scanner kb = new Scanner(System.in);
		String s, c;

		System.out.print("Enter a country name: ");
		s = kb.nextLine();

		switch (s) {
		case "Qatar":
			c = "Doha";
			break;
		case "Oman":
			c = "Muscat";
			break;
		case "USA":
			c = "Washington DC";
			break;
		default:
			c = "I don't know";
		}
		System.out.println("The capital of " + s + " is " + c);

		kb.close();
	}

	public static void main(String[] args) {
		new SwitchTester();
	}
}