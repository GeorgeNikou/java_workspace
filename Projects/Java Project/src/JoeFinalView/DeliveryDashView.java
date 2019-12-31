package view;

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
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.LineBorder;

public class DeliveryDashView extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu menuFile;
	private JMenuItem menuItemDisconnect;
	private JMenuItem menuItemQuit;
	private JMenu menuMenu;
	private JMenuItem menuItemCreateMenu;
	private JMenuItem menuItemEditMenu;
	private JMenuItem menuItemDeleteMenu;
	private JButton AcceptBtn;
	private JButton ViewBtn;
	private JButton EndBtn;
	
	
	
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeliveryDashView frame = new DeliveryDashView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public DeliveryDashView() {
		setTitle("Restaurant Delivery System");
		setFont(new Font("Arial", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 800);
		
		menuBar = new JMenuBar();
		menuBar.setFont(new Font("Arial", Font.PLAIN, 15));
		setJMenuBar(menuBar);
		
		menuFile = new JMenu("File");
		menuFile.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(menuFile);
		
		menuItemDisconnect = new JMenuItem("Disconnect");
		menuItemDisconnect.setFont(new Font("Arial", Font.PLAIN, 15));
		menuFile.add(menuItemDisconnect);
		
		menuItemQuit = new JMenuItem("Exit");
		menuItemQuit.setFont(new Font("Arial", Font.PLAIN, 15));
		menuFile.add(menuItemQuit);
		
		menuMenu = new JMenu("Options");
		menuMenu.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(menuMenu);
		
		menuItemCreateMenu = new JMenuItem("View Deliveries");
		menuItemCreateMenu.setFont(new Font("Arial", Font.PLAIN, 15));
		menuMenu.add(menuItemCreateMenu);
		
		menuItemEditMenu = new JMenuItem("Accept Deliveries");
		menuItemEditMenu.setFont(new Font("Arial", Font.PLAIN, 15));
		menuMenu.add(menuItemEditMenu);
		
		menuItemDeleteMenu = new JMenuItem("End Deliveries");
		menuItemDeleteMenu.setFont(new Font("Arial", Font.PLAIN, 15));
		menuMenu.add(menuItemDeleteMenu);
		
		contentPane = new JPanel();
		contentPane.setFont(new Font("Arial", Font.PLAIN, 15));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 250));
		contentPane.add(panel, BorderLayout.NORTH);
		FlowLayout fl_panel = new FlowLayout(FlowLayout.CENTER, 5, 5);
		panel.setLayout(fl_panel);
		
		JLabel lblWelcome = new JLabel("Delivery Options");
		lblWelcome.setBorder(new EmptyBorder(125, 0, 0, 0));
		lblWelcome.setFont(new Font("Arial", Font.BOLD, 40));
		panel.add(lblWelcome);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(200, 10));
		panel_4.add(panel_2, BorderLayout.WEST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setPreferredSize(new Dimension(200, 10));
		panel_4.add(panel_3, BorderLayout.EAST);
		
		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new GridLayout(4, 0, 0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new EmptyBorder(55, 0, 0, 0));
		FlowLayout flowLayout_1 = (FlowLayout) panel_7.getLayout();
		flowLayout_1.setVgap(20);
		panel_5.add(panel_7);
		
		JLabel lblDeliveryOptions = new JLabel("Delivery Options");
		lblDeliveryOptions.setFont(new Font("Arial", Font.PLAIN, 22));
		panel_7.add(lblDeliveryOptions);
		
		JPanel panel_8 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_8.getLayout();
		panel_5.add(panel_8);
		
		ViewBtn = new JButton("View Deliveries");
		panel_8.add(ViewBtn);
		ViewBtn.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		ViewBtn.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		ViewBtn.setPreferredSize(new Dimension(275, 50));
		
		JPanel panel_9 = new JPanel();
		panel_5.add(panel_9);
		
		AcceptBtn = new JButton("Accept Deliveries");
		panel_9.add(AcceptBtn);
		AcceptBtn.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		AcceptBtn.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		AcceptBtn.setPreferredSize(new Dimension(275, 50));
		
		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6);
		
		EndBtn = new JButton("End Deliveries");
		panel_6.add(EndBtn);
		EndBtn.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		EndBtn.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		EndBtn.setPreferredSize(new Dimension(275, 50));
		
		this.setVisible(false);
		
		menuItemCreateMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeliveryView nw = new DeliveryView();
				nw.DViewScreen();
			}
		
		});

		menuItemEditMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeliveryAcceptView nw = new DeliveryAcceptView();
				nw.DAcceptScreen();
			}
		});

		menuItemDeleteMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeliveryDoneView nw = new DeliveryDoneView();
				nw.DDoneScreen();
			}
			
			
		});
	}






	public JMenu getMenuFile() {
		return menuFile;
	}



	public void setMenuFile(JMenu menuFile) {
		this.menuFile = menuFile;
	}



	public JMenuItem getMenuItemDisconnect() {
		return menuItemDisconnect;
	}



	public void setMenuItemDisconnect(JMenuItem menuItemDisconnect) {
		this.menuItemDisconnect = menuItemDisconnect;
	}



	public JMenuItem getMenuItemQuit() {
		return menuItemQuit;
	}



	public void setMenuItemQuit(JMenuItem menuItemQuit) {
		this.menuItemQuit = menuItemQuit;
	}



	public JMenu getMenuMenu() {
		return menuMenu;
	}



	public void setMenuMenu(JMenu menuMenu) {
		this.menuMenu = menuMenu;
	}



	public JMenuItem getMenuItemCreateMenu() {
		return menuItemCreateMenu;
	}



	public void setMenuItemCreateMenu(JMenuItem menuItemCreateMenu) {
		this.menuItemCreateMenu = menuItemCreateMenu;
	}



	public JMenuItem getMenuItemEditMenu() {
		return menuItemEditMenu;
	}



	public void setMenuItemEditMenu(JMenuItem menuItemEditMenu) {
		this.menuItemEditMenu = menuItemEditMenu;
	}



	public JMenuItem getMenuItemDeleteMenu() {
		return menuItemDeleteMenu;
	}



	public void setMenuItemDeleteMenu(JMenuItem menuItemDeleteMenu) {
		this.menuItemDeleteMenu = menuItemDeleteMenu;
	}



	public JButton getAcceptBtn() {
		return AcceptBtn;
	}



	public void setAcceptBtn(JButton acceptBtn) {
		AcceptBtn = acceptBtn;
	}



	public JButton getViewBtn() {
		return ViewBtn;
	}



	public void setViewBtn(JButton viewBtn) {
		ViewBtn = viewBtn;
	}



	public JButton getEndBtn() {
		return EndBtn;
	}



	public void setEndBtn(JButton endBtn) {
		EndBtn = endBtn;
	}

}
