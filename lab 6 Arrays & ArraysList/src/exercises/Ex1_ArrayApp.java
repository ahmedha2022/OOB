package exercises;

import java.util.Scanner;

public class Ex1_ArrayApp {
	public static void main(String[] args) {
		// TODO 1 CREATE AN ARRAY OF 5 INTEGERS
		int readings[] = new int[5];// go to the memory and create five arrays in the memory will be like [0] [1]
									// [2] [3] [4]

		// TODO 2 CREATE A SCANNER OBJECT TO READ THE FIVE INTERGES
		Scanner input = new Scanner(System.in);

		// TODO 3 MAKE A FOR LOOP TO REPAT THE NUMBER AND SKING TO ENTER AGAIN
		for (int i = 0; i < readings.length; i++) {
			System.out.print("Enter element no. " + i + " -->");
			readings[i] = input.nextInt();// READINGS[0]= 123 ,READING[1]=1234
		}
        
		//TODO 4 asking the user to enter a value to search or replace
		System.out.println("which number u wanna serach");
		int value = input.nextInt();

		 search(readings, value);
		 replace(readings, 3, 200);
			
		

		input.close();

	}
//------------------------------------------------------------------------------------------------------------------------------

	// TODO 4A MAKE A SEARCH METHOD CAN LET THE USER TO FIND THE VALUE FROM THE
	// ARRAY, THEN PASS THE ARRAY AND THE VALUE U WANNA SEARCH IN THE SEARCH METHOD

	public static int search(int theArray[], int value) {

		// TODO 4B MAKE A FOR LOOP TO GO THROUGH ALL THE ARRAY AND FIND THE NUMBER
		for (int i = 0; i < theArray.length; i++) {

			// TODO 4C MAKE SELECTION STAEMTENT IF THERE IS AVALUE THE SHOW THAT VALUE
			if (theArray[i] == value)
				System.out.println("found");

		}
		// TODO 4D RETURN STH IF THERE IS NO ANY VALUE TO SEARCH
	return -1;
	}

//------------------------------------------------------------------------------------------------------------------------------
//TODO 5A MAKE A REPLACE METHOD AND PASSED INSIDE OF IT THE ARRAY AND SEARCH VALUE AND THE WHAT U WANNA REPLACE
	public static void replace(int theArray[], int searchValue, int replaceValue) {

		// TODO 5B MAKE A FOR LOOP TO GO THROUGH THE ELEMNTS INSIDE THE ARRAYS
		for (int i = 0; i < theArray.length; i++) {

			// TODO 5C MAKE IF CONDITION IF THE SEARCH VALUE EQUAL THE INDEX THE REPLACE THE
			// VALUE OF THIS INDEX
			if (theArray[i] == searchValue)
				theArray[i] = replaceValue;
			     
		}
	}

	public void info(String info) {

//	// there is another method to find 2 and chagne it once a time
//	int index = search(theArray, searchValue);
//
//	while (index != -1) {
//		theArray[index] = replaceValue;
//		index = search(theArray, searchValue);
//
//	}

	}
}
