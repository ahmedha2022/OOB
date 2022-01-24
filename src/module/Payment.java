package module;

import java.sql.Date;
import java.time.LocalDate;

/**
 * 
 * @author Ahmed Ibrahim Alhato, Mohamed Yeslm Mohamed, Amir Ahmed Adlabi
 * @since 20/10/2020
 * @version 1.0
 */
public class Payment {

	private int paymentId;
	private double price;
	private LocalDate paymentDate;
	private String paymentDescription;

	/**
	 * This constructor takes initial values for Payment class
	 * 
	 * @param paymentDescription
	 * @param paymentId
	 * @param price
	 * @param paymentDate
	 */
	public Payment(String paymentDescription, int paymentId, double price, LocalDate paymentDate) {

		this.paymentDescription = paymentDescription;
		this.paymentId = paymentId;
		this.price = price;
		this.paymentDate = paymentDate;
	}

	public String getPaymentDescription() {
		return paymentDescription;
	}

	public void setPaymentDescription(String paymentDescription) {
		this.paymentDescription = paymentDescription;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	@Override
	public String toString() {
		return "\n \n paymentId=" + paymentId + ", price=" + price + "," + "paymentDate= " + paymentDate
				+ ", paymentDescription= " + paymentDescription + "\n";
	}

}
