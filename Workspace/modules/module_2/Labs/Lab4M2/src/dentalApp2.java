import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.NumberFormat;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;


public class dentalApp2 extends JFrame {
	JTextField textPhone = new JTextField();
	JTextField textCell = new JTextField();
	JTextField textSocial = new JTextField();
	JFormattedTextField month = new JFormattedTextField();
	JFormattedTextField day = new JFormattedTextField();
	JFormattedTextField year = new JFormattedTextField();
	public dentalApp2() {
		
		
		JFrame myframe = new JFrame();
		myframe.setTitle("New Account Registration");
		myframe.setSize(980, 900);
		myframe.setAlwaysOnTop(true);
		myframe.setLocationRelativeTo(null);
		
		//setting Dimensions
		Dimension labelSize = new Dimension(100, 30);
		Dimension textSize = new Dimension(200, 25);
		
		//top panel image
		JLabel labelImage = new JLabel();
		labelImage.setIcon(new ImageIcon("title.gif"));
		JPanel top = new JPanel(new BorderLayout());
		top.add(labelImage);
		myframe.add(top,BorderLayout.NORTH);
		
		//main panel
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
		mainPanel.setBorder(BorderFactory.createLineBorder(Color.black));

		

		// name
		JPanel panelName = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelName.setPreferredSize(new Dimension(900,30));
		JLabel labelName = new JLabel("Name:");
		JTextField textLast = new JTextField();
		JTextField textMiddle = new JTextField();
		JTextField textName = new JTextField();
		textName.setPreferredSize(new Dimension(200,30));
		textMiddle.setPreferredSize(new Dimension(200,30));
		textLast.setPreferredSize(new Dimension(200,30));
		
		
		panelName.add(labelName);
		panelName.add(textLast);
		panelName.add(textMiddle);
		panelName.add(textName);
		mainPanel.add(panelName);
		
		//Address
		JPanel panelAdress = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel labelAdress = new JLabel("Adress:");
		JTextField textAddress = new JTextField();
		textAddress.setPreferredSize(new Dimension(600,30));
		
		panelAdress.add(labelAdress);
		panelAdress.add(textAddress);
		mainPanel.add(panelAdress);
		
		// home telephone
		JPanel panelTelephone = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel labelPhone = new JLabel("Home Telephone:");
		JLabel labelCell = new JLabel("Cellular:");
		
		
		
		try {
			MaskFormatter license = new MaskFormatter("(###) ###-####");
			textPhone = new JFormattedTextField(license);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			MaskFormatter license = new MaskFormatter("(###) ###-####");
			textCell = new JFormattedTextField(license);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		labelPhone.setPreferredSize(new Dimension(100,30));
		textPhone.setPreferredSize(labelSize);
		textCell.setPreferredSize(new Dimension(100,30));
		
		panelTelephone.add(labelPhone);
		panelTelephone.add(textPhone);
		panelTelephone.add(labelCell);
		panelTelephone.add(textCell);
		mainPanel.add(panelTelephone);
		
		//social/birth/email
		JPanel panelSocial = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel labelSocial = new JLabel("Social Security no.:");
		
		JLabel labelAge = new JLabel("D.O.B");
		
		
		
	
		JLabel labelEmail = new JLabel("Email Address");
		JTextField textEmail = new JTextField();
		textEmail.setPreferredSize(new Dimension(200,30));
		
		try {
			MaskFormatter license = new MaskFormatter("##");
			month = new JFormattedTextField(license);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			MaskFormatter license = new MaskFormatter("##");
			day = new JFormattedTextField(license);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			MaskFormatter license = new MaskFormatter("####");
			year = new JFormattedTextField(license);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			MaskFormatter license = new MaskFormatter("### ### ###");
			textSocial = new JFormattedTextField(license);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		month.setPreferredSize(new Dimension(35,30));
		day.setPreferredSize(new Dimension(35,30));
		year.setPreferredSize(new Dimension(35,30));
		textSocial.setPreferredSize(new Dimension(100,30));
		
		
		
		
		panelSocial.add(labelSocial);
		panelSocial.add(textSocial);
		panelSocial.add(labelAge);
		panelSocial.add(month);
		panelSocial.add(day);
		panelSocial.add(year);
		panelSocial.add(labelEmail);
		panelSocial.add(textEmail);
		mainPanel.add(panelSocial);
		
		//desired employement
		JPanel desiredEmployement = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JLabel labelDesiredEmp = new JLabel("Desired employment(check all if applicable)");
		desiredEmployement.add(labelDesiredEmp);
		mainPanel.add(desiredEmployement);
		
		//position applied/desired salary/desired employment
		JPanel panelJob = new JPanel();
		panelJob.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel labelPosition = new JLabel("Position Applied for:");
		JTextField textPosition = new JTextField();
		textPosition.setPreferredSize(new Dimension(125,30));
		
		JLabel labelSalary = new JLabel("Desired Salary");
		JTextField textSalary = new JTextField();
		textSalary.setPreferredSize(new Dimension(125,30));
		
		JCheckBox fulltime = new JCheckBox("Fulltime");
		JCheckBox partime = new JCheckBox("Part-time");
		JCheckBox temporary = new JCheckBox("Temporary");
		JCheckBox permanent = new JCheckBox("Permanent");
		
		panelJob.add(labelPosition);
		panelJob.add(textPosition);
		panelJob.add(labelSalary);
		panelJob.add(textSalary);
		panelJob.add(fulltime);
		panelJob.add(partime);
		panelJob.add(temporary);
		panelJob.add(permanent);
		mainPanel.add(panelJob);
		
		
		
		//Hygienist Certified?
		JPanel panelHygienist = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel labelHygienist = new JLabel("Are you a registered dental hygienist?");
		JLabel labelLicense = new JLabel("(If yes, please provide us with a copy of your certificate)");
		JRadioButton hyge1 = new JRadioButton("yes");
		JRadioButton hyge2 = new JRadioButton("no");
		ButtonGroup bt = new ButtonGroup();
		
		bt.add(hyge1);
		bt.add(hyge2);
		panelHygienist.add(labelHygienist);
		panelHygienist.add(hyge1);
		panelHygienist.add(hyge2);
		panelHygienist.add(labelLicense);
		mainPanel.add(panelHygienist);
		
		//Hygienist registered?
		JPanel panelHygienist2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel labelHygienist2 = new JLabel("Are you a registered dental Hygienist");
		JLabel labelLicense2 = new JLabel("If yes, please provide us with a copy of your license");
		JRadioButton hyge3 = new JRadioButton("yes");
		JRadioButton hyge4 = new JRadioButton("no");	
		ButtonGroup bt2 = new ButtonGroup();
		
		bt2.add(hyge3);
		bt2.add(hyge4);
		panelHygienist2.add(labelHygienist2);
		panelHygienist2.add(hyge3);
		panelHygienist2.add(hyge4);
		panelHygienist2.add(labelLicense2);
		mainPanel.add(panelHygienist2);
		
		
		
		
		//days and hours of work
		JPanel daysHours = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel labelDayHour = new JLabel("Days/Hours are you available to work");
		daysHours.add(labelDayHour);
		mainPanel.add(daysHours);
		
		
		
		
		//Schedule Monday-Thursday
		JPanel mondayToThursday = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel monday = new JLabel("Monday:");
		JLabel tuesday = new JLabel("tuesday:");
		JLabel wedsnday = new JLabel("wedsnday:");
		JLabel thursday = new JLabel("thursday:");
		
		JLabel dash1 = new JLabel("-");
		JLabel dash2 = new JLabel("-");
		JLabel dash3 = new JLabel("-");
		JLabel dash4 = new JLabel("-");
		
		JComboBox<String> array1 = new JComboBox<>(hourFunction());
		JComboBox<String> array2 = new JComboBox<>(hourFunction());
		JComboBox<String> array3 = new JComboBox<>(hourFunction());
		JComboBox<String> array4 = new JComboBox<>(hourFunction());
		JComboBox<String> array5 = new JComboBox<>(hourFunction());
		JComboBox<String> array6 = new JComboBox<>(hourFunction());
		JComboBox<String> array7 = new JComboBox<>(hourFunction());
		JComboBox<String> array8 = new JComboBox<>(hourFunction());
		JComboBox<String> array9 = new JComboBox<>(hourFunction());
		JComboBox<String> array10 = new JComboBox<>(hourFunction());
		JComboBox<String> array11 = new JComboBox<>(hourFunction());
		JComboBox<String> array12 = new JComboBox<>(hourFunction());
		JComboBox<String> array13 = new JComboBox<>(hourFunction());
		JComboBox<String> array14 = new JComboBox<>(hourFunction());
		JComboBox<String> array15 = new JComboBox<>(hourFunction());
		JComboBox<String> array16 = new JComboBox<>(hourFunction());
		
		
		mondayToThursday.add(monday);
		mondayToThursday.add(array1);
		mondayToThursday.add(dash1);
		mondayToThursday.add(array2);
		
		mondayToThursday.add(tuesday);
		mondayToThursday.add(array3);
		mondayToThursday.add(dash2);
		mondayToThursday.add(array4);
		
		mondayToThursday.add(wedsnday);
		mondayToThursday.add(array7);
		mondayToThursday.add(dash3);
		mondayToThursday.add(array8);
		
		mondayToThursday.add(thursday);
		mondayToThursday.add(array9);
		mondayToThursday.add(dash4);
		mondayToThursday.add(array10);
		mainPanel.add(mondayToThursday);
		
		
		//Schedule Friday to Sunday
		JPanel thursdayToSunday = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel friday = new JLabel("Friday:");
		JLabel saturday = new JLabel("Saturday:");
		JLabel sunday = new JLabel("Sunday:");
		
		JLabel dash5 = new JLabel("-");
		JLabel dash6 = new JLabel("-");
		JLabel dash7 = new JLabel("-");
		
		
		thursdayToSunday.add(friday);
		thursdayToSunday.add(array11);
		thursdayToSunday.add(dash5);
		thursdayToSunday.add(array12);
		
		thursdayToSunday.add(saturday);
		thursdayToSunday.add(array13);
		thursdayToSunday.add(dash6);
		thursdayToSunday.add(array14);
		
		thursdayToSunday.add(sunday);
		thursdayToSunday.add(array15);
		thursdayToSunday.add(dash7);
		thursdayToSunday.add(array16);
		mainPanel.add(thursdayToSunday);
			
		
		
		//start date/additional information
		JPanel panelInfo1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel labelinfo1 = new JLabel("When are you available to start work?");
		JLabel labelinfo2 = new JLabel("Do your have a drivers License?");
		JTextField textInfo1 = new JTextField();
		JTextField textInfo2 = new JTextField();
		textInfo1.setPreferredSize(new Dimension(125,30));
		textInfo2.setPreferredSize(new Dimension(125,30));
		
		panelInfo1.add(labelinfo1);
		panelInfo1.add(textInfo1);
		panelInfo1.add(labelinfo2);
		panelInfo1.add(textInfo2);
		mainPanel.add(panelInfo1);
		
		//additional information/referred to
		JPanel panelInfo2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel labelinfo3 = new JLabel("What means of transportation do you use to commute to work?");
		JLabel labelinfo4 = new JLabel("Who referred you to us?");
		JTextField textInfo3 = new JTextField();
		JTextField textInfo4 = new JTextField();
		textInfo3.setPreferredSize(new Dimension(125,30));
		textInfo4.setPreferredSize(new Dimension(125,30));
		
		panelInfo2.add(labelinfo3);
		panelInfo2.add(textInfo3);
		panelInfo2.add(labelinfo4);
		panelInfo2.add(textInfo4);
		mainPanel.add(panelInfo2);
		
		
		
		//areas able to commute question
		JPanel panelCommute = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel labelCommute = new JLabel("What areas are you willing to commute?");
		
		panelCommute.add(labelCommute);
		mainPanel.add(panelCommute);
		
		//areas able to commute locations
		JPanel panelAreas = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JCheckBox area1 = new JCheckBox("NYC");
		JCheckBox area2 = new JCheckBox("Queens ");
		JCheckBox area3 = new JCheckBox("Bronx ");
		JCheckBox area4 = new JCheckBox("Brooklyn ");
		JCheckBox area5 = new JCheckBox("Westchester ");
		JCheckBox area6 = new JCheckBox("State Island");
		JCheckBox area7 = new JCheckBox("Nassau County");
		JCheckBox area8 = new JCheckBox("Suffolk County");
		JCheckBox area9 = new JCheckBox("New Jersey");
		
		panelAreas.add(area1);
		panelAreas.add(area2);
		panelAreas.add(area3);
		panelAreas.add(area4);
		panelAreas.add(area5);
		panelAreas.add(area6);
		panelAreas.add(area7);
		panelAreas.add(area8);
		panelAreas.add(area9);
		mainPanel.add(panelAreas);
		
		//education GridLayout
		JPanel educationTable = new JPanel(new GridLayout(5,5,1,1));
		
		//row 1
		JLabel education = new JLabel("Education");
		JLabel highSchool = new JLabel("High school");
		JLabel schoolName = new JLabel("School Name");
		JLabel location = new JLabel("Location(Mailing address)");
		JLabel years = new JLabel("number of years competed");
		JLabel degree = new JLabel("Major & degree");
		
		//row2
		JLabel collage = new JLabel("collage");
		JTextField textGrid1 = new JTextField();
		JTextField textGrid2 = new JTextField();
		JTextField textGrid3 = new JTextField();
		JTextField textGrid4 = new JTextField();
		
		//row3
		JLabel BoT = new JLabel("Buisness or Trade school");
		JTextField textGrid5 = new JTextField();
		JTextField textGrid6 = new JTextField();
		JTextField textGrid7 = new JTextField();
		JTextField textGrid8 = new JTextField();
		
		//row4
		JLabel profSchool = new JLabel("Professional school");
		JTextField textGrid9 = new JTextField();
		JTextField textGrid10 = new JTextField();
		JTextField textGrid11 = new JTextField();
		JTextField textGrid12 = new JTextField();
		
		JTextField textGrid13 = new JTextField();
		JTextField textGrid14 = new JTextField();
		JTextField textGrid15 = new JTextField();
		JTextField textGrid16 = new JTextField();
		
		educationTable.add(education);
		educationTable.add(highSchool);
		educationTable.add(collage);
		educationTable.add(BoT);
		educationTable.add(profSchool);
		
		educationTable.add(schoolName);
		educationTable.add(textGrid1);
		educationTable.add(textGrid2);
		educationTable.add(textGrid3);
		educationTable.add(textGrid4);
		
		educationTable.add(location);
		educationTable.add(textGrid5);
		educationTable.add(textGrid6);
		educationTable.add(textGrid7);
		educationTable.add(textGrid8);
		
		educationTable.add(years);
		educationTable.add(textGrid9);
		educationTable.add(textGrid10);
		educationTable.add(textGrid11);
		educationTable.add(textGrid12);
		
		educationTable.add(degree);
		educationTable.add(textGrid13);
		educationTable.add(textGrid14);
		educationTable.add(textGrid15);
		educationTable.add(textGrid16);
		
		mainPanel.add(educationTable);
		
		
			
		//submit button
		JPanel panelSubmitButton = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JButton submitBtn = new JButton("Submit Form");
		panelSubmitButton.add(submitBtn);
		mainPanel.add(panelSubmitButton);
		
		
		
		
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//names
				System.out.println("First name: " + textLast.getText());
				System.out.println("Middle name: " + textMiddle.getText());
				System.out.println("Last name: " + textName.getText());
				
				//address
				System.out.println("Adress: " + textAddress.getText());
				
				//telephone
				System.out.println("Telephone number: " + textPhone.getText());
				System.out.println("Cell phone number: "+ textCell.getText());
				
				//social/birth/email
				System.out.println("Social security number: " + textSocial.getText());
				System.out.println("Month: " + month.getText());
				System.out.println("Day: " + day.getText());
				System.out.println("Year: " + year.getText());
				System.out.println("Email: " + textEmail.getText());
				
				//position applied/desired salary/desired employment
				System.out.println("Position: " + textPosition.getText());
				System.out.println("Expected Salary: " + textSalary.getText());
				
				//employement
				System.out.println("EMPLOYMENT");
				if(fulltime.isSelected())
					System.out.println(fulltime.getText());
				if(partime.isSelected())
					System.out.println(partime.getText());
				if(permanent.isSelected())
					System.out.println(permanent.getText());
				if(temporary.isSelected())
					System.out.println(temporary.getText());
				System.out.println("______________________");
				
				if(hyge1.isSelected()) {
					System.out.println("Certified: " + hyge1.getText());
				}else if(hyge2.isSelected()) {
					System.out.println("Certified: " + hyge2.getText());
				}
				if(hyge3.isSelected()) {
					System.out.println("Licensed: " + hyge3.getText());
				}else if(hyge4.isSelected()) {
					System.out.println("Licensed: " + hyge4.getText());
				}
			
				System.out.println("Monday: " + array1.getSelectedItem()); 
				System.out.println("Monday: " + array2.getSelectedItem()); 
				System.out.println("================"); 
				System.out.println("Tuesday: " + array3.getSelectedItem()); 
				System.out.println("Tuesday: " + array4.getSelectedItem());
				System.out.println("================"); 
				System.out.println("Wedsnday: " + array5.getSelectedItem()); 
				System.out.println("Wedsnday: " + array6.getSelectedItem());
				System.out.println("================"); 
				System.out.println("Thursday: " + array7.getSelectedItem()); 
				System.out.println("Thursday: " + array8.getSelectedItem()); 
				System.out.println("================"); 
				System.out.println("Friday: " + array9.getSelectedItem()); 
				System.out.println("Friday: " + array10.getSelectedItem()); 
				System.out.println("================"); 
				System.out.println("Saturday: " + array11.getSelectedItem()); 
				System.out.println("Saturday: " + array12.getSelectedItem());
				System.out.println("================"); 
				System.out.println("Sunday: " + array13.getSelectedItem()); 
				System.out.println("Sunday: " + array14.getSelectedItem()); 
				
				System.out.println("Start date: " + textInfo1.getText());
				System.out.println("Drivers License: " + textInfo2.getText());
				
				System.out.println("Transportation: " + textInfo3.getText());
				System.out.println("Referenced by: " + textInfo4.getText());
				
				System.out.println();
				System.out.println("AREAS ABLE TO COMMUTE BELOW");
				System.out.println("===========================");
				if(area1.isSelected())
					System.out.println(area1.getText());

				if(area2.isSelected())
					System.out.println(area2.getText());

				if(area3.isSelected())
					System.out.println(area3.getText());

				if(area4.isSelected())
					System.out.println(area4.getText());

				if(area5.isSelected())
					System.out.println(area5.getText());

				if(area6.isSelected())
					System.out.println(area6.getText());

				if(area7.isSelected())
					System.out.println(area7.getText());

				if(area8.isSelected())
					System.out.println(area8.getText());

				if(area9.isSelected())
					System.out.println(area9.getText());
				System.out.println();
			
				//school name
				System.out.println("SCHOOL NAME");
				System.out.println("High school: " + textGrid1.getText());
				System.out.println("College: " + textGrid2.getText());
				System.out.println("Buisness or Trade: " + textGrid3.getText());
				System.out.println("Professional School: " + textGrid14.getText());
				System.out.println("____________________________________");
				
				//location
				System.out.println("LOCATION");
				System.out.println();
				System.out.println("High school: " + textGrid5.getText());
				System.out.println("College: " + textGrid6.getText());
				System.out.println("Buisness or Trade: " + textGrid7.getText());
				System.out.println("Professional School: " + textGrid8.getText());
				System.out.println("____________________________________");
				
				//years studied
				System.out.println("YEARS STUDIED");
				System.out.println();
				System.out.println("High school: " + textGrid9.getText());
				System.out.println("College: " + textGrid10.getText());
				System.out.println("Buisness or Trade: " + textGrid11.getText());
				System.out.println("Professional School: " + textGrid12.getText());
				System.out.println("____________________________________");
				
				//Major and Degree
				System.out.println("MAJOR AND DEGREES");
				System.out.println();
				System.out.println("High school: " + textGrid13.getText());
				System.out.println("College: " + textGrid14.getText());
				System.out.println("Buisness or Trade: " + textGrid15.getText());
				System.out.println("Professional School: " + textGrid16.getText());
				System.out.println("____________________________________");
				
			
			}
				
				
				
				
				
				
			
		});
		
		
		
		
	
		
		
		
		
		myframe.add(mainPanel,BorderLayout.CENTER);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setVisible(true);
	}
	public String[] hourFunction() {
		String[] hours = new String[24];
		
		for(int i =0;i<=23;i++)
			if(i < 10)
				hours[i] = "0"+i+":00H";
			else
				hours[i] = i+":00H";
		
		return hours;
			
	}

}
