package exercises2d_Vehicle;

import java.time.LocalDate;

public class Truck extends Vehicle {
	private int load;

	public Truck(String palteNumber, int wheels, int weight, int load, LocalDate regestirationDate, int cleaningCount) {
		super(palteNumber, wheels, weight, regestirationDate, cleaningCount);
		this.load = load;
	}

	public double getWheelLoad() {

		return 0;
	}

	@Override
	public String toString() {
		return "Truck [load=" + load + "]";
	}

}
