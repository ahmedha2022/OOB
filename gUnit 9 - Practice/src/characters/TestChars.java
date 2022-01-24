package characters;

import java.util.Scanner;

import util.Util;

/**
 * Use this program to test all the methods inside
 * the Character class. Examples include, isUpperCase(), toUpperCase(), isDigit()...etc
 * 
 * @author Abdulaziz Al-Ali
 *
 */
public class TestChars {

	public static void main(String[] args)
	{
		
		
		Scanner in = new Scanner(System.in);
		char c = '3';
		while (c != '5') // until the user enters the character '5'
		{
			Util.print("Enter a character:");
			
			/*
			 * You can test all Character static methods
			 * in this for loop. In addition to the ones
			 * below, I recommend looking 
			 * at isUpperCase(), isDigit(), and toUpperCase().
			 */
			
			c = in.nextLine().charAt(0);
			
			//test methods by changing the code in the next line
			Util.print(Character.isDigit(c) + " ");
			
			
		}
		Util.print("DONE");
		in.close();
		
	}
	
}
