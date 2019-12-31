package MadLib1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;

public class MadFrame extends JFrame {
	static MadFrame frame;

	private JPanel mainPanel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame = new MadFrame();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setSize(280,600);
					frame.setAlwaysOnTop(false);
					frame.setLocationRelativeTo(null);
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MadFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenu mnAbout = new JMenu("About");
		menuBar.add(mnAbout);
		mainPanel = new JPanel();
		mainPanel.setSize(new Dimension(400, 700));
		//setContentPane(mainPanel);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.setOpaque(false);
		
		JPanel titlePanel = new JPanel();
		JLabel titleLabel = new JLabel("Romeo and Juliet");
		titleLabel.setForeground(Color.RED);
		titleLabel.setFont(new Font("Nirmala UI Semilight", Font.BOLD | Font.ITALIC, 15));
		titlePanel.add(titleLabel,BorderLayout.CENTER);
		titlePanel.setOpaque(false);
		mainPanel.add(titlePanel);
		
		

		JPanel nounPlural1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) nounPlural1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		nounPlural1.setBackground(UIManager.getColor("Button.background"));
		nounPlural1.setOpaque(false);
		mainPanel.add(nounPlural1);
		
		
		JLabel lblNewLabel = new JLabel("Noun Plural: ");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setPreferredSize(new Dimension(100, 30));
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setOpaque(false);
		nounPlural1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Yu Gothic Light", Font.ITALIC, 15));
		nounPlural1.add(textField);
		textField.setColumns(10);
		
		JPanel place = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) place.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		place.setOpaque(false);
		mainPanel.add(place);
		
		JLabel lblNewLabel_1 = new JLabel("Place: ");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setPreferredSize(new Dimension(100, 30));
		lblNewLabel_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		place.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Yu Gothic Light", Font.ITALIC, 15));
		place.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel noun1 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) noun1.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		noun1.setOpaque(false);
		mainPanel.add(noun1);
		
		JLabel lblNewLabel_2 = new JLabel("Noun: ");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setPreferredSize(new Dimension(100, 30));
		lblNewLabel_2.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		noun1.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Yu Gothic Light", Font.ITALIC, 15));
		noun1.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel nounPlural2 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) nounPlural2.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		nounPlural2.setOpaque(false);
		mainPanel.add(nounPlural2);
		
		JLabel lblNewLabel_3 = new JLabel("Noun Plural: ");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setPreferredSize(new Dimension(100, 30));
		lblNewLabel_3.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		nounPlural2.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Yu Gothic Light", Font.ITALIC, 15));
		nounPlural2.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel noun2 = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) noun2.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		noun2.setOpaque(false);
		mainPanel.add(noun2);
		
		JLabel lblNewLabel_4 = new JLabel("Noun: ");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setPreferredSize(new Dimension(100, 30));
		lblNewLabel_4.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		noun2.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Yu Gothic Light", Font.ITALIC, 15));
		noun2.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel adj1 = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) adj1.getLayout();
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		adj1.setOpaque(false);
		mainPanel.add(adj1);
		
		JLabel lblNewLabel_5 = new JLabel("Adjective: ");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setPreferredSize(new Dimension(100, 30));
		lblNewLabel_5.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		adj1.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Yu Gothic Light", Font.ITALIC, 15));
		adj1.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel num1 = new JPanel();
		FlowLayout flowLayout_7 = (FlowLayout) num1.getLayout();
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		num1.setOpaque(false);
		mainPanel.add(num1);
		
		JLabel lblNewLabel_7 = new JLabel("Verb: ");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setPreferredSize(new Dimension(100, 30));
		lblNewLabel_7.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.LEFT);
		num1.add(lblNewLabel_7);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Yu Gothic Light", Font.ITALIC, 15));
		num1.add(textField_7);
		textField_7.setColumns(10);
		
		JPanel adj2 = new JPanel();
		FlowLayout flowLayout_8 = (FlowLayout) adj2.getLayout();
		flowLayout_8.setAlignment(FlowLayout.LEFT);
		adj2.setOpaque(false);
		mainPanel.add(adj2);
		
		JLabel lblNewLabel_8 = new JLabel("Number: ");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setPreferredSize(new Dimension(100, 30));
		lblNewLabel_8.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.LEFT);
		adj2.add(lblNewLabel_8);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Yu Gothic Light", Font.ITALIC, 15));
		adj2.add(textField_8);
		textField_8.setColumns(10);
		
		JPanel bodyPart = new JPanel();
		FlowLayout flowLayout_9 = (FlowLayout) bodyPart.getLayout();
		flowLayout_9.setAlignment(FlowLayout.LEFT);
		bodyPart.setOpaque(false);
		mainPanel.add(bodyPart);
		
		JLabel lblAdjective = new JLabel("Adjective: ");
		lblAdjective.setForeground(Color.WHITE);
		lblAdjective.setPreferredSize(new Dimension(100, 30));
		lblAdjective.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblAdjective.setHorizontalAlignment(SwingConstants.LEFT);
		bodyPart.add(lblAdjective);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Yu Gothic Light", Font.ITALIC, 15));
		bodyPart.add(textField_9);
		textField_9.setColumns(10);
		
		JPanel verb2 = new JPanel();
		FlowLayout flowLayout_10 = (FlowLayout) verb2.getLayout();
		flowLayout_10.setAlignment(FlowLayout.LEFT);
		verb2.setOpaque(false);
		mainPanel.add(verb2);
		
		JLabel lblNewLabel_9 = new JLabel("Body part: ");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblNewLabel_9.setPreferredSize(new Dimension(100, 30));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.LEFT);
		verb2.add(lblNewLabel_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Yu Gothic UI Light", Font.ITALIC, 15));
		verb2.add(textField_10);
		textField_10.setColumns(10);
		
		JPanel verb3 = new JPanel();
		FlowLayout fl_verb3 = (FlowLayout) verb3.getLayout();
		fl_verb3.setAlignment(FlowLayout.LEFT);
		verb3.setOpaque(false);
		mainPanel.add(verb3);
		
		JLabel lblNewLabel_10 = new JLabel("Verb: ");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblNewLabel_10.setPreferredSize(new Dimension(100, 30));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.LEFT);
		verb3.add(lblNewLabel_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Yu Gothic UI Light", Font.ITALIC, 15));
		verb3.add(textField_11);
		textField_11.setColumns(10);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setOpaque(false);
		mainPanel.add(buttonPanel);
		
		JButton btnNewButton = new JButton("VIEW RESULT!");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton.setOpaque(false);
		buttonPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CLEAR");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 8));
		buttonPanel.add(btnNewButton_1);
		
		
		JLabel imageRJ = new JLabel();
		imageRJ.setIcon(new ImageIcon(new ImageIcon("romeo-juliet.jpeg").getImage().getScaledInstance(280, 600, Image.SCALE_SMOOTH)));
		
		FlowLayout f1 = new FlowLayout();
		this.setContentPane(imageRJ);
		imageRJ.setLayout(f1);
		getContentPane().add(mainPanel);
		
		romeoJuliet game1 = new romeoJuliet();
//		romeoJuliet game1 = new romeoJuliet(textField.getText(),textField_1.getText(), textField_2.getText(),textField_3.getText(),textField_4.getText(),textField_5.getText(),textField_10.getText(),textField_7.getText(),textField_8.getText(),textField_8.getText(),textField_9.getText());
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.setNounPlural(textField.getText());
				game1.setPlace(textField_1.getText());
				game1.setNoun1(textField_2.getText());
				game1.setNounPlural2(textField_3.getText());
				game1.setNoun2(textField_4.getText());
				game1.setAdj1(textField_5.getText());
				game1.setVerb1(textField_10.getText());
				game1.setNum1(textField_7.getText());
				game1.setAdj2(textField_8.getText());
				game1.setBodyPart(textField_8.getText());
				game1.setVerb2(textField_9.getText());
				game1.setVerb2(textField_11.getText());
				JOptionPane.showMessageDialog(null, game1.spill(),"romeo and juliet", JOptionPane.PLAIN_MESSAGE);
				
				
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_10.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_11.setText("");
			}
		});
		
	
		
		
	}

}
