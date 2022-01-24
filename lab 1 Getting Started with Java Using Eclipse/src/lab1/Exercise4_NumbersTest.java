/*
 * Create a Java project and let the class wizard create a class called NumbersTest that contains a main method.
   Perform the following in the main() method:
   Add two ‘double’ variables, var1 and var2 and initialize them with 3.33 and 6.67 respectively.
   Store the sum of the two numbers in a variable called sum.
   Output the values of the two variables and their sum, properly labelled, each on a separate line. (see the hint given below)
   Hint: To output var1=3.3 we concatenate (i.e. join) the label “var1=” with the value of
   var1 as in the following statement: [Java’s concatenation operator is ‘+’]
   System.out.println(“var1=”+var1);
*/
package lab1;

import java.util.Scanner;

public class Exercise4_NumbersTest

{
	public static void main(String[] args)

	{

// debuging is just read the erros

		// TODO 1 CREATE A SCANNER OBJECT TO CALL THE METHODS THAT LET USER TO ENTER
		// VALUES
		Scanner cin = new Scanner(System.in);

		// TODO 2 INTIALIZING THREE VALUES
		double sum, var1, var2;

		// TODO 3 PRINT A SENTENCE REQUSTING FROM THE USER TO ENTER THE VALUES
		System.out.print("Enter TWO number: ");

		// TODO 4 THE METHODS THE LET USR TO ENTR VALUES
		var1 = cin.nextDouble();
		var2 = cin.nextDouble();

		// TODO 5 WRITE THE SUM EQUATION
		sum = var1 + var2;

		// TODO 6 PRINTING THE VALUES AND THE TOTAL TO THE USER
		System.out.println("var1=" + var1);
		System.out.println("var1=" + var2);
		System.out.println("sum=" + sum);

		// TODO 7 CLOSE SCANNER OBJECT
		cin.close();
	}

}
