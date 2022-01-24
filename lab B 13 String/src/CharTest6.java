import java.util.ArrayList;
import java.util.Scanner;

public class CharTest6 {
	
	public static void main(String[] args) {
		String tel1 = "+974-432535";
		String tel2 = "+975-23452345";
		ArrayList<String> numbers = new ArrayList<>();
		numbers.add(tel1);
		numbers.add(tel2);
		
		
		for (String tel : numbers) {
			if(tel.regionMatches(0,"+974", 0, 4)) //instead of 0 we can put in the first one true to ignore case
			{
				System.out.println(tel);

			}
		}
	}

}
