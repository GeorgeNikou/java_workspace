package Banking;

public class BankMain {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount(15000);
		
		Banking george = new Banking("George", account);
		Banking Kate = new Banking("Kate", account);
		
		Thread t1 = new Thread(george);
		Thread t2 = new Thread(Kate);
		
		t1.start();
		t2.start();

	}

}
