import java.util.Scanner;

public class q1Edit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. Geometry
		 * 
		 * ========================================================= Start by greeting
		 * the user and give the following option: 1. Areas 2. Perimetre 3. Volume X.
		 * Exit
		 * 
		 * Depending of the choice give the following options
		 * 
		 * -Areas 1. Rectangle 2. Triangle 3. Square 4. Trapezoid 5. Parallelogram
		 * 
		 * -Perimeter 1. Rectangle 2. Triangle 3. Pentagone 4. Circle 5. Compound Shape
		 * (min 8 sides)
		 * 
		 * -Volume 1. Square 2. Retangle 3. Sphere 4. Pyramid 5. Cone -Exit
		 * 
		 * Ask the needed parameter (ex: to calculate the area of a square you need to
		 * know the side). In each program there should be an option to get back to the
		 * main menu. The only way to exit the program is by hitting "X" at the main
		 * menu. If the user selects and invalid choice from the menu, the program
		 * should display an error message. Remember why functions are used for, use
		 * them wisely. Number validation is a must.(No negative numbers or letters) Run
		 * until the users hit Exit Please make something USER FRIENDLY.
		 */

		String[] measurements = { "Area", "perimeter", "volume", " to exit" };
		String[] area = { "rectangle", "triangle", "square", "trapezoid", "parallelogram" };
		String[] perimeter = { "rectangle", "triangle", "pentagon", "circle", "compound shape" };
		String[] volume = { "square", "rectangle", "sphere", "pyramid", "cone" };

		boolean exit = false;
		int entry = 0; // user input for selection
		int width = 0, length = 0, height = 0, base = 0, base2 = 0, side = 0, side2 = 0, radius = 0;
		double tmp = 0, dside = 0, leng = 1, vRadius = 1, hei = 1, dRadius = 1;
		String temp = "";

		while (!exit) {
			System.out.println("please select one of the options below");
			System.out.println("______________________________________");
			System.out.println();
			for (int i = 0; i < measurements.length; i++) {
				System.out.println((i + 1) + ". " + measurements[i]);

			} // validating user input

			if (sc.hasNextInt() || sc.hasNextDouble()) {
				entry = sc.nextInt();

			} else {
				System.err.println("invalid");
				sc.nextLine();

			}

			if (entry < 0 || entry > 4) {
				sc.nextLine();
			}
			if (entry == 4)
				exit = true;

			// AREA MEASUREMENTS
			if (entry == 1) {
				System.out.println("please select one of thex folowing options");
				System.out.println(" ======================================= ");
				for (int i = 0; i < area.length; i++) {
					System.out.println((i + 1) + ". " + area[i]);
				}
				entry = sc.nextInt();

				if (entry == 1) {
					do {
						System.out.println("Please enter the length of the rectangle");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							length = sc.nextInt();
							if (length > 0)
								break;
						} else
							sc.next();

					} while (true);

					do {
						System.out.println("Please enter width of the rectangle");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							width = sc.nextInt();
							if (width > 0)
								break;
						} else
							sc.next();

					} while (true);

					int areaofRect = width * length;
					System.out.println("the area of the given rectangle is " + areaofRect);
				} else if (entry == 2) {
					do {
						System.out.println("please enter the base of the given triangle");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							entry = sc.nextInt();
							if (entry > 0)
								break;

						} else
							sc.next();

					} while (true);

					base = entry;
					do {
						System.out.println("please enter the height of the given triangle");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							entry = sc.nextInt();
							if (entry > 0)
								break;
						} else
							sc.next();

					} while (true);

					height = entry;
					double areaTriangle = (base * height) / 2d;
					System.out.println("the area of the triangle is : " + areaTriangle);

				} else if (entry == 3) {
					do {
						System.out.println("please enter the side of the square");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							entry = sc.nextInt();
							if (entry > 0)
								break;
						} else
							sc.next();

					} while (true);

					double areaSquare = Math.pow(entry, 2);
					System.out.println("the area of the given square is " + areaSquare);

				} else if (entry == 4) {
					do {
						System.out.println("Please enter the base#1 of the given trapezoid");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							entry = sc.nextInt();
							if (entry > 0)
								break;
						} else
							sc.next();

					} while (true);
					base = entry;

					do {
						System.out.println("Please enter the base#2 of the given trapezoid");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							entry = sc.nextInt();
							if (entry > 0)
								break;
						} else
							sc.next();
					} while (true);
					base2 = entry;

					do {
						System.out.println("please enter the height of the given trapezoid");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							entry = sc.nextInt();
							if (entry > 0)
								break;
						} else
							sc.next();

					} while (true);

					height = entry;
					int areaTrap = (base + base2) / 2 * height;
					System.out.println("the area of the given trapezoid is " + areaTrap);

				} else if (entry == 5) {
					do {
						System.out.println("Please enter the base of the given parallelogram");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							entry = sc.nextInt();
							if (entry > 0)
								break;
						} else
							sc.next();

					} while (true);

					base = entry;
					do {
						System.out.println("Please enter the height of the given parallelogram");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							entry = sc.nextInt();
							if (entry > 0)
								break;
						} else
							sc.next();

					} while (true);

					height = entry;
					int areaPara = base * height;
					System.out.println("the area of the given parallelogram is " + areaPara);

				}

			} // PERIMETER MEASUREMENTS
			if (entry == 2) {
				System.out.println("please select one of the folowing options");
				System.out.println(" ======================================= ");
				for (int i = 0; i < perimeter.length; i++) {
					System.out.println((i + 1) + ". " + perimeter[i]);

				}
				entry = sc.nextInt();
				if (entry == 1) {
					do {
						System.out.println("please enter the length of the given rectangle");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							length = sc.nextInt();
							if (length > 0)
								break;
						} else
							sc.next();

					} while (true);

					do {
						System.out.println("please enter the width of the given rectangle");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							width = sc.nextInt();
							if (width > 0)
								break;
						} else
							sc.next();

					} while (true);

					int peri = length + width;
					System.out.println("the perimeter of the given rectangle is " + peri);
					System.out.println();

				} else if (entry == 2) {
					do {
						System.out.println("Please enter side #1 of the given triangle");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							side = sc.nextInt();
							if (side > 0)
								break;
						} else
							sc.next();

					} while (true);

					do {
						System.out.println("Please enter side #2 of the given triangle");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							side2 = sc.nextInt();
							if (side2 > 0)
								break;
						} else
							sc.next();

					} while (true);

					do {
						System.out.println("Please enter the base of the given triangle");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							base = sc.nextInt();
							if (base > 0)
								break;
						} else
							sc.next();

					} while (true);

					int periTriangle = base + side + side2;
					System.out.println("The perimeter of the triangle is " + periTriangle);
					System.out.println();
				} else if (entry == 3) {
					do {
						System.out.println("please enter the side of the given pentagon");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							side = sc.nextInt();
							if (side > 0)
								break;
						} else
							sc.next();

					} while (true);

					int periPent = side * 5;
					System.out.println("the perimeter of the given pentagon is " + periPent);
					System.out.println();
				} else if (entry == 4) {
					do {
						System.out.println("Please enter the radius of the given circle");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							dRadius = sc.nextDouble();
							if (dRadius > 0)
								break;
						} else
							sc.next();

					} while (true);

					double periCircle = (2 * Math.PI) * dRadius;
					double dTmp = Math.round(periCircle * 100d) / 100d;
					System.out.println("The perimeter of the given circle is " + dTmp);
					System.out.println();
				} else if (entry == 5) {
					do {
						System.out.println("How many sides do you want to enter?");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							entry = sc.nextInt();
							if (entry > 0)
								break;
						} else
							sc.next();

					} while (true);

					for (int i = 0; i < entry; i++) {
						System.out.println("Enter a side of the given compound circle: "); // question for validation
						dside += sc.nextDouble();

					}
					System.out.println("the perimeter of the given circle is " + dside);

				}
			} // VOLUME MEASUREMENTS
			if (entry == 3) {

				System.out.println("please select one of the folowing options");
				System.out.println(" ======================================= ");
				for (int i = 0; i < volume.length; i++) {
					System.out.println((i + 1) + ". " + volume[i]);
				}
				do {

					if (sc.hasNextInt() || sc.hasNextDouble())
						break;
					else
						System.out.println("Must be a valid number");
					sc.next();

				} while (true);
				entry = sc.nextInt();
				if (entry == 1) {
					for (double i = 0; i < 3; i++) {
						do {
							System.out.println("please enter the side of the given square");

							if (!sc.hasNextInt()) {
								System.err.println("invalid");
								sc.next();
							} else if (leng > 0) {
								leng *= sc.nextDouble();
								break;
							} else if (i == 3)
								break;

						} while (true);

					}
					System.out.println("the volume of the square is : " + leng);
				} else if (entry == 2) {
					for (double i = 0; i < 3; i++) {
						do {
							System.out.println("please enter the side of the given rectangle");
							leng *= sc.nextDouble();
							if (leng > 0) {
								break;

							} else
								sc.next();

						} while (true);

					}
					System.out.println("the volume of the rectangle is : " + leng);
				} else if (entry == 3) {
					do {
						System.out.println("Please enter the radius of the given sphere");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							vRadius = sc.nextDouble();
							if (vRadius > 0)
								break;
						} else
							sc.next();

					} while (true);

					double volSphere = (4 / 3) * Math.PI * (Math.pow(vRadius, 3));
					System.out.println("The volume of the sphere is " + volSphere);
				} else if (entry == 4) {
					do {
						System.out.println("Please enter the length of the given pyramid");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							length = sc.nextInt();
							if (length > 0)
								break;
						} else
							sc.next();

					} while (true);

					do {
						System.out.println("Please enter the width");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							width = sc.nextInt();
							if (width > 0)
								break;
						} else
							sc.next();

					} while (true);

					do {
						System.out.println("Please enter the height");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							height = sc.nextInt();
							break;
						} else
							sc.next();

					} while (true);

					int volPyr = (length * width * height) / 3;
					System.out.println("The volume of the pyramid is " + volPyr);
				} else if (entry == 5) {
					do {
						System.out.println("Please enter the height of the given cone");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							hei = sc.nextDouble();
							if (hei > 0)
								break;
						} else
							sc.next();

					} while (true);

					do {
						System.out.println("Please enter the radius");
						if (sc.hasNextInt() || sc.hasNextDouble()) {
							vRadius = sc.nextDouble();
							if (vRadius > 0)
								break;
						} else
							sc.next();

					} while (true);

					double volCone = (Math.PI * Math.pow(vRadius, 2)) * hei / 3;
					volCone = Math.round(volCone * 100d) / 100d;
					System.out.println("The volume of the cone is " + volCone);
				}
			}
			if (temp.equalsIgnoreCase("x"))
				exit = true;

		}
	}

}
