import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class question1 {

	public static void main(String[] args) {
		// creating the frame
		JFrame myframe = new JFrame();
		myframe.setTitle("QUESTION 1");
		myframe.setSize(600, 300);
		// myFrame.setResizable(false);
		myframe.setAlwaysOnTop(true);
		myframe.setLocationRelativeTo(null);

		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setVisible(true);

		JButton btn1 = new JButton("Button1");
		JButton btn2 = new JButton("Button2");
		JButton btn3 = new JButton("Button3");
		JButton btn4 = new JButton("Button4");
		JButton btn5 = new JButton("Button5");
		JButton btn6 = new JButton("Button6");
		JButton btn7 = new JButton("Button7");
		JButton btn8 = new JButton("Button8");
		JButton btn9 = new JButton("Button9");

		// left panel
		myframe.setLayout(new GridLayout(0, 3));

		JPanel pan1 = new JPanel();
		pan1.setLayout(new BorderLayout());
		pan1.setBackground(Color.black);
		myframe.add(pan1);
		pan1.add(btn1, BorderLayout.NORTH);
		pan1.add(btn2, BorderLayout.CENTER);
		btn1.setPreferredSize(new Dimension(0, 80));

		
		// middle panel
		JPanel pan2 = new JPanel();
		pan2.setLayout(new BorderLayout());
		pan2.setBackground(Color.cyan);
		myframe.add(pan2);
		pan2.add(btn3);
		
		
		//main right/parent
		JPanel pan3 = new JPanel();
		pan3.setLayout(new BorderLayout());
		myframe.add(pan3);
		
		
		//right panel/top
		JPanel pan4 = new JPanel();
		pan4.setLayout(new GridLayout(2,0));
		pan4.setPreferredSize(new Dimension(0,80));
		pan3.add(pan4,BorderLayout.NORTH);
		pan4.add(btn5);
		pan4.add(btn6);
		
	
		
		
		JPanel pan5 = new JPanel();
		pan5.setLayout(new GridLayout(0,3));
		pan3.add(pan5);
		
		pan5.add(btn7);
		pan5.add(btn8);
		pan5.add(btn9);
		
		
		
		
		
		
		
		

		myframe.repaint();
		myframe.revalidate();

	}

}
