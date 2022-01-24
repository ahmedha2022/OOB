import java.util.ArrayList;
import java.util.Scanner;

public class CharTest7 {
	// string builder can increase its capcity later but normal string no
	public static void main(String[] args) {
		
		StringBuilder line = new StringBuilder("Hello, how are you?");
		
		line.append("hello man").append("\n").append("another nice line");
		
		System.out.println(line.toString());
		System.out.println(line.length());

	}

}
