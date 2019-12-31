import java.lang.invoke.VolatileCallSite;
import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Question1 {

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

		String[] measurements = { "Area", "perimeter", "volume", "X to exit" };
		String[] area = { "rectangle", "triangle", "square", "trapezoid", "parallelogram" };
		String[] perimeter = { "rectangle", "triangle", "pentagon", "circle", "compound shape" };
		String[] volume = { "square", "rectangle", "sphere", "pyramid", "cone" };

		boolean exit = false;
		int entry = 0; // user input for selection
		int width = 0, length = 0, height = 0, base = 0, base2 = 0, side = 0, side2 = 0, radius = 0;
		double tmp = 0, dside = 0, leng = 1, vRadius = 1, hei = 1;

		while (!exit) {
			System.out.println("please select one of the options below");
			System.out.println("______________________________________");
			System.out.println();
			for (int i = 0; i < measurements.length; i++) {
				System.out.println((i + 1) + ". " + measurements[i]);

			} // validating user input
			try {
				entry = sc.nextInt();
			} catch (Exception e) {
				System.err.println("Entry must be a number");
				sc.nextLine();
			}

			if (entry < 0 || entry > 4)
				System.err.println("Option not found");

			// AREA MEASUREMENTS
			if (entry == 1) {
				System.out.println("please select one of the folowing options");
				System.out.println(" ======================================= ");
				for (int i = 0; i < area.length; i++) {
					System.out.println((i + 1) + ". " + area[i]);
				}
				entry = sc.nextInt();

				if (entry == 1) {
					System.out.println("Please enter the length of the rectangle");
					length = sc.nextInt();
					System.out.println("Please enter width of the rectangle");
					width = sc.nextInt();
					int areaofRect = width * length;
					System.out.println("the area of the given rectangle is " + areaofRect);
				} else if (entry == 2) {
					System.out.println("please enter the base of the given triangle");
					entry = sc.nextInt();
					base = entry;
					System.out.println("please enter the height of the given triangle");
					entry = sc.nextInt();
					height = entry;
					double areaTriangle = (base * height) / 2;
					System.out.println("the area of the triangle is : " + areaTriangle);

				} else if (entry == 3) {
					System.out.println("please enter the side of the square");
					entry = sc.nextInt();
					double areaSquare = Math.pow(entry, 2);
					System.out.println("the area of the given square is " + areaSquare);

				} else if (entry == 4) {
					System.out.println("Please enter the base#1 of the given trapezoid");
					entry = sc.nextInt();
					base = entry;
					System.out.println("Please enter the base#2 of the given trapezoid");
					entry = sc.nextInt();
					base2 = entry;
					System.out.println("please enter the height of the given trapezoid");
					entry = sc.nextInt();
					height = entry;
					int areaTrap = (base + base2) / 2 * height;
					System.out.println("the area of the given trapezoid is " + areaTrap);

				} else if (entry == 5) {
					System.out.println("Please enter the base of the given parallelogram");
					entry = sc.nextInt();
					base = entry;
					System.out.println("Please enter the height of the given parallelogram");
					entry = sc.nextInt();
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
					System.out.println("please enter the length of the given rectangle");
					length = sc.nextInt();
					System.out.println("please enter the width of the given rectangle");
					width = sc.nextInt();
					int peri = length + width;
					System.out.println("the perimeter of the given rectangle is " + peri);
					System.out.println();

				} else if (entry == 2) {
					System.out.println("Please enter side #1 of the given triangle");
					side = sc.nextInt();
					System.out.println("Please enter side #2 of the given triangle");
					side2 = sc.nextInt();
					System.out.println("Please enter the base of the given triangle");
					base = sc.nextInt();
					int periTriangle = base + side + side2;
					System.out.println("The perimeter of the triangle is " + periTriangle);
					System.out.println();
				} else if (entry == 3) {
					System.out.println("please enter the side of the given pentagon");
					side = sc.nextInt();
					int periPent = side * 5;
					System.out.println("the perimeter of the given pentagon is " + periPent);
					System.out.println();
				} else if (entry == 4) {
					System.out.println("Please enter the radius of the given circle");
					double dRadius = sc.nextDouble();
					double periCircle = (2 * Math.PI) * dRadius;
					double dTmp = Math.round(periCircle * 100d) / 100d;
					System.out.println("The perimeter of the given circle is " + dTmp);
					System.out.println();
				} else if (entry == 5) {
					System.out.println("How many sides do you want to enter?");
					entry = sc.nextInt();
					for (int i = 0; i < entry; i++) {
						System.out.println("Enter a side of the given compound circle: ");
						dside += sc.nextDouble();

					}
					System.out.println("the perimeter of the given circle is " + dside);

				}
			}
			if (entry == 3) {
				System.out.println("please select one of the folowing options");
				System.out.println(" ======================================= ");
				for (int i = 0; i < volume.length; i++) {
					System.out.println((i + 1) + ". " + volume[i]);
				}
				entry = sc.nextInt();
				if (entry == 1) {
					for (double i = 0; i < 3; i++) {
						System.out.println("please enter the side of the given square");
						leng *= sc.nextDouble();

					}
					System.out.println("the volume of the square is : " + leng);
				} else if (entry == 2) {
					for (double i = 0; i < 3; i++) {
						System.out.println("please enter the side of the given square");
						leng *= sc.nextDouble();
					}
					System.out.println("the volume of the rectangle is : " + leng);
				} else if (entry == 3) {
					System.out.println("Please enter the radius of the given circle");
					vRadius = sc.nextDouble();
					double volSphere = (4 / 3) * Math.PI * (Math.pow(vRadius, 3));
					System.out.println("The volume of the sphere is " + volSphere);
				} else if (entry == 4) {
					System.out.println("Please enter the length of the given pyramid");
					length = sc.nextInt();
					System.out.println("Please enter the width");
					width = sc.nextInt();
					System.out.println("Please enter the height");
					height = sc.nextInt();
					int volPyr = (length * width * height) / 3;
					System.out.println("The volume of the pyramid is " + volPyr);
				} else if (entry == 5) {
					System.out.println("Please enter the height of the given cone");
					hei = sc.nextDouble();
					System.out.println("Please enter the radius");
					vRadius = sc.nextDouble();
					double volCone = (Math.PI * Math.pow(vRadius, 2)) * hei / 3;
					volCone = Math.round(volCone * 100d) / 100d;
					System.out.println("The volume of the cone is " + volCone);
				}
			} // if()

		}
	}
}