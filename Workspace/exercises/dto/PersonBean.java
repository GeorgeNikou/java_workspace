package dto;

public class PersonBean {

	private String name;
	private String color;
	private String age;
	private String id;
	
	public PersonBean(String name, String color, String age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}
	
	public String toString() {
		return "\nName: " + this.name +
				"\nColor: " + this.color + 
				"\nAge: " + this.age +
				"\nID: " + this.id;
			
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
	public String getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
