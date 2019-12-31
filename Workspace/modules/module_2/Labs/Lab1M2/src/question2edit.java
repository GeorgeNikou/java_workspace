import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class question2edit {

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
		JPanel parentPanel = new JPanel();
		JPanel mainPanel = new JPanel();
		JPanel middlePanel = new JPanel();
		parentPanel.setLayout(new BorderLayout());
		myframe.add(parentPanel);
		JButton btn2 = new JButton("BTN2");
		JButton btn3 = new JButton("BTN3");
		JButton btn4 = new JButton("BTN4");
		parentPanel.add(mainPanel,BorderLayout.WEST);
		mainPanel.setLayout(new GridLayout(3,0));
		mainPanel.add(btn2,BorderLayout.WEST);
		mainPanel.add(btn3,BorderLayout.WEST);
		mainPanel.add(btn4,BorderLayout.WEST);
		
		
		
		

		// center panel
		JButton bigassbutt = new JButton("BIGASSBUTTON");
		middlePanel.setLayout(new BorderLayout());
		middlePanel.add(bigassbutt,BoxLayout.X_AXIS);
		parentPanel.add(middlePanel);
		

		// right panel
		/*JPanel rightPanel = new JPanel();
		rightPanel.setLayout(new GridLayout(0,1));
		myframe.add(rightPanel,BorderLayout.EAST);
		JButton btn5 = new JButton("BTN5");
		rightPanel.add(btn5,BorderLayout.EAST);*/

		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setVisible(true);
	}

	}

