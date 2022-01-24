package module;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 * regulates the payments and calculates the total amount
 * 
 * @author Ahmed Ibrahim Alhato, Mohamed Yeslm Mohamed, Amir Ahmed Adlabi
 * @since 20/10/2020
 * @version 1.0
 */
public class Invoice {

	private int invoiceNo;
	private LocalDate invoiceDate;
	private ArrayList<Payment> payments;

	/**
	 * This constructor takes initial values for invoice class
	 * 
	 * @param invoiceNo
	 * @param invoiceDate
	 * @param payments
	 */
	public Invoice(int invoiceNo, LocalDate invoiceDate, ArrayList<Payment> payments) {

		this.invoiceNo = invoiceNo;
		this.invoiceDate = invoiceDate;
		this.payments = payments;
	}

	public int getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	// methods

	public String modifyPayment(int paymentID, Payment newPayment) {

		// How can we find the old payment in arraylist?

		for (int i = 0; i < payments.size(); i++) {

			if (paymentID == payments.get(i).getPaymentId())// modifiyng step
			{
				payments.set(i, newPayment);
				return "updated payment successfully";
			}

		}

		return "could not find";
	}

	public String deletePayment(int paymentId) {
		for (int i = 0; i < payments.size(); i++) {
			if (payments.get(i).getPaymentId() == paymentId) {
				payments.remove(i);
				return "delete payment successfully";
			}
		}
		return "No such payment ID";
	}

	public String addPayment(Payment payment) {
		payments.add(payment);
		return "add payment successfully";
	}

	public Payment getPayment(int paymentId) {

		for (int i = 0; i < payments.size(); i++) {
			if (payments.get(i).getPaymentId() == paymentId) {

				return payments.get(i);
			}

		}
		return null;
	}

	public double calculateTotalPayment() {
		double total = 0;
		for (int i = 0; i < payments.size(); i++) {
			total += payments.get(i).getPrice();
		}
		return total;
	}

	@Override
	public String toString() {
		return "Invoice invoiceNo=" + invoiceNo + ", invoiceDate=" + invoiceDate + ", payments=" + payments;
	}

}
