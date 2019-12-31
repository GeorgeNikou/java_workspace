package exo4;

public abstract class Animal {
	
	protected String name;
	protected int age;
	protected String color;
	protected double weight;
	public static int count = 0;
	
	public Animal(String name, int age, String color, double weight) {
		this.name = name;
		this.age = age;
		this.color = color;
		this.weight = weight;
	}
	
	public void eat(String eat) {
		System.out.println(this.name + " is eating " + eat);
	}
	
	public void drink(String drink) {
		System.out.println(this.name + " is drinking " + drink);
	}
	
	public String toString() {
		String desc = "\nClass:	" + this.getClass().getSimpleName();
		desc += "\nName: " + this.name;
		desc += "\nAge: " + this.age;
		desc += "\nColor: " + this.color;
		desc += "\nWeight: " + this.weight;
		return desc;
	}
	
	//Abstract
	abstract void sound();
	abstract void migrate();

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return the count
	 */
	public static int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public static void setCount(int count) {
		Animal.count = count;
	}
	
	
	

}
