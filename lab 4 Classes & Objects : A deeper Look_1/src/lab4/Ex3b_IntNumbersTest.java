package lab4;

import java.util.Scanner;

public class Ex3b_IntNumbersTest {
	public static void main(String arg[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a value for n: ");
		int n = keyboard.nextInt();
		System.out.println(digits(n));
		System.out.println(Ex3a_IntNumbers.digits(n));
		System.out.println(Math.sqrt(n));
		keyboard.close();
	}

	public static int digits(int x) {
		int n = 0;
		while (x != 0) {
			x = x / 10;
			n++;
		}
		return n;
	}
}