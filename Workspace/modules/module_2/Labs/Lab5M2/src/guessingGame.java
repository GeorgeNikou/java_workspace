import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class guessingGame extends JFrame {
	JButton btnName;
	int counter = 3;

	public guessingGame() {

		this.setTitle("Guessing Game");
		this.setSize(850, 800);

		// Main panel (BorderLayout)
		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.setBackground(Color.red);

		// North panel
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new BoxLayout(northPanel, BoxLayout.X_AXIS));
		northPanel.setPreferredSize(new Dimension(200, 75));
		northPanel.setBackground(Color.BLUE);
		mainPanel.add(northPanel, BorderLayout.NORTH);

		// North panel button (name)
		JPanel panelName = new JPanel(new FlowLayout(FlowLayout.LEFT));
		btnName = new JButton("Name");
		btnName.setPreferredSize(new Dimension(200, 50));
		panelName.add(btnName);
		northPanel.add(panelName);

		// North panel label and level(ComboBox)
		JPanel levelPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel labelLevel = new JLabel("Level:");
		labelLevel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		JComboBox<String> comboLevels = new JComboBox<>(levelFunction());
		comboLevels.setFont(new Font("Consolas", Font.BOLD, 40));
		comboLevels.setPreferredSize(new Dimension(60, 45));

		levelPanel.add(labelLevel);
		levelPanel.add(comboLevels);
		northPanel.add(levelPanel);

		// start button
		JPanel startPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JButton btnStart = new JButton("START");
		btnStart.setPreferredSize(new Dimension(200, 50));
		startPanel.add(btnStart);
		northPanel.add(startPanel);

		// center panel
		JPanel centerPanel = new JPanel(new BorderLayout());
		mainPanel.add(centerPanel, BorderLayout.CENTER);

		// North panel 2
		JPanel northPanel2 = new JPanel(new BorderLayout());
		northPanel2.setPreferredSize(new Dimension(200, 30));
		centerPanel.add(northPanel2, BorderLayout.NORTH);

		// west level panel choice
		JPanel panelLevelWest = new JPanel(new BorderLayout());
		JLabel level = new JLabel("LEVEL: EASY");
		level.setFont(new Font("Calibri", Font.BOLD, 35));
		panelLevelWest.add(level);
		northPanel2.add(panelLevelWest, BorderLayout.WEST);

		// east level panel tries
		JPanel panelTriesEast = new JPanel(new BorderLayout());
		JLabel tries = new JLabel("TRIES: 00");
		tries.setFont(new Font("Calibri", Font.BOLD, 35));
		panelTriesEast.add(tries);
		northPanel2.add(panelTriesEast, BorderLayout.EAST);

		// Game boxes (GridLayout)
		JPanel boxes1 = new JPanel(new GridLayout(3, 3,15,15));
		boxes1.setPreferredSize(new Dimension(50, 50));
		

		JButton btn1 = new JButton();
		JButton btn2 = new JButton();
		JButton btn3 = new JButton();
		JButton btn4 = new JButton();
		JButton btn5 = new JButton();
		JButton btn6 = new JButton();
		JButton btn7 = new JButton();
		JButton btn8 = new JButton();
		JButton btn9 = new JButton();

		boxes1.add(btn1);
		boxes1.add(btn2);
		boxes1.add(btn3);
		boxes1.add(btn4);
		boxes1.add(btn5);
		boxes1.add(btn6);
		boxes1.add(btn7);
		boxes1.add(btn8);
		boxes1.add(btn9);
		
		centerPanel.add(boxes1);

		// south panel main
		JPanel southPanel = new JPanel(new BorderLayout());
		southPanel.setPreferredSize(new Dimension(200, 150));
		southPanel.setBackground(Color.BLUE);
		mainPanel.add(southPanel, BorderLayout.SOUTH);

		// south west panel
		JPanel southWestPanel = new JPanel();
		southWestPanel.setLayout(new BoxLayout(southWestPanel, BoxLayout.Y_AXIS));
		southWestPanel.setPreferredSize(new Dimension(425, 0));
		southWestPanel.setBackground(Color.YELLOW);
		southPanel.add(southWestPanel, BorderLayout.WEST);

		// games played
		JPanel gamesPlayedPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel gamesPlayedLabel = new JLabel("Games Played: ");
		JLabel gamesPlayedNum = new JLabel("00");
		gamesPlayedLabel.setFont(new Font("Calibri", Font.ITALIC, 30));
		gamesPlayedNum.setFont(new Font("Calibri", Font.BOLD, 30));

		gamesPlayedPanel.add(gamesPlayedLabel);
		gamesPlayedPanel.add(gamesPlayedNum);
		southWestPanel.add(gamesPlayedPanel);

		// games won
		JPanel gamesWonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel gamesWonLabel = new JLabel("Games Won: ");
		JLabel gamesWonNum = new JLabel("00");
		gamesWonLabel.setFont(new Font("Calibri", Font.ITALIC, 30));
		gamesWonNum.setFont(new Font("Calibri", Font.BOLD, 30));

		gamesWonPanel.add(gamesWonLabel);
		gamesWonPanel.add(gamesWonNum);
		southWestPanel.add(gamesWonPanel);

		// games Lost
		JPanel gamesLostPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel gamesLostLabel = new JLabel("Games Lost: ");
		JLabel gamesLostNum = new JLabel("00");
		gamesLostLabel.setFont(new Font("Calibri", Font.ITALIC, 30));
		gamesLostNum.setFont(new Font("Calibri", Font.BOLD, 30));

		gamesLostPanel.add(gamesLostLabel);
		gamesLostPanel.add(gamesLostNum);
		southWestPanel.add(gamesLostPanel);

		// south east panel
		JPanel southEastPanel = new JPanel();
		southEastPanel.setLayout(new BoxLayout(southEastPanel, BoxLayout.Y_AXIS));
		southEastPanel.setPreferredSize(new Dimension(425, 0));
		southEastPanel.setBackground(Color.magenta);
		southPanel.add(southEastPanel, BorderLayout.EAST);

		// player name
		JPanel playerNamePanel = new JPanel();
		JLabel playerNameLabel = new JLabel("test1");
		playerNameLabel.setFont(new Font("Ink Free", Font.BOLD, 45));

		playerNamePanel.add(playerNameLabel);
		southEastPanel.add(playerNamePanel);

		// total wins
		JPanel winsLosePanel = new JPanel();
		JLabel winLose = new JLabel("test2");
		winLose.setFont(new Font("Ink Free", Font.BOLD, 45));

		winsLosePanel.add(winLose);
		southEastPanel.add(winsLosePanel);

		this.add(mainPanel);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		Random r = new Random();
		int win = r.nextInt()*9;
		
		//action listener setting NAME
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane jop1 = new JOptionPane();
				String PlayerName = JOptionPane.showInputDialog(null, "enter your name", "Guessing Game!",
						JOptionPane.QUESTION_MESSAGE);
				System.out.println("Players name: " + PlayerName);
				playerNameLabel.setText(PlayerName);

			}
		});
		
		
		//action listener setting LEVEL
		comboLevels.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboLevels.getSelectedItem();
				
				JComboBox comboLevels = (JComboBox) e.getSource();
				
			}
		});
		
		//start
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			boxes1.setBackground(Color.green);
			
				
			}
		});
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	}

	public String[] levelFunction() {
		String[] lvl = new String[3];

		for (int i = 0; i < 3; i++) {
			lvl[i] = (i+1) + "";
		}
		return lvl;

	}
}
