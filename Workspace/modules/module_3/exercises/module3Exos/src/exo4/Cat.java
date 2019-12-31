package exo4;

public class Cat extends Feline {

	public Cat(String name, int age, String color, double weight) {
		super(name, age, color, weight);
	}

	@Override
	void sound() {
		System.out.println("meow");
	}

}
