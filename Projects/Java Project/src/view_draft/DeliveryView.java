package view;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JList;

public class DeliveryView {

	private JFrame contentPane;
	private JMenuBar menuBar;
	private JMenu FileMenu;
	private JMenuItem DisconnectMI;
	private JMenuItem CloseMI;

	private JMenu DeliveryMenu;
	private JMenuItem ViewDeliveryMI;
	private JMenuItem AcceptedDeliveryMI;
	private JMenuItem DeliveryMadeMI;

	private JLabel RestaurantNumberlbl2;
	private JLabel OrderNumberlbl2;
	private JLabel DeliveryAddresslbl2;
	private JLabel DeliveryPostalCodelbl2;

	private JButton Completebtn;
	private JButton Selectbtn;
	private JTextArea SelectionTA;

	private JList<String> DeliveryOrderList;

	/**
	 * Launch the application.
	 */
	public static void DViewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeliveryView window = new DeliveryView();
					window.contentPane.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DeliveryView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		contentPane = new JFrame();
		contentPane.setBounds(100, 100, 600, 500);
		contentPane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		menuBar = new JMenuBar();
		contentPane.setJMenuBar(menuBar);

		FileMenu = new JMenu("File");
		menuBar.add(FileMenu);

		JMenuItem DisconnectMI = new JMenuItem("Disconnect");
		FileMenu.add(DisconnectMI);

		JMenuItem CloseMI = new JMenuItem("Close");
		FileMenu.add(CloseMI);

		CloseMI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(contentPane, "Close this application?");

				if (result == JOptionPane.OK_OPTION)
					System.exit(0);
			}
		});

		JMenu DeliveryMenu = new JMenu("Delivery");
		menuBar.add(DeliveryMenu);

		JMenuItem ViewDeliveryMI = new JMenuItem("View Deliveries");
		DeliveryMenu.add(ViewDeliveryMI);

		JMenuItem AcceptedDeliveryMI = new JMenuItem("Accepted Deliveries");
		DeliveryMenu.add(AcceptedDeliveryMI);

		JMenuItem DeliveryMadeMI = new JMenuItem("Delivery Made");
		DeliveryMenu.add(DeliveryMadeMI);

		JPanel LeftPan = new JPanel();
		contentPane.getContentPane().add(LeftPan, BorderLayout.WEST);
		LeftPan.setLayout(new BorderLayout(0, 0));

		JPanel TitlePan = new JPanel();
		LeftPan.add(TitlePan, BorderLayout.NORTH);
		TitlePan.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel DeliveryManlbl = new JLabel("Order");
		TitlePan.add(DeliveryManlbl);
		DeliveryManlbl.setFont(new Font("Arial", Font.BOLD, 14));

		JPanel TextAreaPan = new JPanel();
		LeftPan.add(TextAreaPan, BorderLayout.CENTER);

		DeliveryOrderList = new JList();
		DeliveryOrderList.setBorder(new LineBorder(new Color(0, 0, 0)));
		DeliveryOrderList.setPreferredSize(new Dimension(225, 350));
		TextAreaPan.add(DeliveryOrderList);

		JPanel SelectPan = new JPanel();
		FlowLayout fl_SelectPan = (FlowLayout) SelectPan.getLayout();
		LeftPan.add(SelectPan, BorderLayout.SOUTH);

		Selectbtn = new JButton("Select");
		SelectPan.add(Selectbtn);

		JPanel CenterPan = new JPanel();
		contentPane.getContentPane().add(CenterPan, BorderLayout.CENTER);
		CenterPan.setLayout(new BorderLayout(0, 0));

		JPanel panel_1 = new JPanel();
		CenterPan.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.NORTH);

		JPanel OrderPan = new JPanel();
		panel_2.add(OrderPan);
		OrderPan.setLayout(new GridLayout(4, 2, 0, 15));

		JLabel OrderNumberlbl = new JLabel("Order #:");
		OrderPan.add(OrderNumberlbl);

		OrderNumberlbl2 = new JLabel("");
		OrderPan.add(OrderNumberlbl2);

		JLabel RestaurantNumberlbl = new JLabel("Restaurant #:");
		OrderPan.add(RestaurantNumberlbl);

		RestaurantNumberlbl2 = new JLabel("");
		OrderPan.add(RestaurantNumberlbl2);

		JLabel DeliveryAddresslbl = new JLabel("Delivery Address: ");
		OrderPan.add(DeliveryAddresslbl);

		DeliveryAddresslbl2 = new JLabel("");
		OrderPan.add(DeliveryAddresslbl2);

		JLabel DeliveryPostalCodelbl = new JLabel("Delivery Postal Code:");
		OrderPan.add(DeliveryPostalCodelbl);

		DeliveryPostalCodelbl2 = new JLabel("");
		OrderPan.add(DeliveryPostalCodelbl2);

		JPanel panel = new JPanel();
		panel_1.add(panel);

		Completebtn = new JButton("Complete Consultation");
		panel.add(Completebtn);
		Completebtn.setFont(new Font("Arial", Font.PLAIN, 11));

		JPanel TopPan = new JPanel();
		CenterPan.add(TopPan, BorderLayout.NORTH);

		JLabel ViewDeliverylbl = new JLabel("View Delivery");
		TopPan.add(ViewDeliverylbl);
		ViewDeliverylbl.setHorizontalAlignment(SwingConstants.CENTER);
		ViewDeliverylbl.setFont(new Font("Arial", Font.PLAIN, 20));

		AcceptedDeliveryMI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeliveryAcceptView nw = new DeliveryAcceptView();
				nw.DAcceptScreen();
			}
		});

		ViewDeliveryMI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeliveryView nw = new DeliveryView();
				nw.DViewScreen();
			}
		});

		DeliveryMadeMI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeliveryDoneView nw = new DeliveryDoneView();
				nw.DDoneScreen();
			}
		});

	}

	public JFrame getContentPane() {
		return contentPane;
	}

	public void setContentPane(JFrame contentPane) {
		this.contentPane = contentPane;
	}

	public JMenuBar getMenuBar() {
		return menuBar;
	}

	public void setMenuBar(JMenuBar menuBar) {
		this.menuBar = menuBar;
	}

	public JMenu getFileMenu() {
		return FileMenu;
	}

	public void setFileMenu(JMenu fileMenu) {
		FileMenu = fileMenu;
	}

	public JMenuItem getDisconnectMI() {
		return DisconnectMI;
	}

	public void setDisconnectMI(JMenuItem disconnectMI) {
		DisconnectMI = disconnectMI;
	}

	public JMenuItem getCloseMI() {
		return CloseMI;
	}

	public void setCloseMI(JMenuItem closeMI) {
		CloseMI = closeMI;
	}

	public JMenu getDeliveryMenu() {
		return DeliveryMenu;
	}

	public void setDeliveryMenu(JMenu deliveryMenu) {
		DeliveryMenu = deliveryMenu;
	}

	public JMenuItem getViewDeliveryMI() {
		return ViewDeliveryMI;
	}

	public void setViewDeliveryMI(JMenuItem viewDeliveryMI) {
		ViewDeliveryMI = viewDeliveryMI;
	}

	public JMenuItem getAcceptedDeliveryMI() {
		return AcceptedDeliveryMI;
	}

	public void setAcceptedDeliveryMI(JMenuItem acceptedDeliveryMI) {
		AcceptedDeliveryMI = acceptedDeliveryMI;
	}

	public JMenuItem getDeliveryMadeMI() {
		return DeliveryMadeMI;
	}

	public void setDeliveryMadeMI(JMenuItem deliveryMadeMI) {
		DeliveryMadeMI = deliveryMadeMI;
	}

	public JLabel getRestaurantNumberlbl2() {
		return RestaurantNumberlbl2;
	}

	public void setRestaurantNumberlbl2(JLabel restaurantNumberlbl2) {
		RestaurantNumberlbl2 = restaurantNumberlbl2;
	}

	public JLabel getOrderNumberlbl2() {
		return OrderNumberlbl2;
	}

	public void setOrderNumberlbl2(JLabel orderNumberlbl2) {
		OrderNumberlbl2 = orderNumberlbl2;
	}

	public JLabel getDeliveryAddresslbl2() {
		return DeliveryAddresslbl2;
	}

	public void setDeliveryAddresslbl2(JLabel deliveryAddresslbl2) {
		DeliveryAddresslbl2 = deliveryAddresslbl2;
	}

	public JLabel getDeliveryPostalCodelbl2() {
		return DeliveryPostalCodelbl2;
	}

	public void setDeliveryPostalCodelbl2(JLabel deliveryPostalCodelbl2) {
		DeliveryPostalCodelbl2 = deliveryPostalCodelbl2;
	}

	public JButton getCompletebtn() {
		return Completebtn;
	}

	public void setCompletebtn(JButton completebtn) {
		Completebtn = completebtn;
	}

	public JButton getSelectbtn() {
		return Selectbtn;
	}

	public void setSelectbtn(JButton selectbtn) {
		Selectbtn = selectbtn;
	}

	public JTextArea getSelectionTA() {
		return SelectionTA;
	}

	public void setSelectionTA(JTextArea selectionTA) {
		SelectionTA = selectionTA;
	}

	public JList<String> getDeliveryOrderList() {
		return DeliveryOrderList;
	}

	public void setDeliveryOrderList(JList<String> deliveryOrderList) {
		DeliveryOrderList = deliveryOrderList;
	}

}
