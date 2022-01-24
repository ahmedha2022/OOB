package strings;

import java.util.Scanner;

import util.Util;

/**
 * This program tests the several String and StringBuilder methods.
 * Follow the TODOs to practice some of them.
 * 
 * @author Abdulaziz Al-Ali
 *
 */
public class TestStrings {

	
	public static void main(String[] args)
	{
		
		//Consider the two methods below to compare strings
		//Which one is more appropriate?
		System.out.println("COMPARING STRINGS:");
		String a = "abc";
		String b = new String("abc");

		if (a == b)
			Util.print("they are equal (when we use ==)");
		else Util.print("they are NOT equal (when we use ==)");
		
		System.out.println();
		//TODO 04 write the proper comparison if-statment

		

		// Example of how a string can be split into a sentence
		// into an array of words
		Util.print("\nSPLIT SENTENCE INTO WORDS:");
				
		String str = new String("Matt the cat chases the rat");
		
		//TODO 05 split the words into a new array of strings.
		
		//TODO 06 display the array (each token in a new line)
		
		System.out.println("\n\n\n\n\n");
		
		//TODO 07 show what happens to the string below when we call trim on it.
		String myString = "  This is Sparta   ";
		System.out.println("BEFORE TRIMMMING:");
		System.out.println(myString);
		
		System.out.println("AFTER TRIMMING:");
		System.out.println( /* TODO 07 what to put here?*/);
		
		Util.print("\nUSE OF STRING BUILDER EXAMPLE:");
		
		//TODO 08 create a new string builder with str as its initial contents
		
		
		//Util.print("Before replacement: " + builder);
		//TODO 09 replace "Matt" with "Pat" inside the builder.
		

		//Util.print("After replacement: " + builder);
		
		
		//TODO 10 (Extra) create a new StringBuilder with capacity = 1,
		// 				  then add to it one character at a time, and display length and capacity.
		//				  Observe how capacity relates to length. When does the capacity increase?
		
		//uncomment code below to see answer:
		/*
		 * StringBuilder bee = new StringBuilder(); Scanner in = new Scanner(System.in);
		 * //only used to make the demo below interactive for (int i = 0; i<35; i++) {
		 * bee.append("a"); in.nextLine(); System.out.println("Length is: " +
		 * bee.length() + " capacity: " + bee.capacity()); }
		 */
		
	}
}