package part1;

public class Employee extends Person {
	private int no_of_children;

	public Employee() {
		super();
	}

	public Employee(int no_of_children, int id, String name) {
		super(id, name);
		this.no_of_children = no_of_children; // setno_of_children(no_of_children)
		// or we can this(no_of_children) hint u cannot have two supers at the same time
		// because both of them are trying to print first
		System.out.println("employee class construcor\n");

	}

	// getters and setters
	public int getNo_of_children() {
		return no_of_children;
	}

	public void setNo_of_children(int no_of_children) {
		this.no_of_children = no_of_children;
	}
	
	@Override
	public String toString() {
	return super.toString()+" , "+getNo_of_children() ;
	
			// getId()+ "," + getName()+","+getNo_of_children();	*/ //using toString inside toString will go in infinte loop
	}
	
}
