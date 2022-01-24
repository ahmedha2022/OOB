package excercise1b_exmployees;

public class SalariedEmployee extends Employee {

	private double monthlySalary;

	public SalariedEmployee(String firstName, String lastNane, String qid, double monthlySalary) {
		super(firstName, lastNane, qid);
		this.monthlySalary = monthlySalary;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return monthlySalary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [monthlySalary=" + monthlySalary + ", getMonthlySalary()=" + getMonthlySalary()+ ", getPaymentAmount()=" + getPaymentAmount() + ", toString()=" + super.toString() + ", getClass()="+ getClass() + ", hashCode()=" + hashCode() + "]";
				
				
	}

}
