import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		
		/*8. Create a program to calculate pounds to kilogram. Our program will convert a weight expressed in pounds into kilograms.
		a. Our input is the weight in pounds.
		b. Our output is the weight in kilograms
		c. We also know that Kilograms = Pounds / 2.2*/
		
		//USING SCANNER TO OBTAIN POUNDS FROM THE USER
		Scanner sc = new Scanner(System.in);
		
		
		//ASKING THE USER FOR POUNDS AND DECLARING OUR POUND TO KILO VARIABLE
		System.out.println("please enter pounds");
		float pounds = sc.nextFloat();
		float poundsToKilo = pounds/2.2f;
		
		//GIVING THE USER THE CONVERSION OF POUNDS TO KILOGRAMS
		System.out.println("total kilograms from pounds is: " + poundsToKilo);
		
		
		
	}

}
