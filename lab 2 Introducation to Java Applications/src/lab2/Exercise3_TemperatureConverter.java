package lab2;

public class Exercise3_TemperatureConverter {
	public static void main(String[] args) {
		// TODO 1 COPYING THE CODE FROM LAB 02
		System.out.println("Fahrenheit" + "\t" + "Centigrade");

		for (int fahr = 0; fahr <= 0; fahr += 10) {
			double centigrade = 5.0 * (fahr - 32) / 9.0;
//TODO 2 FORMAT THE PREVIOUS OUTPUT AND MAKE 10 SAPCES BETWEEN F & C ALSO ROUND THE C TO 2 NUMBERS AFTER DECIMAL POINT
			System.out.printf("%5d\t%15.2f%s\n", fahr, centigrade, " Temp. Converter");
			System.out.printf("%5d" + "\t" + "%15.2f" + "%s" + "%s" + "\n", fahr, centigrade, " Temp.", " Converter");

//TODE 3 MAKE A second way BY using string format it's the same a previous one but the difference is u neeD to assign it into a variable from string type  
			String outputLine = String.format("%5d" + "\t" + "%15.2f" + "%s" + "%s" + "\n", fahr, centigrade, " Temp.",
					" Converter");
			System.out.println(outputLine);

		}
	}
}
