/**
 * Write a Java application that reads three integer numbers. Calculate the sum and average fo
   these numbers. Display the three numbers and their sum and average.
 * 
 */
package lab1;

import java.util.Scanner;

public class Exercise3

{
	public static void main(String[] args)

	{
		//TODO 1 CREATE A NEW SCANNER OBJECT
		Scanner cin = new Scanner(System.in);

		int Int1, Int2, Int3;
		System.out.println(" give three integer numbers  "); // ordering from user to enter the three numbers

		//TODO 2 WRITE codes to let user enter the numbers
		Int1 = cin.nextInt();
		Int2 = cin.nextInt();
		Int3 = cin.nextInt();

		//TODO 3 calculating the sum and displaying to the user
		System.out.println("Sum = " + (Int1 + Int2 + Int3));

		//TODO 4 calculating the avg and displaying to the user
		System.out.println("Average = " + (Int1 + Int2 + Int3) / 3.0);

		//TODO 5 CLOSE SCANNER OBJECT
		cin.close();

	}

}
