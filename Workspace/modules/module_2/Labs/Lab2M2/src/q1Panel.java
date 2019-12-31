import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class q1Panel extends JPanel {
	public void paintComponent(Graphics g) {

		Font octagonFont = new Font("Consolas", Font.BOLD, 45);

		// rectangle #1
		int x1[] = { 10, 85, 85, 10 };
		int y1[] = { 100, 100, 200, 200 };

		// Octagon #1
		int x2[] = { 85, 156, 256, 327, 327, 256, 156, 85 };
		int y2[] = { 100, 29, 29, 100, 200, 271, 271, 200 };

		// rectangle #2
		int x3[] = { 498, 573, 573, 498 };
		int y3[] = { 271, 271, 371, 371 };

		// Octagon #2
		int x4[] = { 327, 427, 498, 498, 427, 327, 256, 256 };
		int y4[] = { 200, 200, 271, 371, 442, 442, 371, 271 };

		g.drawPolygon(x1, y1, x1.length);
		g.drawPolygon(x2, y2, x2.length);
		g.drawPolygon(x3, y3, x3.length);
		g.drawPolygon(x4, y4, x4.length);

		// ==============================================//

		// rectangle #1
		g.drawPolygon(x1, y1, x1.length);
		g.setColor(Color.white);
		g.fillPolygon(x1, y1, x1.length);

		// octagon #1
		g.drawPolygon(x2, y2, x2.length);
		g.setColor(Color.blue);
		g.fillPolygon(x2, y2, x2.length);
		g.setFont(octagonFont);
		g.setColor(Color.white);
		g.drawString("HERZING", 120, 160);

		// rectangle #2
		g.drawPolygon(x3, y3, x3.length);
		g.setColor(Color.blue);
		g.fillPolygon(x3, y3, x3.length);

		// octagon #2
		g.drawPolygon(x4, y4, x4.length);
		g.setColor(Color.white);
		g.fillPolygon(x4, y4, x4.length);
		g.setFont(octagonFont);
		g.setColor(Color.blue);
		g.drawString("COLLEGE", 295, 335);

	}

}
