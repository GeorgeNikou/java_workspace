package people_package;

public abstract class Person {
	
	//persons attributes
	private String name;
	private String eyes;
	private String mouth;
	private String color;
	private int age;
	private String gender;
	public  String desc = "";
	
	public Person(String name, String eyes, String mouth, String color, int age, String gender) {
		this.name = name;
		this.eyes = eyes;
		this.mouth = mouth;
		this.color = color;
		this.age = age;
		this.gender = gender;
		
	}
	
	public String toString() {
		desc = "\nclass: " + this.getClass().getSimpleName();
		desc += "\nName: " + this.name;
		desc += "\nEyes: " + this.eyes;
		desc += "\nMouth: " + this.mouth;
		desc += "\nColor: " + this.color;
		desc += "\nAge: " + this.age;
		desc += "\nGender: " + this.gender;
		return desc;
	}
	
	//behavior
	public void eat() {
		System.out.println("I am eating sushi!");
	}
	
	public void sleep() {
		System.out.println("I never sleep");
	}

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
	 * @return the eyes
	 */
	public String getEyes() {
		return eyes;
	}

	/**
	 * @param eyes the eyes to set
	 */
	public void setEyes(String eyes) {
		this.eyes = eyes;
	}

	/**
	 * @return the mouth
	 */
	public String getMouth() {
		return mouth;
	}

	/**
	 * @param mouth the mouth to set
	 */
	public void setMouth(String mouth) {
		this.mouth = mouth;
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
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
	
	

}
