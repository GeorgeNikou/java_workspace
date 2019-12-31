package exo3;

import java.awt.Graphics;

import javax.swing.JPanel;

public class ShapePan extends JPanel {

	private boolean isFilled = false;
	private Shape shape = null;
	private int x = 0;
	private int y = 0;
//	public int[] r = {150,150,200,150,150,100};
//	public int[] k = {150,250,250,150,250,250};


	public ShapePan() {
	}

	public void paintComponent(Graphics g) {
		if (this.shape != null) {
			g.setColor(this.shape.getColor());
			String shapeName = this.shape.getClass().getSimpleName();

			if (shapeName.equalsIgnoreCase("Circle")) {
				Circle c = (Circle) this.shape;
				if (isFilled == true)
					g.fillOval(this.x, this.y, (int) c.getRadius(), (int) c.getRadius());
				else {
					g.drawOval(this.x, this.y, (int) c.getRadius(), (int) c.getRadius());
					
				}
			}
			if (shapeName.equalsIgnoreCase("Square")) {
				Square d = (Square) this.shape;
				if (isFilled == true)
					g.drawRect(this.x, this.y, (int) d.getWidth(), (int) d.getHeight());
				else {
					g.fillRect(this.x, this.y, (int) d.getWidth(), (int) d.getHeight());
					
				}
			}
			if(shapeName.equalsIgnoreCase("triangle")) {
				Triangle s = (Triangle) this.shape;
				float f = ((float)Math.pow(s.getSide(), 2f)) - ((float)Math.pow(s.getSide()/2f, 2f));
				float ySide = (float)Math.sqrt(f);
				int[] r = {this.x, (int) (this.x - s.getSide()), (int) (this.x + s.getSide()),3};
				int[] k = {this.y,(int)(this.y + ySide),(int)(this.y + ySide), 3};
				
				if(isFilled == true)
					g.drawPolygon(r, k, 3);
				else {
					g.fillPolygon(r, k, 3);
				}
			}
		}
	}

	/**
	 * @param shape the shape to set
	 */
	public void setShape(Shape shape) {
		this.shape = shape;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the isFilled
	 */
	public boolean isFilled() {
		return isFilled;
	}

	/**
	 * @param isFilled the isFilled to set
	 */
	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}

	/**
	 * @return the shape
	 */
	public Shape getShape() {
		return shape;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

}
