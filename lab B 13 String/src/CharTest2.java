 import java.util.Scanner;

public class CharTest2 {
	
	
	public static void main(String[]args) {
		
		
		String sample = "hello world";
		char firstletter = sample.charAt(5);
		
		System.out.println(firstletter);
		
		char[] myName= {'a','h','m','e','d'};
		
		String n1 = "aHmed";
		String n2 = "Essad";
		
		if (n1.equalsIgnoreCase(n2))
			System.out.println("equal");
		else
			System.out.println("not equal");
		
		
	}

}
