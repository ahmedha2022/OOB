package courses;

public class Instructor {

	//TODO 02: make each Course has an Instructor (do we have the Instructor class? what to do?)
		/*
		 * Instructor has name (String), numStudents (int), and favoriteClass (String)
		 */
	
	public String name;
	public int numStudents;
	public String favClass;
	
	public Instructor(String name, int numStudents, String favClass)
	{
		this.name = name;
		this.numStudents = numStudents;
		this.favClass = favClass;
	}
}
