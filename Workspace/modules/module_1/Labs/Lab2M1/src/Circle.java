import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {

		/*
		 * 1. Write a program that asks the user to input the radius of a circle then
		 * calculates and outputs the circumference and area, rounded to 2 decimal
		 * places. Run program until the user hit “x” to exit. Save as Circle.java.
		 */

		Scanner sc = new Scanner(System.in);
		double area, circumference;
		boolean exit = false;

		do {
			System.out.println("Enter the radius of the given circle\nOr Would you like to exit? (x)");
			if (sc.hasNextDouble()) {

				double rCircle = sc.nextDouble();
				sc.nextLine();
				area = Math.PI * Math.pow(rCircle, 2);
				circumference = 2 * Math.PI * rCircle;
				area = Math.round(area * 100) / 100;
				circumference = Math.ceil(circumference * 100) / 100;
				System.out.println(
						"the area of the given circle is " + area + " and the circumference is " + circumference);
			} else {
				String entry = sc.nextLine();
				if (entry.equals("x")) {
					System.out.println("goodbye");
					exit = true;
				}

			}
		} while (!exit);
	}

}
