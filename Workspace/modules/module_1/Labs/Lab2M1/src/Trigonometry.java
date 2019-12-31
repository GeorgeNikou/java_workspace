import java.util.Scanner;

public class Trigonometry {

	public static void main(String[] args) {
		/*
		 * 4. Write a program that asks the user for an angle in degrees between 0 and
		 * 180 and outputs the sine, cosine and tangent of that angle, rounded to 2
		 * decimal places. Run program until the user hit “x” to exit. Save as
		 * Trigonometry.java.
		 */

		Scanner sc = new Scanner(System.in);
		double sine, cosine, tangent;
		while (true) {
			System.out.println("Please enter a angle in degrees between 0 and 180: \nType x to exit");

			if (sc.hasNextDouble()) {
				double angle = sc.nextDouble();
				sc.nextLine();
				sine = Math.sin(Math.toRadians(angle));
				cosine = Math.cos(Math.toRadians(angle));
				tangent = Math.tan(Math.toRadians(angle));

				sine = (double) Math.round(sine * 100) / 100;
				cosine = (double) Math.round(cosine * 100) / 100;
				tangent = (double) Math.round(tangent * 100) / 100;

				System.out.println(" sine: " + sine + " cosine: " + cosine + " tangent: " + tangent);
			} else {
				String exit = sc.nextLine();
				if (exit.equals("x")) {
					System.out.println("Goodbye!");
					break;
				}
					
				
			}

		}

	}

}
