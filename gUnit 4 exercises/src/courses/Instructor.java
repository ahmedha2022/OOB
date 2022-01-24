package courses;

public class Instructor {

	// TODO 02B: make each Course has an Instructor (do we have the Instructor
	// class? what to do?)
	/*
	 * 
	 * Instructor has name (String), numStudents (int), and favoriteClass (String)
	 */

	String name;
	int numStudents;
	String favoriteClass;

	public Instructor(String name, int numStudents, String favoriteClass) {
		this.name = name;
		this.numStudents = numStudents;
		this.favoriteClass = favoriteClass;
	}

	public String toString() {
		return "Instructor [name=" + name + ", numStudents=" + numStudents + ", favoriteClass=" + favoriteClass + "]";
	}

}
