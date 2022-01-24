package excercise1b_exmployees;

public class CommissionEmployee extends Employee {
	private double grossSales, commissiomRate;

	public CommissionEmployee(String firstName, String lastNane, String qid, double grossSales, double commissiomRate) {
		super(firstName, lastNane, qid);
		this.grossSales = grossSales;
		this.commissiomRate = commissiomRate;
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return grossSales * commissiomRate;
	}

	@Override
	public String toString() {
		return "CommissionEmployee [grossSales=" + grossSales + ", commissiomRate=" + commissiomRate+ ", getPaymentAmount()=" + getPaymentAmount() + ", toString()=" + super.toString() + ", getClass()="+ getClass() + ", hashCode()=" + hashCode() + "]";
				
				
	}

}
