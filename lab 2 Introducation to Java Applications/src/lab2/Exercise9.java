package lab2;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {

		System.out.println("give me the number");

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		
		// 1/2 + 3/4 + 5/6 + 7/8 + 9/10 + 11/12 + 13/14 + 15/16 +....(n)/(n+1)+ (n+2)/(n+2+1)
		
		double y=0 ;
		
		for (int i =1; i<=n; i+=2)
		{
			
		y += (double)i/i+1; 
			
		System.out.println("y --> "+ y);
			
		}
		
		
		
		input.close();
	}

}
