package exercise2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Exercise 2: Text Files (Working with Scanner class)
// in this exercise we will use the scanner to read the contents inside the file

public class Ex2_Analyze_Read_Count {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // here to read the name of the file
												// that user will create
		System.out.println("please enter file name");
		String fileName = input.nextLine();
		input.close(); // closing the reading file scanner

		File file = new File(fileName); // it can use for files and folders
		// analyzeFile(file);
		//String fileContent = countWords(file);
		//System.out.println(fileContent);
		
	}

//----------------------------------------------------------------------------------------------------------------------------------------------------------
	public static void analyzeFile(File file) {
		System.out.println(file.exists()); // to check if the the exist or not

		if (file.exists()) {

			System.out.printf("File name = %s \n", file.getName()); // to get the name of file
			System.out.printf("Is File " + file.isFile()); // to check if it's file or not
			System.out.printf("Is directory " + file.isDirectory()); // to check if it's folder or not
			System.out.printf("complete/absolute path " + file.getAbsolutePath()); // to get the complete path
			System.out.printf("relative path " + file.getPath()); // to get the relative path or from where you start

			if (file.isDirectory()) {

				File[] files = file.listFiles();
				for (File f : files) {
					System.out.println(f.getName());
				}
			}

		}
	}

//----------------------------------------------------------------------------------------------------------------------------------------------------------
// we will enter a file and then return a string content
	public static String readFileContent(File file) {
		int count = 0;

		String content = ""; // start with empty string
		Scanner scanner;
		try {

			scanner = new Scanner(file);// here the file is opened and scanner will read the from the file,
			while (scanner.hasNext())// as long as you have more data
				content += scanner.nextLine() + "\n";
			scanner.close();
		} catch (FileNotFoundException e) { // in case the try crach it does not crash the entire application but it
											// just stop and give the problem and comlplete
			e.printStackTrace();
		}
		return content;

	}
//----------------------------------------------------------------------------------------------------------------------------------------------------------

	public static String readFileContent1(File file) {

		String content = "whatever content ";

		try {
			int x = 1 / 0;
		} catch (ArithmeticException e) {
			// other way ---> sysout "the problem in 1/0"
			e.printStackTrace();
		}
		return content;
	}

//----------------------------------------------------------------------------------------------------------------------------------------------------------
	public static String countWords(File file) {
		// we will enter a WORD and then COUNT them
		String content = ""; // start with empty string
		Scanner scanner;
		try {
			int count = 0;
			scanner = new Scanner(file);
			String word;
			while (scanner.hasNext()) {
				word = scanner.next() + "\n";
				System.out.println(word);
				if (word.trim().equalsIgnoreCase("scanner"))
					;
				count++;
			}
			System.out.println("scanner word occured " + count + " times ");
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return content;

	}


}