package model;

public class DeliveryBean {
	private String id;
	private String userName;
	private String password;
	private String confirmPassword;
	private String name;
	private String telephone;
	private String area;
	private String areaCode;

	public DeliveryBean(String userName, String password, String confirmPassword, String name, String telephone,
			String area, String areaCode) {
		this.userName = userName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.name = name;
		this.telephone = telephone;
		this.area = area;
		this.areaCode = areaCode;
	}

	public DeliveryBean(String id, String userName, String password, String confirmPassword, String name, String telephone,
			String area, String areaCode) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.name = name;
		this.telephone = telephone;
		this.area = area;
		this.areaCode = areaCode;
	}

	public String toString() {
		return this.id + " : " + this.name + " " + this.telephone + ", " + this.area + ", " + this.areaCode;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

}
