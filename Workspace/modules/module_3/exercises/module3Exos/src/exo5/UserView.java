package exo5;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserView extends JFrame {

	JLabel selectLabel;
	JLabel nameLabel;
	JLabel lastLabel;
	JLabel ageLabel;
	JLabel genderLabel;

	JTextField selectTxt;
	JTextField nameTxt;
	JTextField lastNameTxt;
	JTextField ageTxt;
	JTextField genderTxt;

	JButton save;
	JButton clear;

	public UserView() {
		this.setSize(500, 300);
		this.setTitle("user info");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		
		JFrame frame = this;

		selectLabel = new JLabel("Select profile");
		nameLabel = new JLabel("First name: ");
		lastLabel = new JLabel("Last name: ");
		ageLabel = new JLabel("Age: ");
		genderLabel = new JLabel("Gender: ");

		selectTxt = new JTextField();
		nameTxt = new JTextField();
		lastNameTxt = new JTextField();
		ageTxt = new JTextField();
		genderTxt = new JTextField();

		save = new JButton("SAVE");
		clear = new JButton("CLEAR");

		JComboBox<String> information = new JComboBox<>();

		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(6, 2,5,5));

		panel1.add(selectLabel,0,0);
		panel1.add(nameLabel,1,0);
		panel1.add(lastLabel,2,0);
		panel1.add(ageLabel,3,0);
		panel1.add(genderLabel,4,0);
		panel1.add(save,5,0);
		
		panel1.add(selectTxt,0,1);
		panel1.add(nameTxt,1,1);
		panel1.add(lastNameTxt,2,1);
		panel1.add(ageTxt,3,1);
		panel1.add(genderTxt,4,1);
		panel1.add(clear,5,1);

		
		this.getContentPane().add(panel1);
		this.setVisible(true);

	}

}
