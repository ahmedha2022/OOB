package exercises2d_Vehicle;

import java.time.LocalDate;
import exercises2e_gearType_and_register.TransmissionType;

public class Car extends Vehicle {
	private int passengers;
	private TransmissionType transmission;

	public Car(String palteNumber, int wheels, int weight, int passengers, TransmissionType transmission,
			LocalDate regestirationDate, int cleaningCount) {
		super(palteNumber, wheels, weight, regestirationDate, cleaningCount);
		this.passengers = passengers;
		this.transmission = transmission;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public TransmissionType getTransmission() {
		return transmission;
	}

	public void setTransmission(TransmissionType transmission) {
		this.transmission = transmission;
	}

	@Override
	public String toString() {
		return "Car [passengers=" + passengers + ", transmission=" + transmission + "]";
	}

}
