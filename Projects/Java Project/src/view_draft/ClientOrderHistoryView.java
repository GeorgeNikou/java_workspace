package view_draft;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class ClientOrderHistoryView extends JFrame {

	// File Menu Bar
	private JMenuItem menuItemDisconnect;
	private JMenuItem menuItemQuit;

	// Account Menu Bar
	private JMenuItem menuItemCreateAccount;
	private JMenuItem menuItemEditAccount;
	private JMenuItem menuItemCloseAccount;

	// Order Menu Bar
	private JMenuItem menuItemOrderFood;
	private JMenuItem menuItemOrderHistory;

	private JPanel contentPane;
	private JTextField tfDeliveryDate;
	private JTextField tfPostalCode;

	private JButton btnBack, btnOrder;
	private JList listMealOrder, listRestaurant;
	private JComboBox cbDeliveryTime;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ClientOrderHistoryView frame = new ClientOrderHistoryView();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public ClientOrderHistoryView() {
		setTitle("Client - Order History | Restuarant Delivery System");
		setFont(new Font("Arial", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Arial", Font.PLAIN, 15));
		setJMenuBar(menuBar);

		JMenu menuFile = new JMenu("File");
		menuFile.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(menuFile);

		menuItemDisconnect = new JMenuItem("Disconnect");
		menuItemDisconnect.setFont(new Font("Arial", Font.PLAIN, 15));
		menuFile.add(menuItemDisconnect);

		menuItemQuit = new JMenuItem("Quit");
		menuItemQuit.setFont(new Font("Arial", Font.PLAIN, 15));
		menuFile.add(menuItemQuit);

		JMenu menuAccount = new JMenu("Account");
		menuAccount.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(menuAccount);

		JMenuItem menuItemEditAccount = new JMenuItem("Edit Account");
		menuItemEditAccount.setFont(new Font("Arial", Font.PLAIN, 15));
		menuAccount.add(menuItemEditAccount);

		JMenuItem menuItemCloseAccount = new JMenuItem("Close Account");
		menuItemCloseAccount.setFont(new Font("Arial", Font.PLAIN, 15));
		menuAccount.add(menuItemCloseAccount);

		JMenu menuOrder = new JMenu("Order");
		menuOrder.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(menuOrder);

		menuItemOrderFood = new JMenuItem("Order Food");
		menuItemOrderFood.setFont(new Font("Arial", Font.PLAIN, 15));
		menuOrder.add(menuItemOrderFood);

		menuItemOrderHistory = new JMenuItem("Order History");
		menuItemOrderHistory.setFont(new Font("Arial", Font.PLAIN, 15));
		menuOrder.add(menuItemOrderHistory);

		contentPane = new JPanel();
		contentPane.setFont(new Font("Arial", Font.PLAIN, 15));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblOrderFood = new JLabel("Order History");
		lblOrderFood.setFont(new Font("Arial", Font.BOLD, 30));
		lblOrderFood.setBounds(382, 11, 213, 61);
		contentPane.add(lblOrderFood);

		JLabel lblDeliveryDate = new JLabel("Delivery Time:");
		lblDeliveryDate.setFont(new Font("Arial", Font.PLAIN, 15));
		lblDeliveryDate.setBounds(325, 93, 183, 33);
		contentPane.add(lblDeliveryDate);

		tfDeliveryDate = new JTextField();
		tfDeliveryDate.setFont(new Font("Arial", Font.PLAIN, 15));
		tfDeliveryDate.setBounds(515, 67, 109, 25);
		contentPane.add(tfDeliveryDate);
		tfDeliveryDate.setColumns(10);

		JLabel label = new JLabel("Delivery date(yyyy/mm/dd):");
		label.setFont(new Font("Arial", Font.PLAIN, 15));
		label.setBounds(325, 59, 183, 33);
		contentPane.add(label);

		cbDeliveryTime = new JComboBox();
		cbDeliveryTime.setBounds(515, 98, 110, 25);
		contentPane.add(cbDeliveryTime);

		JLabel lblPostalCode = new JLabel("Postal Code:");
		lblPostalCode.setFont(new Font("Arial", Font.PLAIN, 15));
		lblPostalCode.setBounds(325, 124, 183, 33);
		contentPane.add(lblPostalCode);

		tfPostalCode = new JTextField();
		tfPostalCode.setFont(new Font("Arial", Font.PLAIN, 15));
		tfPostalCode.setColumns(10);
		tfPostalCode.setBounds(515, 128, 109, 25);
		contentPane.add(tfPostalCode);

		JLabel lblRestaurant = new JLabel("Your Orders");
		lblRestaurant.setFont(new Font("Arial", Font.BOLD, 15));
		lblRestaurant.setBounds(209, 201, 117, 33);
		contentPane.add(lblRestaurant);

		listRestaurant = new JList();
		listRestaurant.setFont(new Font("Arial", Font.PLAIN, 15));
		listRestaurant.setBounds(69, 232, 368, 361);
		contentPane.add(listRestaurant);

		JLabel lblOrder = new JLabel("Meals in Order");
		lblOrder.setFont(new Font("Arial", Font.BOLD, 15));
		lblOrder.setBounds(635, 205, 117, 25);
		contentPane.add(lblOrder);

		btnOrder = new JButton("Select");
		btnOrder.setFont(new Font("Arial", Font.PLAIN, 15));
		btnOrder.setBounds(171, 602, 146, 33);
		contentPane.add(btnOrder);

		listMealOrder = new JList();
		listMealOrder.setFont(new Font("Arial", Font.PLAIN, 15));
		listMealOrder.setBounds(536, 232, 368, 361);
		contentPane.add(listMealOrder);

		btnBack = new JButton("Client Dashboard");
		btnBack.setFont(new Font("Arial", Font.PLAIN, 15));
		btnBack.setBounds(413, 681, 146, 33);
		contentPane.add(btnBack);

		this.setVisible(false);
	}

	/**
	 * @return the menuItemDisconnect
	 */
	public JMenuItem getMenuItemDisconnect() {
		return menuItemDisconnect;
	}

	/**
	 * @param menuItemDisconnect the menuItemDisconnect to set
	 */
	public void setMenuItemDisconnect(JMenuItem menuItemDisconnect) {
		this.menuItemDisconnect = menuItemDisconnect;
	}

	/**
	 * @return the menuItemQuit
	 */
	public JMenuItem getMenuItemQuit() {
		return menuItemQuit;
	}

	/**
	 * @param menuItemQuit the menuItemQuit to set
	 */
	public void setMenuItemQuit(JMenuItem menuItemQuit) {
		this.menuItemQuit = menuItemQuit;
	}

	/**
	 * @return the menuItemCreateAccount
	 */
	public JMenuItem getMenuItemCreateAccount() {
		return menuItemCreateAccount;
	}

	/**
	 * @param menuItemCreateAccount the menuItemCreateAccount to set
	 */
	public void setMenuItemCreateAccount(JMenuItem menuItemCreateAccount) {
		this.menuItemCreateAccount = menuItemCreateAccount;
	}

	/**
	 * @return the menuItemEditAccount
	 */
	public JMenuItem getMenuItemEditAccount() {
		return menuItemEditAccount;
	}

	/**
	 * @param menuItemEditAccount the menuItemEditAccount to set
	 */
	public void setMenuItemEditAccount(JMenuItem menuItemEditAccount) {
		this.menuItemEditAccount = menuItemEditAccount;
	}

	/**
	 * @return the menuItemCloseAccount
	 */
	public JMenuItem getMenuItemCloseAccount() {
		return menuItemCloseAccount;
	}

	/**
	 * @param menuItemCloseAccount the menuItemCloseAccount to set
	 */
	public void setMenuItemCloseAccount(JMenuItem menuItemCloseAccount) {
		this.menuItemCloseAccount = menuItemCloseAccount;
	}

	/**
	 * @return the menuItemOrderFood
	 */
	public JMenuItem getMenuItemOrderFood() {
		return menuItemOrderFood;
	}

	/**
	 * @param menuItemOrderFood the menuItemOrderFood to set
	 */
	public void setMenuItemOrderFood(JMenuItem menuItemOrderFood) {
		this.menuItemOrderFood = menuItemOrderFood;
	}

	/**
	 * @return the menuItemOrderHistory
	 */
	public JMenuItem getMenuItemOrderHistory() {
		return menuItemOrderHistory;
	}

	/**
	 * @param menuItemOrderHistory the menuItemOrderHistory to set
	 */
	public void setMenuItemOrderHistory(JMenuItem menuItemOrderHistory) {
		this.menuItemOrderHistory = menuItemOrderHistory;
	}

	/**
	 * @return the tfDeliveryDate
	 */
	public JTextField getTfDeliveryDate() {
		return tfDeliveryDate;
	}

	/**
	 * @param tfDeliveryDate the tfDeliveryDate to set
	 */
	public void setTfDeliveryDate(JTextField tfDeliveryDate) {
		this.tfDeliveryDate = tfDeliveryDate;
	}

	/**
	 * @return the tfPostalCode
	 */
	public JTextField getTfPostalCode() {
		return tfPostalCode;
	}

	/**
	 * @param tfPostalCode the tfPostalCode to set
	 */
	public void setTfPostalCode(JTextField tfPostalCode) {
		this.tfPostalCode = tfPostalCode;
	}

	/**
	 * @return the btnBack
	 */
	public JButton getBtnBack() {
		return btnBack;
	}

	/**
	 * @param btnBack the btnBack to set
	 */
	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}

	/**
	 * @return the btnOrder
	 */
	public JButton getBtnOrder() {
		return btnOrder;
	}

	/**
	 * @param btnOrder the btnOrder to set
	 */
	public void setBtnOrder(JButton btnOrder) {
		this.btnOrder = btnOrder;
	}

	/**
	 * @return the listMealOrder
	 */
	public JList getListMealOrder() {
		return listMealOrder;
	}

	/**
	 * @param listMealOrder the listMealOrder to set
	 */
	public void setListMealOrder(JList listMealOrder) {
		this.listMealOrder = listMealOrder;
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
	 * @return the cbDeliveryTime
	 */
	public JComboBox getCbDeliveryTime() {
		return cbDeliveryTime;
	}

	/**
	 * @param cbDeliveryTime the cbDeliveryTime to set
	 */
	public void setCbDeliveryTime(JComboBox cbDeliveryTime) {
		this.cbDeliveryTime = cbDeliveryTime;
	}
	
	
}
