package Banking;

public class Banking extends Thread{
	
	private Banking bankAccount;
	private String nameOfPerson;
	private int total;
	
	
	public Banking(String nameOfPerson, BankAccount bankingAccount){
		this.nameOfPerson = nameOfPerson;
		this.total = total;
		this.bankAccount = bankAccount;
	}


	
	public void run() {
		
		try {
			//System.out.println(this.nameOfPerson + ":" + this.total);
			
			while(true) {
				if(bankAccount.getTotal()>0) {
					System.out.println("sleep");
					Thread.sleep(1000);
				}else {
					System.out.println("Your account has " + this.total + "funds left.");
				}
			}
		}catch(Exception e) {}
		
		
	}


	/**
	 * @return the backAccount
	 */
	public Banking getBackAccount() {
		return bankAccount;
	}


	/**
	 * @param backAccount the backAccount to set
	 */
	public void setBackAccount(Banking backAccount) {
		this.bankAccount = backAccount;
	}


	/**
	 * @return the name
	 */
	public String getNameOfPerson() {
		return nameOfPerson;
	}


	/**
	 * @param name the name to set
	 */
	public void setNameOfPerson(String nameOfPerson) {
		this.nameOfPerson = nameOfPerson;
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
