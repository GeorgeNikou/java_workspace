package Banking;

public class BankAccount {
	
	private int bankAcc;
	private int total;
	
	public BankAccount(int backAcc){
		this.bankAcc = backAcc;
	}

	/**
	 * @return the bankAcc
	 */
	public int getBankAcc() {
		return bankAcc;
	}

	/**
	 * @param bankAcc the bankAcc to set
	 */
	public void setBankAcc(int bankAcc) {
		this.bankAcc = bankAcc;
	}

	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	

}
