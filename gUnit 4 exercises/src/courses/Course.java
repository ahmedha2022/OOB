package courses;

public class Course {

	//TODO 01: make an instance variable name (String)
public String name;

public Instructor instructor; 

	
	//TODO 02A: make each Course has an Instructor (do we have the Instructor class? what to do?)
	/*
	 * 
	 * Instructor has name (String), numStudents (int), and favoriteClass (String)
	 */

	
	//TODO 03: make a constructor that initializes the Course
public Course(String name, Instructor instructor) {

	this.name = name;
	this.instructor = instructor;
}



public String toString() {
	return "Course [name=" + name + ", instructor=" + instructor + "]";
}
	

}
