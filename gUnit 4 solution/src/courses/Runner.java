package courses;

public class Runner {

	public static void main(String[] args) {
		
		
		//TODO 04: create a course.
		//Instructor myInstructor = new Instructor("Jassim", 150, "Biology");
		//Course myCourse = new Course("OOP", myInstructor);
		//TODO 04a: can you create the course in one line?
		Course myCourse = new Course("OOP",  new Instructor("Jassim", 150, "Biology"));
		
		
		//TODO 05: display the course information and instructor information
		
		System.out.println("Course name: " + myCourse.name + "\n" +
							"Instructor name: " + myCourse.instructor.name +
							" num students: " + myCourse.instructor.numStudents +
							" fav class: " + myCourse.instructor.favClass);
	}

}
