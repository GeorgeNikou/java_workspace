import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		/*
		 * 3. Write a program that asks the user to input two numbers. Then the program
		 * should output a sentence like, “2 to the power of 3 is 8, and 3 to the power
		 * of 2 is 9.” Run program until the user hit “x” to exit. Save as Power.java.
		 */

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("type x to exit or type enter to continue");
			String exit = sc.nextLine();
			if (exit.equals("x")) {
				break;
				
			}else {
				System.out.println("Please enter a number: ");
			double num1 = sc.nextDouble();
			System.out.println("Please enter another number: ");
			double num2 = sc.nextDouble();

			double a = Math.pow(num1, num2);
			double b = Math.pow(num2, num1);

			System.out.println(num1 + " to the power of " + num2 + " is " + a);
			System.out.println(num2 + " to the power of " + num1 + " is " + b);
			sc.nextLine();
			}
			
		}sc.close();

	}

}
