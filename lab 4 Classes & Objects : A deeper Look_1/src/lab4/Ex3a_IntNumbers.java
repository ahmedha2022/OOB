package lab4;

public class Ex3a_IntNumbers {
	public static int digits(int x) {
		int n = 0;
		while (x != 0) {
			x = x / 10;
			n++;
		}
		return n;
	}

}