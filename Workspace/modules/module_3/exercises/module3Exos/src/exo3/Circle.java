package exo3;

import java.awt.Color;

public class Circle extends Shape {

	// attributes
	private float radius;

	// constructor
	public Circle(Color color, float radius) {
		super(color);
		this.radius = radius;
	}

	// function to calculate area of a circle
	public float calculateArea() {
		float area = (float)( Math.PI * (Math.pow(this.radius, 2)));
		return area;
	}

	// function to calculate Perimeter of a circle
	public float calculatePerimeter() {
		float perimeter = (float)(2 * Math.PI) * this.radius;
		return perimeter;
	}
	public String toString() {
		String desc = super.toString();
		desc +=  "\nRadius: " + this.radius;
		return desc;
	}

	/**
	 * @return the radius
	 */
	public float getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	

	
}
