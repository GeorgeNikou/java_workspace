package model_draft;

import java.util.ArrayList;

public class MenuModel {

	private MenuDAO restaurantMenuDAO = new MenuDAO();

	public MenuModel() {

		this.createMenu(new MenuBean("Chic-Fil-A", "Spicy Chicken Sandwich", 8));
		this.createMenu(new MenuBean("Chic-Fil-A", "Chicken Sandwich", 7));
		this.createMenu(new MenuBean("Chic-Fil-A", "Waffle fries", 3));

		this.createMenu(new MenuBean("Five Guys", "Cheese burger", 10));
		this.createMenu(new MenuBean("Five Guys", "Milkshake", 3));
		this.createMenu(new MenuBean("Five Guys", "Fries", 2));

		this.createMenu(new MenuBean("McDonalds", "Big Mac", 7));
		this.createMenu(new MenuBean("McDonalds", "Chicken Nuggets", 10));
		this.createMenu(new MenuBean("McDonalds", "Fries", 4));

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
