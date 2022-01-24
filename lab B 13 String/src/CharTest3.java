import java.util.Scanner;

public class CharTest3 {
	
	
	public static void main(String[]args) {
		
		
		String sample = "hello world";
		char firstletter = sample.charAt(5);
		
		System.out.println(firstletter);
		
		String name = "ahmed";
		
		char[] myName = name.toCharArray();
		
		for (char c : myName) {
			System.out.print(c + " - ");
			
		}
		
	}

}
