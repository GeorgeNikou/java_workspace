
public class SickNote {

	private String sillyWord_1;
	private String lastName;
	private String illness;
	private String nounPlural;
	private String adjective_1;
	private String adjective_2;
	private String sillyWord_2;
	private String place;
	private String number;
	private String adjective_3;

	public SickNote(String sillyWord_1, String lastName, String illness, String nounPlural, String adjective_1,
			String adjective_2, String sillyWord_2, String place, String number, String adjective_3) {
		
		this.sillyWord_1 = sillyWord_1;
		this.lastName = lastName;
		this.illness = illness;
		this.nounPlural = nounPlural;
		this.adjective_1 = adjective_1;
		this.adjective_2 = adjective_2;
		this.sillyWord_2 = sillyWord_2;
		this.place = place;
		this.number = number;
		this.adjective_3 = adjective_3;
	}
	
	public String toString() {
		
		return "\nClass: " + this.getClass().getSimpleName() + "\nsilly word: " + this.sillyWord_1
				+"\nLast name: " + this.lastName 
				+"\nIllness: " + this.illness
				+"\nNoun plural: " + this.nounPlural
				+"\nAdjective: " + this.adjective_1
				+"\nAdjective: " + this.adjective_2
				+"\nSilly word: " + this.sillyWord_2
				+"\nPlace: " + this.place
				+"\nNumber: " + this.number
				+"\nAdjective: " + this.adjective_3;
			
	}

	/**
	 * @return the sillyWord_1
	 */
	public String getSillyWord_1() {
		return sillyWord_1;
	}

	/**
	 * @param sillyWord_1 the sillyWord_1 to set
	 */
	public void setSillyWord_1(String sillyWord_1) {
		this.sillyWord_1 = sillyWord_1;
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
	 * @return the illness
	 */
	public String getIllness() {
		return illness;
	}

	/**
	 * @param illness the illness to set
	 */
	public void setIllness(String illness) {
		this.illness = illness;
	}

	/**
	 * @return the nounPlural
	 */
	public String getNounPlural() {
		return nounPlural;
	}

	/**
	 * @param nounPlural the nounPlural to set
	 */
	public void setNounPlural(String nounPlural) {
		this.nounPlural = nounPlural;
	}

	/**
	 * @return the adjective_1
	 */
	public String getAdjective_1() {
		return adjective_1;
	}

	/**
	 * @param adjective_1 the adjective_1 to set
	 */
	public void setAdjective_1(String adjective_1) {
		this.adjective_1 = adjective_1;
	}

	/**
	 * @return the adjective_2
	 */
	public String getAdjective_2() {
		return adjective_2;
	}

	/**
	 * @param adjective_2 the adjective_2 to set
	 */
	public void setAdjective_2(String adjective_2) {
		this.adjective_2 = adjective_2;
	}

	/**
	 * @return the sillyWord_2
	 */
	public String getSillyWord_2() {
		return sillyWord_2;
	}

	/**
	 * @param sillyWord_2 the sillyWord_2 to set
	 */
	public void setSillyWord_2(String sillyWord_2) {
		this.sillyWord_2 = sillyWord_2;
	}

	/**
	 * @return the place
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * @param place the place to set
	 */
	public void setPlace(String place) {
		this.place = place;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the adjective_3
	 */
	public String getAdjective_3() {
		return adjective_3;
	}

	/**
	 * @param adjective_3 the adjective_3 to set
	 */
	public void setAdjective_3(String adjective_3) {
		this.adjective_3 = adjective_3;
	}
	
	

}
