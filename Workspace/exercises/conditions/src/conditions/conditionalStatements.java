package conditions;

import java.util.Scanner;

public class conditionalStatements {

	private static final int String = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("please enter a number: "); String entry = sc.nextLine();
		 * double num = Double.valueOf(entry).doubleValue();
		 * 
		 * System.out.println("Number :" + num);
		 * 
		 * if(sc.hasNextInt()) { int num1 = sc.nextInt(); }else {
		 * System.out.println("sorry this not a number!");
		 * 
		 * }
		 * 
		 * 
		 * System.out.println("Please enter your name"); String entry2 = sc.nextLine();
		 */

		/*
		 * System.out.println("enter a number: ");
		 * 
		 * if (sc.hasNextDouble()) { double num = sc.nextDouble();
		 * System.out.println("you entered :" + num + "!"); if (num < 0) {
		 * System.out.println("the number must be a positive number");
		 * 
		 * }
		 * 
		 * } else { System.out.println("invalid answer"); }
		 */

		String g = "george";
		String t = "thomas";
		String j = "jeffrey";

		System.out.println("please enter your name");

		if (sc.hasNext(g) || sc.hasNext(t) || sc.hasNext(j)) {
			String name = sc.nextLine();
			System.out.println("hello " + name);
			
			System.out.println("Please enter your age");
			int age = sc.nextInt();
			
		if (age < 120)
			System.out.println("You are " + age + " years old");
		else if (age > 120)
				System.out.println("Liar!");

			
		} else {
			System.out.println("invalid name!");
			String name = sc.next();
		}
	}
}
