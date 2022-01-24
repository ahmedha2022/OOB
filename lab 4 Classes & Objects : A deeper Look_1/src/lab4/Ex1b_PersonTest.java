package lab4;

public class Ex1b_PersonTest {

	public static void main(String args[]) {
//
		Ex1a_Person person = new Ex1a_Person("Ahmed", "Ibrahim", 19);

		System.out.printf("Created %s %s, age %d\n", person.getFirstName(), person.getLastName(), person.getAge());

		person.setAge(person.getAge() + 1);

		System.out.printf("Happy Birthday to %s %s\nYour age is now %d\n", person.getFirstName(), person.getLastName(),
				person.getAge());

		Ex1a_Person person1 = new Ex1a_Person("Mohammad", "Ali", 25, 80, 1.8);

		System.out.printf(
				"Your name is: %s %s, your age is: %d, your weight is: %.2f, your height is: %.2f "
						+ " and your BMI is: %.2f\n",
				person1.getFirstName(), person1.getLastName(), person1.getAge(), person1.getWeight(),
				person1.getHeight(), person1.getBMI());

		if (person1.getBMI() >= 25)
			System.out.println("Overweight.");
		else
			System.out.println("Healthy.");

	}
}