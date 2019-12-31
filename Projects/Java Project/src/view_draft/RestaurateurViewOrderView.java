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
import javax.swing.JList;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;

public class RestaurateurViewOrderView extends JFrame {

	private JPanel contentPane;
	private JTextField tfDeliveryDate;
	private JTextField tfDeliveryTime;
	private JTextField tfPostalCode;

	private JButton btnRestaurantSelect, btnGoBack, btnSelectOrder;
	private JMenuItem menuItemDisconnect, menuItemQuit, menuItemAcceptOrder, menuItemOrderReady;
	private JList listMealInOrder, listRestaurantsOrders, listRestaurants;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					RestaurateurViewOrderView frame = new RestaurateurViewOrderView();
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
	public RestaurateurViewOrderView() {
		setTitle("Restaurateur Menu | Restuarant Delivery System");
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

		JMenu menuOrder = new JMenu("Order");
		menuOrder.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(menuOrder);

		menuItemAcceptOrder = new JMenuItem("Accept Order");
		menuItemAcceptOrder.setFont(new Font("Arial", Font.PLAIN, 15));
		menuOrder.add(menuItemAcceptOrder);

		menuItemOrderReady = new JMenuItem("Order Ready");
		menuItemOrderReady.setFont(new Font("Arial", Font.PLAIN, 15));
		menuOrder.add(menuItemOrderReady);

		contentPane = new JPanel();
		contentPane.setFont(new Font("Arial", Font.PLAIN, 15));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		listRestaurants = new JList();
		listRestaurants.setBorder(new CompoundBorder());
		listRestaurants.setBounds(77, 70, 359, 376);
		contentPane.add(listRestaurants);

		JLabel lblNewLabel = new JLabel("View Orders");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(430, 0, 119, 62);
		contentPane.add(lblNewLabel);

		btnRestaurantSelect = new JButton("Select");
		btnRestaurantSelect.setBounds(77, 447, 359, 26);
		contentPane.add(btnRestaurantSelect);

		JLabel lblDeliveryDate = new JLabel("Delivery Date (yyyy/mm/dd):");
		lblDeliveryDate.setFont(new Font("Arial", Font.PLAIN, 15));
		lblDeliveryDate.setBounds(486, 565, 221, 26);
		contentPane.add(lblDeliveryDate);

		tfDeliveryDate = new JTextField();
		tfDeliveryDate.setBounds(717, 563, 186, 26);
		contentPane.add(tfDeliveryDate);
		tfDeliveryDate.setColumns(10);

		JLabel lblDeliveryTime = new JLabel("Delivery Time:");
		lblDeliveryTime.setFont(new Font("Arial", Font.PLAIN, 15));
		lblDeliveryTime.setBounds(486, 591, 221, 26);
		contentPane.add(lblDeliveryTime);

		tfDeliveryTime = new JTextField();
		tfDeliveryTime.setColumns(10);
		tfDeliveryTime.setBounds(717, 592, 186, 26);
		contentPane.add(tfDeliveryTime);

		JLabel lblPostalCode = new JLabel("Postal Code:");
		lblPostalCode.setFont(new Font("Arial", Font.PLAIN, 15));
		lblPostalCode.setBounds(486, 621, 221, 26);
		contentPane.add(lblPostalCode);

		tfPostalCode = new JTextField();
		tfPostalCode.setColumns(10);
		tfPostalCode.setBounds(717, 622, 186, 26);
		contentPane.add(tfPostalCode);

		JLabel lblMealOrder = new JLabel("Meal in Order");
		lblMealOrder.setFont(new Font("Arial", Font.PLAIN, 15));
		lblMealOrder.setBounds(67, 500, 113, 26);
		contentPane.add(lblMealOrder);

		listMealInOrder = new JList();
		listMealInOrder.setBounds(66, 524, 359, 185);
		contentPane.add(listMealInOrder);

		JLabel lblRestaurant = new JLabel("Restaurant");
		lblRestaurant.setFont(new Font("Arial", Font.BOLD, 15));
		lblRestaurant.setBounds(220, 45, 94, 26);
		contentPane.add(lblRestaurant);

		JLabel lblRestaurantsOrder = new JLabel("Restaurant's Order");
		lblRestaurantsOrder.setFont(new Font("Arial", Font.BOLD, 15));
		lblRestaurantsOrder.setBounds(623, 45, 160, 26);
		contentPane.add(lblRestaurantsOrder);

		btnGoBack = new JButton("Go Back");
		btnGoBack.setBounds(642, 675, 104, 34);
		contentPane.add(btnGoBack);

		listRestaurantsOrders = new JList();
		listRestaurantsOrders.setBorder(new CompoundBorder());
		listRestaurantsOrders.setBounds(544, 70, 359, 376);
		contentPane.add(listRestaurantsOrders);

		btnSelectOrder = new JButton("Select");
		btnSelectOrder.setBounds(544, 449, 359, 26);
		contentPane.add(btnSelectOrder);

		this.setVisible(false);

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
	 * @return the tfDeliveryTime
	 */
	public JTextField getTfDeliveryTime() {
		return tfDeliveryTime;
	}

	/**
	 * @param tfDeliveryTime the tfDeliveryTime to set
	 */
	public void setTfDeliveryTime(JTextField tfDeliveryTime) {
		this.tfDeliveryTime = tfDeliveryTime;
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
	 * @return the btnRestaurantSelect
	 */
	public JButton getBtnRestaurantSelect() {
		return btnRestaurantSelect;
	}

	/**
	 * @param btnRestaurantSelect the btnRestaurantSelect to set
	 */
	public void setBtnRestaurantSelect(JButton btnRestaurantSelect) {
		this.btnRestaurantSelect = btnRestaurantSelect;
	}

	/**
	 * @return the btnGoBack
	 */
	public JButton getBtnGoBack() {
		return btnGoBack;
	}

	/**
	 * @param btnGoBack the btnGoBack to set
	 */
	public void setBtnGoBack(JButton btnGoBack) {
		this.btnGoBack = btnGoBack;
	}

	/**
	 * @return the btnSelectOrder
	 */
	public JButton getBtnSelectOrder() {
		return btnSelectOrder;
	}

	/**
	 * @param btnSelectOrder the btnSelectOrder to set
	 */
	public void setBtnSelectOrder(JButton btnSelectOrder) {
		this.btnSelectOrder = btnSelectOrder;
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
	 * @return the menuItemAcceptOrder
	 */
	public JMenuItem getMenuItemAcceptOrder() {
		return menuItemAcceptOrder;
	}

	/**
	 * @param menuItemAcceptOrder the menuItemAcceptOrder to set
	 */
	public void setMenuItemAcceptOrder(JMenuItem menuItemAcceptOrder) {
		this.menuItemAcceptOrder = menuItemAcceptOrder;
	}

	/**
	 * @return the menuItemOrderReady
	 */
	public JMenuItem getMenuItemOrderReady() {
		return menuItemOrderReady;
	}

	/**
	 * @param menuItemOrderReady the menuItemOrderReady to set
	 */
	public void setMenuItemOrderReady(JMenuItem menuItemOrderReady) {
		this.menuItemOrderReady = menuItemOrderReady;
	}

	/**
	 * @return the listMealInOrder
	 */
	public JList getListMealInOrder() {
		return listMealInOrder;
	}

	/**
	 * @param listMealInOrder the listMealInOrder to set
	 */
	public void setListMealInOrder(JList listMealInOrder) {
		this.listMealInOrder = listMealInOrder;
	}

	/**
	 * @return the listRestaurantsOrders
	 */
	public JList getListRestaurantsOrders() {
		return listRestaurantsOrders;
	}

	/**
	 * @param listRestaurantsOrders the listRestaurantsOrders to set
	 */
	public void setListRestaurantsOrders(JList listRestaurantsOrders) {
		this.listRestaurantsOrders = listRestaurantsOrders;
	}

	/**
	 * @return the listRestaurants
	 */
	public JList getListRestaurants() {
		return listRestaurants;
	}

	/**
	 * @param listRestaurants the listRestaurants to set
	 */
	public void setListRestaurants(JList listRestaurants) {
		this.listRestaurants = listRestaurants;
	}

}
