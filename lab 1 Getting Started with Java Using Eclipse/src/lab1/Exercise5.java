/**
 * 
 * 
Write a Java application for the calculation of the area of a scalene triangle whose sides are a, b

and c. Use the following formula:
𝑎𝑟𝑒𝑎 = √𝑠(𝑠 − 𝑎)(𝑠 − 𝑏)(𝑠 − 𝑐)
where s = (a + b + c) / 2. [Hint. The square root function is Math.sqrt()]
Use your program to calculate the area of the following triangle:
 * 
 */

package lab1;

import java.util.Scanner; //1- importing scanner class

public class Exercise5

{
	public static void main(String[] args)

	{
		// TODO 1 THE SCANNER OBJECT
		Scanner cin = new Scanner(System.in);

		// TODO 2 demand from the user to enter them
		System.out.println("\nEnter the value of a, b and c please: ");

		// TODO 3 - initializing the three sides
		double a = cin.nextDouble(); // 5- first side
		double b = cin.nextDouble(); // 6- second side
		double c = cin.nextDouble(); // 7- third side

		// TODO 4 INTIALIZING THE GIVEN RULE
		double s = (a + b + c) / 2;

		// TODO 5 calculating the area by using Math CLASS which ,does not need calling
		// to use it
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

		// TODO 6 PRINTING THE AREA T THE USER
		System.out.println("Area = " + area);

		// TODO 7 CLASE SCANNER OBJECT
		cin.close();
	}

}
