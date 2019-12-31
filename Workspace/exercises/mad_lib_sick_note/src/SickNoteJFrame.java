import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class SickNoteJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	Random r = new Random();
	
	private String one;
	private String two;
	private String three;
	private String four;
	private String five;
	private String six;
	private String seven;
	private String eight;
	private String nine;
	private String ten;
	
	// array values for random button use
	private String[] silly = {"stoopid", "flabergasted", "doink", "doo-doo", "weinie", "bumfuzzle", "loligag", "wabbit", "cattywampus", "gobble" }; 
	private String[] lastNames = {"McDoyle", "Bubba", "Smithy", "Dickens", "White", "Darkness", "Foley", "Hartkok", "Loosegina", "Trump"};
	private String[] illnesses = {"Water allergy", "Foreign Accent Syndrome", "Laughing death", "peanut allergy", "Gluten allergy", "sleep acnea", "Diahrea", "vaginal rash", "fish odor Syndrome", "alien hand Syndrome"};
	private String[] nounPlural1 = {"cups", "bubbles", "brushes", "curtains", "bottles", "caps", "toes", "folders", "lamps", "crickets"};
	private String[] adj1 = {"fat","grumpy","scattered","bitter","arrogant","clumsy","lazy","witty","precious", "frightened"};
	private String[] adj2 = {"gigantic", "fuzzy", "cuddly", "frantic", "passive","vibrant", "kind", "vivacious","up-tight","shakey"};
	private String[] silly2 = {"pompous", "aloof", "bamboozle","blob", "bozo","cockatoo", "dillydally", "egg-head","flippant", "looney"};
	private String[] place = {"bathroom", "porter-potty", "Jerusalem", "dog house", "thors-well", "Bermuta Triangle", "chocolate hills", "Goblin Valey State Park", "Whale-Bone Valey", "The Catacombs"};
	private String[] number = {"20","5001","one trillion", "8", "a-gazillian", "7", "2 million and 1", "16", "99", "1"};
	private String[] adj3  = {"smelly", "slimey", "beautiful", "spikey", "tricky", "hideous", "attrocious", "greedy", "cozy", "plump"};
	
	private String blank = null;
	int rand;
	
	SickNote person;
	JFrame frame = this;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SickNoteJFrame frame = new SickNoteJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SickNoteJFrame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,600);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel titlePanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) titlePanel.getLayout();
		flowLayout.setVgap(15);
		titlePanel.setOpaque(false);
		contentPane.add(titlePanel, BorderLayout.NORTH);
		
		JLabel lblSickNote = new JLabel("Sick Note");
		lblSickNote.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 24));
		lblSickNote.setOpaque(false);
		titlePanel.add(lblSickNote);
		
		JPanel buttonPanel = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) buttonPanel.getLayout();
		flowLayout_1.setVgap(10);
		buttonPanel.setOpaque(false);
		contentPane.add(buttonPanel, BorderLayout.SOUTH);
		
		JButton btnResult = new JButton("RESULT");
		btnResult.setFont(new Font("Georgia", Font.BOLD, 11));
		buttonPanel.add(btnResult);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setFont(new Font("Georgia", Font.BOLD, 11));
		buttonPanel.add(btnClear);
		
		
		JButton btnRandom = new JButton("Random");
		btnRandom.setFont(new Font("Georgia", Font.BOLD, 11));
		buttonPanel.add(btnRandom);
		
		JPanel madLibPanel = new JPanel();
		contentPane.add(madLibPanel, BorderLayout.CENTER);
		madLibPanel.setOpaque(false);
		madLibPanel.setLayout(new GridLayout(0, 2, -150, 15));
		
		JLabel lblSillyWord = new JLabel("Silly word");
		lblSillyWord.setHorizontalAlignment(SwingConstants.LEFT);
		lblSillyWord.setFont(new Font("Tahoma", Font.BOLD, 15));
		madLibPanel.add(lblSillyWord);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe Print", Font.ITALIC, 15));
		madLibPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setHorizontalAlignment(SwingConstants.LEFT);
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 15));
		madLibPanel.add(lblLastName);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe Print", Font.ITALIC, 15));
		madLibPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblIllness = new JLabel("Illness");
		lblIllness.setHorizontalAlignment(SwingConstants.LEFT);
		lblIllness.setFont(new Font("Tahoma", Font.BOLD, 15));
		madLibPanel.add(lblIllness);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Segoe Print", Font.ITALIC, 15));
		madLibPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNounplural = new JLabel("Noun (Plural)");
		lblNounplural.setHorizontalAlignment(SwingConstants.LEFT);
		lblNounplural.setFont(new Font("Tahoma", Font.BOLD, 15));
		madLibPanel.add(lblNounplural);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Segoe Print", Font.ITALIC, 15));
		madLibPanel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblAdjective = new JLabel("Adjective");
		lblAdjective.setHorizontalAlignment(SwingConstants.LEFT);
		lblAdjective.setFont(new Font("Tahoma", Font.BOLD, 15));
		madLibPanel.add(lblAdjective);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Segoe Print", Font.ITALIC, 15));
		madLibPanel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblAdjective_1 = new JLabel("Adjective");
		lblAdjective_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblAdjective_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		madLibPanel.add(lblAdjective_1);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Segoe Print", Font.ITALIC, 15));
		madLibPanel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblSillyWord_1 = new JLabel("Silly word");
		lblSillyWord_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSillyWord_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		madLibPanel.add(lblSillyWord_1);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Segoe Print", Font.ITALIC, 15));
		madLibPanel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblPlace = new JLabel("Place");
		lblPlace.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlace.setFont(new Font("Tahoma", Font.BOLD, 15));
		madLibPanel.add(lblPlace);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Segoe Print", Font.ITALIC, 15));
		madLibPanel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
		madLibPanel.add(lblNumber);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Segoe Print", Font.ITALIC, 15));
		madLibPanel.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblAdjective_2 = new JLabel("Adjective");
		lblAdjective_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblAdjective_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		madLibPanel.add(lblAdjective_2);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Segoe Print", Font.ITALIC, 15));
		madLibPanel.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel img =  new JLabel();
		img.setIcon(new ImageIcon(new ImageIcon("duck.jpeg").getImage().getScaledInstance(600, 500, Image.SCALE_SMOOTH)));
		
		
		
		/*repaint();
		revalidate();*/
		
		
		
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveUserInfo();
				person = new SickNote(one, two, three, four, five, six, seven, eight, nine, ten);
				JOptionPane.showMessageDialog(null, one + " " + two + " will not be attending school today. He/she has come down \nwith a case of " + three + " and has horrible " + four + " and a " + five + " fever. We have \nmade an appointment with the " + six + " Dr." + seven+", who studied for many years in " + eight + " \nand has " + nine + " degrees in pediatrics. He will send you all the information you need. \n\nThank you!\r\n" + 
						"Sincerely\r\n" + "Mrs." + ten + ". ", "Sick Note", JOptionPane.DEFAULT_OPTION, null);
				System.out.println(person);
						
			}
		});

		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clearUserInfo();
			}
		});
		btnRandom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			rand = r.nextInt(10);
			randomInfo();	
			
			}
		});
		
		
	}
	
	public void saveUserInfo() {
		
		one = textField.getText();
		two = textField_1.getText();
		three = textField_2.getText();
		four = textField_3.getText();
		five = textField_4.getText();
		six = textField_5.getText();
		seven = textField_6.getText();
		eight = textField_7.getText();
		nine = textField_8.getText();
		ten = textField_9.getText();
	}
	
	public void clearUserInfo() {
		
		textField.setText(blank);
		textField_1.setText(blank);
		textField_2.setText(blank);
		textField_3.setText(blank);
		textField_4.setText(blank);
		textField_5.setText(blank);
		textField_6.setText(blank);
		textField_7.setText(blank);
		textField_8.setText(blank);
		textField_9.setText(blank);
		
	}
	
	public void randomInfo() {
		
		textField.setText(silly[rand]);
		textField_1.setText(lastNames[rand]);
		textField_2.setText(illnesses[rand]);
		textField_3.setText(nounPlural1[rand]);
		textField_4.setText(adj1[rand]);
		textField_5.setText(adj2[rand]);
		textField_6.setText(silly2[rand]);
		textField_7.setText(place[rand]);
		textField_8.setText(number[rand]);
		textField_9.setText(adj3[rand]);
	}
	

}
