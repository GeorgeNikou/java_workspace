package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;

public class DeliveryCreateView {

	JFrame frame;
	private JTextField firstNametf;
	private JTextField lastNametf;
	private JTextField emailtf;
	private JTextField Phonetf;
	private JTextField DeliveryCodetf;
	private JButton AddAreaCodebtn;
	private JButton DeleteAreaCodebtn;
	private JButton Savebtn;

	private JMenuBar menuBar;
	private JMenu FileMenu;
	private JMenuItem DisconnectMI;
	private JMenuItem QuitMI;

	private JMenu ResMenu;
	private JMenuItem CreateResMI;
	private JMenuItem EditResMI;
	private JMenuItem DeleteResMI;

	private JMenu ResMenMenu;
	private JMenuItem CreateMenuMI;
	private JMenuItem EditMenuMI;
	private JMenuItem DeleteMenuMI;

	private JMenu DeliveryGuyMenu;
	private JMenuItem CreateDeliveryGuyMI;
	private JMenuItem EditDeliveryGuyMI;
	private JMenuItem DeleteDeliveryGuyMI;

	private JButton Selectbtn;
	private JList DeliveryManList;
	private JTextField textField;
	private JTextField emailTF;
	private JTextField addressTF;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					DeliveryCreateView window = new DeliveryCreateView();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 * 
	 * @wbp.parser.entryPoint
	 */
	public DeliveryCreateView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel mainPanel = new JPanel();

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
//		
		FileMenu = new JMenu("File");
		menuBar.add(FileMenu);
//		
		DisconnectMI = new JMenuItem("Disconnect");
		FileMenu.add(DisconnectMI);

		QuitMI = new JMenuItem("Quit");
		FileMenu.add(QuitMI);

		QuitMI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(frame, "Close this application?");

				if (result == JOptionPane.OK_OPTION)
					System.exit(0);
			}

		});

		ResMenu = new JMenu("Restaurant");
		menuBar.add(ResMenu);

		CreateResMI = new JMenuItem("Create");
		ResMenu.add(CreateResMI);

		EditResMI = new JMenuItem("Edit");
		ResMenu.add(EditResMI);

		DeleteResMI = new JMenuItem("Delete");
		ResMenu.add(DeleteResMI);

		ResMenMenu = new JMenu("Menu");
		menuBar.add(ResMenMenu);

		CreateMenuMI = new JMenuItem("Create");
		ResMenMenu.add(CreateMenuMI);

		EditMenuMI = new JMenuItem("Edit");
		ResMenMenu.add(EditMenuMI);

		DeleteMenuMI = new JMenuItem("Delete");
		ResMenMenu.add(DeleteMenuMI);

		DeliveryGuyMenu = new JMenu("Delivery Guy");
		menuBar.add(DeliveryGuyMenu);

		CreateDeliveryGuyMI = new JMenuItem("Create");
		DeliveryGuyMenu.add(CreateDeliveryGuyMI);

		EditDeliveryGuyMI = new JMenuItem("Edit");
		DeliveryGuyMenu.add(EditDeliveryGuyMI);

		DeleteDeliveryGuyMI = new JMenuItem("Delete");
		DeliveryGuyMenu.add(DeleteDeliveryGuyMI);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel CenterPan = new JPanel();
		frame.getContentPane().add(CenterPan, BorderLayout.CENTER);
		CenterPan.setLayout(new BorderLayout(0, 0));

		JPanel TopCenter = new JPanel();
		CenterPan.add(TopCenter, BorderLayout.NORTH);
		TopCenter.setLayout(new BorderLayout(0, 0));

		JPanel LabelPan = new JPanel();
		TopCenter.add(LabelPan, BorderLayout.NORTH);
		LabelPan.setLayout(new BorderLayout(0, 0));

		JLabel AddDeliverylbl = new JLabel("Edit Delivery Guy");
		AddDeliverylbl.setHorizontalAlignment(SwingConstants.CENTER);
		LabelPan.add(AddDeliverylbl);
		AddDeliverylbl.setFont(new Font("Arial", Font.BOLD, 20));
		// frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel Title = new JPanel();
		TopCenter.add(Title, BorderLayout.CENTER);
		Title.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel = new JPanel();
		Title.add(panel);

		JLabel firstNamelbl = new JLabel("Name: ");
		panel.add(firstNamelbl);
		firstNamelbl.setHorizontalAlignment(SwingConstants.LEFT);

		firstNametf = new JTextField();
		panel.add(firstNametf);
		firstNametf.setHorizontalAlignment(SwingConstants.RIGHT);
		firstNametf.setColumns(12);

		JLabel lastNamelbl = new JLabel("Last Name");
		panel.add(lastNamelbl);

		textField = new JTextField();
		panel.add(textField);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setColumns(12);

		JLabel Emaillbl = new JLabel("Email");
		panel.add(Emaillbl);

		emailTF = new JTextField();
		panel.add(emailTF);
		emailTF.setColumns(17);

		JPanel TelephonePan = new JPanel();
		TopCenter.add(TelephonePan, BorderLayout.SOUTH);
		FlowLayout flowLayout = (FlowLayout) TelephonePan.getLayout();
		TelephonePan.setSize(10, 50);

		JLabel Telephonelbl = new JLabel("Telephone: ");
		TelephonePan.add(Telephonelbl);

		Phonetf = new JTextField();
		TelephonePan.add(Phonetf);
		Phonetf.setText("");
		Phonetf.setColumns(15);

		JLabel addreslbl = new JLabel("Address:");
		TelephonePan.add(addreslbl);

		addressTF = new JTextField();
		TelephonePan.add(addressTF);
		addressTF.setColumns(29);

		JPanel MiddlePan = new JPanel();
		CenterPan.add(MiddlePan, BorderLayout.CENTER);
		MiddlePan.setLayout(new BorderLayout(0, 0));

		JPanel DeliveryAreaPan1 = new JPanel();
		MiddlePan.add(DeliveryAreaPan1, BorderLayout.NORTH);

		JPanel DeliveryAreaPan = new JPanel();
		DeliveryAreaPan1.add(DeliveryAreaPan);
		DeliveryAreaPan.setLayout(new BorderLayout(0, 0));

		JLabel DeliveryArealbl = new JLabel("Delivery Area");
		DeliveryArealbl.setHorizontalAlignment(SwingConstants.CENTER);
		DeliveryArealbl.setFont(new Font("Arial", Font.BOLD, 20));
		DeliveryAreaPan.add(DeliveryArealbl, BorderLayout.NORTH);

		JList DeliveryAreaList = new JList();
		DeliveryAreaList.setBorder(new LineBorder(new Color(0, 0, 0)));
		DeliveryAreaList.setVisibleRowCount(20);
		DeliveryAreaList.setPreferredSize(new Dimension(348, 100));
		DeliveryAreaPan.add(DeliveryAreaList, BorderLayout.SOUTH);

		JPanel CenterPan1 = new JPanel();
		MiddlePan.add(CenterPan1, BorderLayout.CENTER);
		CenterPan1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel AddDeleteSubmitPan = new JPanel();
		CenterPan1.add(AddDeleteSubmitPan);
		AddDeleteSubmitPan.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel DeliveryAreaTAPan = new JPanel();
		AddDeleteSubmitPan.add(DeliveryAreaTAPan);
		DeliveryAreaTAPan.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel AddDeliveryArea = new JPanel();
		DeliveryAreaTAPan.add(AddDeliveryArea);

		JLabel lblNewLabel = new JLabel("Delivery Area Code :");
		AddDeliveryArea.add(lblNewLabel);

		DeliveryCodetf = new JTextField();
		AddDeliveryArea.add(DeliveryCodetf);
		DeliveryCodetf.setColumns(25);

		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(10, 50));
		panel_1.setFont(new Font("Arial", Font.BOLD, 12));
		panel_1.setBorder(new EmptyBorder(10, 10, 0, 10));
		DeliveryAreaTAPan.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);

		AddAreaCodebtn = new JButton("Add delivery Area");
		AddAreaCodebtn.setHorizontalAlignment(SwingConstants.LEFT);

		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		panel_2.add(AddAreaCodebtn);
		AddAreaCodebtn.setFont(new Font("Tahoma", Font.BOLD, 12));

		DeleteAreaCodebtn = new JButton("Delete delivery Area");
		panel_2.add(DeleteAreaCodebtn);
		DeleteAreaCodebtn.setFont(new Font("Tahoma", Font.BOLD, 12));

		JPanel SubmitPan = new JPanel();
		DeliveryAreaTAPan.add(SubmitPan);

		Savebtn = new JButton("Save");
		Savebtn.setFont(new Font("Tahoma", Font.BOLD, 12));
//				Savebtn.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent arg0) {
//						DefaultListModel dim = new DefaultListModel();
//						for (int i = 0; i < 10; i++) {
//							dim.addElement(Nametf);
//						}
//					}
//				});
		SubmitPan.add(Savebtn);

		JPanel RightPan = new JPanel();
		frame.getContentPane().add(RightPan, BorderLayout.EAST);
		RightPan.setLayout(new BorderLayout(0, 0));

		JPanel TitlePan = new JPanel();
		RightPan.add(TitlePan, BorderLayout.NORTH);
		TitlePan.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel DeliveryManlbl = new JLabel("Delivery Man");
		TitlePan.add(DeliveryManlbl);
		DeliveryManlbl.setFont(new Font("Arial", Font.BOLD, 14));

		JPanel ListPan = new JPanel();
		RightPan.add(ListPan, BorderLayout.CENTER);
		ListPan.setLayout(new BorderLayout(0, 0));

		DeliveryManList = new JList();
		DeliveryManList.setBorder(new LineBorder(new Color(0, 0, 0)));
		DeliveryManList.setVisibleRowCount(20);
		DeliveryManList.setPreferredSize(new Dimension(225, 350));
		ListPan.add(DeliveryManList, BorderLayout.NORTH);

		JPanel SelectPan = new JPanel();
		ListPan.add(SelectPan);
		FlowLayout fl_SelectPan = (FlowLayout) SelectPan.getLayout();

		Selectbtn = new JButton("Select");
		SelectPan.add(Selectbtn);

		frame.setVisible(false);

		this.setVisible(false);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getNametf() {
		return firstNametf;
	}

	public void setNametf(JTextField nametf) {
		firstNametf = nametf;
	}

	public JTextField getPhonetf() {
		return Phonetf;
	}

	public void setPhonetf(JTextField phonetf) {
		Phonetf = phonetf;
	}

	public JTextField getAddtf() {
		return DeliveryCodetf;
	}

	public void setAddtf(JTextField addtf) {
		DeliveryCodetf = addtf;
	}

	public JButton getSavebtn() {
		return Savebtn;
	}

	public void setSavebtn(JButton savebtn) {
		Savebtn = savebtn;
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

	public JMenuItem getQuitMI() {
		return QuitMI;
	}

	public void setQuitMI(JMenuItem quitMI) {
		QuitMI = quitMI;
	}

	public JMenu getDeliveryGuyMenu() {
		return DeliveryGuyMenu;
	}

	public void setDeliveryGuyMenu(JMenu deliveryGuyMenu) {
		DeliveryGuyMenu = deliveryGuyMenu;
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

	public JMenu getResMenu() {
		return ResMenu;
	}

	public void setResMenu(JMenu ResMenu) {
		this.ResMenu = ResMenu;
	}

	public JMenuItem getCreateResMI() {
		return CreateResMI;
	}

	public void setCreateResMI(JMenuItem createResMI) {
		CreateResMI = createResMI;
	}

	public JMenuItem getEditResMI() {
		return EditResMI;
	}

	public void setEditResMI(JMenuItem editResMI) {
		EditResMI = editResMI;
	}

	public JMenuItem getDeleteResMI() {
		return DeleteResMI;
	}

	public void setDeleteResMI(JMenuItem deleteResMI) {
		DeleteResMI = deleteResMI;
	}

	public JMenu getResMenMenu() {
		return ResMenMenu;
	}

	public void setResMenMenu(JMenu resMenMenu) {
		ResMenMenu = resMenMenu;
	}

	public JMenuItem getCreateMenuMI() {
		return CreateMenuMI;
	}

	public void setCreateMenuMI(JMenuItem createMenuMI) {
		CreateMenuMI = createMenuMI;
	}

	public JMenuItem getEditMenuMI() {
		return EditMenuMI;
	}

	public void setEditMenuMI(JMenuItem editMenuMI) {
		EditMenuMI = editMenuMI;
	}

	public JMenuItem getDeleteMenuMI() {
		return DeleteMenuMI;
	}

	public void setDeleteMenuMI(JMenuItem deleteMenuMI) {
		DeleteMenuMI = deleteMenuMI;
	}

	public JTextField getDeliveryCodetf() {
		return DeliveryCodetf;
	}

	public void setDeliveryCodetf(JTextField deliveryCodetf) {
		DeliveryCodetf = deliveryCodetf;
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub

	}

	public JButton getSelectbtn() {
		return Selectbtn;
	}

	public void setSelectbtn(JButton selectbtn) {
		Selectbtn = selectbtn;
	}

	public JList getDeliveryManList() {
		return DeliveryManList;
	}

	public void setDeliveryManList(JList deliveryManList) {
		DeliveryManList = deliveryManList;
	}

	public JTextField getFirstNametf() {
		return firstNametf;
	}

	public void setFirstNametf(JTextField firstNametf) {
		this.firstNametf = firstNametf;
	}

	public JTextField getLastNametf() {
		return lastNametf;
	}

	public void setLastNametf(JTextField lastNametf) {
		this.lastNametf = lastNametf;
	}

	public JTextField getEmailtf() {
		return emailtf;
	}

	public void setEmailtf(JTextField emailtf) {
		this.emailtf = emailtf;
	}

	public JButton getAddAreaCodebtn() {
		return AddAreaCodebtn;
	}

	public void setAddAreaCodebtn(JButton addAreaCodebtn) {
		AddAreaCodebtn = addAreaCodebtn;
	}

	public JButton getDeleteAreaCodebtn() {
		return DeleteAreaCodebtn;
	}

	public void setDeleteAreaCodebtn(JButton deleteAreaCodebtn) {
		DeleteAreaCodebtn = deleteAreaCodebtn;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getEmailTF() {
		return emailTF;
	}

	public void setEmailTF(JTextField emailTF) {
		this.emailTF = emailTF;
	}

	public JTextField getAddressTF() {
		return addressTF;
	}

	public void setAddressTF(JTextField addressTF) {
		this.addressTF = addressTF;
	}

}
