import java.util.Scanner;

public class CharTest {
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		String word = " Hello world \n";
		char x = word.charAt(0);
		System.out.println(x);
		
		input.close();
	}

}
