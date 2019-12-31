package people_package;

public class Female extends Person {
	
	private String hair;

	public Female(String name, String eyes, String mouth, String color, int age, String gender,String hair) {
		super(name, eyes, mouth, color, age, gender);
		this.hair = hair;
	}
	
	public void makeup() {
		System.out.println("I wear a shit ton of makeup to hide my hideous face");
	}
	
	public String toString() {
		desc += super.toString();
		desc += "\nHair: " + this.hair;
		return desc;
	}

	/**
	 * @return the hair
	 */
	public String getHair() {
		return hair;
	}

	/**
	 * @param hair the hair to set
	 */
	public void setHair(String hair) {
		this.hair = hair;
	}
	
	

}
