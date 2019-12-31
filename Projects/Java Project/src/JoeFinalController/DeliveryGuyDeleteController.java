package Controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import model.DTO;
import model.DeliveryGuyBean;
import model.DeliveryGuyDAO;
import model.DeliveryGuyModel;
import model.DeliveryModel;
import model.UserBean;
import model.UserDAO;
import model.UserModel;
import view.DeliveryDeleteView;
import view.LoginView;

public class DeliveryGuyDeleteController implements ActionListener {
	
	private DTO arrays;
	private LoginView loginView;
	private DeliveryGuyBean deliveryGuyBean;
	private DeliveryGuyDAO deliveryDAO;
	private DeliveryModel deliveryModel;
	private DeliveryDeleteView deliveryDelete;
	private DeliveryGuyModel deliveryGuyModel;
	
	private UserBean userBean;
	private UserDAO userDAO;
	private UserModel userModel;
	
	public DeliveryGuyDeleteController() {
		 userModel = new UserModel();
		 deliveryDelete =  new DeliveryDeleteView();
		 
			DefaultListModel<String> listModel = new DefaultListModel<>();
			listModel.setSize(0);
			for (UserBean user : UserDAO.getAllUsers()) {
				
				if(user.getId() == 2) {
					
					listModel.addElement(user.getUserName());
					
				}
				
					
			}
				
			deliveryDelete.getDeliveryManList().setModel(listModel);
			deliveryDelete.getDeliveryManList().addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e) {
					DeliveryGuyBean deliveryGuy = deliveryModel.getSingleDelivery((String) deliveryDelete.getDeliveryManList().getSelectedValue());
					try {
						deliveryDelete.getFirstNametf().setText(deliveryGuy.getFirstName());
						deliveryDelete.getLastNametf().setText(deliveryGuy.getLastName());
						deliveryDelete.getEmailtf().setText(deliveryGuy.getEmail());
						deliveryDelete.getPhonetf().setText(deliveryGuy.getEmail());
						
						System.out.println(deliveryGuy);
					}catch (Exception e1) {
						// TODO: handle exception
					}
					
					
				}
			});
			
			deliveryDelete.getSelectbtn().addActionListener(new ActionListener() {
				
//				@Override
				public void actionPerformed(ActionEvent e) {
					DeliveryGuyBean delivery = deliveryGuyModel.getSingleDeliveryMan() deliveryDelete.getDeliveryManList().getSelectedValue());
					int reply = JOptionPane.showConfirmDialog(null,
							"Are You Sure You want to Delete this user?", "Delete",
							JOptionPane.YES_NO_OPTION);
					if (reply == JOptionPane.YES_OPTION)
						DeliveryGuyModel.deleteDeliveryGuy(delivery);
					loginView.setVisible(false);
					
				}
			});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
