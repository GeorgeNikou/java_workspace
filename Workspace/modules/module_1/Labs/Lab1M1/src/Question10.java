import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		

		/*10. Create a program to calculate the following (check on google for the formula):
		- area of a circle
		- area of a triangle
		- volume of a circle
		- volume of a trapezoid
		- area of an equilateral triangle*/
		
									//CIRCLE//
		
				//CREATING OUR SCANNER TO RETRIEVE INPUTS FROM THE USER
		Scanner sc = new Scanner(System.in);
		
			
		
				//ASKING FOR THE USERS INPUT
		System.out.println("please enter the radius of the circle");
				
				//CREATING VARIABLE FOR THE AREA OF AN CIRCLE
		double radius = sc.nextDouble();
		double area = 3.14 * Math.pow(radius, 2);
		
				//DISPLAYING THE AREA OF THE CIRCLE
		System.out.println("The area of the circle is: " + area);
		
									//TRIANGLE//
		
				//ASKING FOR THE USERS INPUT
		System.out.println("Please enter the height of the triangle");
		double height = sc.nextDouble();
		
		System.out.println("Please enter the base of the triangle");
		double base = sc.nextDouble();
		
				//GIVING THE AREA OF THE TRIANGLE
		double area2 = height * base / 2;
		System.out.println("the area of the given triangle is: " + area2);
		
									//V.SPHERE
		
				//ASK THE USER FOR THE RADIUS OF THE SPHERE
		System.out.println("Give me the radius of the sphere please");
		double radius2 = sc.nextDouble();
		
				//CREATE THE VARIABLE WITH FORMULA
		double volume = 4.00/3.00 * Math.PI * Math.pow(radius2, 3);
		
		
				//OUTPUT THE VOLUME OF THE GIVEN SPHERE
		System.out.println("the volume of the sphere is: " + volume);
		
		
									//V.TRAPEZOID
		
				//ASK THE USER FOR THE PORPER MEASUREMENTS OF THE TRAPEZOID
		System.out.println("please enter the length of the trapezoid");
		double length = sc.nextDouble();
		System.out.println("please enter the height of the trapezoid");
		double height2 = sc.nextDouble();
		System.out.println("please enter the base width of the trapezoid");
		double baseWidth = sc.nextDouble();
		System.out.println("please enter the top width of the trapezoid");
		double topWidth = sc.nextDouble();
		
		double volume2 = length * height2 * (baseWidth + Math.pow(topWidth, 2));
		
				//MAKE THE FINAL CALCULATION AND OUTPUT THE RESULTS
		System.out.println("the volume of the given trapezoid is: " + volume2);
		
		
									//A.EQUILATERAL TRIANGLE
		
		//ASKING THE USER FOR PROPER MEASUREMENTS OF THE EQUILATERAL RIANGLE
				System.out.println("Please enter the side measurement");
				double side = sc.nextDouble();
				
				
		//CREATING OUR VARIABLE FOR CALCULATIONS
				double area3 = Math.sqrt(3) / 4 * Math.pow(side, 2);
				
		//OUTPUTING THE ANSWER TO THE USER
				System.out.println("the area of the given equilateral triangle is: " + area3);
			
		
		
	}

}
