package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This is just a utility class created to facilitate the lecture.
 * Feel free to look at the code below!
 * 
 * @author Abdulaziz Al-Ali
 *
 */
public class Util {

	public static void print(char c)
	{
		System.out.println(c);
	}
	
	public static void print(String str)
	{
		System.out.println(str);
	}
	
	public static void print()
	{
		System.out.println();
	}
	
	public static String readFile()
	{
		File file = new File("troy.txt");
		Scanner s;
		String ans = "";
		try {
			s = new Scanner(file);
			ans = s.nextLine();
			s.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return ans;
	}
}
