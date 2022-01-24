package exercises3_test_ex2;

import java.time.LocalDate;
import java.util.ArrayList;

import exercises2b_Resident.Resident;
import exercises2c_Residence.Residence;
import exercises2d_Vehicle.Car;
import exercises2d_Vehicle.Truck;
import exercises2d_Vehicle.Vehicle;
import exercises2e_gearType_and_register.TransmissionType;

public class CleaningCoApp {

	public static void main(String[] args) {

		// the first Resident's address
		Residence firstResidenceAddress = new Residence("Villa @ 5 La Plage Villas, The Pearl, Doha", 6, 5);//adding the type of the residence

		// Saad's cars
		Car Scar1 = new Car("1201", 4, 1950, 5, TransmissionType.AUTOMATIC, LocalDate.of(2019, 7, 1), 1);

		// Saad's trucks
		Truck St1 = new Truck("4211", 12, 4000, 12000, LocalDate.of(2019, 7, 1), 5);
		Truck St2 = new Truck("8003", 10, 3000, 8000, LocalDate.of(2015, 8, 24), 1);
		Truck St3 = new Truck("8025", 12, 4500, 15000, LocalDate.of(2019, 1, 21), 2);

		// the list of 1's vehicles
		ArrayList<Vehicle> firstVlist = new ArrayList<Vehicle>();
		firstVlist.add(0, Scar1);
		firstVlist.add(1, St1);
		firstVlist.add(2, St2);
		firstVlist.add(3, St3);

		// the second Resident's address
		Residence secondResidenceAddress = new Residence("lives in a Unit 16 @ 508 West Porto Drive, The pearl, Doha",
				2, 3);

		// fatma's cars
		Car fcar1 = new Car("1201", 4, 1950, 5, TransmissionType.AUTOMATIC, LocalDate.of(2018, 3, 2), 5);
		Car fcar2 = new Car("9093", 4, 3000, 8, TransmissionType.MANUAL, LocalDate.of(2016, 12, 1), 1);

		// the list of 2's vehicles
		ArrayList<Vehicle> secondVlist = new ArrayList<Vehicle>();
		secondVlist.add(0, fcar1);
		secondVlist.add(1, fcar2);

		// resident's profiles
		Resident firstResident = new Resident(1, "Saad Mohamed", firstVlist, firstResidenceAddress);
		Resident seoncdResident = new Resident(2, "Fatma Salman", secondVlist, secondResidenceAddress);

		ArrayList<Resident> allResidents = new ArrayList<Resident>();
		allResidents.add(0, firstResident);
		allResidents.add(1, seoncdResident);

		// displaying the information
		for (Resident dis : allResidents) {
			/**
			 * 
			 * 
			 * specify the type of home
			 * 
			 */
			System.out.println("Resident name and address "+dis.getName()+dis.getResidence().getStreet());
		//	System.out.println("Residence type "dis.getResidence()); // 


		}

	}

}
