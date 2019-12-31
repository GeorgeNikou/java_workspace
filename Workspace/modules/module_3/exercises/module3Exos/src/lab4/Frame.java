package lab4;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JFrame;

public class Frame extends JFrame implements MouseListener, Runnable {

	private Ball ball;
	private BallPanel panel;
	private int positionX;
	private int positionY;
	private Color[] diffColors = { Color.red, Color.green, Color.black, Color.cyan, Color.gray};
	private int count = 0;
	Random r = new Random();

	public Frame() {
		this.setTitle("Ball");
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);

		this.addMouseListener(this);

		ball = new Ball(100, new Point(50, 50), Color.BLUE);
		panel = new BallPanel(ball);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.add(panel);
		Thread t1 = new Thread(this);
		t1.start();
	}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void run() {
		boolean xUp = true, yUp = true;
		int numX,numY;
		
		while (true) {
			numX = r.nextInt(15);
			numY = r.nextInt(15);
			
			
			try {
				// x position
				if (xUp) {
					ball.getPosition().x += 25;
					
				} else {
					ball.getPosition().x -= 25;
				}
				if(ball.getPosition().x + ball.getRadius() > 600) {
					ball.setColor(diffColors[count]);
					xUp = false;
					
					count++;
				}
				if(ball.getPosition().x <= 0) {
					ball.setColor(diffColors[count]);
					xUp = true;
				}
				// y position
				if (yUp) {
					ball.getPosition().y += 10;
					
				} else {
					ball.getPosition().y -= 10;
				}
				if(ball.getPosition().y + ball.getRadius()> 600) {
					yUp = false;
					ball.setColor(diffColors[count]);
					count++;
				}
				if(ball.getPosition().y <= 0) {
					yUp = true;
				}
				Thread.sleep(10);
				
				//RESET COLORS BACK TO INDEX 0
				  if (ball.getColor() == diffColors[4]) {
					  count = 0; 
				  }

				/*if (positionY > 300) { ball.getPosition().y -= 50; ball.getPosition().y -=
				  50; ball.setColor(diffColors[count]); count++; if (ball.getColor() ==
				  diffColors[3]) { count = 0; } }*/
				
				
			
			} catch (Exception e) {
				
			}
			

			this.repaint();
			this.revalidate();
		}

	}

}
