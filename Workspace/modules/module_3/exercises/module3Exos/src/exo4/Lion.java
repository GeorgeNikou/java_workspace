package exo4;

public class Lion extends Feline {

	public Lion(String name, int age, String color, double weight) {
		super(name, age, color, weight);
	}

	@Override
	void sound() {
		System.out.println("roar");
	}

}
