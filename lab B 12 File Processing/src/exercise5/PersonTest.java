package exercise5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.imageio.stream.FileImageInputStream;

public class PersonTest {

	public static void main(String[] args) {

		String meHobbies[] = { "movies", "playoing videos", "socce" };
		Person person1 = new Person("ahmed ibrahim ", meHobbies);
		//savePerson(person1);
		Person p = getperson();
		System.out.println(p);
	}

	public static void savePerson(Person person) {
		// take this person object and write it into a file
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("person.dat", true);// if it exists it'll open else it will create it then write
															// to
															// that file , dat type a generic data type to save objects
			ObjectOutputStream objectout = new ObjectOutputStream(fout);

			objectout.writeObject(person);

			objectout.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static Person getperson() {

		Person person = null;

		try {
			FileInputStream input = new FileInputStream("person.dat");
			ObjectInputStream objectInput = new ObjectInputStream(input);
			
			Object obj = objectInput.readObject();//read first line of object
			person = (Person) obj;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return person;

	}
}
