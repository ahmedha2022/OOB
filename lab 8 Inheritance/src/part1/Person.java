package part1;

public class Person {

	protected int id; // in the same package and inherited classed can see the attributes but the
						// other package cannot see these attributes Hint : getters and setter will be
						// useless because u can access them , and to use the protected in other package
						// u need to use import the class

	protected String name;

	public Person() {
		System.out.println("person constructor called\n");
	}

	/**
	 * @param id
	 * @param name
	 */
	public Person(int id, String name) {

		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return id + "," + name; // return id + "," + name; "Person [id=" + id + ", name=" + name + "]"
	}

}
