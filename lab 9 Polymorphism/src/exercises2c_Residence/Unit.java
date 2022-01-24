package exercises2c_Residence;

public class Unit extends Residence {

	private String buildingName;
	private int unitNumber;

	public Unit(String street, int roomCountl, int cleaningCount) {
		super(street, roomCountl, cleaningCount);
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public int getUnitNumber() {
		return unitNumber;
	}

	public void setUnitNumber(int unitNumber) {
		this.unitNumber = unitNumber;
	}

}
