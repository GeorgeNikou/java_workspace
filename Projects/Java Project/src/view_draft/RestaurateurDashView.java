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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RestaurateurDashView extends JFrame {

	private JPanel contentPane;

	private JButton btnViewOrders, btnAcceptmarkOrders;
	private JMenuItem menuItemDisconnect, menuItemQuit, menuItemAcceptOrder, menuItemOrderReady;

	//RestaurateurMarkAcceptView frameMarkOrderAsReady = new RestaurateurMarkAcceptView();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Restaurateur frame = new Restaurateur();
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
	public RestaurateurDashView() {
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

		JLabel lblNewLabel = new JLabel("View Orders");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel.setBounds(183, 194, 154, 81);
		contentPane.add(lblNewLabel);

		JLabel lblAcceptmarkOrders = new JLabel("Accept/Mark Orders");
		lblAcceptmarkOrders.setFont(new Font("Arial", Font.PLAIN, 24));
		lblAcceptmarkOrders.setBounds(587, 194, 213, 81);
		contentPane.add(lblAcceptmarkOrders);

		btnViewOrders = new JButton("View Orders");
		btnViewOrders.setFont(new Font("Arial", Font.PLAIN, 15));
		btnViewOrders.setBounds(183, 286, 154, 32);
		contentPane.add(btnViewOrders);

		btnAcceptmarkOrders = new JButton("Accept/Mark Orders");
		btnAcceptmarkOrders.setFont(new Font("Arial", Font.PLAIN, 15));
		btnAcceptmarkOrders.setBounds(597, 286, 191, 32);
		contentPane.add(btnAcceptmarkOrders);

		this.setVisible(false);
		// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * @return the btnViewOrders
	 */
	public JButton getBtnViewOrders() {
		return btnViewOrders;
	}

	/**
	 * @param btnViewOrders the btnViewOrders to set
	 */
	public void setBtnViewOrders(JButton btnViewOrders) {
		this.btnViewOrders = btnViewOrders;
	}

	/**
	 * @return the btnAcceptmarkOrders
	 */
	public JButton getBtnAcceptmarkOrders() {
		return btnAcceptmarkOrders;
	}

	/**
	 * @param btnAcceptmarkOrders the btnAcceptmarkOrders to set
	 */
	public void setBtnAcceptmarkOrders(JButton btnAcceptmarkOrders) {
		this.btnAcceptmarkOrders = btnAcceptmarkOrders;
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
	
	

}
