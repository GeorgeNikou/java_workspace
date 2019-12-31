package Classes;

import java.util.ArrayList;
/*
 * DTO = Data Transfer Object
*/
public class DTO {
 	
	
	//ArrayList that is storing all the PersonBean info
	private ArrayList<PersonBean> accounts = new ArrayList<>();
	
	

	
	//singleton
	// create a variable to get the instance of this class
	private static DTO current_instance = null;

	// make the constructor private to prevent the instantiation of this class
	private DTO() {
	}

	// create a function to get the instance of the class (getter)
	public static DTO getInstance() {
		if (current_instance == null)
			current_instance = new DTO();
		return current_instance;
	}

	/**
	 * @return the accounts
	 */
	public ArrayList<PersonBean> getAccounts() {
		return accounts;
	}

	/**
	 * @param accounts the accounts to set
	 */
	public void setAccounts(ArrayList<PersonBean> accounts) {
		this.accounts = accounts;
	}

	/**
	 * @return the current_instance
	 */
	public static DTO getCurrent_instance() {
		return current_instance;
	}

	/**
	 * @param current_instance the current_instance to set
	 */
	public static void setCurrent_instance(DTO current_instance) {
		DTO.current_instance = current_instance;
	}
	
	
}