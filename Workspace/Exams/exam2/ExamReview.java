package Exam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class ExamReview extends JFrame {

	private JPanel contentPane;
	private JTextField id_tf;
	private JTextField firstname_tf;
	private JTextField lastname_tf;
	private JTextField dob_tf;
	private JTextField phone_tf;
	private JTextField city_tf;
	private JTextField email_tf;
	private JTextField address_tf;
	private JComboBox profile_cb;
	private JComboBox program_cb;
	private JComboBox province_cb;
	private JComboBox avatar_cb;
	private ArrayList<String[]> profiles = new ArrayList<>();
	private JRadioButton male_rb;
	private JRadioButton other_rb;
	private JRadioButton female_rb;
	private JLabel avatar_lbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExamReview frame = new ExamReview();
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
	public ExamReview() {
		String profile1[] = { "1001", "George 1", "Boursiquot", "1", "01/01/2010", "Male", "514-514-5144",
				"email1@gmail.com", "123 Fake Street", "Montreal", "1", "1" };
		String profile3[] = { "1002", "George 2", "Boursiquot", "2", "01/01/2010", "Female", "514-514-5144",
				"email2@gmail.com", "123 Fake Street", "Montreal", "1", "1" };
		String profile4[] = { "1003", "George 3", "Boursiquot", "3", "01/01/2010", "Male", "514-514-5144",
				"email3@gmail.com", "123 Fake Street", "Montreal", "1", "1" };

		profiles.add(new String[] { "Empty" });
		profiles.add(profile1);
		profiles.add(profile3);
		profiles.add(profile4);
		profiles.add(new String[] { "1004", "George 4", "Boursiquot", "1", "01/01/2010", "Male", "514-514-5144",
				"email4@gmail.com", "123 Fake Street", "Montreal", "1", "1" });
		profiles.add(new String[] { "1005", "George 5", "Boursiquot", "2", "01/01/2010", "Male", "514-514-5144",
				"email5@gmail.com", "123 Fake Street", "Montreal", "1", "1" });

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 366, 437);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmClose = new JMenuItem("Close");
		mnFile.add(mntmClose);

		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);

		JMenuItem mntmClear = new JMenuItem("Clear");
		mnEdit.add(mntmClear);

		JMenu mnAbout = new JMenu("Help");
		menuBar.add(mnAbout);

		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				profile_cb.addItem("1006 Mushu Mulan");
			}
		});
		mnAbout.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel lblSelectProfile = new JLabel("Select Profile");
		lblSelectProfile.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(lblSelectProfile);

		profile_cb = new JComboBox();
		profile_cb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = profile_cb.getSelectedIndex();
				if (index > 0) {

					String profile[] = profiles.get(index);

					// textfields
					id_tf.setText(profile[0]);
					firstname_tf.setText(profile[1]);
					lastname_tf.setText(profile[2]);
					dob_tf.setText(profile[4]);
					phone_tf.setText(profile[6]);
					email_tf.setText(profile[7]);
					address_tf.setText(profile[8]);
					city_tf.setText(profile[9]);

					// comboboxes
					program_cb.setSelectedIndex(Integer.parseInt(profile[3]));
					province_cb.setSelectedIndex(Integer.parseInt(profile[10]));
					avatar_cb.setSelectedIndex(Integer.parseInt(profile[11]));

					// radio buttons
					if (profile[5].equals("Male"))
						male_rb.setSelected(true);
					else if (profile[5].equals("Female"))
						female_rb.setSelected(true);
					else
						other_rb.setSelected(true);
				} else
					resetFields();
			}
		});
		profile_cb.setFont(new Font("Tahoma", Font.BOLD, 12));

		populateProfilesCombo();
		panel.add(profile_cb);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1, BorderLayout.SOUTH);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				profiles.add(createProfile());
				populateProfilesCombo();
				resetFields();
			}
		});

		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(btnAdd);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = profile_cb.getSelectedIndex();
				profiles.set(index, createProfile());
				populateProfilesCombo();
				resetFields();
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(btnUpdate);

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = profile_cb.getSelectedIndex();
				if (index > 0) {
					profiles.remove(index);
					populateProfilesCombo();
					resetFields();
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(btnDelete);

		JButton btnAclear = new JButton("Clear");
		btnAclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetFields();
			}
		});
		btnAclear.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(btnAclear);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EmptyBorder(5, 0, 0, 0));
		panel_3.setBackground(Color.WHITE);
		panel_3.setPreferredSize(new Dimension(10, 130));
		panel_2.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new GridLayout(0, 3, 10, 0));

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EmptyBorder(0, 10, 0, 0));
		panel_4.setBackground(Color.WHITE);
		panel_3.add(panel_4);
		panel_4.setLayout(new GridLayout(5, 0, 0, 5));

		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(lblId);

		JLabel lblFirstname = new JLabel("Firstname");
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(lblFirstname);

		JLabel lblLastname = new JLabel("Lastname");
		lblLastname.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(lblLastname);

		JLabel lblProgram = new JLabel("Program");
		lblProgram.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(lblProgram);

		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(lblDateOfBirth);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_3.add(panel_5);
		panel_5.setLayout(new GridLayout(5, 0, 0, 5));

		id_tf = new JTextField();
		id_tf.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(id_tf);
		id_tf.setColumns(10);

		firstname_tf = new JTextField();
		firstname_tf.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(firstname_tf);
		firstname_tf.setColumns(10);

		lastname_tf = new JTextField();
		lastname_tf.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(lastname_tf);
		lastname_tf.setColumns(10);

		program_cb = new JComboBox();
		program_cb.setFont(new Font("Tahoma", Font.BOLD, 12));
		program_cb.setModel(
				new DefaultComboBoxModel(new String[] { "Select Program", "Programming", "ATP", "Day Care", "CADD" }));
		panel_5.add(program_cb);

		dob_tf = new JTextField();
		dob_tf.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(dob_tf);
		dob_tf.setColumns(10);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_3.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));

		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		panel_11.setBorder(new EmptyBorder(5, 0, 1, 0));
		panel_6.add(panel_11, BorderLayout.SOUTH);
		panel_11.setLayout(new GridLayout(0, 1, 0, 0));

		avatar_cb = new JComboBox();
		avatar_cb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = avatar_cb.getSelectedIndex();

				switch (index) {
				case 1:
					avatar_lbl.setIcon(new ImageIcon(new ImageIcon("avatars/m1.png").getImage().getScaledInstance(100,
							100, Image.SCALE_SMOOTH)));
					break;
				case 2:
					avatar_lbl.setIcon(new ImageIcon(new ImageIcon("avatars/m2.png").getImage().getScaledInstance(100,
							100, Image.SCALE_SMOOTH)));
					break;
				case 3:
					avatar_lbl.setIcon(new ImageIcon(new ImageIcon("avatars/f1.png").getImage().getScaledInstance(100,
							100, Image.SCALE_SMOOTH)));
					break;
				case 4:
					avatar_lbl.setIcon(new ImageIcon(new ImageIcon("avatars/f2.png").getImage().getScaledInstance(100,
							100, Image.SCALE_SMOOTH)));
					break;
				default:
					avatar_lbl.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\gboursiquot\\Pictures\\279006f.jpg")
							.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
				}
			}
		});
		avatar_cb.setPreferredSize(new Dimension(28, 19));
		panel_11.add(avatar_cb);
		avatar_cb.setFont(new Font("Tahoma", Font.BOLD, 12));
		avatar_cb.setModel(new DefaultComboBoxModel(new String[] { "Empty", "Male1", "Male2", "Female1", "Female2" }));

		avatar_lbl = new JLabel("");
		avatar_lbl.setBackground(Color.WHITE);
		avatar_lbl.setOpaque(true);
		avatar_lbl.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\gboursiquot\\Pictures\\279006f.jpg").getImage()
				.getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
		panel_6.add(avatar_lbl, BorderLayout.NORTH);

		JPanel panel_7 = new JPanel();
		panel_7.setPreferredSize(new Dimension(10, 160));
		panel_2.add(panel_7, BorderLayout.SOUTH);
		panel_7.setLayout(new BorderLayout(0, 0));

		JPanel panel_8 = new JPanel();
		panel_7.add(panel_8, BorderLayout.WEST);
		panel_8.setBorder(new EmptyBorder(0, 10, 0, 0));
		panel_8.setPreferredSize(new Dimension(117, 10));
		panel_8.setBackground(Color.WHITE);
		panel_8.setLayout(new GridLayout(6, 0, 0, 5));

		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_8.add(lblGender);

		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_8.add(lblPhone);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_8.add(lblEmail);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_8.add(lblAddress);

		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_8.add(lblCity);

		JLabel lblProvince = new JLabel("Province");
		lblProvince.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_8.add(lblProvince);

		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_7.add(panel_9, BorderLayout.CENTER);
		panel_9.setLayout(new GridLayout(6, 0, 0, 5));

		JPanel panel_10 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_10.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_10.setBackground(Color.WHITE);
		panel_9.add(panel_10);

		male_rb = new JRadioButton("Male");
		male_rb.setMargin(new Insets(0, 2, 2, 2));
		male_rb.setAlignmentY(Component.TOP_ALIGNMENT);
		male_rb.setFont(new Font("Tahoma", Font.BOLD, 11));
		male_rb.setBackground(Color.WHITE);
		panel_10.add(male_rb);

		female_rb = new JRadioButton("Female");
		female_rb.setMargin(new Insets(0, 2, 2, 2));
		female_rb.setAlignmentY(Component.TOP_ALIGNMENT);
		female_rb.setFont(new Font("Tahoma", Font.BOLD, 11));
		female_rb.setBackground(Color.WHITE);
		panel_10.add(female_rb);

		other_rb = new JRadioButton("Other");
		other_rb.setMargin(new Insets(0, 2, 2, 2));
		other_rb.setAlignmentY(Component.TOP_ALIGNMENT);
		other_rb.setFont(new Font("Tahoma", Font.BOLD, 11));
		other_rb.setBackground(Color.WHITE);
		panel_10.add(other_rb);

		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(male_rb);
		genderGroup.add(female_rb);
		genderGroup.add(other_rb);

		phone_tf = new JTextField();
		phone_tf.setFont(new Font("Tahoma", Font.BOLD, 12));
		phone_tf.setColumns(10);
		panel_9.add(phone_tf);

		email_tf = new JTextField();
		email_tf.setFont(new Font("Tahoma", Font.BOLD, 12));
		email_tf.setColumns(10);
		panel_9.add(email_tf);

		address_tf = new JTextField();
		address_tf.setFont(new Font("Tahoma", Font.BOLD, 12));
		address_tf.setColumns(10);
		panel_9.add(address_tf);

		city_tf = new JTextField();
		city_tf.setFont(new Font("Tahoma", Font.BOLD, 12));
		city_tf.setColumns(10);
		panel_9.add(city_tf);

		province_cb = new JComboBox();
		province_cb.setFont(new Font("Tahoma", Font.BOLD, 12));
		province_cb.setModel(new DefaultComboBoxModel(new String[] { "Select Province", "Qu\u00E9bec", "Ontario" }));
		panel_9.add(province_cb);
	}

	private void populateProfilesCombo() {
		String ComboBoxModel[] = new String[profiles.size();

		for (int i = 0; i < ComboBoxModel.length; i++)
			if (i == 0)
				ComboBoxModel[i] = profiles.get(i)[0];
			else
				ComboBoxModel[i] = profiles.get(i)[0] + " " + profiles.get(i)[1] + " " + profiles.get(i)[2];

		profile_cb.setModel(new DefaultComboBoxModel(ComboBoxModel));
	}

	private void resetFields() {
		// textfields
		id_tf.setText("");
		firstname_tf.setText("");
		lastname_tf.setText("");
		dob_tf.setText("");
		phone_tf.setText("");
		email_tf.setText("");
		address_tf.setText("");
		city_tf.setText("");

		// comboboxes
		profile_cb.setSelectedIndex(0);
		program_cb.setSelectedIndex(0);
		province_cb.setSelectedIndex(0);
		avatar_cb.setSelectedIndex(0);

		// radio buttons
		male_rb.setSelected(false);
		female_rb.setSelected(false);
		other_rb.setSelected(false);
	}

	private String[] createProfile() {
		String profile[] = new String[12];
		// textfields
		profile[0] = id_tf.getText();
		profile[1] = firstname_tf.getText();
		profile[2] = lastname_tf.getText();
		profile[4] = dob_tf.getText();
		profile[6] = phone_tf.getText();
		profile[7] = email_tf.getText();
		profile[8] = address_tf.getText();
		profile[9] = city_tf.getText();

		// comboboxes
		profile[3] = program_cb.getSelectedIndex() + "";
		profile[10] = province_cb.getSelectedIndex() + "";
		profile[11] = avatar_cb.getSelectedIndex() + "";

		// radio buttons
		if (male_rb.isSelected())
			profile[5] = "Male";
		else if (female_rb.isSelected())
			profile[5] = "Female";
		else
			profile[5] = "Other";

		return profile;
	}
}
