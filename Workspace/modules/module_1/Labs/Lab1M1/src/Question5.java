
public class Question5 {

	public static void main(String[] args) {
		
		/*5. The following program redundantly repeats the same expressions many times.
		modify the program to remove the redundancy using variables. Use an appropriate type for each variable.
		
		public class ComputePay {
			public static void main(String[] args) {
				// Calculate my pay at work, based on how many hours I worked each day
				System.out.println("My total hours worked:");
				System.out.println(4 + 5 + 8 + 4);

				System.out.println("My hourly salary:");
				System.out.println("$" + 8.75);

				System.out.println("My total pay:");
				System.out.println((4 + 5 + 8 + 4) * 8.75);

				System.out.println("My taxes owed:");
				System.out.println((4 + 5 + 8 + 4) * 8.75 * 0.20);   // 20% tax rate
*/		
		
		double hoursWorked = 4+5+8+4;
		System.out.println("My total hours worked:"+ hoursWorked);
		
		double hourlySalary = 15.50;
		System.out.println("My hourly salary is:" + (hourlySalary + 8.75));
		
		double totalPay = (3+5+8+4)*8.75;
		System.out.println("My total pay is: "+ totalPay);
		
		double taxesOwed = (4+5+8+4) * 8.75 * 0.20;
		System.out.println("My total taxes owed is equal to: "+ taxesOwed);
		
		
		

	}

}
