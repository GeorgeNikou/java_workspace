package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.AdminDash;
import view.DeliveryAcceptView;
import view.DeliveryCreateView;
import view.DeliveryDeleteView;
import view.DeliveryDoneView;
import view.DeliveryEditView;
import view.DeliveryView;
import view.LoginView;

public class MenuBar1DeliveryView {

	public AdminDash adminView;
	public LoginView loginView;
	public DeliveryCreateView deliveryCreate;
	public DeliveryEditView deliveryEdit;
	public DeliveryDeleteView deliveryDelete;
	public DeliveryAcceptView deliveryAccept;
	public DeliveryDoneView deliveryDone;
	public DeliveryView deliveryView;
	
	public MenuBar1DeliveryView(LoginView loginView, AdminDash adminView, DeliveryCreateView deliveryCreate, DeliveryDeleteView deliveryDelete,
			DeliveryAcceptView deliveryAccept, DeliveryDoneView deliveryDone, DeliveryView deliveryView, DeliveryEditView deliveryEdit) {
		this.loginView = loginView;
		this.adminView = adminView;
		this.deliveryCreate = deliveryCreate;
		this.deliveryEdit = deliveryEdit;	
		this.deliveryDelete = deliveryDelete;
		this.deliveryAccept = deliveryAccept;
		this.deliveryDone = deliveryDone;
		this.deliveryView = deliveryView;

//		=========================Disconnect====================
		
		deliveryCreate.getFileMenu().getItem(0).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(adminView, deliveryCreate, "Are you sure you want to disconnect?", JOptionPane.OK_CANCEL_OPTION);

				if (temp == 0) {

					loginView.getText_field1().setText("");
					loginView.getText_field2().setText("");
					deliveryCreate.setVisible(false);
					loginView.setVisible(true);	

				} else if (temp == 1) {
					JOptionPane.showMessageDialog(adminView, deliveryCreate, "Bringing you back to the admin's main page now", JOptionPane.OK_CANCEL_OPTION);
					adminView.setVisible(true);
				} else {
					System.out.println("cancel");
				}

			}
		});
		
		deliveryEdit.getFileMenu().getItem(0).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(adminView, deliveryCreate, "Are you sure you want to disconnect?", JOptionPane.OK_CANCEL_OPTION);

				if (temp == 0) {

					loginView.getText_field1().setText("");
					loginView.getText_field2().setText("");
					deliveryEdit.setVisible(false);
					loginView.setVisible(true);	

				} else if (temp == 1) {
					JOptionPane.showMessageDialog(adminView, deliveryEdit, "Bringing you back to the admin's main page now", JOptionPane.OK_CANCEL_OPTION);
					adminView.setVisible(true);
				} else {
					System.out.println("cancel");
				}

			}
		});
		
		deliveryDelete.getFileMenu().getItem(0).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(adminView, deliveryDelete, "Are you sure you want to disconnect?", JOptionPane.OK_CANCEL_OPTION);

				if (temp == 0) {

					loginView.getText_field1().setText("");
					loginView.getText_field2().setText("");
					deliveryDelete.setVisible(false);
					loginView.setVisible(true);	

				} else if (temp == 1) {
					JOptionPane.showMessageDialog(adminView, deliveryDelete, "Bringing you back to the admin's main page now", JOptionPane.OK_CANCEL_OPTION);
					adminView.setVisible(true);
				} else {
					System.out.println("cancel");
				}

			}
		});
		
		deliveryAccept.getFileMenu().getItem(0).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(adminView, deliveryAccept, "Are you sure you want to disconnect?", JOptionPane.OK_CANCEL_OPTION);

				if (temp == 0) {

					loginView.getText_field1().setText("");
					loginView.getText_field2().setText("");
					deliveryAccept.setVisible(false);
					loginView.setVisible(true);	

				} else if (temp == 1) {
					JOptionPane.showMessageDialog(adminView, deliveryAccept, "Bringing you back to the admin's main page now", JOptionPane.OK_CANCEL_OPTION);
					adminView.setVisible(true);
				} else {
					System.out.println("cancel");
				}

			}
		});
		
		deliveryDone.getFileMenu().getItem(0).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(adminView, deliveryDone, "Are you sure you want to disconnect?", JOptionPane.OK_CANCEL_OPTION);

				if (temp == 0) {

					loginView.getText_field1().setText("");
					loginView.getText_field2().setText("");
					deliveryDone.setVisible(false);
					loginView.setVisible(true);	

				} else if (temp == 1) {
					JOptionPane.showMessageDialog(adminView, deliveryDone, "Bringing you back to the admin's main page now", JOptionPane.OK_CANCEL_OPTION);
					adminView.setVisible(true);
				} else {
					System.out.println("cancel");
				}

			}
		});
		
		deliveryView.getFileMenu().getItem(0).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(adminView, deliveryView, "Are you sure you want to disconnect?", JOptionPane.OK_CANCEL_OPTION);

				if (temp == 0) {

					loginView.getText_field1().setText("");
					loginView.getText_field2().setText("");
					deliveryView.setVisible(false);
					loginView.setVisible(true);	

				} else if (temp == 1) {
					JOptionPane.showMessageDialog(adminView, deliveryView, "Bringing you back to the admin's main page now", JOptionPane.OK_CANCEL_OPTION);
					adminView.setVisible(true);
				} else {
					System.out.println("cancel");
				}

			}
		});
		
//		================================Quit======================

		deliveryCreate.getFileMenu().getItem(1).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(adminView, "Are you sure you want like to quit?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(adminView, deliveryCreate, "Program will now close\n" + "            " + "Goodbye!", JOptionPane.OK_CANCEL_OPTION);
					deliveryCreate.dispose();
				}

			}
		});
		
		deliveryEdit.getFileMenu().getItem(1).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(adminView, "Are you sure you want like to quit?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(adminView, deliveryEdit, "Program will now close\n" + "            " + "Goodbye!", JOptionPane.OK_CANCEL_OPTION);
					deliveryEdit.dispose();
				}

			}
		});

		
		deliveryDelete.getFileMenu().getItem(1).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(adminView, "Are you sure you want like to quit?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(adminView, deliveryDelete, "Program will now close\n" + "            " + "Goodbye!", JOptionPane.OK_CANCEL_OPTION);
					deliveryDelete.dispose();
				}

			}
		});

		
		deliveryAccept.getFileMenu().getItem(1).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(adminView, "Are you sure you want like to quit?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(adminView, deliveryAccept, "Program will now close\n" + "            " + "Goodbye!", JOptionPane.OK_CANCEL_OPTION);
					deliveryAccept.dispose();
				}

			}
		});

		
		deliveryDone.getFileMenu().getItem(1).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(adminView, "Are you sure you want like to quit?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(adminView, deliveryDone, "Program will now close\n" + "            " + "Goodbye!", JOptionPane.OK_CANCEL_OPTION);
					deliveryDone.dispose();
				}

			}
		});

		
		deliveryView.getFileMenu().getItem(1).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(adminView, "Are you sure you want like to quit?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(adminView, deliveryView, "Program will now close\n" + "            " + "Goodbye!", JOptionPane.OK_CANCEL_OPTION);
					deliveryView.dispose();
				}

			}
		});


	}

}
