import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		/*
		 * 14. Print all of the factors of a value stored in the variable number. Assume
		 * the value is positive.
		 */
		Scanner sc = new Scanner(System.in);
		double result = 1;
		double number = 0;
		System.out.println("enter a number: ");
		number = sc.nextDouble();

		for (int i = 1; i <= number; i++) {
			result = result * i;
			System.out.println(" factorial of " + i + " is " + result);
		}

	}

}
