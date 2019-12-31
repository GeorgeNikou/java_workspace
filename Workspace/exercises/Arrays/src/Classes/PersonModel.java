package Classes;

import java.util.ArrayList;

public class PersonModel {
	
	PersonBean person;
	PersonBean person2;
	ArrayList<PersonBean> accounts = new ArrayList<>();
	
	public PersonModel() {
		
		person = new PersonBean("george", "white", "29");
		person2 = new PersonBean("David", "black", "55");
		
		
		createAccount(person);
		createAccount(person2);
		
	}
	
	public void createAccount(PersonBean person) {
		accounts.add(person);
	}
	
	
	/**
	 * @return the person
	 */
	public PersonBean getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(PersonBean person) {
		this.person = person;
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

	public static void main(String[] args) {
		
		PersonModel m = new PersonModel();
		
		System.out.println(m.getAccounts());
		
		
	
	
	}
}
