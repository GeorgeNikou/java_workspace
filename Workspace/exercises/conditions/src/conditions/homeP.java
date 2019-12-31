package conditions;

import java.util.Scanner;

public class homeP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double pass = 0.;
		int count = 0;
		// asking the user for a pass
		do {
			count++;
			System.out.println("Please enter your password: ");
			if (!sc.hasNextInt() || !sc.hasNextDouble()) {
				System.err.println("error!");
				sc.next();
			} else {
				pass = sc.nextDouble();
				System.out.println("Hello, your number is " + pass);
				break;

			}

		} while (count < 3);

	}

}
