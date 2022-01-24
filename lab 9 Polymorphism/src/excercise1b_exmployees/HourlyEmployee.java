package excercise1b_exmployees;

public class HourlyEmployee extends Employee {

	private double wage, hours;

	public HourlyEmployee(String firstName, String lastNane, String qid, double wage, double hours) {
		super(firstName, lastNane, qid);
		this.wage = wage;
		this.hours = hours;
	}

	@Override
	public double getPaymentAmount() {
		return wage * hours;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + ", hours=" + hours + ", getPaymentAmount()=" + getPaymentAmount()+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()+ "]";
				
				
	}

}
