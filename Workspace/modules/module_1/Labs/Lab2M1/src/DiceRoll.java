import java.util.Random;
import java.util.Scanner;

public class DiceRoll {

	public static void main(String[] args) {
		/*
		 * 5. Write a program that simulates the roll of 2 six sided dice and then
		 * outputs the value of each die, and the total sum of the dice. Run program
		 * until the user hit “x” to exit. Save as DiceRoll.java.
		 */

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		while (true) {
			int dice1 = r.nextInt(6) + 1;
			int dice2 = r.nextInt(6) + 1;

			System.out.println("First die: " + dice1 + "\nSecond die: " + dice2);
			System.out.println("Sum of both dice is: " + (dice1 + dice2));
			System.out.println("If you wish to exit press x");
			String exit = sc.nextLine();
			if (exit.equals("x"))
				break;

		}

	}

}
