package exo3;

import java.awt.Color;

public class Triangle extends Shape {

	// attribute
	private float side;
	

	// constructor
	public Triangle(Color color, float side) {
		super(color);
		this.side = side;
		
	}
	
	public float calculateArea() {
		float area = ((float)(Math.sqrt(3f) / 4f * Math.pow(this.side, 2f)));
		return area;
	}
	
	public String toString() {
		String desc = super.toString();
		desc += "\nside: " + this.side;
		return desc;
	}

	/**
	 * @return the side
	 */
	public float getSide() {
		return side;
	}

	/**
	 * @param side the side to set
	 */
	public void setSide(float side) {
		this.side = side;
	}
	
	
	
}
