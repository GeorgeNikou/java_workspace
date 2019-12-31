package model_Joe;

import java.util.ArrayList;

public class DeliveryGuyModel {

	private DeliveryGuyDAO deliveryGuyDAO;

	public DeliveryGuyModel() {
		deliveryGuyDAO = new DeliveryGuyDAO();
		this.createNewDeliveryGuy(new DeliveryGuyBean("Ann", "Nan", "514-555-5555", "dffjk@hotmail.com", "123"));

	}

	public void createNewDeliveryGuy(DeliveryGuyBean DeliveryMan) {
		int id = DeliveryGuyDAO.getAllDeliveryGuys().size();
		DeliveryMan.setId(id + "");
		DeliveryGuyDAO.createNewDeliveryGuy(DeliveryMan);

	}

	public void editDeliveryGuy(DeliveryGuyBean newDeliveryMan, int id) {
		DeliveryGuyBean oldDeliveryGuy = this.getSingleDeliveryMan(id);
//		oldDelivery.setUserName(newDeliveryMan.getUserName());
//		oldDelivery.setPassword(newDeliveryMan.getPassword());
//		oldDelivery.setConfirmPassword(newDeliveryMan.getConfirmPassword());
		oldDeliveryGuy.setFirstName(newDeliveryMan.getFirstName());
		oldDeliveryGuy.setLastName(newDeliveryMan.getFirstName());
		oldDeliveryGuy.setphone(newDeliveryMan.getphone());
		oldDeliveryGuy.setEmail(newDeliveryMan.getEmail());
		oldDeliveryGuy.setAreaCode(newDeliveryMan.getAreaCode());

		DeliveryGuyDAO.editDeliveryGuy(oldDeliveryGuy, id);
	}

	public void deleteDeliveryGuy(int id) {
		DeliveryGuyDAO.deleteDeliveryGuy(id);
	}

	public ArrayList<DeliveryGuyBean> getAllDeliveryGuys() {
		return DeliveryGuyDAO.getAllDeliveryGuys();

	}

	public DeliveryGuyBean getSingleDeliveryMan(int id) {
		return DeliveryGuyDAO.getSingleDelivery(id);
	}




}
