package exo3;

import java.awt.Color;

public class Shape {
	
	//attributes
	 private Color color;
	
	
	//constructor
	public Shape(Color color) {
		this.color = color;
		
	}
	
	//function to calculate area
	public float calculateArea() {
		return 0;
	}
	
	//function to calculate perimeter
	public float calculatePerimeter() {
		return 0;
	}
	
	public String toString() {
		return "Class: " + this.getClass().getSimpleName() + "\nColor: " + this.color;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
