package model_Joe;

import java.util.ArrayList;

import model.DTO;
import model.DeliveryGuyBean;

public class DeliveryGuyDAO {

		// DeliveryGuy
		public static void createNewDeliveryGuy(DeliveryGuyBean DeliveryGuy) {
			int id = DTO.getInstance().getDeliveryGuyList().size();
			DeliveryGuy.setId(id + "");
			DTO.getInstance().getDeliveryGuyList().add(DeliveryGuy);
		}
		
		public static void editDeliveryGuy(DeliveryGuyBean DeliveryGuy, int id) {
			DTO.getInstance().getDeliveryGuyList().set(id, DeliveryGuy);
		}
		
		public static void deleteDeliveryGuy(int id) {
			DTO.getInstance().getDeliveryGuyList().remove(id);
		}
		
		public static ArrayList<DeliveryGuyBean> getAllDeliveryGuys() {
			return DTO.getInstance().getDeliveryGuyList();
		}
		
		public static DeliveryGuyBean getSingleDelivery(int id) {
			return DTO.getInstance().getDeliveryGuyList().get(id);
		}

	}

