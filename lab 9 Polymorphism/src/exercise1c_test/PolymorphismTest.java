package exercise1c_test;

abstract class Animal {
	abstract public void sound();
}

class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("Meow says the " + this.getClass().getSimpleName());
	}
}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("woof says the " + this.getClass().getSimpleName());
	}
}

public class PolymorphismTest {
	public static void main(String[] args) {

		Animal animal = new Cat();
		animal.sound();

		animal = new Dog();
		animal.sound();
	}
}
