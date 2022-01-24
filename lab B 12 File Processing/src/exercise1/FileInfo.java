package exercise1;

import java.io.File;
import java.util.Scanner;

public class FileInfo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // reading the name of the file to open it
		System.out.println("please enter file name");
		String fileName = input.nextLine();
		input.close(); // closing the reading file scanner

		File file = new File(fileName); // it can use for files and folders
		analyzeFile(file);
	}

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

}
