import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class guessingGameEdit extends JFrame {
	JButton btnName;
	int counter = 0;
	JFrame frame;
	JPanel boxes1;
	int num = 3;
	int number1 = 0;
	int number2 = 0;
	int number3 = 0;
	int number4 = 0;
	JLabel img;
	JLabel gamesPlayedNum;
	JLabel winLose;
	JLabel tries;
	JLabel gamesWonNum;
	JLabel gamesLostNum;
	JMenuItem startRestart;
	ArrayList<String> pl = new ArrayList<String>();

	public guessingGameEdit() {
		pl.add("George");
		pl.add("Nick");
		pl.add("Samantha");
		frame = this;
		this.setTitle("Guessing Game");
		this.setSize(865, 800);

		// Main panel (BorderLayout)
		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.setSize(new Dimension(850,725));

		mainPanel.setOpaque(false);//-----------------

		JLabel img = new JLabel();
		//img.setIcon(new ImageIcon("cat_dog.jpeg"));
		ImageIcon newImg = new ImageIcon(new ImageIcon("cat_dog.jpeg").getImage().getScaledInstance(850, 800, Image.SCALE_SMOOTH));
		img.setIcon(newImg);
		
		// North panel
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new BoxLayout(northPanel, BoxLayout.X_AXIS));
		northPanel.setPreferredSize(new Dimension(200, 75));
		northPanel.setBackground(Color.BLUE);
		mainPanel.add(northPanel, BorderLayout.NORTH);

		northPanel.setOpaque(false);// ------------------

		// North panel button (name)
		JPanel panelName = new JPanel(new FlowLayout(FlowLayout.LEFT));
		btnName = new JButton("Name");
		btnName.setPreferredSize(new Dimension(200, 50));
		panelName.add(btnName);
		northPanel.add(panelName);

		panelName.setOpaque(false);// --------------------

		// North panel levels(ComboBox)
		JPanel levelPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel labelLevel = new JLabel("Level:");
		labelLevel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		JComboBox<String> comboLevels = new JComboBox<>(levelFunction());
		comboLevels.setFont(new Font("Consolas", Font.BOLD, 40));
		comboLevels.setPreferredSize(new Dimension(60, 45));

		levelPanel.setOpaque(false);// --------------------
		labelLevel.setOpaque(false);
		comboLevels.setOpaque(false);

		levelPanel.add(labelLevel);
		levelPanel.add(comboLevels);
		northPanel.add(levelPanel);

		// start button
		JPanel startPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JButton btnStart = new JButton("START");
		btnStart.setPreferredSize(new Dimension(200, 50));

		startPanel.setOpaque(false);// ---------------------
		btnStart.setOpaque(false);

		startPanel.add(btnStart);
		northPanel.add(startPanel);

		// center panel
		JPanel centerPanel = new JPanel(new BorderLayout());
		centerPanel.setOpaque(false);// --------------------
		mainPanel.add(centerPanel, BorderLayout.CENTER);

		// North panel 2
		JPanel northPanel2 = new JPanel(new BorderLayout());
		northPanel2.setPreferredSize(new Dimension(200, 30));
		northPanel2.setOpaque(false);// --------------------
		centerPanel.add(northPanel2, BorderLayout.NORTH);

		// west level panel choice
		JPanel panelLevelWest = new JPanel(new BorderLayout());
		JLabel level = new JLabel("LEVEL: EASY");
		level.setFont(new Font("Calibri", Font.BOLD, 35));

		panelLevelWest.setOpaque(false);// ------------------
		level.setOpaque(false);

		panelLevelWest.add(level);
		northPanel2.add(panelLevelWest, BorderLayout.WEST);

		// east level panel tries
		JPanel panelTriesEast = new JPanel(new BorderLayout());
		tries = new JLabel("TRIES: 0");
		tries.setFont(new Font("Calibri", Font.BOLD, 35));

		panelTriesEast.setOpaque(false);// ------------------
		tries.setOpaque(false);

		panelTriesEast.add(tries);
		northPanel2.add(panelTriesEast, BorderLayout.EAST);

		// GridLayout initialized
		boxes1 = new JPanel();
		boxes1.setOpaque(false);// ------------------
		centerPanel.add(boxes1);

		// south panel main
		JPanel southPanel = new JPanel(new BorderLayout());
		southPanel.setPreferredSize(new Dimension(200, 150));
		southPanel.setBackground(Color.BLUE);

		southPanel.setOpaque(false);// ----------------

		mainPanel.add(southPanel, BorderLayout.SOUTH);

		// south west panel
		JPanel southWestPanel = new JPanel();
		southWestPanel.setLayout(new BoxLayout(southWestPanel, BoxLayout.Y_AXIS));
		southWestPanel.setPreferredSize(new Dimension(425, 0));
		southWestPanel.setBackground(Color.YELLOW);

		southWestPanel.setOpaque(false);// -------------------

		southPanel.add(southWestPanel, BorderLayout.WEST);

		// games played
		JPanel gamesPlayedPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel gamesPlayedLabel = new JLabel("Games Played: ");
		gamesPlayedNum = new JLabel("0");
		gamesPlayedLabel.setFont(new Font("Calibri", Font.ITALIC, 30));
		gamesPlayedNum.setFont(new Font("Calibri", Font.BOLD, 30));

		gamesPlayedPanel.setOpaque(false);
		gamesPlayedLabel.setOpaque(false);
		
		gamesPlayedPanel.add(gamesPlayedLabel);
		gamesPlayedPanel.add(gamesPlayedNum);
		southWestPanel.add(gamesPlayedPanel);

		// games won
		JPanel gamesWonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel gamesWonLabel = new JLabel("Games Won: ");
		gamesWonNum = new JLabel("0");
		gamesWonLabel.setFont(new Font("Calibri", Font.ITALIC, 30));
		gamesWonNum.setFont(new Font("Calibri", Font.BOLD, 30));

		gamesWonPanel.setOpaque(false);
		gamesWonLabel.setOpaque(false);
		
		gamesWonPanel.add(gamesWonLabel);
		gamesWonPanel.add(gamesWonNum);
		southWestPanel.add(gamesWonPanel);

		// games Lost
		JPanel gamesLostPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel gamesLostLabel = new JLabel("Games Lost: ");
		gamesLostNum = new JLabel("0");
		gamesLostLabel.setFont(new Font("Calibri", Font.ITALIC, 30));
		gamesLostNum.setFont(new Font("Calibri", Font.BOLD, 30));
		
		gamesLostPanel.setOpaque(false);
		gamesLostLabel.setOpaque(false);

		gamesLostPanel.add(gamesLostLabel);
		gamesLostPanel.add(gamesLostNum);
		southWestPanel.add(gamesLostPanel);

		// south east panel
		JPanel southEastPanel = new JPanel();
		southEastPanel.setLayout(new BoxLayout(southEastPanel, BoxLayout.Y_AXIS));
		southEastPanel.setPreferredSize(new Dimension(425, 0));
		southEastPanel.setBackground(Color.magenta);
		
		southEastPanel.setOpaque(false);
		
		southPanel.add(southEastPanel, BorderLayout.EAST);

		// player name
		JPanel playerNamePanel = new JPanel();
		JLabel playerNameLabel = new JLabel("test1");
		playerNameLabel.setFont(new Font("Ink Free", Font.BOLD, 45));
		
		playerNamePanel.setOpaque(false);

		playerNamePanel.add(playerNameLabel);
		southEastPanel.add(playerNamePanel);

		// total wins
		JPanel winsLosePanel = new JPanel();
		winLose = new JLabel("test2");
		winLose.setFont(new Font("Ink Free", Font.BOLD, 45));

		winsLosePanel.setOpaque(false);
		
		winsLosePanel.add(winLose);
		southEastPanel.add(winsLosePanel);

		// menu bar
		JMenuBar menuBar = new JMenuBar();

		// menu
		JMenu file = new JMenu("File");
		JMenu help = new JMenu("Help");

		// menu items (file)
		startRestart = new JMenuItem("Start/Restart");
		JMenuItem Level = new JMenuItem("Level");
		JMenuItem Close = new JMenuItem("Close");

		// menu items (help)
		JMenuItem version = new JMenuItem("Version");
		JMenuItem about = new JMenuItem("about");

		file.add(startRestart);
		file.add(Level);
		file.add(Close);
		help.add(version);
		help.add(about);

		menuBar.add(file);
		menuBar.add(help);

		// close
		Close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int optionYesNo = JOptionPane.showConfirmDialog(frame, "would you like to close this application?",
						"Abort", JOptionPane.YES_NO_OPTION);

				switch (optionYesNo) {
				case JOptionPane.YES_OPTION:
					System.exit(0);
				}
			}
		});

		// help menu
		version.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Version 1 trillion 0.2", "Help", JOptionPane.INFORMATION_MESSAGE);

			}
		});

		// about menu
		about.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "George Nikou\nfavorite color is red\nFavorite fruit is banana",
						"About", JOptionPane.INFORMATION_MESSAGE);

			}
		});

		Level.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String difficulty[] = { "1", "2", "3" };

				int input = JOptionPane.showOptionDialog(frame, "Choose the difficulty level", "Guessing Game",
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, difficulty, difficulty[0]);
				System.out.println(input);
				if (input == 0) {
					level.setText("LEVEL: 1");
					comboLevels.setSelectedIndex(0);
					num = 3;
				} else if (input == 1) {
					comboLevels.setSelectedIndex(1);
					level.setText("LEVEL: 2");
					num = 5;
				} else if (input == 2) {
					comboLevels.setSelectedIndex(2);
					level.setText("LEVEL: 3");
					num = 10;

				}

			}
		});

		startRestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startRestart.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String startArray[] = {"restart","start","close"};
						int choice = JOptionPane.showOptionDialog(frame,
								"Select options",
								"Guessing Game",
								JOptionPane.DEFAULT_OPTION,
								JOptionPane.QUESTION_MESSAGE,
								null, 
								startArray,
								startArray[0]);
						if(choice == 0) {
							String difficulty[] = {"1", "2", "3"};
							int input = JOptionPane.showOptionDialog(
										frame, 
										"Choose the difficulty level", 
										"Guessing Game", 
										JOptionPane.DEFAULT_OPTION,
										JOptionPane.QUESTION_MESSAGE,
										null,
										difficulty,
										difficulty[0]
									);
							System.out.println(input);
							if(input == 0) {
								level.setText("LEVEL: 1");
								comboLevels.setSelectedIndex(0);
								num=3;
							}else if(input == 1) {
								comboLevels.setSelectedIndex(1);
								level.setText("LEVEL: 2");
								num=5;
							}else if(input == 2) {
								comboLevels.setSelectedIndex(2);
								level.setText("LEVEL: 3");
								num=10;
							}
							start(num);
							
						}else if(choice == 1) {
							String arrayNames[] = {};
							start(num);
						}else if(choice == 2) {
							System.exit(0);
						}
						
					}
				});

			}
		});
		
		
		img.add(mainPanel);
		this.setContentPane(img);
		
		
		this.setJMenuBar(menuBar);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		// setting NAME
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int nameSelect = JOptionPane.showConfirmDialog(frame, "are you a new player?");
				
				if (nameSelect == 0) {
					String PlayerName = JOptionPane.showInputDialog(null, "enter your name", "Guessing Game!",JOptionPane.QUESTION_MESSAGE);
					System.out.println("Players name: " + PlayerName);
					playerNameLabel.setText(PlayerName);
					pl.add(PlayerName);
				} else {
					String names = (String) JOptionPane.showInputDialog(frame, "select player", "Guessing Game",
							JOptionPane.QUESTION_MESSAGE, null, pl.toArray(), null);
					System.out.println("name selected: " + names);
					playerNameLabel.setText(names);
					
					
				}

			}
		});

		// start game
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tries.setText("0");
				counter = 0;
				number4 = 1;
				number1++;
				gamesPlayedNum.setText(number1 + "");

				if (comboLevels.getSelectedItem().equals("1")) {
					num = 3;
					level.setText("EASY");
				} else if (comboLevels.getSelectedItem().equals("2")) {
					num = 5;
					level.setText("MEDIUM");
				} else if (comboLevels.getSelectedItem().equals("3")) {
					num = 10;
					level.setText("HARD");
				}

				start(num);
			}
		});

	}

	public String[] levelFunction() {
		String[] lvl = new String[3];

		for (int i = 0; i < 3; i++) {
			lvl[i] = (i + 1) + "";
		}
		return lvl;

	}

	public void start(int level) {

		// random number generated
		Random r = new Random();
		int win = r.nextInt(level * level);

		// Game boxes (GridLayout)
		boxes1.setLayout(new GridLayout(level, level, 15, 15));
		boxes1.setPreferredSize(new Dimension(50, 50));
		boxes1.removeAll();
		JButton btn1[] = new JButton[level * level];

		for (int i = 0; i < btn1.length; i++) {
			btn1[i] = new JButton((i + 1) + "");
			boxes1.add(btn1[i]);

			btn1[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					JButton b = (JButton) e.getSource();
					System.out.println(b.getText());
					System.out.println(win);

					if (b.getText().equals(win + "")) {
						new JOptionPane().showMessageDialog(frame, "YOU WIN", "Guessing Game",
								JOptionPane.INFORMATION_MESSAGE);
						b.setEnabled(true);
						b.setBackground(Color.green);
						winLose.setText("YOU WON!");
						number2++;
						gamesWonNum.setText(number2 + "");

					} else {
						System.out.println("nope");
						b.setEnabled(false);
						b.setBackground(Color.red);
						tries.setText("TRIES: " + (number4 + ""));
						number4++;
						counter++;
					}
					if (counter == num) {
						new JOptionPane().showMessageDialog(null, "YOU LOSE", "Guessing Game",
								JOptionPane.INFORMATION_MESSAGE);
						winLose.setText("YOU LOST");
						number3++;
						gamesLostNum.setText(number3 + "");
					}

				}

			});

			winLose.setText("");
			frame.repaint();
			frame.revalidate();
		}

	}

}
