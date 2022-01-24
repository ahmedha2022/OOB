package module;

/**
 * describes the vehicle information
 * 
 * @author Ahmed Ibrahim Alhato, Mohamed Yeslm Mohamed, Amir Ahmed Adlabi
 * @since 20/10/2020
 * @version 1.0
 */

public class Car {

	private String plateNo, model;
	private CarType type;
	boolean isAvilabile;

	/**
	 * This constructor takes initial values for Car class
	 * 
	 * @param plateNo
	 * @param model
	 * @param type
	 * @param isAvilabile
	 */
	public Car(String plateNo, String model, CarType type, boolean isAvilabile) {
		this.plateNo = plateNo;
		this.model = model;
		this.type = type;
		this.isAvilabile = isAvilabile;
	}

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public CarType getType() {
		return type;
	}

	public void setType(CarType type) {
		this.type = type;
	}

	public boolean getIsAvilabile() {
		return isAvilabile;
	}

	public void setAvilabile(boolean isAvilabile) {
		this.isAvilabile = isAvilabile;
	}

	/**
	 * This method is used to display the Car class
	 */
	@Override
	public String toString() {
		return " \n Car: plateNo=" + plateNo + ", model=" + model + ", type=" + type + ", isAvilabile=" + isAvilabile
				+ "\n";
	}
}
