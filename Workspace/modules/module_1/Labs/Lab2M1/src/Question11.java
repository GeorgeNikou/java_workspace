import java.util.Random;
import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		/*
		 * 11. Write a program to try to make the user guess a random number between 1
		 * and 10. The user must have 3 tries. Evaluate each guess and return the random
		 * number if user did not guess right after three tries. Run program until the
		 * user hit “x” to exit
		 */

		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		int num = 0;

		while (!exit) {
			int number = r.nextInt(2) + 1;
			num += 1;
			System.out.println("Enter your number\n[type x to exit] ");
			String entry = sc.nextLine();
			if (entry.equals("x"))
				exit = true;
			if (entry.equals(number)) {
				System.out.println("you got it!");
				break;
			}else if (num == 3) {
				System.out.println("the random number was " + number);
				num = 0;

							
			}

		}

	}

}
