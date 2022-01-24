package module;


import java.beans.Transient;
import java.time.LocalDate;
import java.time.Period;

import test.add.Customer;

/**
 * The class the specify rental information
 * 
 * @author Ahmed Ibrahim Alhato, Mohamed Yeslm Mohamed, Amir Ahmed Adlabi
 * @since 20/10/2020
 * @version 1.0
 */
public class Rental {

	private int rentalNo;
	private Customer customer;
	private Car car;
	private double deposit;
	private LocalDate startDate;
	private LocalDate endDate;
	private Invoice invoice;

	/**
	 * This constructor takes initial values for Rental class
	 * 
	 * @param rentalNo
	 * @param customer
	 * @param car
	 * @param deposit
	 * @param startDate
	 * @param endDate
	 * @param invoice
	 */

	public Rental(int rentalNo, Customer customer, Car car, double deposit, LocalDate startDate, LocalDate endDate,
			Invoice invoice) {

		this.rentalNo = rentalNo;
		this.customer = customer;
		this.car = car;
		this.deposit = deposit;
		this.startDate = startDate;
		this.endDate = endDate;
		this.invoice = invoice;
	}

	public int getRentalNo() {
		return rentalNo;
	}

	public void setRentalNo(int rentalNo) {
		this.rentalNo = rentalNo;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		endDate = endDate;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	@Transient
	public int getInvoiceNo() {
		return invoice.getInvoiceNo();
	}
	/**
	 * This method is used to display the Rental class
	 */
	@Override
	public String toString() {
		return " \n Rental rentalNo=" + rentalNo + ", customer name=" + customer.getName() + ", car plate number="
				+ car.getPlateNo() + ", deposit=" + deposit + ", startDate=" + startDate + ", endDate=" + endDate
				+ "\n";
	}
	
	@Transient
	public LocalDate getInvoiceDate() {
		return invoice.getInvoiceDate();

}
	@Transient
	public double getTotal() {
		Period period = Period.between(startDate, endDate);
		int difference = period.getDays();
		return 200*difference;
}
}
