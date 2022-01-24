package exercises;

import java.util.ArrayList;

public class Ex2_CircleArrayTest {
	public static void main(String[] args) {
		// TODO 1 CREATING AN ARRAYLIST CLASS AND NAMING IT ANYTHING AND CALLED THE
		// OBJECT OF IT circlelist
		ArrayList<Example_Circle> circlist = new ArrayList<Example_Circle>();

		// TODO 2 PRINITING ITS SIZE
		System.out.println("the size before " + circlist.size());

		// TODO 3 MAKING A MAIN OBJECT FROM THE OTHER MAIN CLASS
		Example_Circle c1 = new Example_Circle();

		// TODO 4 ADDING THE OBJECT INSDIE THE ARRAYLIST
		circlist.add(c1);

		// TODO 5 PRINTING THE SIZE AFTER ADDING FIRST OBJECT INSIDE OF IT
		System.out.println(circlist.size());

		// TODO 6 MAKING A FOOR LOOP TO PRINT THE AREA OF THE an index in circle list
		for (int i = 0; i < circlist.size(); i++) {

			System.out.println("THE AREA OF THE INDEX " + circlist.get(i).getArea());

		}

		//TODO 7  MAKING A FOR LOOP TO SEARCH THE ELEMENTS ON THE LIST AND REMOVE ALL INDEXES 
		for (int i = 0; i < circlist.size(); i++) {
			circlist.remove(i);

		}
	}

	public void extra(String extra) {


//			Circle c = new Circle();

//			circlist.add(c);
//			circlist.remove(c);
		//
//			for (int i = 0; i < circlist.size(); i++) {
//				Circle newcircle = new Circle(i * 1.8);
//				circlist.add(newcircle);
		//
//			}

		// for (int i = 0;i<circles.length;i++)
		// {
		//
//			Circle c = circles[i];
//			System.out.printf("circle [%d] \n", i);
//			System.out.printf("area = %f\n", c.getArea());
//			System.out.printf("circumeference = %f\n\n", c.getCircumfences());
		//
		// // when creating arralist and put 10 then u cannot change it after
		// in arraylist // no need for size
		// }

	}

}