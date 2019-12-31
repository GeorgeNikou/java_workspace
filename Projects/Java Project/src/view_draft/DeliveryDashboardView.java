package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class DeliveryDashboardView {

	private JFrame frame;
	private JMenuBar menuBar;
	
	private JMenu FileMenu;
	private JMenuItem DisconnectMI;
	private JMenuItem QuitMI;
	
	private JMenu DeliveryMenu;
	private JMenuItem ViewDeliveryMI;
	private JMenuItem AcceptedDeliveryMI;
	private JMenuItem DeliveryMadeMI;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeliveryDashboardView window = new DeliveryDashboardView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DeliveryDashboardView() {
	 {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		FileMenu = new JMenu("File");
		menuBar.add(FileMenu);
		
		DisconnectMI = new JMenuItem("Disconnect");
		FileMenu.add(DisconnectMI);
		
		JMenuItem QuitMI = new JMenuItem("Quit");
		FileMenu.add(QuitMI);
		
		QuitMI.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(frame, "Close this application?");
			
			if(result == JOptionPane.OK_OPTION)
				System.exit(0);
		}});
		
		
		
		DeliveryMenu = new JMenu("Delivery");
		menuBar.add(DeliveryMenu);
		
	ViewDeliveryMI = new JMenuItem("View Deliveries");
		DeliveryMenu.add(ViewDeliveryMI);
		

		
		AcceptedDeliveryMI = new JMenuItem("Accepted Deliveries");
		DeliveryMenu.add(AcceptedDeliveryMI);
		

		
		 DeliveryMadeMI = new JMenuItem("Delivery Made");
		DeliveryMenu.add(DeliveryMadeMI);
		
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
}