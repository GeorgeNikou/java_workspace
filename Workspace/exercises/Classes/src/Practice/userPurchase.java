package Practice;

public class userPurchase {

	private double totalCash;

	public userPurchase(double totalCash) {
		this.totalCash = totalCash;
	}
	
	public String toString() {
		return "\nTotal cash: " + totalCash;
	}
	
	public double buy(double price) {
		return totalCash - price;
	}

	/**
	 * @return the totalCash
	 */
	public double getTotalCash() {
		return totalCash;
	}

	/**
	 * @param totalCash the totalCash to set
	 */
	public void setTotalCash(double totalCash) {
		this.totalCash = totalCash;
	}
	
	


}
