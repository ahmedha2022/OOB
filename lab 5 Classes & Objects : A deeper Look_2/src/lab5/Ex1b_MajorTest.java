package lab5;

//TODO 1 CALL THE SECUTRITYRANDOM CLASS
import java.security.SecureRandom;
//TODO 2 CALL THE RANDOM CLASS
import java.util.Random;

public class Ex1b_MajorTest {

	public static void main(String[] args) {

		Ex1a_Major cse = new Ex1a_Major();

		cse.setTitle("Computer Science and Engineering");
		cse.setHostDeptId(700);
		cse.display();

		System.out.println("\n");

		Ex1a_Major me = new Ex1a_Major(101, "Mechniacal Engineering", 102, 145);
		me.display();
		me.getMajorId();// self documenting

		// random number

		Random random = new Random(); // gets the seed time
		System.out.print(random.nextInt());

		SecureRandom secureRancom = new SecureRandom();
		System.out.print(secureRancom.nextInt(100));
		// first generate a number between A-Z

	}

	
}
