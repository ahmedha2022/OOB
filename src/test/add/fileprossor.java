package test.add;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class fileprossor {

	
	private static List<Customer> Customerslist;

	public static List<Customer> loadCustomer() {

		List<Customer> CustomersList = new ArrayList<Customer>();

		System.out.println("Reading from the OBJECT file.");
		try {
			 File file = new File("CustomersList.dat");
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
			CustomersList = Arrays.asList((Customer[]) in.readObject());
		} catch (FileNotFoundException e) {
			System.out.println("The file is NOT exist.\n");
		} catch (EOFException e) {
			System.out.println("Reached the end of the file.\n");
		} catch (IOException e) {
			System.out.println("Error while processing the file.\n");
		} catch (ClassNotFoundException e) {
			System.out.println("Text file Object is NOT found.\n");
		}
		return CustomersList;
	}

	public static void saveData(Customer[] CustomersList) {
		System.out.println("Writting to the OBJECT file.");
		try {
			 File file = new File("CustomersList.dat");
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
			out.writeObject(CustomersList);
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException.\n");
		} catch (IOException e) {
			System.out.println("IOException.\n");
		}
		System.out.println("Customers added successfully.");
	}

}
