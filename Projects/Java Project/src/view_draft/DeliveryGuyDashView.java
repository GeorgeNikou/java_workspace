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
import javax.swing.BoxLayout;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.LineBorder;

public class DeliveryGuyDashView extends JFrame {

	private JPanel contentPane;
	private JMenu menuFile;
	private JMenuItem DisconnectMI;
	private JMenuItem QuitMI;
	
	private JMenu menuMenu;
	private JMenuItem CreateDeliveryGuyMI;
	private JMenuItem EditDeliveryGuyMI;
	private JMenuItem DeleteDeliveryGuyMI;
	
	private JButton Createbtn;
	private JButton Editbtn;
	private JButton Deletebtn;
	
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
	public DeliveryGuyDashView() {
		setTitle("Restaurant Delivery System");
		setFont(new Font("Arial", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 800);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Arial", Font.PLAIN, 15));
		setJMenuBar(menuBar);
		
		menuFile = new JMenu("File");
		menuFile.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(menuFile);
		
		DisconnectMI = new JMenuItem("Disconnect");
		DisconnectMI.setFont(new Font("Arial", Font.PLAIN, 15));
		menuFile.add(DisconnectMI);
		
		QuitMI = new JMenuItem("Exit");
		QuitMI.setFont(new Font("Arial", Font.PLAIN, 15));
		menuFile.add(QuitMI);
		
		menuMenu = new JMenu("Options");
		menuMenu.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(menuMenu);
		
		CreateDeliveryGuyMI = new JMenuItem("Create Delivery Guy");
		CreateDeliveryGuyMI.setFont(new Font("Arial", Font.PLAIN, 15));
		menuMenu.add(CreateDeliveryGuyMI);
		
		EditDeliveryGuyMI = new JMenuItem("Edit Delivery Guy");
		EditDeliveryGuyMI.setFont(new Font("Arial", Font.PLAIN, 15));
		menuMenu.add(EditDeliveryGuyMI);
		
		DeleteDeliveryGuyMI = new JMenuItem("Delete Delivery Guy");
		DeleteDeliveryGuyMI.setFont(new Font("Arial", Font.PLAIN, 15));
		menuMenu.add(DeleteDeliveryGuyMI);
		
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
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setBorder(new EmptyBorder(125, 0, 0, 0));
		lblWelcome.setFont(new Font("Arial", Font.BOLD, 40));
		panel.add(lblWelcome);
		
		JLabel lblgetname = new JLabel(" .getName()");
		lblgetname.setFont(new Font("Arial", Font.BOLD, 40));
		lblgetname.setBorder(new EmptyBorder(125, 0, 0, 0));
		panel.add(lblgetname);
		
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
		
		Createbtn = new JButton("Create Delivery Guy");
		panel_8.add(Createbtn);
		Createbtn.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		Createbtn.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		Createbtn.setPreferredSize(new Dimension(275, 50));
		
		JPanel panel_9 = new JPanel();
		panel_5.add(panel_9);
		
		Editbtn = new JButton("Edit Delivery Guy");
		panel_9.add(Editbtn);
		Editbtn.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		Editbtn.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		Editbtn.setPreferredSize(new Dimension(275, 50));
		
		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6);
		
		Deletebtn = new JButton("Delete Delivery Guy");
		panel_6.add(Deletebtn);
		Deletebtn.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		Deletebtn.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		Deletebtn.setPreferredSize(new Dimension(275, 50));
		
		this.setVisible(false);
	}

	public JMenu getMenuFile() {
		return menuFile;
	}

	public void setMenuFile(JMenu menuFile) {
		this.menuFile = menuFile;
	}

	public JMenuItem getDisconnectMI() {
		return DisconnectMI;
	}

	public void setDisconnectMI(JMenuItem disconnectMI) {
		DisconnectMI = disconnectMI;
	}

	public JMenuItem getQuitMI() {
		return QuitMI;
	}

	public void setQuitMI(JMenuItem quitMI) {
		QuitMI = quitMI;
	}

	public JMenu getMenuMenu() {
		return menuMenu;
	}

	public void setMenuMenu(JMenu menuMenu) {
		this.menuMenu = menuMenu;
	}

	public JMenuItem getCreateDeliveryGuyMI() {
		return CreateDeliveryGuyMI;
	}

	public void setCreateDeliveryGuyMI(JMenuItem createDeliveryGuyMI) {
		CreateDeliveryGuyMI = createDeliveryGuyMI;
	}

	public JMenuItem getEditDeliveryGuyMI() {
		return EditDeliveryGuyMI;
	}

	public void setEditDeliveryGuyMI(JMenuItem editDeliveryGuyMI) {
		EditDeliveryGuyMI = editDeliveryGuyMI;
	}

	public JMenuItem getDeleteDeliveryGuyMI() {
		return DeleteDeliveryGuyMI;
	}

	public void setDeleteDeliveryGuyMI(JMenuItem deleteDeliveryGuyMI) {
		DeleteDeliveryGuyMI = deleteDeliveryGuyMI;
	}

	public JButton getCreatebtn() {
		return Createbtn;
	}

	public void setCreatebtn(JButton createbtn) {
		Createbtn = createbtn;
	}

	public JButton getEditbtn() {
		return Editbtn;
	}

	public void setEditbtn(JButton editbtn) {
		Editbtn = editbtn;
	}

	public JButton getDeletebtn() {
		return Deletebtn;
	}

	public void setDeletebtn(JButton deletebtn) {
		Deletebtn = deletebtn;
	}

	
}
