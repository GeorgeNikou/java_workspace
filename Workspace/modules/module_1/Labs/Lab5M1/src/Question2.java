import java.util.Scanner;

public class Question2 {
	public static double meterInch(double a) {
		return a / 0.0254d;
	}

	public static double inchMeter(double a) {
		return a * 0.0254d;
	}

	public static double meterFeet(double a) {
		return a / 0.3048d;
	}

	public static double feetMeter(double a) {
		return a * 0.3048;
	}

	public static double farCel(double a) {
		return (a - 32) / 1.8;
	}

	public static double celFar(double a) {
		return a * 9 / 5 + 32;
	}

	public static double farKev(double a) {
		return 5d / 9d * (a - 32d) + 273d;
	}
	public static double kevFar(double a) {
		return 9/5d * (a-273d) + 32d;
	}

	public static void main(String[] args) {
		/*
		 * 2.Conversion Write an application to convert distances and degree
		 * 
		 * ========================================================= Start by greeting
		 * the user and give the following option: 1. Miles - Kilometers 2. Meters -
		 * Inches 3. Meters - Feet 4. Ferenheit - Celcius 5. Farenheit - Kelvin X. Exit
		 * 
		 * Depending on the choice, ask for the following -Miles - Kilometers 1. Miles
		 * -> Kilometers 2. Kilometers -> Miles
		 * 
		 * -Meters - Inches 1. Meters -> Inches 2. Inches -> Meters
		 * 
		 * -Meters - Feet 1. Meters -> Feet 2. Feet -> Meters
		 * 
		 * -Farenheit - Celcius 1. Farenheit -> Celcius 2. Celcius -> Farenheit
		 * 
		 * -Farenheit - Kelvin 1. Farenheit -> Kelvin 2. Kelvin -> Farenheit
		 * 
		 * 
		 * Ask the distance or degree to convert. In each program there should be an
		 * option to get back to the main menu. The only way to exit the program is by
		 * hitting "X" at the main menu. If the user selects and invalid choice from the
		 * menu, the program should display an error message. Remember why functions are
		 * used for, use them wisely. Number validation is a must. (No negative numbers
		 * or letters) Run until the users hit Exit Please make something USER FRIENDLY.
		 */

		Scanner sc = new Scanner(System.in);
		String[] menu = { "Miles - Kilometers", "Meters - Inches", "Meters - Feet", "Ferenheit - Celcius",
				"Farenheit - Kelvin", "=== exit ===" };
		String[] milesToKm = { "Miles -> Kilometers", "Kilometers -> Miles" };
		String[] metersToInches = { "Meters -> inches", "Inches -> Meters" };
		String[] metersToFeet = { "meters -> Feet", "Feet -> Meters" };
		String[] ferToCel = { "Farenheit -> Celcius", "Celcius -> Farenheit" };
		String[] ferToKel = { "Farenheit -> Kelvin", "Kelvin -> Farenheit" };
		boolean exit = false;
		int entry = 0;
		String tmp = "";
		double miles = 0, kilom = 0, meters = 1, inches = 1;

		while (!exit) {
			System.out.println("Please select one of the folowing options below");
			System.out.println("____________________________________");
			System.out.println();

			for (int i = 0; i < menu.length; i++) {
				System.out.println((i + 1) + ". " + menu[i]);

			}

			if (!sc.hasNextInt() || !sc.hasNextDouble()) {
				System.err.println("ERROR!");
				sc.nextLine();
			} else
				entry = sc.nextInt();
			if (entry < 0 || entry > 6) {
				System.err.println("ERROR!");
				sc.nextLine();
			}
			if (entry == 6)
				exit = true;

			if (entry == 1) {
				do {
					System.out.println("Select 1 or 2");
					System.out.println("=======================");
					for (int i = 0; i < milesToKm.length; i++) {
						System.out.println(i + 1 + ". " + milesToKm[i]);
					}
					if (sc.hasNextInt()) {
						entry = sc.nextInt();
						break;
					} else
						sc.nextLine();

				} while (true);

				if (entry == 1) {
					do {
						System.out.println("please enter the distance in miles");
						if (sc.hasNextInt() || sc.hasNextDouble())
							break;
						else
							sc.next();
					} while (true);
					miles = sc.nextDouble();
					double mtk = miles / 0.62137d;
					mtk = Math.round(mtk * 100d) / 100d;
					System.out.println(miles + " miles" + " is " + mtk + "km");

				} else if (entry == 2) {
					do {
						System.out.println("Please enter the distance in kilometers");
						if (sc.hasNextInt() || sc.hasNextDouble())
							break;
						else
							sc.next();
					} while (true);
					kilom = sc.nextDouble();
					miles = kilom * 0.62137d;
					double kmt = Math.round(miles * 100d) / 100d;
					System.out.println(kilom + "km" + " is " + kmt + "miles");

				}

			}
			if (entry == 2) {
				do {
					System.out.println("Select 1 or 2");
					System.out.println("=======================");
					for (int i = 0; i < metersToInches.length; i++)
						System.out.println(i + 1 + ". " + metersToInches[i]);
					if (sc.hasNextInt()) {
						break;

					} else
						sc.next();
				} while (true);
				entry = sc.nextInt();
				if (entry == 1) {
					do {
						System.out.println("Please enter the measurement in meters");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							break;

						} else
							sc.next();
					} while (true);
					meters = sc.nextDouble();
					meters = meterInch(meters);
					System.out.println(Math.round(meters * 100d) / 100d);

				} else if (entry == 2) {
					do {
						System.out.println("Please enter the measurment in inches");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							break;

						} else
							sc.next();

					} while (true);
					meters = sc.nextDouble();
					meters = inchMeter(meters);
					System.out.println(Math.round(meters * 1000d) / 1000d);
				}
			}
			if (entry == 3) {
				do {
					System.out.println("Select 1 or 2");
					System.out.println("=======================");
					for (int i = 0; i < metersToFeet.length; i++)
						System.out.println(i + 1 + ". " + metersToFeet[i]);

					if (sc.hasNextInt()) {
						entry = sc.nextInt();
						break;
					} else
						sc.nextLine();
				} while (true);
				if (entry == 1) {
					do {
						System.out.println("enter meters for conversion");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							break;
						} else
							sc.next();
					} while (true);
					meters = sc.nextDouble();
					meters = meterFeet(meters);
					System.out.println(Math.round(meters * 1000d) / 1000d);
				}
				if (entry == 2) {
					do {
						System.out.println("enter feet for conversion");
						if (sc.hasNextInt() || sc.hasNextDouble())
							break;
						else
							sc.next();
					} while (true);
					meters = sc.nextDouble();
					meters = feetMeter(meters);
					System.out.println(Math.round(meters * 1000d) / 1000d);
				}
			}
			if (entry == 4) {
				do {
					System.out.println("Select 1 or 2");
					System.out.println("=======================");
					for (int i = 0; i < ferToCel.length; i++)
						System.out.println(i + 1 + ". " + ferToCel[i]);
					if (sc.hasNextInt()) {
						break;

					} else
						sc.next();
				} while (true);
				entry = sc.nextInt();
				if (entry == 1) {
					do {
						System.out.println("enter fareinheit for conversion");
						if (sc.hasNextInt())
							break;
						else
							sc.next();
					} while (true);
					meters = sc.nextDouble();
					meters = farCel(meters);
					System.out.println(Math.round(meters * 100d) / 100d);
				}
				if (entry == 2) {
					do {
						System.out.println("enter celcius for conversion");
						if (sc.hasNextInt() || sc.hasNextDouble())
							break;
						else
							sc.next();
					} while (true);
					meters = sc.nextDouble();
					meters = celFar(Math.round(meters * 10d) / 10d);
					System.out.println(meters);
				}
			}
			if (entry == 5) {
				do {
					System.out.println("Select 1 or 2");
					System.out.println("=======================");
					for (int i = 0; i < ferToKel.length; i++)
						System.out.println(i + 1 + ". " + ferToKel[i]);
					if (sc.hasNextInt()) {
						break;

					} else
						sc.next();
				} while (true);
				entry = sc.nextInt();
				if (entry == 1) {
					do {
						System.out.println("Enter Fareinheit for conversion");
						if (sc.hasNextInt() || sc.hasNextDouble())
							break;
						else
							sc.next();
					} while (true);
					meters = sc.nextDouble();
					meters = farKev(Math.round(meters * 1000d) / 1000d);
					System.out.println(meters);
				} else if (entry == 2) {
					do{
						System.out.println("Enter Kelvin for conversion");
						if(sc.hasNextInt() || sc.hasNextDouble())
							break;
						else
							sc.next();
					}while(true);
					meters = sc.nextDouble();
					meters = kevFar(Math.round(meters*100d)/100d);
					System.out.println(meters);
				
					
				}
			}

		}

	}
}