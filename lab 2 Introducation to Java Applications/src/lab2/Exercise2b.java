package lab2;

import java.util.Scanner;

public class Exercise2b {
	public static void main(String[] args) {

		// TODO 1 CREATING A SCANNER OBJECT
		Scanner cin = new Scanner(System.in);

		// TODO 2 PRINTING TO THE USER TO ENTER THE VALUES
		System.out.println("Enter an integer value please: ");

		// TODO 3 VALIDATE THE VALUE THAT THE USER ENTERED IT WHICH MEANS CAN THE
		// COMPILER ACCEPT IT
		int mark = cin.nextInt();

		// TODO 4 USE A SWITCH WHICH IS A SELECTION STATEMENT TO PRINT TO USER HIS
		// CHOICE OT VALUE,
		// UNLIKE IF STATEMENT (SINGLE STATMENT) AND IF -ELSE (DOUBLE STATEMNT) , THE
		// SWITCH STATEMENT USES MORE THAN TWO STATEMTNS FOR A LIST OF VALUES

		// TODO 5 DEFINIG THE SWITCH STATEMNT BY PUTTING THE USER VALUE INSIDE OF IT
		switch (mark) {

		// TODO 6 PUTTING THE THE FOURTH CASE
		
		case 4:
			// TODO 6A PRINTING THE ITS STATEMTNT
			
			System.out.println("Excellent.");
			// TODO 6B STOP HERE IF IT'S CORRECT AND SHOW IT TO THE USER
			
			break;
		// TODO 7 PUTTING THE FIFTH CASE
			
		case 5:
			// TODO 7A PRINTING ITS STATEMTNT
			
			System.out.println("Excellent.");
			// TODO 7B STOP HERE IF IT'S CORRECT AND SHOW IT TO THE USER
			
			break;
		// TODO 8 PUTTING THE EIGHTH CASE
			
		case 3:
			// TODO 8A PRINTING ITS STATEMENT
			
			System.out.println("Very Good.");
			// TODO 8B STOP HERE IF IT'S CORRECT AND SHOW IT TO THE USER
			
			break;
		// TODO 9 THE SECOND CASE
			
		case 2:
			// TODO 9A PRINTING ITS STATEMENT
			
			System.out.println("Good.");
			// TODO 9B STOP HERE IF IT'S CORRECT AND SHOW IT TO THE USER
			
			break;
		// TODO 10 IF THE USER DID NOT ENTER ANYTHING PRINT THIS STATEMNT
			
		default:
			// TODO 11 THE STATEMNT TIF THE USER DID NOT ENTER ANYTHING
			
			System.out.println("Fail.");
			;
		}

		// TODO 12 CLOSING THE SCANNER OBJECT
		cin.close();

	}
}
