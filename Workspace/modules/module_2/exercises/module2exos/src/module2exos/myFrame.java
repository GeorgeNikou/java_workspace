package module2exos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.ImageCapabilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;


	public class myFrame extends JFrame {
		JFrame myframe = new JFrame();
		String 	p = "";
		JTextField numText;
		public myFrame() {
			
			myframe= this;
			
			this.setTitle("New Account Registration");
			this.setSize(500, 600);
			this.setAlwaysOnTop(true);
			this.setLocationRelativeTo(null);
			
			
			JLabel theD = new JLabel();
			theD.setIcon(new ImageIcon("donald-trump.jpeg"));
			
			

			// CREATING A MAIN PANEL FOR THE FRAME IN (BoxLayout)vertical
			JPanel mainPanel = new JPanel();
			mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS)); 
			//mainPanel.setPreferredSize(new Dimension(this.getWidth(),this.getHeight()));
			mainPanel.setOpaque(false);
			
			
	
			//title
			JPanel title  = new JPanel();
			JLabel titleLabel = new JLabel("New Account Registration");
			titleLabel.setForeground(Color.white);
			titleLabel.setFont(new Font("Times New Roman",Font.BOLD,30));
			title.setOpaque(false);
			
			title.add(titleLabel);
			mainPanel.add(title);
			

			
			
			// 1st NAME INPUT
			JPanel panel1 = new JPanel();
			JLabel label1 = new JLabel("Name:");
			label1.setFont(new Font("Arial",Font.BOLD,13));
			label1.setForeground(Color.white);
			label1.setPreferredSize(new Dimension(125,40));
			JTextField nameTextField = new JTextField();
			nameTextField.setPreferredSize(new Dimension(220, 25));
			nameTextField.setBackground(Color.white);
			
			panel1.setOpaque(false);
			
			panel1.add(label1);
			panel1.add(nameTextField);
			mainPanel.add(panel1);
			
			nameTextField.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("name: "+nameTextField.getText());
				}
			});

			
			// 2nd EMAIL ADRESS
			JPanel panel2 = new JPanel();
			JLabel label2 = new JLabel("Email adress:");
			label2.setForeground(Color.white);
			label2.setFont(new Font("Arial",Font.BOLD,13));
			label2.setPreferredSize(new Dimension(125,40));
			JTextField emailText = new JTextField();
			emailText.setPreferredSize(new Dimension(220, 25));
			emailText.setBackground(Color.white);
			
			panel2.setOpaque(false);
			
			panel2.add(label2);
			panel2.add(emailText);
			mainPanel.add(panel2);
			
			emailText.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Email Adress: "+emailText.getText());
				}
			});
			
			
			
			//	3rd CREATE PASSWORD
			JPanel panel3 = new JPanel();
			JLabel label3 = new JLabel("Create Password:");
			label3.setForeground(Color.white);
			label3.setFont(new Font("Arial",Font.BOLD,13));
			label3.setPreferredSize(new Dimension(125,40));
			JTextField passwordText = new JTextField();
			passwordText.setPreferredSize(new Dimension(220, 25));
			passwordText.setBackground(Color.white);
			
			panel3.setOpaque(false);
			
			panel3.add(label3);
			panel3.add(passwordText);
			mainPanel.add(panel3);
			
			
			
			//	4th CONFIRM PASSWORD
			JPanel panel4 = new JPanel();
			JLabel label4 = new JLabel("Confirm Password:");
			label4.setForeground(Color.white);
			label4.setFont(new Font("Arial",Font.BOLD,13));
			label4.setPreferredSize(new Dimension(125,40));
			JTextField confirmPasswordText = new JTextField();
			confirmPasswordText.setPreferredSize(new Dimension(220, 25));
			confirmPasswordText.setBackground(Color.white);
			
			panel4.setOpaque(false);
			
			panel4.add(label4);
			panel4.add(confirmPasswordText);
			mainPanel.add(panel4);
			
			passwordText.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				p = passwordText.getText();
					
				}
			});
			confirmPasswordText.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				String cp = confirmPasswordText.getText();	
				if(cp.equals(p)) {
					System.out.println("password confirmed");
				}else
					System.err.println("invalid password");
					
				}
			});
			
			
			//	5th GENDER SELECTION
			JPanel panel5 = new JPanel();
			JLabel lable5 = new JLabel("Gender:");
			lable5.setForeground(Color.white);
			lable5.setPreferredSize(new Dimension(140,40));
			lable5.setFont(new Font("Arial",Font.BOLD,13));
			JRadioButton gender1 = new JRadioButton("Male");
			gender1.setForeground(Color.white);
			gender1.setFont(new Font("Arial",Font.BOLD,13));
			gender1.setPreferredSize(new Dimension(100,40));
			JRadioButton gender2 = new JRadioButton("Female");
			gender2.setForeground(Color.white);
			gender2.setFont(new Font("Arial",Font.BOLD,13));
			gender2.setPreferredSize(new Dimension(100,40));
			ButtonGroup genderGroup = new ButtonGroup();
			
			panel5.setOpaque(false);
			gender1.setOpaque(false);
			gender2.setOpaque(false);
			
			genderGroup.add(gender1);
			genderGroup.add(gender2);
			
			panel5.add(lable5);
			panel5.add(gender1);
			panel5.add(gender2);
			mainPanel.add(panel5);
			
			gender1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("Gender: "+gender1.getText());
				}
			});
			gender2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("Gender: "+gender2.getText());
				}
			});
			
			
			//	6th	ADRESS
			JPanel panel6 = new JPanel();
			JLabel lable6 = new JLabel("Address:");
			lable6.setForeground(Color.white);
			lable6.setFont(new Font("Arial",Font.BOLD,13));
			lable6.setPreferredSize(new Dimension(125,40));
			JTextField adressText = new JTextField();
			adressText.setPreferredSize(new Dimension(220, 25));
			adressText.setBackground(Color.red);
			
			panel6.setOpaque(false);
			
			panel6.add(lable6);
			panel6.add(adressText);
			mainPanel.add(panel6);
			
			adressText.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("Address: "+adressText.getText());
					
				}
			});
			
			
			//	7th STATE SELECTION
			JPanel panel7 = new JPanel();
			JLabel label7 = new JLabel("State:");
			label7.setForeground(Color.white);
			label7.setFont(new Font("Arial",Font.BOLD,13));
			label7.setPreferredSize(new Dimension(240,40));
			String[] state = {"New York","Alabama","Washington","California","Virginia","Boston"}; 
			JComboBox<String> stateArr = new JComboBox<>(state);
			stateArr.setFont(new Font("Arial Black",15,12));
			stateArr.setBackground(Color.white);
			
			panel7.setOpaque(false);
			
			panel7.add(label7);
			panel7.add(stateArr);
			mainPanel.add(panel7);
			
			stateArr.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("State: "+stateArr.getSelectedItem());
					
				}
			});
			
			//	8th COUNTRY SELECTION
			JPanel panel8 = new JPanel();
			JLabel label8 = new JLabel("Country:");
			label8.setForeground(Color.white);
			label8.setPreferredSize(new Dimension(125,40));
			label8.setFont(new Font("Arial",Font.BOLD,13));
			JTextField countryText = new JTextField();
			countryText.setBackground(Color.blue);
			countryText.setPreferredSize(new Dimension(220, 25));
			
			panel8.setOpaque(false);
			
			
			panel8.add(label8);
			panel8.add(countryText);
			mainPanel.add(panel8);
			
			countryText.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("Country: "+countryText.getText());
					
				}
			});
			
			
			
			//	9th PHONE NUMBER
			JPanel panel9 = new JPanel();
			JLabel label9 = new JLabel("Phone Number:");
			label9.setForeground(Color.white);
			label9.setFont(new Font("Arial",Font.BOLD,13));
			label9.setPreferredSize(new Dimension(125,40));
			numText = new JTextField();
			
			
			panel9.setOpaque(false);
			
			
			
			try {
				MaskFormatter license = new MaskFormatter("(###) ### ####");
				numText = new JFormattedTextField(license);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			numText.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("Phone NUmber: "+numText.getText());
					
				}
			});
			
			numText.setPreferredSize(new Dimension(220, 25));
			panel9.add(label9);
			panel9.add(numText);
			mainPanel.add(panel9);
			
			JPanel dtPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
			JLabel dt = new JLabel("Sponsored by: SPACE FORCE");
			dt.setFont(new Font("Consolas",Font.ITALIC,10));
			dt.setForeground(Color.LIGHT_GRAY);
			dtPanel.setOpaque(false);
			dtPanel.add(dt);
			mainPanel.add(dtPanel);
			
			
			
			
			
			
			
			
			
			
			
			this.setContentPane(theD);
			theD.setLayout(new FlowLayout());
			this.add(mainPanel);
			
			
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);
			
			/*this.repaint();
			this.revalidate();*/
		}

}
