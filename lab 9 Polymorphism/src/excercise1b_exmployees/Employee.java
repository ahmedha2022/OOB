package excercise1b_exmployees;

import excercise1_Interface.Payable;

public abstract class Employee implements Payable {

	private String firstName, lastName, quid;

	public Employee(String firstName, String lastName, String quid) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.quid = quid;
	}

	public String toString() {
		return "Employee [firstName=" + firstName + ", lastNane=" + lastName + ", qid=" + quid + ", getPaymentAmount()="+ getPaymentAmount() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="+ super.toString() + "]";
				
				
	}

}
