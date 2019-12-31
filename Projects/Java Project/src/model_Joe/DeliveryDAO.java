	package model_Joe;

import java.util.ArrayList;


public class DeliveryDAO {

	// Deliveries
	public static void viewDelivery(DeliveryBean Delivery) {
		int id = DTO.getInstance().getDeliveryList().size();
		Delivery.setId(id + "");
		DTO.getInstance().getDeliveryList().add(Delivery);
	}
	
	public static void acceptDelivery(DeliveryBean Delivery, int id) {
		DTO.getInstance().getDeliveryList().set(id, Delivery);
	}
	
	public static void madeDelivery(DeliveryBean id) {
		DTO.getInstance().getDeliveryList().add(id);
	}
	
	public static DeliveryBean getDeliveryList() {
		return DTO.getInstance().getDeliveryList();
	}
	
	public static DeliveryBean getSingleDelivery(int id) {
		return DTO.getInstance().getDeliveryList().get(id);
	}
	
}
