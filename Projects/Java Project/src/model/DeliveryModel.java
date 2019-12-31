package model;

import java.util.ArrayList;
import model.DeliveryBean;
import model.DeliveryDAO;

public class DeliveryModel {

	private DeliveryDAO deliveryDAO;

	public DeliveryModel() {
		deliveryDAO = new DeliveryDAO();
		this.createNewDelivery(
				new DeliveryBean("Delivery1", "123", "123", "Bob", "5145555555", "This Area", "m2n 1h3"));
		this.createNewDelivery(
				new DeliveryBean("Delivery2", "123", "123", "John", "5145555555", "This Area", "m2n 1h3"));
		this.createNewDelivery(
				new DeliveryBean("Delivery3", "123", "123", "Jack", "5145555555", "This Area", "m2n 1h3"));
	}

	private void createNewDelivery(DeliveryBean DeliveryMan) {
		int id = DeliveryDAO.getAllDeliveryGuys().size();
		DeliveryMan.setId(id + "");
		DeliveryDAO.createNewDelivery(DeliveryMan);

	}

	private void editDelivery(DeliveryBean newDeliveryMan, int id) {
		DeliveryBean oldDelivery = this.getSingleDeliveryMan(id);
		oldDelivery.setUserName(newDeliveryMan.getUserName());
		oldDelivery.setPassword(newDeliveryMan.getPassword());
		oldDelivery.setConfirmPassword(newDeliveryMan.getConfirmPassword());
		oldDelivery.setName(newDeliveryMan.getName());
		oldDelivery.setTelephone(newDeliveryMan.getTelephone());
		oldDelivery.setArea(newDeliveryMan.getArea());
		oldDelivery.setAreaCode(newDeliveryMan.getAreaCode());

		DeliveryDAO.editDelivery(oldDelivery, id);
	}

	public void deleteDelivery(int id) {
		DeliveryDAO.deleteDelivery(id);
	}

	public ArrayList<DeliveryBean> getAllDelivery() {
		return DeliveryDAO.getAllDeliveryGuys();

	}

	public DeliveryBean getSingleDeliveryMan(int id) {
		return DeliveryDAO.getSingleDeliveryMan(id);
	}

}
