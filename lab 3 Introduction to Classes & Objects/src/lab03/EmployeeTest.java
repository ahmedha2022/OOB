package lab03;

public class EmployeeTest {
	public static void main(String args[]) {
		
		// TODO 10 MAKING A NEW OBJECT FROM EMPLOYEE CLASS AND PUT THE INITAL VALUES CALLED EMP1
		Employee emp1 = new Employee("Ahmad", "Mohammad", 10000);
		
		//TODO 11 MAKING ANOTHER OBJECT CALLED EMP1
		Employee emp2 = new Employee("Mohammad", "Khalid", 20000);

		//TODO 12 PRINTIING THE EMP1 INFORAMTION BY USING PRINTF
		System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f\n",
				emp1.getfName(), emp1.getlName(), emp1.getSalary()*12); // TIMES 12 MEANS 12 MONTHS
		
		//TODO 13 PRINTING EMP2 INFORAMTION
		System.out.printf("Employee 2: %s %s; Yearly Salary: %.2f\n",
				emp2.getfName(), emp2.getlName(), emp2.getSalary()*12);
		
		//TODO 14 PRINTING AND SETTING EMPOLYEE SALARIES
		System.out.println("\nIncreasing employee salaries by 10%: ");
		
		emp1.setSalary(emp1.getSalary() * 1.1);
		emp2.setSalary(emp2.getSalary() + (emp2.getSalary() * 0.1));
		
		//TODO 15 PRINTING EMPOLYEE SALARIES AFTER INCREASING
		System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f\n",
				emp1.getfName(), emp1.getlName(), emp1.getSalary()*12);
		
		System.out.printf("Employee 2: %s %s; Yearly Salary: %.2f\n",
				emp2.getfName(), emp2.getlName(), emp2.getSalary()*12);

	}
}