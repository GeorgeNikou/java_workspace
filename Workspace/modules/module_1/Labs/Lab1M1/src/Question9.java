import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		
		/*9. Create a small application to in order to convert a Celcius temperature taken from the user to Fahrenheit.
		Remember 1 degree Fahrenheit is equal to 1 degree Celcuis * 1.8 + 32*/
		
				//CREATE THE SCANNER
		Scanner sc = new Scanner(System.in);
			
		
				
				//RETRIEVING THE REQUIRED INPUT FROM USER(celcius)
		System.out.println("Please enter the degrees in celcius");
				
				//CREATING OUR NEEDED VARIABLES
		double celcius = sc.nextDouble();
		double farenheit = celcius * 1.8 +32;
				
				//GIVING THE DEGREES FROM CELCIUS TO FARENHEIT TO THE USER
		System.out.println("degrees in celcius to farenheit is: " + farenheit);
				
		

	}

}
