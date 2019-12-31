package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.DTO;
import model.DeliveryGuyBean;
import model.DeliveryDAO;
import model.DeliveryModel;
import model.UserBean;
import model.UserDAO;
import model.UserModel;
import view.DeliveryCreateView;

public class DeliveryGuyCreateController implements ActionListener {
	private DTO arrays;
	private DeliveryGuyBean deliveryBean;
	private DeliveryDAO deliveryDAO;
	private DeliveryModel deliveryModel;
	private DeliveryCreateView deliveryCreateView;
	private UserBean userBean;
	private UserDAO userDAO;
	private UserModel userModel;

	public DeliveryGuyCreateController(DeliveryModel deliveryModel2, DeliveryCreateView deliveryCreate) {
		// TODO Auto-generated constructor stub
	}

	public void DeliveryGuyCreateSaveController(DeliveryModel deliveryModel, DeliveryCreateView deliveryCreateView) {
		this.deliveryModel = deliveryModel;
		this.deliveryCreateView = deliveryCreateView;

		deliveryCreateView.getSavebtn().addActionListener(this);

	}

	public void actionPerformed(ActionEvent arg0) {

		if (!deliveryCreateView.getFirstNametf().getText().equals("")
				&& !deliveryCreateView.getLastNametf().getText().equals("")
				&& !deliveryCreateView.getPhonetf().getText().equals("")
				&& !deliveryCreateView.getEmailtf().getText().equals("")
				&& !deliveryCreateView.getDeliveryCodetf().getText().equals("")) {

			deliveryModel.createNewDeliveryGuy(new DeliveryGuyBean(
					deliveryCreateView.getFirstNametf().getText(),
					deliveryCreateView.getLastNametf().getText(), 
					deliveryCreateView.getPhonetf().getText(),
					deliveryCreateView.getEmailtf().getText(), 
					deliveryCreateView.getDeliveryCodetf().getText()));

//			System.out.println(deliveryModel.getAllClients() + "\n ");

			deliveryCreateView.setVisible(false);

		} else {
			JOptionPane.showMessageDialog(null, "Invalid Entry", "Missing one or a few Field(s)!",
					JOptionPane.ERROR_MESSAGE);
		}

	}
}
