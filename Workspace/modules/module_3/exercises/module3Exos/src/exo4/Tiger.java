package exo4;

public class Tiger extends Feline {

	public Tiger(String name, int age, String color, double weight) {
		super(name, age, color, weight);
	}

	@Override
	void sound() {
		System.out.println("roar");
	}

}
