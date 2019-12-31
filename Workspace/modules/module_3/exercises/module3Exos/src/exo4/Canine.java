package exo4;

public abstract class Canine extends Animal {

	public Canine(String name, int age, String color, double weight) {
		super(name, age, color, weight);
	}

	void migrate() {
		System.out.println("we migrate in packs");
	}

}
