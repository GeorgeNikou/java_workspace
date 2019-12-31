package model_Joe;

import java.util.ArrayList;

public class DeliveryModel {

	private DeliveryDAO deliveryGuyDAO;

	public DeliveryModel() {
		deliveryGuyDAO = new DeliveryDAO();

	}

	public void ViewDelivery(DeliveryBean Delivery) {
		int id = DeliveryDAO.getDeliveryList().size();
		Delivery.setId(id + "");
		DeliveryDAO.viewDelivery(Delivery);

	}

	public void acceptDelivery(DeliveryBean Delivery, int id) {
		DeliveryBean oldDelivery = this.getDeliveryList();
//		oldDelivery.setUserName(Delivery.getUserName());
//		oldDelivery.setPassword(Delivery.getPassword());
//		oldDelivery.setConfirmPassword(Delivery.getConfirmPassword());
		oldDelivery.setOrderNumber(Delivery.getOrderNumber());
		oldDelivery.setRestaurantName(Delivery.getRestaurantName());
		oldDelivery.setDeliveryAddress(Delivery.getDeliveryAddress());
		oldDelivery.setDeliveryPostalCode(Delivery.getDeliveryPostalCode());

		DeliveryDAO.acceptDelivery(oldDelivery, id);
	}

	public void madeDelivery(int id) {
		DeliveryDAO.madeDelivery(id);
	}

	public DeliveryBean getDeliveryList() {
		return DeliveryDAO.getDeliveryList();

	}

	public DeliveryBean getSingleDelivery(int id) {
		return DeliveryDAO.getSingleDelivery(id);
	}




}
