package control_george;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;

import model_draft.DTO;
import model_draft.RestaurantBean;
import model_draft.RestaurauntModel;
import view_draft.AdminDash;
import view_draft.RestaurantCreateView;
import view_draft.RestaurantDeleteView;

public class DelRestoController implements ActionListener {

	public RestaurauntModel model;
	public RestaurantDeleteView restoDelView;

	public DelRestoController(RestaurauntModel model, RestaurantDeleteView restoDelView) {
		this.restoDelView = restoDelView;
		this.model = model;

		restoDelView.getBtnDeleteRestaurant().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		RestaurantBean oldRB = (RestaurantBean) restoDelView.getList().getSelectedValue();

		for (int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
			if (DTO.getInstance().getRestaurauntList().get(i).getId() == oldRB.getId()) {
				DTO.getInstance().getRestaurauntList().remove(i);
				break;
			}
		}

		// JList being updated
		DefaultListModel<RestaurantBean> model = new DefaultListModel<>();
		for (int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
			RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
			model.addElement(item);
		}
		restoDelView.getList().setModel(model);

		// TODO: Clear all the fields and the comboboxes
		restoDelView.getTxtfield_name().setText("");
		restoDelView.getTxtfield_address().setText("");
		restoDelView.getTxtfield_telephone().setText("");
		
		restoDelView.comboResetHour();
		restoDelView.comboResetMinute();

	

	}
}
