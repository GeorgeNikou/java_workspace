package Account;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class AccountView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountView frame = new AccountView();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AccountView() {
		

		 AccountBean person1 = new AccountBean("Mary", "Tzanetakos", "55", "1500 st", "438-930-1816");
		 AccountBean person2 = new AccountBean("Jimmy", "T", "43", "133 st", "438-556-1832");
		 
		 person1.setChecking(115000.0);
		 person1.setSaving(2000);
		 
		 
		 
		System.out.println(person1);
		System.out.println(person2);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(120, 10));
		contentPane.add(panel, BorderLayout.WEST);
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(120, 10));
		contentPane.add(panel_1, BorderLayout.EAST);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(5, 2, 0, 0));
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_3.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_2.add(panel_3);
		
		JLabel lblFirstName = new JLabel("First Name: ");
		panel_3.add(lblFirstName);
		
		textField = new JTextField();
		panel_3.add(textField);
		textField.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_4.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_2.add(panel_4);
		
		JLabel lblLastname = new JLabel("LastName: ");
		panel_4.add(lblLastname);
		
		textField_1 = new JTextField();
		panel_4.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_5.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_2.add(panel_5);
		
		JLabel lblAge = new JLabel("Age: ");
		panel_5.add(lblAge);
		
		textField_2 = new JTextField();
		panel_5.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_6.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_2.add(panel_6);
		
		JLabel lblAddress = new JLabel("Address: ");
		panel_6.add(lblAddress);
		
		textField_3 = new JTextField();
		panel_6.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) panel_7.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		panel_2.add(panel_7);
		
		JLabel lblNumber = new JLabel("Number: ");
		panel_7.add(lblNumber);
		
		textField_4 = new JTextField();
		panel_7.add(textField_4);
		textField_4.setColumns(10);
		
		AccountBean person3 = new AccountBean(getTextField().getText(), getTextField_1().getText(), getTextField_2().getText(), getTextField_3().getText(), getTextField_4().getText());
		System.out.println(person3);
		this.setVisible(true);
	}

	

	/**
	 * @return the textField
	 */
	public JTextField getTextField() {
		return textField;
	}

	/**
	 * @param textField the textField to set
	 */
	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	/**
	 * @return the textField_1
	 */
	public JTextField getTextField_1() {
		return textField_1;
	}

	/**
	 * @param textField_1 the textField_1 to set
	 */
	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	/**
	 * @return the textField_2
	 */
	public JTextField getTextField_2() {
		return textField_2;
	}

	/**
	 * @param textField_2 the textField_2 to set
	 */
	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	/**
	 * @return the textField_3
	 */
	public JTextField getTextField_3() {
		return textField_3;
	}

	/**
	 * @param textField_3 the textField_3 to set
	 */
	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}

	/**
	 * @return the textField_4
	 */
	public JTextField getTextField_4() {
		return textField_4;
	}

	/**
	 * @param textField_4 the textField_4 to set
	 */
	public void setTextField_4(JTextField textField_4) {
		this.textField_4 = textField_4;
	}
	
	

}
