package qa.edu.qu.cmps251.fileio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * An extra way of writing characters directly to files. (no need to format them).
 *
 */
public class FileReaderWriter {

	public void run() {
		write();
		read();
	}
	
	private void write() {
		FileWriter f = null;
		try {
			f = new FileWriter("FileWriter.txt", false);
			f.write("Hi there");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (f!=null)
					f.close();
			} catch (IOException e) {
				System.err.println("couldn't close");
			}
		}
	}
	
	private void read() {
		
		System.out.println("---start--- FileReaderWriter.java");
		
		FileReader f = null;
		try {
			f = new FileReader("FileWriter.txt");
			
			char[] test = new char[512]; //create a buffer to read data into
			
			int x = f.read(test); //pass a reference to the buffer you created
			
			System.out.println("characters read: " + x);
			
			String s = new String(test); //convert char[] to String
			
			System.out.println("Read: " + s);
		} catch (IOException e) {
			
		} finally {
			try {
				f.close();
			} catch (IOException e) {
				System.err.println("couldn't close");
			}
		}
		
		System.out.println("----end---- FileReaderWriter.java");
	}
	
}
