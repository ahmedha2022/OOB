package qa.edu.qu.unit01;

public class PrintTester {

	public static void main(String args[])
	{
		float fl = 32.152f;
		int x = 3;
		int y = 42;
		int z = 564;
		String a = "Fatima";
		String b = "Amal";
		String c = "Hamad";
		
		System.out.println("Now using only print\n");
		System.out.print(fl);
		System.out.print(x);
		System.out.print(y);
		System.out.print(z);
		
		System.out.println("\n\nNow using println");
		System.out.println(fl);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		System.out.println("\n\nNow using printf and adding new line");
		System.out.println("\nThe floats:\n");
		System.out.printf("%.1f%n", fl);
		System.out.printf("%.2f%n", fl);
		System.out.printf("%.4f%n", fl);
		
		System.out.println("\n\nThe integers:\n");
		System.out.printf("%3d%n", x);
		System.out.printf("%-3d%n", y);
		System.out.printf("%3d%n", z);
		
		System.out.println("\n\nThe Strings:\n");
		System.out.printf("%6s%n", a);
		System.out.printf("%6s%n", b);
		System.out.printf("%6s%n", c);
		
		//TODO 1: Can you print 
		//   "Fatima is    32.15       years old"
		// with out using any ' ' spaces, or space characters?
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Answer for Todo 1:   System.out.printf("%-7s%-6s%.2f%12s%4s%n", a, "is", fl, "years", "old");
}
