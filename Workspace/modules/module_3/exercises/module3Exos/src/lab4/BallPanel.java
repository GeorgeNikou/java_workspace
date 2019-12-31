package lab4;

import java.awt.Graphics;
import javax.swing.JPanel;

public class BallPanel extends JPanel {

	private Ball ball;

	public BallPanel(Ball ball) {
		this.ball = ball;
	}

	public void paintComponent(Graphics g) {
		g.setColor(ball.getColor());
		g.fillOval(ball.getPosition().x, ball.getPosition().y, ball.getRadius(), ball.getRadius());

	}

}
