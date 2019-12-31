import java.util.Scanner;

public class Bigger {

	public static void main(String[] args) {
		/*
		 * 2. Write a program that asks the user to input two numbers. Then the program
		 * should tell the user which number is the bigger number by outputting a
		 * sentence like, “The number 9 is bigger than the number 2.” Do the same for
		 * the smaller number. Run program until the user hit “x” to exit. Save as
		 * Bigger.java..
		 */

		int min, max;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please choose a random number: ");
		int num1 = sc.nextInt();

		System.out.println("Please choose another random number: ");
		int num2 = sc.nextInt();

		if (num1 < num2) {
			min = num1;
			max = num2;
			System.out.println("the number " + max + " is bigger than the number " + min);
		} else {
			max = num1;
			min = num2;
			System.out.println("the number " + max + " is bigger than the number " + min);
		}

	}
}
