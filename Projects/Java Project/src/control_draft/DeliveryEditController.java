package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.DeliveryBean;
import model.DeliveryDAO;
import model.DeliveryModel;
import view.DeliveryEditView;
import view.DeliveryGuyDashView;

public class DeliveryEditController implements ActionListener {

	private DeliveryBean deliveryBean;
	private DeliveryGuyDashView deliveryDashView;
	private DeliveryDAO deliveryDAO;
	private DeliveryModel deliveryModel;
	private DeliveryEditView deliveryEdit;

	public DeliveryEditController(DeliveryModel deliveryModel, DeliveryEditView deliveryEdit) {
		this.deliveryEdit = deliveryEdit;
		this.deliveryModel = deliveryModel;
		deliveryEdit.getSubmitbtn().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		deliveryBean = deliveryModel.getSingleDeliveryGuy(0);
				
				if( !deliveryEdit.getNametf().getText().equals("")
				&& !deliveryEdit.getPhonetf().getText().equals("")
				&& !deliveryEdit.getDeliveryAreaTA().getText().equals("")
				&& !deliveryEdit.getDeliveryAreaCodetf().getText().equals("")); {
					
						deliveryBean.setName(deliveryEdit.getNametf().getText());
						deliveryBean.setTelephone(deliveryEdit.getPhonetf().getText());
						deliveryBean.setArea(deliveryEdit.getDeliveryAreaTA().getText());
						deliveryBean.setAreaCode(deliveryEdit.getDeliveryAreaCodetf().getText());
						
						 deliveryModel.editDeliveryGuy(deliveryBean, 0);
					
						JOptionPane.showMessageDialog(null, "The delivery Guy has been edited",
								"Edit Client Account", JOptionPane.INFORMATION_MESSAGE);
						// ClientController.clientView.setVisible(true);
						deliveryDashView.setVisible(true);
//						deliveryEdit.setVisible(false);
						
					} 

					
					
				
		
		
	}


}
