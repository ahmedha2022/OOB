package exercises2c_Residence;

import exercises2a_Interface.Cleanable;

public class Residence implements Cleanable{
	private String street;
	private int roomCountl;
	private int cleaningCount;

	public Residence() {

	}

	public Residence(String street, int roomCountl, int cleaningCount) {
		this.cleaningCount = cleaningCount;
		this.roomCountl = roomCountl;
		this.cleaningCount = cleaningCount;

	}

	

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getRoomCountl() {
		return roomCountl;
	}

	public void setRoomCountl(int roomCountl) {
		this.roomCountl = roomCountl;
	}

	public int getCleaningCount() {
		return cleaningCount;
	}

	public void setCleaningCount(int cleaningCount) {
		this.cleaningCount = cleaningCount;
	}

	@Override
	public int getFree(String name) {

		return 0;
	}

	@Override
	public double getCleaningAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
