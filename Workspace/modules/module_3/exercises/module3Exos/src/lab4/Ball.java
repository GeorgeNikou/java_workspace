package lab4;

import java.awt.Color;
import java.awt.Point;

public class Ball {
	
	private int radius;
	private Point position;
	private Color color;
	
	public Ball(int radius, Point position, Color color ) {
		this.radius = radius;
		this.position = position;
		this.color = color;
	}

	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}

	/**
	 * @return the position
	 */
	public Point getPosition() {
		return position;
	}

	/**
	 * @param i the position to set
	 */
	public void setPosition(Point i) {
		this.position = i;
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
