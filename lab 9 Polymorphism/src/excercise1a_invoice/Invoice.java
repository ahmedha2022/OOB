package excercise1a_invoice;

import excercise1_Interface.Payable;

public class Invoice implements Payable {

	private String partNumber, partDescription;
	private int quantity;
	private double unitPrice;

	public Invoice(String partNumber, String partDescription, int quantity, double unitPrice) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	@Override
	public double getPaymentAmount() {

		return quantity * unitPrice;
	}

	@Override
	public String toString() {
		return "Invoice [partNumber=" + partNumber + ", partDescription=" + partDescription + ", quantity=" + quantity+ ", unitPrice=" + unitPrice + "]";
				
	}

}
