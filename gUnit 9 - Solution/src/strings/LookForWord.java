package strings;

import java.util.Scanner;

import util.Util;

/**
 * This program looks for a word inside a String
 * If found, the program displays where the word appears in String.
 * Practice and try to finish this program:
 * 
 * @author Abdulaziz Al-Ali
 *
 */
public class LookForWord {

	public static void main(String[] args) {
		
		
		String story = Util.readFile();
		
		System.out.println(story);
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Type the word you want to look for:");
		String input = kb.nextLine();
		
		//System.out.println( "The output is: " + story.substring(0, 4).toUpperCase().charAt(3));
		
		//TODO 01 what do you type here to look for the word?
		
		int index = story.toLowerCase().indexOf(input.toLowerCase()); // make this line look for the word and store its position in index
		

		if (index != -1) // to make the word is found first 
		{
		Util.print("Location is: " + index);


		//TODO 02 write a statement to print the word with some characters before and after its occurrence:

		System.out.println( "..." + story.substring( index-10 , index+input.length()+10) + "...");
		
		//TODO 03 what would you do to look for the word without case sensitivity? //
		//for example, if I type "troy", it will find even "Troy" with capital T.
		

		}else System.out.println("NOT FOUND!");

	}
	


}
