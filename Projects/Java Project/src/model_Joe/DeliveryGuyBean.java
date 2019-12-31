package model_Joe;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;

public class DeliveryGuyBean{

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String areaCode;
	private ListModel<String> deliveryArea;

	public DeliveryGuyBean(String firstName, String lastName, String email, String phone, String areaCode) {
		this.deliveryArea = new DefaultListModel<>();
//		this.userName = userName;
//		this.password = password;
//		this.confirmPassword = confirmPassword;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.areaCode = areaCode;
		this.id = DTO.getInstance().getDeliveryList().size();
	}

	public String toString() {
		return this.firstName + " " + this.lastName + " " + this.email + " " +  this.phone + ", " + this.areaCode + " ";
	}

	public int getId() {
		return id;
	}

	public void setId(String string) {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getphone() {
		return phone;
	}

	public void setphone(String phone) {
		this.phone = phone;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public ListModel<String> getDeliveryArea() {
		return deliveryArea;
	}

	public void setDeliveryArea(ListModel<String> deliveryArea) {
		this.deliveryArea = deliveryArea;
	}


}
