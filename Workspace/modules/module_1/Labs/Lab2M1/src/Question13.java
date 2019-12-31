
public class Question13 {

	public static void main(String[] args) {
		/*
		 * 13. Print a sequence of asterisk characters in the following configuration.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 6* *
		 */
		int num1, num2;

		for (num1 = 1; num1 <= 6; num1++) {

			for (num2 = 1; num2 <= num1; num2++) {
				if (num2 == num1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}

	}

}
