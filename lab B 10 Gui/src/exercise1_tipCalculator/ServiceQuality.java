package exercise1_tipCalculator;

public class ServiceQuality {
	public static double getTip(String strTip) {
		switch (strTip) {
		case "Excellent":
			return 0.2;
		case "Good":
			return 0.15;
		case "Poor":
			return 0.1;
		default:
			return 0.0;
		}
	}

}
