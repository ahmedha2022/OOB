package exercise2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ex2_write {

	public static void main(String[] args) {
		File file = new File("myfile.txt");
		writeToFile(file);
	}
	public static void writeToFile(File file) {
		try {
			FileWriter writer = new FileWriter(file , true); //true to keep writing 
			writer.write("this file is updating  " + LocalDateTime.now() + "\n");

			writer.close();
			System.out.println("file saved");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
