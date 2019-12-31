package Lab3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Lab3 extends JFrame {
	String temp = "";
	JLabel title;
	double num1 = 0;
	String opp = "";

	public Lab3() {
		JFrame frame = this;
		this.setTitle("Calculator");
		this.setSize(250, 300);
		this.setAlwaysOnTop(true);
		this.setLocationRelativeTo(null);

		// main panel to receive the buttons and title on top
		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		// title label
		title = new JLabel("0", JLabel.RIGHT);
		title.setOpaque(true);
		title.setBackground(Color.WHITE);
		title.setFont(new Font("Consolas", Font.PLAIN, 30));
		mainPanel.add(title, BorderLayout.NORTH);

		// center panel to receive all the buttons
		JPanel centerpan = new JPanel(new GridLayout(4, 4, 10, 10));
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton btnDiv = new JButton("/");

		// adding first row
		centerpan.add(btn7);
		centerpan.add(btn8);
		centerpan.add(btn9);
		centerpan.add(btnDiv);

		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btnTimes = new JButton("*");

		// adding second row
		centerpan.add(btn4);
		centerpan.add(btn5);
		centerpan.add(btn6);
		centerpan.add(btnTimes);

		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btnMinus = new JButton("-");

		// adding third row
		centerpan.add(btn1);
		centerpan.add(btn2);
		centerpan.add(btn3);
		centerpan.add(btnMinus);

		JButton btn0 = new JButton("0");
		JButton btnPeriod = new JButton(".");
		JButton btnEqual = new JButton("=");
		JButton btnPlus = new JButton("+");

		// adding last row
		centerpan.add(btn0);
		centerpan.add(btnPeriod);
		centerpan.add(btnEqual);
		centerpan.add(btnPlus);

		centerpan.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
		mainPanel.add(centerpan, BorderLayout.CENTER);

		btn7.addActionListener(new numberAction());
		btn8.addActionListener(new numberAction());
		btn9.addActionListener(new numberAction());
		btn4.addActionListener(new numberAction());
		btn5.addActionListener(new numberAction());
		btn6.addActionListener(new numberAction());
		btn3.addActionListener(new numberAction());
		btn2.addActionListener(new numberAction());
		btn1.addActionListener(new numberAction());
		btn0.addActionListener(new numberAction());
		btnPeriod.addActionListener(new numberAction());

		btnEqual.addActionListener(new equals());
		btnTimes.addActionListener(new operators());
		btnDiv.addActionListener(new operators());
		btnMinus.addActionListener(new operators());
		btnPlus.addActionListener(new operators());

		JMenuBar menuBar = new JMenuBar();

		// EDIT menu(change colors)
		JMenu edit = new JMenu("Edit");
		JMenuItem red = new JMenuItem("red");
		JMenuItem blue = new JMenuItem("blue");
		JMenuItem green = new JMenuItem("green");
		JMenuItem exit = new JMenuItem("exit");

		edit.add(red);
		edit.add(blue);
		edit.add(green);
		edit.add(exit);
		menuBar.add(edit);

		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int response = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", "Calculator",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

				switch (response) {

				case JOptionPane.YES_OPTION:
					System.exit(0);
					break;
				case JOptionPane.NO_OPTION:
					System.out.println("no");
					break;
				case JOptionPane.CANCEL_OPTION:
					System.out.println("cancel");
					break;
				default:
					System.out.println("");
				}

			}
		});

		red.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setBackground(Color.red);
				centerpan.setBackground(Color.red);

			}
		});

		blue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setBackground(Color.blue);
				centerpan.setBackground(Color.blue);

			}
		});

		green.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setBackground(Color.green);
				centerpan.setBackground(Color.green);

			}
		});

		// ABOUT Menu
		JMenu help = new JMenu("Help");
		JMenuItem version = new JMenuItem("version");
		JMenuItem about = new JMenuItem("about");

		help.add(version);
		help.add(about);
		menuBar.add(help);

		version.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Version 2.5", "Current version running",
						JOptionPane.INFORMATION_MESSAGE);

			}
		});

		about.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "George Nikou\nI have a glorious beard", "",
						JOptionPane.INFORMATION_MESSAGE);

			}
		});

		this.setJMenuBar(menuBar);
		this.add(mainPanel);
		this.setVisible(true);
		this.repaint();
		this.revalidate();

	}

	class numberAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String text = title.getText();
			JButton btn = (JButton) e.getSource();
				
				if(text.equals("0")) 
					title.setText(btn.getText());
				else if(btn.getText().equals(".") && text.indexOf(".") != -1) 
					title.setText(text);
				else 
					title.setText(text+btn.getText());	

							
				
//			}else if(btn.getText().equals(".")) {
//				
//			}else{
//				title.setText(text+btn.getText());
//			}
				
			// num1 = Double.parseDouble(title.getText());
			//title.setText(title.getText() + btn.getText());

		}

	}

	class operators implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			num1 = Double.parseDouble(title.getText());
			opp = btn.getText();
			title.setText("0");
			// System.out.println(num1 +" "+ opp);

		}

	}

	class equals implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// JButton btn = (JButton) e.getSource();
			double num2 = Double.parseDouble(title.getText());
			if (opp.equals("-")) {
				title.setText("" + (num1 - num2));

			} else if (opp.equals("+")) {
				title.setText("" + (num1 + num2));

			} else if (opp.equals("/")) {
				title.setText("" + (num1 / num2));

			} else if (opp.equals("*")) {
				title.setText("" + (num1 * num2));

			}

		}

	}

}
