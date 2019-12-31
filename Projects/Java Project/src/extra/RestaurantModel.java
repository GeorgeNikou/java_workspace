package extra;

import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;

public class RestaurantModel {

	private RestaurantDAO restaurantDAO = new RestaurantDAO();

	public RestaurantModel() {

		// constuctor for testing
		ArrayList<String> listModel = new ArrayList<String>();
		listModel.add("aaa");
		listModel.add("bbb");

		RestaurantBean r1 = new RestaurantBean("Restaraunt #1", "Silver Spring Drive", listModel, "301-890-7777");
		r1.setId(DTO.getInstance().getRestaurauntList().size());
		this.createNewRestaurant(r1);

		MenuBean item1 = new MenuBean("Pizza", 5);
		item1.setId(r1.getMenuItem().size());
		AddMenuItem(item1, r1.getId());

		MenuBean item2 = new MenuBean("Fries", 4);
		item2.setId(r1.getMenuItem().size());
		AddMenuItem(item2, r1.getId());
		
		RestaurantBean r2 = new RestaurantBean("Mcdonalds", "Columbus Road", listModel, "301-890-7777");
		r2.setId(DTO.getInstance().getRestaurauntList().size());
		this.createNewRestaurant(r2);
		
		MenuBean item3 = new MenuBean("Big Mac", 5);
		item3.setId(r2.getMenuItem().size());
		AddMenuItem(item3, r2.getId());

		MenuBean item4 = new MenuBean("Chicken Nuggets", 4);
		item4.setId(r2.getMenuItem().size());
		AddMenuItem(item4, r2.getId());

		// menuItemList1.add();
		// menuItemList1.add("Burger 4");

		ArrayList<MenuBean> menuItemList2 = new ArrayList<MenuBean>();
		// menuItemList2.add("Big Mac");
		// menuItemList2.add("Mac 3");

		// this.createNewRestaurant(new RestaurantBean("GeorgeDonalds", "Burtonsville",
		// listModel, "301-555-5555", menuItemList2));
		// this.createNewRestaurant(new RestaurantBean("FiveGuys", "sVille", listModel,
		// "301-333-5555"));

		// hard coded value to test
//		DTO.getInstance().getRestaurauntList().get(0).setSundayOpenHour(5);
//		DTO.getInstance().getRestaurauntList().get(0).setSundayOpenMinute(30);
//		DTO.getInstance().getRestaurauntList().get(0).setSundayCloseMinute(45);
//		DTO.getInstance().getRestaurauntList().get(0).setSundayCloseHour(7);
//
//		DTO.getInstance().getRestaurauntList().get(1).setSundayOpenHour(6);
//		DTO.getInstance().getRestaurauntList().get(1).setSundayOpenMinute(15);
	}

	public RestaurantModel(String restoName, String restoAddress, ArrayList<String> deliveryArea, String phoneNum) {
		this.createNewRestaurant(new RestaurantBean(restoName, restoAddress, deliveryArea, phoneNum));
	}

	public void AddMenuItem(MenuBean item, int restID) {
		RestaurantBean r = restaurantDAO.getSingleRestaurant(restID);
		ArrayList<MenuBean> menuItemList = r.getMenuItem();
		menuItemList.add(item);
		r.setMenuItem(menuItemList);
		restaurantDAO.editRestaurant(restID, r);
	}

	public void createNewRestaurant(RestaurantBean resto) {
		restaurantDAO.createNewRestaurant(resto);

	}

}
