package model;

import java.util.ArrayList;

import model.DeliveryBean;
import model.DTO;

public class DeliveryDAO {

		// Deliveries
		public static void createNewDelivery(DeliveryBean DeliveryMan) {
			int id = DTO.getInstance().getDeliveryList().size();
			DeliveryMan.setId(id + "");
			DTO.getInstance().getDeliveryList().add(DeliveryMan);
		}
		
		public static void editDelivery(DeliveryBean DeliveryMan, int id) {
			DTO.getInstance().getDeliveryList().set(id, DeliveryMan);
		}
		
		public static void deleteDelivery(int id) {
			DTO.getInstance().getDeliveryList().remove(id);
		}
		
		public static ArrayList<DeliveryBean> getAllDeliveryGuys() {
			return DTO.getInstance().getDeliveryList();
		}
		
		public static DeliveryBean getSingleDeliveryMan(int id) {
			return DTO.getInstance().getDeliveryList().get(id);
		}
	}

