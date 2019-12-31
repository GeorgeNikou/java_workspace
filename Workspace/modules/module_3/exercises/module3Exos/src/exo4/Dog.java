package exo4;

public class Dog extends Canine implements PlayAction {

	public Dog(String name, int age, String color, double weight) {
		super(name, age, color, weight);
	}

	@Override
	public void fetch() {
		System.out.println("I fetch chew toys");

	}

	@Override
	public void chaseTail() {
		System.out.println("I have an ilness");

	}

	@Override
	public void dig() {
		System.out.println("I love digging holes in the backyard");

	}

	@Override
	public void lick() {
		System.out.println("I love licking my groin");

	}

	@Override
	void sound() {
		System.out.println("woof woof");

	}

}
