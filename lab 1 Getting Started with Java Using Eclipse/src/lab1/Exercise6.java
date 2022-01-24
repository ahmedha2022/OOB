/**
 * 
Write a Java application to read three numbers representing the percent scores of a student in three
subjects: Math, Computer, and English, and then compute and display their average. If the average
is less than 60 then print an asterisk ‘i.e. a *’ next to the average. Test your program once with
data that produces an average greater than 60 and once with a set of data that produces an average
which is less than 60.
 * 
 */

package lab1;

import java.util.Scanner;

public class Exercise6

{
	public static void main(String[] args)

	{ // TODO 1 displaying to the user to enter the scores

		System.out.println("Enter score of Math, Computer and English ");
		// TODO 2 creating a scanner object to read the scores
		Scanner cin = new Scanner(System.in);

		// TODO 3 reading the three scores from the user

		double math, com, eng;
		math = cin.nextDouble();
		com = cin.nextDouble();
		eng = cin.nextDouble();

		// TODO 4 computing the average

		double ave = (math + com + eng) / 3;

		// TODO 5 showing the result if it's greater than 60 or not

		if (ave < 60)
			System.out.println("The average is: " + ave + '*');
		else
			System.out.println("The average is: " + ave);

		// TODO 6 closing the object
		cin.close();

	}

}
