package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Tester {

	public static void main(String[] args)
	{
		
		//TODO 01: create a an array of 3 ints called "a".
		int [] a = new int[3];//a it's arrays of integers 
		
		//TODO 02: put the values (123, 897, and 430) in it.
		a[0] = 123;
		a[1] = 897;
		a[2] = 430;
		
		
		//TODO 03: print the values inside the array 
		for (int i = 0; i< a.length ; i++ )
			System.out.println( a[i]  );
		
		//TODO 04: create an array of 3 Persons called "persons"
		Person [] persons = new Person[3];
		
		//TODO 05: put the Persons ("Ahmad Ghanim", "Fatima Jassim", "Khalid Hamad").
		Person alpha = new Person("Ahmad", "Ghanim");
		persons[0] = alpha;
		persons[1] = new Person("Fatima", "Jassim");
		persons[2] = new Person("Khalid", "Hamad");
		
		//TODO 06: print the values inside the array "persons"
		//		   is there a nicer way to do it?!
		for ( int i = 0; i<persons.length; i++ )
			System.out.println( persons[i] );
		
		//TODO 07: Is there a "nicer" way to access array elements when indices do not matter? (when there is no need to know exact position of each element)
		// 		   Hint: use the new for-each loop to print everything in "persons"
		for ( Person p : persons ) // for each perosn and declaring p from me inside person array 
			System.out.println( p.getfName() );
		
		//TODO 08: print the first array "a" in one statement (no for-loop)
		System.out.println( Arrays.toString( a  ) ); // u need to convert a static to string by calling toString from arrays class
		
		//TODO 09: sort the first array "a" that you created
		Arrays.sort( a );
		System.out.println( "AFTER SORTING:\n" + Arrays.toString( a  ) );//use toString to print the arrays
		
		//TODO 10: create a new array (called "b") of 10 ints with the values 88 in it.
		int [] b = new int[10];
		System.out.println( "Array b has:\n" + Arrays.toString( b  ) );
		Arrays.fill( b , 88);
		System.out.println( "Array b after filling has:\n" + Arrays.toString( b  ) );
		
		//TODO 11: copy the contents of array "a" into "b". Place them in third position .
		System.arraycopy(a, 0, b, 2, a.length);//srcpos wherer do u wanna strat copying from 
		System.out.println( "After copying, b has:\n" + Arrays.toString( b  ) );
		
		//TODO 12: what happens if we try to put the number 218 in the fourth position in array a a[3]?
		//a[5] = 218;
		//System.out.println( "Array a after adding has:\n" + Arrays.toString( a  ) );
		// ANSWER: It will crash and cause an ArrayIndexOutOfBoundsException
		
		
		//TODO 13: what happens if we create a new array of Person objects, and then immediately set the name of the first person in the array? (try it!)
		// try it by creating a person array with of size 3, then call setfName(...) of the first person in the array. 
		//Person [] arr = new Person[3];
		//arr[0].setfName("Ghanim");
		// ANSWER: It will crash (program exits) and cause a NullPointerException
		
		
		
		/*
		 * ARRAYLIST EXAMPLES BELOW
		 */
		
		
		//TODO 14: create an ArrayList of 3 persons called personList.
		ArrayList<Person> personList = new ArrayList<Person>();
		
		//TODO 15: add the persons you added in "persons" to personList, then display it
		personList.add( persons[0] );
		personList.add( persons[1] );
		personList.add( persons[2] );

		
		System.out.println("PRINTING ARRAYLIST:");
		for (int i = 0 ; i< personList.size(); i++)
			System.out.println( personList.get(i) );
		
		/*
		 * for (Person temp: personList) System.out.println( temp );
		 */
		
		//TODO 16: create a new person p with Name = "Jabir" "Fahad"
		Person p = new Person("Jabir", "Fahad");
		
		//TODO 17: replace the second person in the list with Jabir
		personList.set(1, p);
		
		
		//TODO 18: display all items in the array list in one line
		System.out.println("BEFORE FILLING");
		System.out.println(  personList );
		
		//TODO 19: fill the above personList ArrayList with p
		System.out.println("AFTER FILLING");
		Collections.fill(personList, p);
		
		//TODO 20: print them all again
		System.out.println(  personList );
		
		// Question: what happens if you change p's first name? would that affect personList?
		// try it!
		p.setfName("Khalid");
		System.out.println(  personList );// all of this in one address so it will chagne the whole of it
		
	}
	
	
}
