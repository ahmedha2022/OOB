package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Tester {

	public static void main(String[] args) {

		// TODO 01: create a an array of 3 ints called "a".
		// data type name of the array [] --> it names arrays of integers
		int[] a = new int[3];

		// TODO 02: put the values (123, 897, and 430) in it.
		a[0] = 123;
		a[1] = 897;
		a[2] = 430;
		// TODO 03: print the values inside the array
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// TODO 04: create an array of 3 Persons called "persons"//create out own data
		// type for arays
		Person[] persons = new Person[3];

		// TODO 05: put the Persons ("Ahmad Ghanim", "Fatima Jassim", "Khalid Hamad").
		persons[0] = new Person("ahmed ","ghanim");
		persons[1] = new Person("Fatima ","Jassim");
		persons[2] = new Person("Khalid ","Hamad");

		

		// TODO 06: print the values inside the array "persons"
		// is there a nicer way to do it?!

		// TODO 07: Is there a "nicer" way to access array elements when indices do not
		// matter? (when there is no need to know exact position of each element)
		// Hint: use the new for-each loop to print everything in "persons"

		// u need to convert a static to string by calling toString from arrays class

		// TODO 09: sort the first array "a" that you created
		// u need to convetr a static to string by calling toString from arrays class

		// TODO 10: create a new array (called "b") of 10 ints with the values 88 in it.

		// TODO 11: copy the contents of array "a" into "b". Place them in third
		// position SRC IS WHERE WE WANNA COPY FROM , WHERE DO U WANT TO SRAT COPY FROM , THEN WHERE WE WANNA PAST ,WHERE DO WE COPY INTO,THEN HOW MANY ITEMS U WANNA COPY 

		// TODO 12: what happens if we try to put the number 218 in the fourth position
		// in array a a[3]?

		// TODO 13: what happens if we create a new array of Person objects, and then
		// immediately set the name of the first person in the array? (try it!)
		// try it by creating a person array with of size 3, then call setfName(...) of
		// the first person in the array.//U CANNOT CHANGE A NAME POINTING TO NULL

		/*
		 * ARRAYLIST EXAMPLES BELOW
		 */

		// TODO 14: create an ArrayList of 3 persons called personList.
		// to createa an arraylist u need to call the arraylist class then give it a
		// name and object's namelike scanner

		// TODO 15: add the persons you added in "persons" to personList, then display
		// it

		// TODO 16: create a new person p with Name = "Jabir" "Fahad"

		// TODO 17: replace the second person in the list with Jabir

		// TODO 18: display all items in the array list in one line

		// TODO 19: fill the above personList ArrayList with p // to use fill u need to
		// pring collection class

		// TODO 20: print them all again

		// Question: what happens if you change p's first name? would that affect
		// personList?
		// try it!

	}

}
