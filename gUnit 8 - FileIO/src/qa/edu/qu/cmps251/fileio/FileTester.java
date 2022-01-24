package qa.edu.qu.cmps251.fileio;

import java.io.File;
import java.util.Arrays;
/**
 * A class to test what can be done with File objects.
 * Feel free to change some things and experiment with it.
 * 
 * @author Abdulaziz Al-Ali
 *
 */
public class FileTester {

	public static void main(String[] args) {
		
		File a = new File("Folder1\\Folder2\\MyFolder\\test.txt");
		
		
		System.out.println("The separator is: " + File.separator); // to know the seprarot for the op
		printFileInfo(a);

	}
	
	//   ( ifSomething() ? ifTrue : ifFalse)
	static void printFileInfo(File f)
	{
		String out = "Name: " + f.getName() + "\n"
				+ "Parent: " + f.getParent() + "\n" // a parent that contains a file 
				+ "Path: " + f.getPath() + "\n"
				+ "Absolute Path: " + f.getAbsolutePath() + "\n"
				+ "Exists?: " + (f.exists() ? "Yes" : "No") + "\n"
				+ "Is File: " + f.isFile() + "\n"
				+ "Is Directory: " + f.isDirectory() + "\n"
				+ "Size (length): " + f.length() + " Bytes \n"
				+ "Modified on: " + f.lastModified(); 
		
		System.out.println("File details:\n" + out);
		
	}

}
