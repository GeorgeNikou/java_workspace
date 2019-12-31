package exo4;

public abstract class Feline extends Animal {
	
	public Feline(String name, int age,String color, double weight) {
		super(name, age, color,weight);
	}
	 
	void migrate() {
		System.out.println("we are lazy AF and we don't migrate!");
	}

}
