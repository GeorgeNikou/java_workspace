package exo1;

import java.util.Scanner;

//ask for string name,email,book name, then print out his/her name,email,book name
public class author {

	
	// attributes
	private String name = "";
	private String email = "";
	private String bookName = "";

	//constructor (constructing objects)
	public author(String name, String email, String bookName) {
		this.name = name;
		this.email = email;
		this.bookName = bookName;
	}
	
	//empty constructor
	public author() {
		
	}
	//user friendly (function)
	public String description() {
		String desc = "";
		desc += "Class: " + this.getClass().getSimpleName() + "\n";
		desc += "name: " + name + "\n";
		desc += "email: " + email + "\n";
		desc += "book name: " + bookName + "\n";

		return desc;
	}


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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}


	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
	
	

}
