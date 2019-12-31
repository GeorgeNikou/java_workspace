package exo3;

import java.awt.Color;

public class Rectangle extends Shape {
	
	
	//attributes
	private float width;
	private float height;

	//Constructor
	public Rectangle(Color color, float width, float height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	// function to calculate area of a square
	public float calculateArea() {
		float area = (float)this.height * this.width;
		return area;
	}
	//function to calculate Perimeter of a square
	public float calculatePerimeter() {
		float perimeter = (float)(this.height *2) + (this.width *2);
		return perimeter;
	}
	public String toString() {
		String desc = super.toString();
		desc += "\nHeight: " + this.height + "\nWidth: " + this.width;
		return desc;
	}

	/**
	 * @return the width
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(float width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(float height) {
		this.height = height;
	}
	
	
}
