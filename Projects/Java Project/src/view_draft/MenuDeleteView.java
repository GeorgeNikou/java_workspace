package view_draft;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

import GeorgeView.RestaurantDeleteMenuView;

import javax.swing.border.LineBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class MenuDeleteView extends JFrame {

	private JPanel contentPane;
	
	private JList listDeleteMenu, listRestaurant;
	private JButton btnDelete, btnSelect;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurantDeleteMenuView frame = new RestaurantDeleteMenuView();
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
	public MenuDeleteView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		mnFile.add("Disconnect");
		mnFile.add("Exit");
		mnFile.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(mnFile);

		JMenu mnRestaurant = new JMenu("Restaurant");
		mnRestaurant.add("Create");
		mnRestaurant.add("Edit");
		mnRestaurant.add("Delete");
		mnRestaurant.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(mnRestaurant);

		JMenu mnMenu = new JMenu("Menu");
		mnMenu.add("Create");
		mnMenu.add("Edit");
		mnMenu.add("Delete");
		mnMenu.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(mnMenu);

		JMenu mnDelivery = new JMenu("Delivery");
		mnDelivery.add("Create");
		mnDelivery.add("Edit");
		mnDelivery.add("Delete");
		mnDelivery.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(mnDelivery);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel title_panel = new JPanel();
		title_panel.setPreferredSize(new Dimension(10, 100));
		contentPane.add(title_panel, BorderLayout.NORTH);
		title_panel.setLayout(new BorderLayout(0, 0));

		JPanel RestaurantTitle_panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) RestaurantTitle_panel.getLayout();
		flowLayout.setVgap(50);
		RestaurantTitle_panel.setPreferredSize(new Dimension(400, 10));
		title_panel.add(RestaurantTitle_panel, BorderLayout.WEST);

		JLabel lblRestaurant = new JLabel("RESTAURANT");
		lblRestaurant.setFont(new Font("Arial", Font.BOLD, 30));
		RestaurantTitle_panel.add(lblRestaurant);

		JPanel createMenu_panel = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) createMenu_panel.getLayout();
		flowLayout_1.setVgap(50);
		createMenu_panel.setPreferredSize(new Dimension(410, 10));
		title_panel.add(createMenu_panel, BorderLayout.EAST);

		JLabel lblCreateMenu = new JLabel("DELETE MENU");
		lblCreateMenu.setFont(new Font("Arial", Font.BOLD, 30));
		createMenu_panel.add(lblCreateMenu);

		JPanel topEmpty_panel = new JPanel();
		title_panel.add(topEmpty_panel, BorderLayout.CENTER);

		JPanel center_panel = new JPanel();
		contentPane.add(center_panel, BorderLayout.CENTER);
		center_panel.setLayout(new BorderLayout(0, 0));

		JPanel bottom_panel = new JPanel();
		bottom_panel.setPreferredSize(new Dimension(10, 200));
		center_panel.add(bottom_panel, BorderLayout.SOUTH);
		bottom_panel.setLayout(new BorderLayout(0, 0));

		JPanel left_panel = new JPanel();
		left_panel.setPreferredSize(new Dimension(400, 10));
		center_panel.add(left_panel, BorderLayout.WEST);
		left_panel.setLayout(new BorderLayout(0, 0));

		JPanel selectBtn_panel = new JPanel();
		selectBtn_panel.setPreferredSize(new Dimension(10, 50));
		left_panel.add(selectBtn_panel, BorderLayout.SOUTH);

		btnSelect = new JButton("Select");
		btnSelect.setBorder(new BevelBorder(BevelBorder.RAISED, Color.LIGHT_GRAY, null, Color.GRAY, null));
		btnSelect.setPreferredSize(new Dimension(100, 35));
		btnSelect.setFont(new Font("Arial", Font.BOLD, 15));
		selectBtn_panel.add(btnSelect);

		JPanel restaurantSelect_panel = new JPanel();
		left_panel.add(restaurantSelect_panel, BorderLayout.CENTER);

		listRestaurant = new JList();
		listRestaurant.setPreferredSize(new Dimension(375, 375));
		restaurantSelect_panel.add(listRestaurant);

		JPanel right_panel = new JPanel();
		right_panel.setPreferredSize(new Dimension(410, 10));
		center_panel.add(right_panel, BorderLayout.EAST);
		right_panel.setLayout(new BorderLayout(0, 0));

		JPanel deleteBtn_panel = new JPanel();
		deleteBtn_panel.setPreferredSize(new Dimension(10, 50));
		right_panel.add(deleteBtn_panel, BorderLayout.SOUTH);

		btnDelete = new JButton("Delete menu");
		btnDelete.setBorder(new BevelBorder(BevelBorder.RAISED, Color.LIGHT_GRAY, null, Color.GRAY, null));
		btnDelete.setPreferredSize(new Dimension(100, 35));
		btnDelete.setFont(new Font("Arial", Font.BOLD, 15));
		deleteBtn_panel.add(btnDelete);

		JPanel menuItems_panel = new JPanel();
		right_panel.add(menuItems_panel, BorderLayout.CENTER);

		listDeleteMenu = new JList();
		listDeleteMenu.setPreferredSize(new Dimension(375, 375));
		menuItems_panel.add(listDeleteMenu);

		JPanel middle_panel = new JPanel();
		center_panel.add(middle_panel, BorderLayout.CENTER);
		middle_panel.setLayout(new BorderLayout(0, 0));

		JPanel middleInfo_panel1 = new JPanel();
		middleInfo_panel1.setPreferredSize(new Dimension(10, 150));
		middle_panel.add(middleInfo_panel1, BorderLayout.NORTH);

		JPanel middleInfo_panel2 = new JPanel();
		middleInfo_panel2.setPreferredSize(new Dimension(10, 150));
		middle_panel.add(middleInfo_panel2, BorderLayout.SOUTH);

		JPanel middleArrow_panel = new JPanel();
		middle_panel.add(middleArrow_panel, BorderLayout.CENTER);

		JLabel label = new JLabel("->");
		label.setForeground(Color.LIGHT_GRAY);
		label.setFont(new Font("Courier New", Font.BOLD, 50));
		middleArrow_panel.add(label);

		this.setVisible(false);
	}

	/**
	 * @return the listDeleteMenu
	 */
	public JList getListDeleteMenu() {
		return listDeleteMenu;
	}

	/**
	 * @param listDeleteMenu the listDeleteMenu to set
	 */
	public void setListDeleteMenu(JList listDeleteMenu) {
		this.listDeleteMenu = listDeleteMenu;
	}

	/**
	 * @return the listRestaurant
	 */
	public JList getListRestaurant() {
		return listRestaurant;
	}

	/**
	 * @param listRestaurant the listRestaurant to set
	 */
	public void setListRestaurant(JList listRestaurant) {
		this.listRestaurant = listRestaurant;
	}

	/**
	 * @return the btnDelete
	 */
	public JButton getBtnDelete() {
		return btnDelete;
	}

	/**
	 * @param btnDelete the btnDelete to set
	 */
	public void setBtnDelete(JButton btnDelete) {
		this.btnDelete = btnDelete;
	}

	/**
	 * @return the btnSelect
	 */
	public JButton getBtnSelect() {
		return btnSelect;
	}

	/**
	 * @param btnSelect the btnSelect to set
	 */
	public void setBtnSelect(JButton btnSelect) {
		this.btnSelect = btnSelect;
	}

}
