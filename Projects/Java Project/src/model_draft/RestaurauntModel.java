package model_draft;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;

public class RestaurauntModel {

	private RestaurantDAO restaurantCreateDAO = new RestaurantDAO();

	public RestaurauntModel() {

		// constuctor for testing
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		listModel.addElement("aaa");
		listModel.addElement("bbb");

		this.createNewRestaurant(new RestaurantBean("Chic-Fil-A", "Silver Spring Drive", listModel, "301-890-7777"));
		this.createNewRestaurant(new RestaurantBean("McDonalds", "Burtonsville", listModel, "301-555-5555"));

		// hard coded value to test
		DTO.getInstance().getRestaurauntList().get(0).setSundayOpenHour(5);
		DTO.getInstance().getRestaurauntList().get(0).setSundayOpenMinute(30);
		DTO.getInstance().getRestaurauntList().get(0).setSundayCloseMinute(45);
		DTO.getInstance().getRestaurauntList().get(0).setSundayCloseHour(7);

		DTO.getInstance().getRestaurauntList().get(1).setSundayOpenHour(6);
		DTO.getInstance().getRestaurauntList().get(1).setSundayOpenMinute(15);
	}

	public RestaurauntModel(String restoName, String restoAddress, ListModel<String> deliveryArea, String phoneNum) {
		this.createNewRestaurant(new RestaurantBean(restoName, restoAddress, deliveryArea, phoneNum));
	}

	public void createNewRestaurant(RestaurantBean resto) {
		restaurantCreateDAO.createNewRestaurant(resto);

	}

}
