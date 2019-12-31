package model_draft;

import java.sql.Date;

public class OrderBean {

	private int id;
	private String item;
	private int price;
	private int quantity;

	public OrderBean(String item, int price, int quantity) {
		this.item = item;
		this.price = price;
		this.quantity = quantity;
		this.id = DTO.getInstance().getOrderList().size();
	}

	public String toString() {
		return "\nItem: " + this.item + " - " + this.price + ".00 $" + " | Quantity: " + this.quantity + " x";
	}

	/**
	 * @return the item
	 */
	public String getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(String item) {
		this.item = item;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
