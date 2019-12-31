package model_draft;

import javax.swing.ListModel;

public class MenuBean {

	private String name;
	private ListModel<String> restaurantName;
	private String itemName;
	private int price;
	private int id;

	public MenuBean(String name, String itemName, int price) {
		this.name = name;
		this.itemName = itemName;
		this.price = price;
		this.id = DTO.getInstance().getMenuList().size();
	}

//	public String toString() {
//		String result = this.itemName;
//		return result;
////		return "\nClass: " + this.getClass().getSimpleName() 
////				+ "\nMenu: " + this.name + "\nItems: " + this.itemName
////				+ "\nPrice: " + this.price;
//		
//	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the price
	 */
	public double getPrice() {
		return price;
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
