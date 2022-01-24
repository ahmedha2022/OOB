package qa.edu.qu.cmps251.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.JFileChooser;

/**
 * A class that demonstrates how to write and read objects (here, persons)
 * directly to the file.
 * 
 * Here, we are writing them in binary format (1s and 0s).
 * 
 *
 */
public class SerializedObjects {

	public void run() {
		//write();
		read();
		
	}
	
	//write data of object into ObjectFile.data
	private void write() {
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("ObjectFile.data");
			oos = new ObjectOutputStream(fos);
			
			Person test = new Person("Maryam", 22, new Car("Toyota"));
			Person test2 = new Person("Hassan", 32, new Car("BMW"));
			
			oos.writeObject(test);
			oos.writeObject(test2);
			oos.writeObject(null); //have to write null to mark end of file
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void read() {
		System.out.println("\n---start--- SerializedObjects.java");
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		
		try {
			Person s;
			Object obj;
			
			
			//We are deploying file chooser to pick the ObjectFile.data file we saved to earlier
			JFileChooser fileChooser = new JFileChooser();
			File file = null;
			
			//only if user clicked OK, continue
			if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
				file = fileChooser.getSelectedFile();
			}
			
			if (file == null)
			{
				System.out.println("NO FILE WAS CHOSEN");
				System.exit(0);
			
			}	
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			while ((obj = ois.readObject()) != null) { //when we read null. we stop
				s = (Person) obj;
				System.out.println("Name: " + s.getName() + " and Age is: " + s.getAge());
				System.out.println("Car: " + s.getCar().getBrand());
			}
			
			ois.close();
			fis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("----end---- SerializedObjects.java");
	}
	
}

