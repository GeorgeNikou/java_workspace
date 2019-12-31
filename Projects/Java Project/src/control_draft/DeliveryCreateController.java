package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.DTO;
import model.DeliveryBean;
import model.DeliveryDAO;
import model.DeliveryModel;
import model_draft.UserBean;
import model_draft.UserDAO;
import model_draft.UserModel;
import view.DeliveryCreateView;

public class DeliveryCreateController implements ActionListener {
	private DTO arrays;
	
	private DeliveryBean deliveryBean;
	private DeliveryDAO deliveryDAO;
	private DeliveryModel deliveryModel;
	private DeliveryCreateView deliveryCreateView;
	
	private UserBean userBean;
	private UserDAO userDAO;
	private UserModel userModel;

public void DeliveryGuyCreateSaveController(DeliveryModel deliveryModel, DeliveryCreateView deliveryCreateView) {
	this.deliveryModel = deliveryModel;
	this.deliveryCreateView = deliveryCreateView;
	
	
	deliveryCreateView.getSavebtn().addActionListener(this);
	
	}

	public void actionPerformed(ActionEvent arg0) {
		
		if (!deliveryCreateView.getNametf().getText().equals("") 
				&& !deliveryCreateView.getPhonetf().getText().equals("") 
				&& !deliveryCreateView.getDeliveryAreaTA().getText().equals("") 
				&& !deliveryCreateView.getDeliveryCodetf().getText().equals("")) {
			
			deliveryModel.createNewDeliveryGuy(
					new DeliveryBean(deliveryCreateView.getNametf().getText(), 
							deliveryCreateView.getPhonetf().getText(), 
					deliveryCreateView.getDeliveryAreaTA().getText(), 
					deliveryCreateView.getDeliveryCodetf().getText())
					);
			
//			System.out.println(deliveryModel.getAllClients() + "\n ");
			
			deliveryCreateView.setVisible(false);
			
		} else {
			JOptionPane.showMessageDialog(null, "Invalid Entry", "Missing one or a few Field(s)!",
					JOptionPane.ERROR_MESSAGE);
		}

			
		}
	}
	
