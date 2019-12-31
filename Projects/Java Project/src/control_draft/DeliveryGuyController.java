package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JOptionPane;

import OtherStuff.DeliveryDashboardView;
import model.DeliveryModel;
import view.DeliveryAcceptView;
import view.DeliveryCreateView;
import view.DeliveryDeleteView;
import view.DeliveryDoneView;
import view.DeliveryEditView;
import view.DeliveryView;

public abstract class DeliveryGuyController implements ActionListener {
	
	private static final AbstractButton AcceptedDeliveryMI = null;
	private static final AbstractButton ViewDeliveryMI = null;
	private static final AbstractButton DeliveryMadeMI = null;
	private static DeliveryModel model;
	private static DeliveryDashboardView Deliveryview;
	private static DeliveryEditView Editview;
	private static DeliveryCreateView Createview;	
	private static DeliveryDeleteView Deleteview;
	public AdminDash adminView;
	public LoginView loginView;
	
	
	public DeliveryGuyController(DeliveryModel model, DeliveryDashboardView Deliveryview, DeliveryCreateView Createview, 
			DeliveryEditView Editview, DeliveryDeleteView Deleteview) {
		this.model = model;
		this.Deliveryview = Deliveryview;
		this.Editview = Editview;
		this.Createview = Createview;
		this.Deleteview = Deleteview;
		
		Createview.getFileMenu().getItem(0).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(Createview, "Are you sure you want to disconnect?");

				if (temp == 0) {

					loginView.getText_field1().setText("");
					loginView.getText_field2().setText("");
					Createview.setVisible(false);
					loginView.setVisible(true);

				} else if (temp == 1) {
					JOptionPane.showMessageDialog(Createview, "Bringing you back to the restaurant create page");
					Createview.setVisible(true);
				} else {
					System.out.println("cancel");
				}

			}
		});

		Createview.getFileMenu().getItem(1).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(Createview, "Are you sure you want like to quit?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(Createview, "Program will now close\n" + "            " + "Goodbye!");
					Createview.dispose();
				}

			}
		});
		
		Editview.getFileMenu().getItem(0).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(Editview, "Are you sure you want to disconnect?");

				if (temp == 0) {

					loginView.getText_field1().setText("");
					loginView.getText_field2().setText("");
					Editview.setVisible(false);
					loginView.setVisible(true);

				} else if (temp == 1) {
					JOptionPane.showMessageDialog(Editview, "Bringing you back to the restaurant edit page");
					Editview.setVisible(true);
				} else {
					System.out.println("cancel");
				}

			}
		});

		Editview.getFileMenu().getItem(1).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(Editview, "Are you sure you want like to quit?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(Editview, "Program will now close\n" + "            " + "Goodbye!");
					Editview.dispose();
				}

			}
		});
		
		
		//restaurant edit menu (file)
		Deleteview.getMnFile().getItem(0).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(Deleteview, "Are you sure you want to disconnect?");

				if (temp == 0) {

					loginView.getText_field1().setText("");
					loginView.getText_field2().setText("");
					Deleteview.setVisible(false);
					loginView.setVisible(true);

				} else if (temp == 1) {
					JOptionPane.showMessageDialog(Deleteview, "Bringing you back to the restaurant delete page");
					Deleteview.setVisible(true);
				} else {
					System.out.println("cancel");
				}

			}
		});

		Deleteview.getFileMenu().getItem(1).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(Deleteview, "Are you sure you want like to quit?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(Deleteview, "Program will now close\n" + "            " + "Goodbye!");
					Deleteview.dispose();
				}

			}
		});
		
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

		Createview.getSavebtn().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
}
