package lab03;

public class PersonTest {
	public static void main(String args[]) {
		Person p1 = new Person();	
		System.out.println(p1.getFirstName());
		Person person = new Person("Ahmed", "Ibrahim", 19);//constructors used to intialize the variables inside the object
		System.out.printf("Object has been created: %s %s, age %d\n", person.getFirstName(), person.getLastName(),person.getAge());

		person.setAge(person.getAge() + 1);

		System.out.printf("Happy Birthday to %s %s, age %d\n", person.getFirstName(), person.getLastName(),	person.getAge());
	}
}