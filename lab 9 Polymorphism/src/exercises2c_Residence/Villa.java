package exercises2c_Residence;

public class Villa extends Residence {

	private int floorsCount;

	public Villa(String street, int roomCountl, int cleaningCount, int floorsCount) {
		super(street, roomCountl, cleaningCount);
		this.floorsCount = floorsCount;
	}

	public int getFloorsCount() {
		return floorsCount;
	}

	public void setFloorsCount(int floorsCount) {
		this.floorsCount = floorsCount;
	}

}
