/*
 * Create a class called Invoice that a hardware store might use to represent an invoice for an item sold
at the store. An Invoice should include four pieces of information as instance variables—a part
number (type String), a part description (type String), a quantity of the item being purchased (type int)
and a price per item (double). Your class should have a constructor that initializes the four instance
variables. Provide a set and a get method for each instance variable. In addition, provide a method
named getInvoiceAmount that calculates the invoice amount (i.e. multiplies the quantity by the price
per item), then returns the amount as a double value. If the quantity is not positive, it should be set to
0. If the price per item is not positive, it should be set to 0.0. Write a test application named
InvoiceTest that demonstrates class Invoice’s capabilities.
 * 
 * 
 * 
 */

package lab03;

public class invoice {
	public String number ;
	public String description ;
	public int quantity;
	public double price;
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		if (quantity <=0) {
		 return 0;
		}
		else
			return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		if (price <=0) {
			 return 0;
		}
		else
			return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getinvoice() {
		
		return  getPrice()*getQuantity();
	}

	
}
