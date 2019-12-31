package Practice;

public class Apple {
	
	private String name;
	private String color;
	private int quantity;
	private double price;

	
	public Apple(String name) {
		this.name = name;
		this.color = color;
		this.quantity = quantity;
		this.price = price;
	}
	
	public String toString() {
		return "\nName: " + this.name + "\nColor: " + this.color + "\nQuantify: " + this.quantity + "\nPrice: " + this.price;
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
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	

}
