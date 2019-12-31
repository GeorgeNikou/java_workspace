package exo4;

public class Wolf extends Canine implements PlayAction{

	public Wolf(String name, int age, String color, double weight) {
		super(name, age, color, weight);
	}

	@Override
	void sound() {
		System.out.println("Howl");
	}

	@Override
	public void fetch() {
		System.out.println("I fetch carcasses");
		
	}

	@Override
	public void chaseTail() {
		System.out.println("I don't chase my tail, im not a dog idiot");
		
	}

	@Override
	public void dig() {
		System.out.println("I dig the remains of my ancestors, and sometimes my favorite toys");
		
	}

	@Override
	public void lick() {
		System.out.println("I lick everything that moves");
		
	}
	

}
