package exercises2b_Resident;

import java.util.ArrayList;

import exercises2c_Residence.Residence;
import exercises2d_Vehicle.Vehicle;

public class Resident {
	private int id;
	private String name;
	private ArrayList<Vehicle> vlist;
	private Residence residence;

	public Resident(int id, String name, ArrayList<Vehicle> vlist, Residence residence) {
		super();
		this.id = id;
		this.name = name;
		this.vlist = vlist;
		this.residence = residence;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Residence getResidence() {
		return residence;
	}

	public void setResidence(Residence residence) {
		this.residence = residence;
	}

	Vehicle getVehicle(String plateNumber) {

		for (int i = 0; i < vlist.size(); i++) {
			Vehicle currentVehicle = vlist.get(i);
			if (currentVehicle.getPalteNumber() == plateNumber) {
				return currentVehicle;
			}
		}
		return null;

	}

	void deleteVehicle(String plateNumber) {

		for (int i = 0; i < vlist.size(); i++) {
			if (vlist.get(i).getPalteNumber() == plateNumber) {
				vlist.remove(i);
			}
		}

	}

	@Override
	public String toString() {
		return "Resident [id=" + id + ", name=" + name + ", vlist=" + vlist + ", residence=" + residence + "]";
	}

}
