package test;

import java.util.ArrayList;

import part1.Person;

public class PersonTest {
	public static void main(String[] args) {
		
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Person (2571 , " ghanim saleh"));
		persons.add(new Person (1318 , " saad mohamed"));
		persons.add(new Person (5376 , " adil salman"));

		
		for (Person item : persons)
			System.out.println(item);
		
		
		
	}

}
