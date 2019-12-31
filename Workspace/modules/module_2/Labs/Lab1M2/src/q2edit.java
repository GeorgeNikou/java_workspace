import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class q2edit {

	public static void main(String[] args) {
		JFrame myframe = new JFrame("question 2");
		//myframe.setTitle("QUESTION 1");
		myframe.setSize(600, 400);
		// myFrame.setResizable(false);
		myframe.setAlwaysOnTop(true);
		myframe.setLocationRelativeTo(null);

		// top panel
		JPanel topPan = new JPanel();
		topPan.setLayout(new GridLayout(0, 2, 100, 0));
		topPan.setPreferredSize(new Dimension(0, 75));
		myframe.add(topPan, BorderLayout.NORTH);
		JButton btn1 = new JButton("BTN1");
		JButton justin = new JButton("JUSTIN");
		topPan.add(btn1, BorderLayout.NORTH);
		topPan.add(justin, BorderLayout.NORTH);

		// bottom panel
		JPanel bottomPan = new JPanel();
		bottomPan.setLayout(new GridLayout(0, 2, 150, 0));
		bottomPan.setPreferredSize(new Dimension(0, 75));
		myframe.add(bottomPan, BorderLayout.SOUTH);
		JButton john = new JButton("JOHN");
		JButton george = new JButton("GEORGE");
		bottomPan.add(john, BorderLayout.SOUTH);
		bottomPan.add(george, BorderLayout.SOUTH);

		// left panel
		JPanel leftPanel = new JPanel();
		JPanel bigButton = new JPanel();
		leftPanel.setLayout(new GridLayout(3, 0));
		leftPanel.setPreferredSize(new Dimension(125, 50));
		myframe.add(leftPanel, BorderLayout.WEST);
		JButton btn2 = new JButton("BTN2");
		JButton btn3 = new JButton("BTN3");
		JButton btn4 = new JButton("BTN4");
		leftPanel.add(btn2, BorderLayout.WEST);
		leftPanel.add(btn3, BorderLayout.WEST);
		leftPanel.add(btn4, BorderLayout.WEST);

		// center panel
		JButton bigassbutt = new JButton("BIGASSBUTTON");
		bigButton.setLayout(new BorderLayout());
		bigButton.add(bigassbutt, BorderLayout.CENTER);
		
		
		JPanel midPanel = new JPanel();
		midPanel.setLayout(new BorderLayout());
		midPanel.add(bigButton,BorderLayout.CENTER);
		myframe.add(midPanel);
		
		JPanel l = new JPanel();
		l.setLayout(new BoxLayout(l, BoxLayout.PAGE_AXIS));
		JButton laul = new JButton("LAUL");
		laul.setAlignmentX(Component.RIGHT_ALIGNMENT);
		l.add(laul);
		midPanel.add(l,BorderLayout.SOUTH);
		
		
		
	

		// right panel
		JPanel rightPanel = new JPanel();
		rightPanel.setLayout(new GridLayout(0,1));
		myframe.add(rightPanel,BorderLayout.EAST);
		JButton btn5 = new JButton("BTN5");
		rightPanel.add(btn5,BorderLayout.EAST);
		
		//	laul panel
		//JPanel laul = new JPanel();
		

		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setVisible(true);

	}

}
