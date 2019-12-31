package conditions;

import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		// INFINITE WHILE LOOP
		/*
		 * int count = 0;
		 * 
		 * while(true) { System.out.println("Counter: " + count); count++;
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("enter your name");
		String name = sc.next();
		boolean exit = false;
		while (!exit) {
			System.out.println("hello " + name + "\nX to exit");

			if (name.equalsIgnoreCase("X"))
				exit = true;

		}

	}

}
