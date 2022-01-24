package test.add;

import java.io.Serializable;
import java.time.LocalDate;

public class Customer implements Serializable {

	private int customerId;
	private String name;
	private String phone;
	private String address;
	private String nationality;
	private String drivingLicence;
	private int passportNo;
	private LocalDate entryDate;
	private LocalDate visaExpiryDate;

	public Customer(int customerId, String name, String phone, String address, String nationality,
			String drivingLicence, int passportNo, LocalDate entryDate2, LocalDate visaExpiryDate2) {

		this.customerId = customerId;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.nationality = nationality;
		this.drivingLicence = drivingLicence;
		this.passportNo = passportNo;
		this.entryDate = entryDate2;
		this.visaExpiryDate = visaExpiryDate2;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getDrivingLicence() {
		return drivingLicence;
	}

	public void setDrivingLicence(String drivingLicence) {
		this.drivingLicence = drivingLicence;
	}

	public int getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}

	public LocalDate getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(LocalDate entryDate) {
		this.entryDate = entryDate;
	}

	public LocalDate getVisaExpiryDate() {
		return visaExpiryDate;
	}

	public void setVisaExpiryDate(LocalDate visaExpiryDate) {
		this.visaExpiryDate = visaExpiryDate;
	}

	public String toString() {
		return "Customer ID = " + customerId + ", name = " + name + ", phone = " + phone + ", address = " + address
				+ ", nationality = " + nationality + ", driving licence = " + drivingLicence + "\n, passportNo = "
				+ passportNo + " , EntryDate = " + entryDate + ", visaExpiryDate = " + visaExpiryDate;
	}

}
