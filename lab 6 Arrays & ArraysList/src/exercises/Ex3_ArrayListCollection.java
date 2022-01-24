package exercises;

import java.util.ArrayList;

public class Ex3_ArrayListCollection {

	public static void main(String[] args) {
		ArrayList<String> items1 = new ArrayList<String>();

		items1.add("red");
		items1.add(0, "yellow");// insert the value at index 0

		System.out.print("display list contents with counter = conteloeed loop");
		for (int i = 0; i < items1.size(); i++)
			System.out.printf("%s", items1.get(i));
		// display(items1, "\n display list contenst with enhanced for statemns");

		items1.add("green");
		items1.add("blue");
		// display(items1, "\n list with two elemnts");

		items1.remove("yeloow");
		display(items1, "\n remove yellow");

		System.out.printf("\"red\" is %s in the list ", items1.contains("RED") ? "for sure" : "NOT");// before ? condition if
																								// it's right or no and
																								// left side for column
																								// is true and the right
																								// is false
//		if (items1.contains("RED")) {
//			System.out.println("");
//
//		} else {
//			System.out.println("not");
//		}
//		
//		int age  ;
//
//		boolean canDrive = age>=18 ? true : false;
//		
		// Boolean-condition ? value if true : value if false
		
		

		System.out.printf("size %s\n", items1.size());

	}

	public static void display(ArrayList<String> items1, String header) {// ?
		System.out.print(header);

		for (String item : items1)// not flexible -- easier syntax - used only when iterate through all elements
			System.out.printf("\n%s", item);
		System.out.println();

	}

	public void extra(String extra) {
		// package part1;
		//
		// public class Ex {
//			int size = 15; // the size connot change
//			Circle circles[] = new Circle[size];
//			for (int i = 0; i < circles.length; i++) {
//				Circle newcircle = new Circle(i * 1.8);
		//
//				circles[i] = newcircle; // object that's not null
		// }

	}

}
