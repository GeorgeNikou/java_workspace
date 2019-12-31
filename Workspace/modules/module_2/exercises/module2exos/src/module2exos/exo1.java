package module2exos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class exo1 extends JFrame {
	JFrame myframe = new JFrame();
	public exo1() {
		
		myframe = this;
		this.setAlwaysOnTop(true);
		this.setSize(400,250);
		this.setTitle("ID card");
		this.setLocationRelativeTo(null);
		
		//main panel to the frame
		JPanel mainPanel = new JPanel(new BorderLayout());
		
		//left side
		JPanel panLeft = new JPanel();
		panLeft.setLayout(new BoxLayout(panLeft, BoxLayout.Y_AXIS));
		mainPanel.add(panLeft,BorderLayout.WEST);
		panLeft.setPreferredSize(new Dimension(150,150));
		
		/*//tmp top
		JPanel tmp1 = new JPanel();
		tmp1.setPreferredSize(new Dimension(40,40));
		panLeft.add(tmp1);*/
		
		//photo panel
		JPanel photo = new JPanel();
		JLabel jpeg = new JLabel();
		//photo.setBackground(Color.black);
		photo.setPreferredSize(new Dimension(150,150));
		ImageIcon image = new ImageIcon(new ImageIcon("Mullet_lama.jpeg").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		//jpeg.setIcon(new ImageIcon("Mullet_lama.jpeg"));
		jpeg.setIcon(image);
		photo.add(jpeg);
		panLeft.add(photo);
		
		/*//tmp Bottom
		JPanel tmp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel laama = new JLabel("Photo: valid until 2084");
		laama.setFont(new Font("Arial",8,8));
		tmp2.setPreferredSize(new Dimension(40,40));
		panLeft.add(tmp2);
		panLeft.add(laama);*/
		
		//right side
		JPanel panRight = new JPanel();
		panRight.setLayout(new BoxLayout(panRight, BoxLayout.Y_AXIS));
		//panRight.setBackground(Color.blue);
		panRight.setPreferredSize(new Dimension(150,150));
		mainPanel.add(panRight,BorderLayout.CENTER);
		
		//title
		JPanel titlePanel = new JPanel();
		JLabel title = new JLabel("HERZING COLLEGE");
		title.setFont(new Font("Times New Roman",Font.BOLD,20));
		titlePanel.add(title);
		panRight.add(titlePanel);
		
		//row 1
		JPanel rightPanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel nameLabel1 = new JLabel("Name:");
		JLabel nameLabel2 = new JLabel("Mr.Laama");
		nameLabel1.setFont(new Font("Consolas",Font.BOLD,17));
		nameLabel2.setFont(new Font("Consolas",Font.PLAIN,17));
		
		rightPanel1.add(nameLabel1);
		rightPanel1.add(nameLabel2);
		panRight.add(rightPanel1);
		
		//row2
		JPanel rightPanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel programLabel1 = new JLabel("Program:");
		JLabel programLabel2 = new JLabel("Buisness Ethics");
		programLabel1.setFont(new Font("Consolas",Font.BOLD,17));
		programLabel2.setFont(new Font("Consolas",Font.PLAIN,17));
		
		rightPanel2.add(programLabel1);
		rightPanel2.add(programLabel2);
		panRight.add(rightPanel2);
		
		//row3
		JPanel rightPanel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel studentNum = new JLabel("Student Number:");
		JLabel num = new JLabel("12345");
		studentNum.setFont(new Font("Consolas",Font.BOLD,17));
		num.setFont(new Font("Consolas",Font.PLAIN,17));
		
		rightPanel3.add(studentNum);
		rightPanel3.add(num);
		panRight.add(rightPanel3);
		
		
		
		
	
	
	
	
	
	
	
	
	
	
		this.add(mainPanel,BorderLayout.CENTER);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.repaint();
		this.revalidate();
	
	
	}

}
