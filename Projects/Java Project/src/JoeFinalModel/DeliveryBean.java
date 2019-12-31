package model;

public class DeliveryBean {
	private String id;
	private String userName;
	private String password;
	private String confirmPassword;
	private int orderNumber;
	private int restaurantNumber;
	private String deliveryAddress;
	private String deliveryPostalCode;

	public DeliveryBean(String userName, String password, String confirmPassword, int orderNumber,
			int restaurantNumber, String deliveryAddress, String deliveryPostalCode) {
		this.userName = userName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.orderNumber = orderNumber;
		this.restaurantNumber = restaurantNumber;
		this.deliveryAddress = deliveryAddress;
		this.deliveryPostalCode = deliveryPostalCode;
	}

	public DeliveryBean(String id, String userName, String password, String confirmPassword, int orderNumber,
			int restaurantNumber, String deliveryAddress, String deliveryPostalCode) {
		this.userName = userName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.orderNumber = orderNumber;
		this.restaurantNumber = restaurantNumber;
		this.deliveryAddress = deliveryAddress;
		this.deliveryPostalCode = deliveryPostalCode;
	}
	
	public String toString() {
		return this.id + " : " + this.orderNumber + " : " + this.restaurantNumber + " : " + this.deliveryAddress + " : " + this.deliveryPostalCode;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getRestaurantNumber() {
		return restaurantNumber;
	}

	public void setRestaurantNumber(int restaurantNumber) {
		this.restaurantNumber = restaurantNumber;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getDeliveryPostalCode() {
		return deliveryPostalCode;
	}

	public void setDeliveryPostalCode(String deliveryPostalCode) {
		this.deliveryPostalCode = deliveryPostalCode;
	}

}
