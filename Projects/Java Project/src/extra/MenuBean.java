package extra;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;

public class MenuBean {

	private String itemName;
	private int price;
	private int id;

	public MenuBean(String itemName, int price) {
		this.itemName = itemName;
		this.price = price;
	}

//	private String name;
//	private ListModel<String> restaurantName;
//	private String itemName;
//	private int price;
//	private int id;
//	
//	public MenuBean(String name, String itemName, int price) {
//		this.name = name;
//		this.itemName = itemName;
//		this.price = price;
//		this.id = DTO.getInstance().getMenuList().size();
//	}

	public String toString() {
		String result = this.itemName;
		return result;
////		return "\nClass: " + this.getClass().getSimpleName() 
////				+ "\nMenu: " + this.name + "\nItems: " + this.itemName
////				+ "\nPrice: " + this.price;
//		
	}

	/**
	 * @return the restaurantName
	 */
//	public ListModel<String> getRestaurantName() {
//		return restaurantName;
//	}
//
//	/**
//	 * @param restaurantName the restaurantName to set
//	 */
//	public void setRestaurantName(ListModel<String> restaurantName) {
//		this.restaurantName = restaurantName;
//	}
	
	

	
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

}
