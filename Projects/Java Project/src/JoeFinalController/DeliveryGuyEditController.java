package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.DeliveryGuyBean;
import model.DeliveryGuyDAO;
import model.DeliveryGuyModel;
import view.DeliveryEditView;
import view.DeliveryGuyDashView;

public class DeliveryGuyEditController implements ActionListener {

	private DeliveryGuyBean deliveryBean;
	private DeliveryGuyDashView deliveryDashView;
	private DeliveryGuyDAO deliveryDAO;
	private DeliveryGuyModel deliveryModel;
	private DeliveryEditView deliveryEdit;

	public DeliveryGuyEditController(DeliveryGuyModel deliveryModel, DeliveryEditView deliveryEdit) {
		this.deliveryEdit = deliveryEdit;
		this.deliveryModel = deliveryModel;
		deliveryEdit.getSavebtn().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		deliveryBean = deliveryModel.getSingleDeliveryMan(0);

		if (!deliveryEdit.getFirstNametf().getText().equals("") && !deliveryEdit.getLastNametf().getText().equals("")
				&& !deliveryEdit.getPhonetf().getText().equals("") && !deliveryEdit.getEmailTF().getText().equals("")
				&& !deliveryEdit.getDeliveryCodetf().getText().equals(""))
			;
		{

			deliveryBean.setFirstName(deliveryEdit.getFirstNametf().getText());
			deliveryBean.setLastName(deliveryEdit.getLastNametf().getText());
			deliveryBean.setphone(deliveryEdit.getPhonetf().getText());
			deliveryBean.setEmail(deliveryEdit.getEmailtf().getText());
			deliveryBean.setAreaCode(deliveryEdit.getDeliveryCodetf().getText());

			deliveryModel.editDeliveryGuy(deliveryBean, 0);

			JOptionPane.showMessageDialog(null, "The delivery Guy has been edited", "Edit Client Account",
					JOptionPane.INFORMATION_MESSAGE);
			// ClientController.clientView.setVisible(true);
			deliveryDashView.setVisible(true);
//						deliveryEdit.setVisible(false);

		}

	}

}
