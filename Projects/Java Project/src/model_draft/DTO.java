package model_draft;

import java.util.ArrayList;

/*
 * DTO = Data Transfer Object
*/
public class DTO {

	private ArrayList<RestaurantBean> restaurauntList;
	private ArrayList<MenuBean> menuList;
//	private ArrayList<RestaurantMenuBean> restaurantMenuList;  // Extra???
	private ArrayList<UserBean> userList;
	private ArrayList<ClientBean> clientList;

	// singleton
	// create a variable to get the instance of this class
	private static DTO current_instance = null;

	// make the constructor private to prevent the instantiation of this class
	private DTO() {

		restaurauntList = new ArrayList<>();
		menuList = new ArrayList<>();
//		restaurantMenuList = new ArrayList<>();
		userList = new ArrayList<>();
		clientList = new ArrayList<>();
	}

	// create a function to get the instance of the class (getter)
	public static DTO getInstance() {
		if (current_instance == null)
			current_instance = new DTO();
		return current_instance;

	}

	/**
	 * @return the current_instance
	 */
	public static DTO getCurrent_instance() {
		return current_instance;
	}

	/**
	 * @return the restoList
	 */
	public ArrayList<RestaurantBean> getRestaurauntList() {
		return restaurauntList;
	}

	/**
	 * @return the clientList
	 */
	public ArrayList<ClientBean> getClientList() {
		return clientList;
	}

	/**
	 * @return the userList
	 */
	public ArrayList<UserBean> getUserList() {
		return userList;
	}

	public void printUserList() {
		System.out.println(userList.toString());
	}

	public ArrayList<MenuBean> getMenuList() {
		return menuList;
	}

	/**
	 * @return the restaurantMenuList
	 */
//	public ArrayList<RestaurantMenuBean> getRestaurantMenuList() {
//		return restaurantMenuList;
//	}

}
