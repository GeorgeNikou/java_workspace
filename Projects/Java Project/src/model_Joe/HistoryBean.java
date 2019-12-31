package model_Joe;

import java.util.ArrayList;

public class HistoryBean {

	private String item;
	private int price;
	private int quantity;
	private int id;
	private String deliveryDateText;
	private String deliveryTime; // Combo Box
	private String postalCode;
	private String restaurantName;
	private String deliveryAddress;
	private String username;
	private int orderNumber;
	private String orderStatus;
	private ArrayList<ClientBean> clientBean;

	public HistoryBean(String item, int price, int quantity, String deliveryDateText, String deliveryTime,
			String postalCode, String restaurantName, String deliveryAddress, int orderNumber) {
		this.item = item;
		this.price = price;
		this.quantity = quantity;
		this.deliveryDateText = deliveryDateText;
		this.deliveryTime = deliveryTime;
		this.postalCode = postalCode;
		this.restaurantName =  restaurantName;
		this.deliveryAddress = deliveryAddress;
		this.orderNumber = DTO.getInstance().getHistoryList().size();
		this.id = DTO.getInstance().getHistoryList().size();
	}
	
	public String toString() {
		return "\n" + this.orderNumber + " - " + this.deliveryDateText + " EST " + this.deliveryTime;
	}

	
	/**
	 * @return the clientBean
	 */
	public ArrayList<ClientBean> getClientBean() {
		return clientBean;
	}

	/**
	 * @param clientBean the clientBean to set
	 */
	public void setClientBean(ArrayList<ClientBean> clientBean) {
		this.clientBean = clientBean;
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

	/**
	 * @return the deliveryDateText
	 */
	public String getDeliveryDateText() {
		return deliveryDateText;
	}

	/**
	 * @param deliveryDateText the deliveryDateText to set
	 */
	public void setDeliveryDateText(String deliveryDateText) {
		this.deliveryDateText = deliveryDateText;
	}

	/**
	 * @return the deliveryTime
	 */
	public String getDeliveryTime() {
		return deliveryTime;
	}

	/**
	 * @param deliveryTime the deliveryTime to set
	 */
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the restaurantName
	 */
	public String getRestaurantName() {
		return restaurantName;
	}

	/**
	 * @param restaurantName the restaurantName to set
	 */
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	/**
	 * @return the deliveryAddress
	 */
	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	/**
	 * @param deliveryAddress the deliveryAddress to set
	 */
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the orderNumber
	 */
	public int getOrderNumber() {
		return orderNumber;
	}

	/**
	 * @param orderNumber the orderNumber to set
	 */
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * @return the orderStatus
	 */
	public String getOrderStatus() {
		return orderStatus;
	}

	/**
	 * @param orderStatus the orderStatus to set
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
}
