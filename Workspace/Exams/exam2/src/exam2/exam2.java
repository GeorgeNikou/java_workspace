package exam2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
	//I was too slow and couldn't complete all of it :'(
public class exam2 extends JFrame {
		JTextField dobText;
		JTextField phoneText;
		JTextField idText;
		JTextField firstNameText;
		JTextField lastNameText;
		JTextField emailAddressText;
		JTextField addressText;
		JTextField cityText;
		JRadioButton genderMale;
		JRadioButton genderFemale;
		JRadioButton genderOther;
		JPanel topRight1;
		JPanel topRight2;
		JComboBox<String> provinceBox = new JComboBox<>();
		JComboBox<String> programBox = new JComboBox<>();
		
		ArrayList<String> arr1 = new ArrayList<>();
		ArrayList<String> arr2 = new ArrayList<>();
		ArrayList<String> arr3 = new ArrayList<>();
		ArrayList<String> arr4 = new ArrayList<>();
		ArrayList<String> arr5 = new ArrayList<>();
		
		public exam2() {
			this.setTitle("");
			this.setSize(550,675);
			this.isAlwaysOnTop();
			
			//=============== Avatar Images =================\\
			JLabel image1 = new JLabel(new ImageIcon("m1.png"));
			JLabel image2 = new JLabel(new ImageIcon("m2.png"));
			JLabel image3 = new JLabel(new ImageIcon("m3.png"));
			JLabel image4 = new JLabel(new ImageIcon("m4.png"));
			JLabel image5 = new JLabel(new ImageIcon("m5.png"));
			
			JLabel image6 = new JLabel(new ImageIcon("f1.png"));
			JLabel image7 = new JLabel(new ImageIcon("f2.png"));
			JLabel image8 = new JLabel(new ImageIcon("f3.png"));
			JLabel image9 = new JLabel(new ImageIcon("f4.png"));
			JLabel image10 = new JLabel(new ImageIcon("f5.png"));
			
			
			//============== MainPanel to frame ===============\\
			JPanel mainPanel = new JPanel();
			mainPanel.setLayout(new BorderLayout());
			mainPanel.setBackground(Color.white);
			
			
			//============== top panel ===============\\
			JPanel topPanel = new JPanel();
			topPanel.setLayout(new BorderLayout());
			topPanel.setPreferredSize(new Dimension(200, 300));
			topPanel.setBackground(Color.yellow);
			topPanel.setOpaque(false);
			
			mainPanel.add(topPanel,BorderLayout.NORTH);
			
			
			//============== profile panel ===============\\
			JPanel profile = new JPanel(new FlowLayout());
			profile.setPreferredSize(new Dimension(100, 40));
			JLabel profileLabel = new JLabel("Select profile: ");
			profileLabel.setFont(new Font("Consolas",Font.BOLD,18));
			JComboBox<String> profileList = new JComboBox<>();
			profileList.addItem("empty");
			//============= Male profiles ================\\
			profileList.addItem("male profile 1");
			profileList.addItem("male profile 2");
			profileList.addItem("male profile 3");
			profileList.addItem("male profile 4");
			profileList.addItem("male profile 5");
			//============= Female profiles ================\\
			profileList.addItem("female profile 1");
			profileList.addItem("female profile 2");
			profileList.addItem("female profile 3");
			profileList.addItem("female profile 4");
			profileList.addItem("female profile 5");
			profileList.setPreferredSize(new Dimension(120, 25));
			profile.setOpaque(false);
			
			profile.add(profileLabel);
			profile.add(profileList);
			
			profileList.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(profileList.getSelectedItem() == "male profile 1") {
						
						idText.setText("UltimateBeaver");
						firstNameText.setText("George");
						lastNameText.setText("Nikou");
						programBox.setSelectedItem("Networking");
						dobText.setText("03281989000");
						topRight1.removeAll();
						topRight1.add(image2);
						topRight1.add(topRight2,BorderLayout.SOUTH);
						topRight1.repaint();
						topRight1.revalidate();
						genderOther.setSelected(true);
						phoneText.setText("5142666884");
						emailAddressText.setText("george.nikou05@gmail.com");
						addressText.setText("1500 st. Louis apt 207");
						cityText.setText("Montreal");
						provinceBox.setSelectedItem("Manitoba");
						
					}else if(profileList.getSelectedItem() == "male profile 2") {
						
						idText.setText("GingerBread");
						firstNameText.setText("Samantha");
						lastNameText.setText("Petch");
						programBox.setSelectedItem("Networking");
						dobText.setText("11291991000");
						topRight1.removeAll();
						topRight1.add(image3);
						topRight1.add(topRight2,BorderLayout.SOUTH);
						topRight1.repaint();
						topRight1.revalidate();
						genderFemale.setSelected(true);
						phoneText.setText("5142666304");
						emailAddressText.setText("ging123@gmail.com");
						addressText.setText(" 2323 abro street");
						cityText.setText("Great Alb");
						provinceBox.setSelectedItem("Alberta");
					
					}else if(profileList.getSelectedItem() == "male profile 3") {
						
						idText.setText("ericTheMan");
						firstNameText.setText("Eric");
						lastNameText.setText("laroche");
						programBox.setSelectedItem("Interior Design");
						dobText.setText("05221988000");
						topRight1.removeAll();
						topRight1.add(image4);
						topRight1.add(topRight2,BorderLayout.SOUTH);
						topRight1.repaint();
						topRight1.revalidate();
						genderMale.setSelected(true);
						phoneText.setText("5142699904");
						emailAddressText.setText("eric3001@gmail.com");
						addressText.setText(" 237 accobo street");
						cityText.setText("a nice Island lol");
						provinceBox.setSelectedItem("Prince Edward Island");
					
					}else if(profileList.getSelectedItem() == "male profile 4") {
						
						idText.setText("MeloQueen");
						firstNameText.setText("Melo");
						lastNameText.setText("altmera");
						programBox.setSelectedItem("Early hildhood education");
						dobText.setText("09231972000");
						topRight1.removeAll();
						topRight1.add(image8);
						topRight1.add(topRight2,BorderLayout.SOUTH);
						topRight1.repaint();
						topRight1.revalidate();
						genderFemale.setSelected(true);
						phoneText.setText("5142099104");
						emailAddressText.setText("Meli5@gmail.com");
						addressText.setText(" 2778 ingred street");
						cityText.setText("Saskatoon");
						provinceBox.setSelectedItem("Saskatchewan");
					
					}else if(profileList.getSelectedItem() == "male profile 5") {
						
						idText.setText("MissPotato");
						firstNameText.setText("David");
						lastNameText.setText("Tzanetakos");
						programBox.setSelectedItem("Early hildhood education");
						dobText.setText("04071943000");
						topRight1.removeAll();
						topRight1.add(image10);
						topRight1.add(topRight2,BorderLayout.SOUTH);
						topRight1.repaint();
						topRight1.revalidate();
						genderFemale.setSelected(true);
						phoneText.setText("4289301888");
						emailAddressText.setText("Marymirabel@gmail.com");
						addressText.setText(" 2020 stuart avenue");
						cityText.setText("Montreal");
						provinceBox.setSelectedItem("Quebec");
					
					}else if(profileList.getSelectedItem() == "male profile 6") {
						
						idText.setText("TheBomb");
						firstNameText.setText("Billy");
						lastNameText.setText("Bob");
						programBox.setSelectedItem("Networking");
						dobText.setText("08081950000");
						topRight1.removeAll();
						topRight1.add(image4);
						topRight1.add(topRight2,BorderLayout.SOUTH);
						topRight1.repaint();
						topRight1.revalidate();
						genderFemale.setSelected(true);
						phoneText.setText("4289222888");
						emailAddressText.setText("Bigbillybob@gmail.com");
						addressText.setText(" 123 madeup street");
						cityText.setText("Montreal");
						provinceBox.setSelectedItem("Quebec");
					
					}else if(profileList.getSelectedItem() == "female profile 2") {
						
					}else if(profileList.getSelectedItem() == "female profile 3") {
						
					}else if(profileList.getSelectedItem() == "female profile 4") {
						
					}else if(profileList.getSelectedItem() == "female profile 5") {
						
					}
					
				}
			});
			
			topPanel.add(profile,BorderLayout.NORTH);
			
			
			//============== top left panel ===============\\
			JPanel topLeft = new JPanel();
			topLeft.setLayout(new BoxLayout(topLeft, BoxLayout.Y_AXIS));
			topLeft.setPreferredSize(new Dimension(345, 100));
			topLeft.setOpaque(false);
			
			
			
			//============== ID ===============\\
			JPanel idPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JLabel idLabel = new JLabel("ID: ");
			idLabel.setPreferredSize(new Dimension(100, 50));
			idLabel.setFont(new Font("Consolas",15,15));
			idText = new JTextField();
			idText.setPreferredSize(new Dimension(200, 25));
			idPanel.setOpaque(false);
			
			idPanel.add(idLabel);
			idPanel.add(idText);
			topLeft.add(idPanel);
			
			
			//============== First Name ===============\\
			JPanel firstNamePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JLabel firstNameLabel = new JLabel("First Name: ");
			firstNameLabel.setPreferredSize(new Dimension(100, 50));
			firstNameLabel.setFont(new Font("Consolas",15,15));
			firstNameText = new JTextField();
			firstNameText.setPreferredSize(new Dimension(200, 25));
			firstNamePanel.setOpaque(false);
			
			firstNamePanel.add(firstNameLabel);
			firstNamePanel.add(firstNameText);
			topLeft.add(firstNamePanel);
			
			
			//============== Last Name ===============\\
			JPanel lastNamePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JLabel lastNameLabel = new JLabel("Last Name: ");
			lastNameLabel.setPreferredSize(new Dimension(100, 50));
			lastNameLabel.setFont(new Font("Consolas",15,15));
			lastNameText = new JTextField();
			lastNameText.setPreferredSize(new Dimension(200, 25));
			lastNamePanel.setOpaque(false);
			
			lastNamePanel.add(lastNameLabel);
			lastNamePanel.add(lastNameText);
			topLeft.add(lastNamePanel);
			
			
			//============== Program ===============\\
			JPanel programPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JLabel programLabel = new JLabel("Program: ");
			programLabel.setPreferredSize(new Dimension(100, 50));
			programLabel.setFont(new Font("Consolas",15,15));
			
			programBox.addItem("select a program");
			programBox.addItem("Programer Analyst");
			programBox.addItem("Networking");
			programBox.addItem("Early hildhood education");
			programBox.addItem("Interior Design");
			
			programPanel.setOpaque(false);
			
			programPanel.add(programLabel);
			programPanel.add(programBox);
			topLeft.add(programPanel);
			
			
			//============== date of birth ===============\\
			JPanel dobPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JLabel dobLabel = new JLabel("Date of birth");
			dobLabel.setFont(new Font("Consolas",15,15));
			dobText = new JTextField();
			dobPanel.setOpaque(false);
			
			
			try {
				MaskFormatter license = new MaskFormatter("## / ## / ####");
				dobText = new JFormattedTextField(license);
			}catch(Exception e) {
				e.printStackTrace();
			}
			dobText.setPreferredSize(new Dimension(80, 25)); 
			
			dobPanel.add(dobLabel);
			dobPanel.add(dobText);
			topLeft.add(dobPanel);
			
															//<---------------------------------------
			
			topPanel.add(topLeft,BorderLayout.WEST);
			//============== top right panel 1 (north) ===============\\
			topRight1 = new JPanel();
			topRight1.setLayout(new BorderLayout());
			topRight1.setPreferredSize(new Dimension(100, 300));
			
			
			topRight1.add(image1);
			
			topPanel.add(topRight1,BorderLayout.CENTER);
			
			
			//============== top right panel 2 (south) ===============\\
			topRight2 = new JPanel();
			topRight2.setLayout(new BorderLayout());
			topRight2.setBackground(Color.green);
			topRight2.setPreferredSize(new Dimension(100, 30));
			JComboBox<String> avatarBox = new JComboBox<>();
			avatarBox.addItem("generic 1");
			avatarBox.addItem("generic 2");
			avatarBox.addItem("generic 3");
			avatarBox.addItem("generic 4");
			avatarBox.addItem("generic 5");
			
			avatarBox.addItem("generic 6");
			avatarBox.addItem("generic 7");
			avatarBox.addItem("generic 8");
			avatarBox.addItem("generic 9");
			avatarBox.addItem("generic 10");
			topRight2.setOpaque(false);
			
			avatarBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(avatarBox.getSelectedItem() == "generic 1") {
						topRight1.removeAll();
						topRight1.add(image1);
						topRight1.add(topRight2,BorderLayout.SOUTH);
						topRight1.repaint();
						topRight1.revalidate();
					}else if(avatarBox.getSelectedItem() == "generic 2") {
						topRight1.removeAll();
						topRight1.add(image2);
						topRight1.add(topRight2,BorderLayout.SOUTH);
						topRight1.repaint();
						topRight1.revalidate();
					}else if(avatarBox.getSelectedItem() == "generic 3") {
						topRight1.removeAll();
						topRight1.add(image3);
						topRight1.add(topRight2,BorderLayout.SOUTH);
						topRight1.repaint();
						topRight1.revalidate();
					}else if(avatarBox.getSelectedItem() == "generic 4") {
						topRight1.removeAll();
						topRight1.add(image4);
						topRight1.add(topRight2,BorderLayout.SOUTH);
						topRight1.repaint();
						topRight1.revalidate();
					}else if(avatarBox.getSelectedItem() == "generic 5") {
						topRight1.removeAll();
						topRight1.add(image5);
						topRight1.add(topRight2,BorderLayout.SOUTH);
						topRight1.repaint();
						topRight1.revalidate();
					}else if(avatarBox.getSelectedItem() == "generic 6") {
						topRight1.removeAll();
						topRight1.add(image6);
						topRight1.add(topRight2,BorderLayout.SOUTH);
						topRight1.repaint();
						topRight1.revalidate();
					}else if(avatarBox.getSelectedItem() == "generic 7") {
						topRight1.removeAll();
						topRight1.add(image7);
						topRight1.add(topRight2,BorderLayout.SOUTH);
						topRight1.repaint();
						topRight1.revalidate();
					}else if(avatarBox.getSelectedItem() == "generic 8") {
						topRight1.removeAll();
						topRight1.add(image8);
						topRight1.add(topRight2,BorderLayout.SOUTH);
						topRight1.repaint();
						topRight1.revalidate();
					}else if(avatarBox.getSelectedItem() == "generic 9") {
						topRight1.removeAll();
						topRight1.add(image9);
						topRight1.add(topRight2,BorderLayout.SOUTH);
						topRight1.repaint();
						topRight1.revalidate();
					}else if(avatarBox.getSelectedItem() == "generic 10") {
						topRight1.removeAll();
						topRight1.add(image10);
						topRight1.add(topRight2,BorderLayout.SOUTH);
						topRight1.repaint();
						topRight1.revalidate();
					}
					
				}
			});
			
			topRight2.add(avatarBox);
			topRight1.add(topRight2,BorderLayout.SOUTH);
			
			
			
			
			
			//============== Bottom panel ===============\\
			JPanel bottomPanel = new JPanel();
			bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.Y_AXIS));
			bottomPanel.setOpaque(false);
			
			mainPanel.add(bottomPanel,BorderLayout.CENTER);
			
			
			//============== Gender panel ===============\\
			JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
			JLabel genderLabel = new JLabel("Gender: ");
			genderPanel.setPreferredSize(new Dimension(100, 50));
			genderLabel.setFont(new Font("Consolas",15,15));
			genderMale = new JRadioButton("Male");
			genderFemale = new JRadioButton("Female");
			genderOther = new JRadioButton("Other");
			ButtonGroup genderGroup = new ButtonGroup();
			genderGroup.add(genderMale);
			genderGroup.add(genderFemale);
			genderGroup.add(genderOther);
			genderPanel.setOpaque(false);
			genderMale.setOpaque(false);
			genderFemale.setOpaque(false);
			genderOther.setOpaque(false);
			
			
			
			genderPanel.add(genderLabel);
			genderPanel.add(genderMale);
			genderPanel.add(genderFemale);
			genderPanel.add(genderOther);
			bottomPanel.add(genderPanel);
			
			
			//============== Phone Number ===============\\
			JPanel phonePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JLabel phoneLabel = new JLabel("Phone Number: ");
			phoneLabel.setFont(new Font("Consolas",15,15));
			phoneText = new JTextField();
			phonePanel.setOpaque(false);
			
			try {
				MaskFormatter license = new MaskFormatter("(###) ###-####");
				phoneText = new JFormattedTextField(license);
			}catch(Exception e) {
				e.printStackTrace();
			}
			phoneText.setPreferredSize(new Dimension(275, 25));
			
			phonePanel.add(phoneLabel);
			phonePanel.add(phoneText);
			bottomPanel.add(phonePanel);
			
			
			//============== Email Address ===============\\
			JPanel emailAddressPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JLabel emailAddressLabel = new JLabel("Email Address: ");
			emailAddressLabel.setPreferredSize(new Dimension(112, 50));
			emailAddressLabel.setFont(new Font("Consolas",15,15));
			emailAddressText = new JTextField();
			emailAddressText.setPreferredSize(new Dimension(275, 25));
			emailAddressPanel.setOpaque(false);
			
			emailAddressPanel.add(emailAddressLabel);
			emailAddressPanel.add(emailAddressText);
			bottomPanel.add(emailAddressPanel);
			
			
			//============== Address ===============\\
			JPanel addressPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JLabel addressLabel = new JLabel("Address: ");
			addressLabel.setPreferredSize(new Dimension(112, 50));
			addressLabel.setFont(new Font("Consolas",15,15));
			addressText = new JTextField();
			addressText.setPreferredSize(new Dimension(275, 25));
			addressPanel.setOpaque(false);
			
			addressPanel.add(addressLabel);
			addressPanel.add(addressText);
			bottomPanel.add(addressPanel);
			
			
			//============== City ===============\\
			JPanel cityPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JLabel cityLabel = new JLabel("City: ");
			cityLabel.setPreferredSize(new Dimension(111, 50));
			cityLabel.setFont(new Font("Consolas",15,15));
			cityText = new JTextField();
			cityText.setPreferredSize(new Dimension(275, 25));
			cityPanel.setOpaque(false);
			
			cityPanel.add(cityLabel);
			cityPanel.add(cityText);
			bottomPanel.add(cityPanel);
			
			
			//============== Province ===============\\
			JPanel provincePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JLabel provinceLabel = new JLabel("Province: ");
			provinceLabel.setPreferredSize(new Dimension(112, 50));
			provinceLabel.setFont(new Font("Consolas",15,15));
		
			provinceBox.addItem("Quebec");
			provinceBox.addItem("Ontario");
			provinceBox.addItem("Alberta");
			provinceBox.addItem("British Columbia");
			provinceBox.addItem("Nova Scotia");
			provinceBox.addItem("New Brunswick");
			provinceBox.addItem("Manitoba");
			provinceBox.addItem("Saskatchewan");
			provinceBox.addItem("Prince Edward Island");
			provinceBox.addItem("NewFoundland");
			provincePanel.setOpaque(false);
			
			provincePanel.add(provinceLabel);
			provincePanel.add(provinceBox);
			bottomPanel.add(provincePanel);
			
			
			
			//============== (south)Button Panel ===============\\
			JPanel southPanel = new JPanel();
			JButton addButton = new JButton("Add");
			JButton updateButton = new JButton("Update");
			JButton deleteButton = new JButton("Delete");
			JButton clearButton = new JButton("Clear");
			southPanel.setOpaque(false);
			addButton.setBackground(Color.white);
			updateButton.setBackground(Color.white);
			deleteButton.setBackground(Color.white);
			clearButton.setBackground(Color.white);
			
			//============== add Button ===============\\
			addButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					idText.setText(idText.getText());
					firstNameText.setText(firstNameText.getText());
					lastNameText.setText(lastNameText.getText());
					programBox.setSelectedItem(programBox.getSelectedItem());
					dobText.setText("04221962000");
					topRight1.removeAll();
					//image?
					topRight1.add(topRight2,BorderLayout.SOUTH);
					topRight1.repaint();
					topRight1.revalidate();
					phoneText.setText("4289301888");
					emailAddressText.setText(emailAddressText.getText());
					addressText.setText(addressText.getText());
					cityText.setText(cityText.getText());
					provinceBox.setSelectedItem(provinceBox.getSelectedItem());	
					
					JOptionPane.showMessageDialog(null, idText.getText()
							+"\n"+firstNameText.getText()
							+"\n"+lastNameText.getText()
							+"\n"+programBox.getSelectedItem()
							+"\n"+ dobText.getText()
							+"\n"+ phoneText.getText()
							+"\n"+ emailAddressText.getText()
							+"\n"+addressText.getText()
							+"\n"+cityText.getText()
							+"\n"+provinceBox.getSelectedItem()
							,"Profile Saved",JOptionPane.DEFAULT_OPTION);
							
							arr1.add(idText.getText());
							arr1.add(firstNameText.getText());
							arr1.add(lastNameText.getText());
							arr1.add(programBox.getSelectedItem()+"");
							arr1.add(dobText.getText());
							arr1.add(phoneText.getText());
							arr1.add(emailAddressText.getText());
							arr1.add(addressText.getText());
							arr1.add(cityText.getText());
							arr1.add(provinceBox.getSelectedItem()+"");
							
							
							System.out.println(arr1);
					
				}
			});
			
			//============== update Button ===============\\
			updateButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			
			//============== delete Button ===============\\
			deleteButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			
			//============== Clear Button ===============\\
			clearButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					idText.setText("");
					firstNameText.setText("");
					lastNameText.setText("");
					dobText.setText("");
					topRight1.removeAll();
					topRight1.add(topRight2,BorderLayout.SOUTH);
					topRight1.repaint();
					topRight1.revalidate();
					phoneText.setText("");
					emailAddressText.setText("");
					addressText.setText("");
					cityText.setText("");
					
				}
			});
			
			
			southPanel.add(addButton);
			southPanel.add(updateButton);
			southPanel.add(deleteButton);
			southPanel.add(clearButton);
			mainPanel.add(southPanel,BorderLayout.SOUTH);
			
			
			
			//============== Menu Bar ===============\\
			
			JMenuBar menuBar = new JMenuBar();
			JMenu file = new JMenu("File"); // < ------ menu(file)
			JMenuItem close = new JMenuItem("close");
			file.add(close);
			
			
			JMenu edit = new JMenu("Edit");// < ------ menu(edit)
			JMenuItem clear = new JMenuItem("clear");
			edit.add(clear);
			
			JMenu help = new JMenu("Help");// < ------ menu(help)
			JMenuItem about = new JMenuItem("about");
			help.add(about);
			
			menuBar.add(file);
			menuBar.add(edit);
			menuBar.add(help);
			
			
			//============== Close A.L ===============\\
			close.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int result = JOptionPane.showConfirmDialog(null, "Close this application?");
					if(result == 0) {
						System.exit(0);
					}else if(result == 1) {
						JOptionPane.showMessageDialog(null, "You clicked no", "File",JOptionPane.NO_OPTION);
					}else if(result == 2) {
						JOptionPane.showMessageDialog(null, "canceled", "File", JOptionPane.CANCEL_OPTION);
					}
				}
			});
			
			
			//=============== Clear A.L ================\\
			clear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to clear all?\nUnsaved changes will be deleted?");
					if(result == 0) {
						idText.setText("");
						firstNameText.setText("");
						lastNameText.setText("");
						dobText.setText("");
						topRight1.removeAll();
						topRight1.repaint();
						topRight1.revalidate();
						phoneText.setText("");
						emailAddressText.setText("");
						addressText.setText("");
						cityText.setText("");
					}else if(result == 1) {
						JOptionPane.showMessageDialog(null, "You clicked no", "File",JOptionPane.NO_OPTION);
					}else if(result == 2) {
						JOptionPane.showMessageDialog(null, "canceled", "File", JOptionPane.CANCEL_OPTION);
					}
					
				}
			});
			
			about.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "George Nikou\nprofiles Examination sheet\nHey George please go easy on me!", "about", JOptionPane.PLAIN_MESSAGE);
					
				}
			});
	
			
			
			this.setJMenuBar(menuBar);
			this.add(mainPanel);
			this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			this.setVisible(true);
	}

}
