package qa.edu.qu.cmps251.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * An example of how to read formatted TEXT files using a Scanner.
 * 
 *
 */
public class JavaScanner {

	public void run() {
		System.out.println("\n---start--- JavaScanner.java\nScanner is reading from Formatter.txt");
		
		File f = new File("Formatter.txt"); // CRATE A FILE OBJECT
		
		Scanner s = null; // Initialize and put nul because we dont know if it will succeed
		
		try {
			s = new Scanner(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		}
		
		while (s!=null && s.hasNextLine()) {
			System.out.println(s.nextLine());
			
		}
		
		s.close();
		
		System.out.println("----end---- JavaScanner.java");
	}
	
	
}
