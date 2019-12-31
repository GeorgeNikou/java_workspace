package module2exos;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class exo4 extends JFrame {
	public exo4() {
		this.setTitle("Tip Calculator");
		this.setSize(650, 300);
		
		//main panel
		JPanel mainPan = new JPanel();
		mainPan.setLayout(new BorderLayout());
		this.add(mainPan);
		
		//left panel
		JPanel leftPan = new JPanel();
		leftPan.setLayout(new BoxLayout(leftPan,BoxLayout.Y_AXIS));
		leftPan.setBackground(Color.black);
		mainPan.add(leftPan,BorderLayout.WEST);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
