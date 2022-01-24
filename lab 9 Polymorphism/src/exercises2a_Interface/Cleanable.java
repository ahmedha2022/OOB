package exercises2a_Interface;

import java.util.Map;

public interface Cleanable {
	Map<String, Integer> fees = Map.of("Car", 10, "Truck", 15, "Unit", 25, "Villa", 50);

	// primitive -> double int float
	// String

	public int getFree(String name);

	public void setCleaningCount(int number);

	public double getCleaningAmount();

}
