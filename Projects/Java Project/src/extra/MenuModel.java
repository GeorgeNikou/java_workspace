package extra;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

public class MenuModel {

	private MenuDAO restaurantMenuDAO = new MenuDAO();

	public MenuModel() {
		ArrayList<String> listModelMenu = new ArrayList<String>();

//		this.createMenu(new MenuBean("Spicy Chicken Sandwich", 8));
//		this.createMenu(new MenuBean("Chicken Sandwich", 7));
//		this.createMenu(new MenuBean("Waffle fries", 3));
//
	//	this.createMenu(new MenuBean(listModelMenu, "Cheese burger", 10, "FiveGuys"));
	//	this.createMenu(new MenuBean(listModelMenu, "Milkshake", 3));
	//	this.createMenu(new MenuBean(listModelMenu, "Fries", 2));

//		this.createMenu(new MenuBean(listModelMenu, "Big Mac", 7));
//	this.createMenu(new MenuBean(listModelMenu, "Chicken Nuggets", 10));
//		this.createMenu(new MenuBean(listModelMenu, "Fries", 4));

	}
	public MenuModel(String name, String itemName, int price) {
		//this.createMenu(new MenuBean(name, itemName, price));
		
	}

	public void createMenu(MenuBean menu) {	
		restaurantMenuDAO.createMenu(menu);
	}

	// ???
	public void editMenu(MenuBean menu) {
		restaurantMenuDAO.editMenu(menu);
	}

	public void deleteMenu(MenuBean restaurant) {
		restaurantMenuDAO.deleteMenu(restaurant);
	}

	public void deleteMenuByName(String name) {
		restaurantMenuDAO.deleteMenuByName(name);
	}

	public ArrayList<String> getRestaurantMenuList(String name) {
		return restaurantMenuDAO.getRestaurantMenuList(name);
	}

	public MenuBean getSingleMenu(int id) {
		return restaurantMenuDAO.getSingleMenu(id);
	}

	public ArrayList<MenuBean> getAllMenu() {
		return restaurantMenuDAO.getAllMenu();
	}

}
