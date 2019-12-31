package Account;

public class AccountBean {

	private String firstName;
	private String lastName;
	private String age;
	private String address;
	private String phoneNumber;
	private double checking;
	private double saving;

	public AccountBean(String firstName, String lastName, String age, String address, String phoneNumber) {
	    this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		return "\nClass: " + this.getClass().getSimpleName() +
				"\nFirstName: " + this.firstName +
				"\nLastname: " + this.lastName + 
				"\nAge: " + this.age + 
				"\nAddress: " + this.address + 
				"\nNumber: " + this.phoneNumber +
				"\nChecking account: " + this.checking +
				"\nSaving account: " + this.saving;		
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the checking
	 */
	public double getChecking() {
		return checking;
	}

	/**
	 * @param checking the checking to set
	 */
	public void setChecking(double checking) {
		this.checking = checking;
	}

	/**
	 * @return the saving
	 */
	public double getSaving() {
		return saving;
	}

	/**
	 * @param saving the saving to set
	 */
	public void setSaving(double saving) {
		this.saving = saving;
	}
	
	
	
	
}
