package exercise2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex2_checking {
	/*
	 * to read a file 
	 *  1- we create file object
	 *  2- use scanner to open the file
	 *  3-use loop to read the words
	 * open read display
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter file name");
		String fileName = input.nextLine();
		input.close();
		File file = new File(fileName);
		checking(file);

	}

//------------------------------------------------------------------------------------------------------------------------------------------------------

	static final String keywords[] = { "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
			"class", "const", "continue", "default", "do", "double", "else", "extends", "false", "final", "finally",
			"float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
			"new", "null", "package", "private", "protected", "public", "return", "short", "static", "strictfp",
			"super", "switch", "synchronized", "this", "throw", "throws", "transient", "true", "try", "void",
			"volatile", "while" };

//-------------------------------------------------------------------------------------------------------------------------------------------------------
	public static boolean isJavaKeyword(String keyword) {
		for (String word : keywords) {
			if (word.equals(keyword))
				return true;
		}
		return false;
	}

//--------------------------------------------------------------------------------------------------------------------------------------------------------
	// we will enter a java keyword and check if it's keyword or not
	public static String checking(File file) {
		String content = ""; // start with empty string
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			String word;
			while (scanner.hasNext()) {
				word = scanner.next() + "\n";
				if (isJavaKeyword(word.trim()))
					;
				System.out.println(word);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return content;

	}

}
