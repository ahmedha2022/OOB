import java.util.Scanner;

public class CharTest4 {

	public static void main(String[] args) {

		String s1 = "ahmed";
		String s2 = "ibrahim";
		String s3 = "alhato";

		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareTo(s3));
		System.out.println(s3.compareTo(s1));

		if (s2.compareTo(s3) > 0) {

			System.out.println(s1 + s3);

		} else
			System.out.println(s1 + s3);

	}

}
