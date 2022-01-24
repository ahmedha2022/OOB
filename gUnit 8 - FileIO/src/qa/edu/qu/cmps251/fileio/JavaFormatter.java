package qa.edu.qu.cmps251.fileio;

import java.io.File;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

/**
 * An example of how to write formatted TEXT files using Formatter
 * 
 *
 */
public class JavaFormatter {

	public void run() {

		File f = new File("Formatter.txt"); // create a file name
		Formatter out = null; // Initialize and put nulL because we don't know if it will succeed

		try {
			out = new Formatter(f);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

	
		

		out.format("hi there, we are writing to file %s%n123%n123", f.getAbsolutePath());

		out.close(); // to save everything

	}

}
