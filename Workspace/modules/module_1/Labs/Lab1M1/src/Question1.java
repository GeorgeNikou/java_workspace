import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
	
		/*1. Write a program to prompt the user to fill out a form with the following fields:
			First Name (string)
			Last Name (string)
			Address (string)
			City (string)
			Postal Code (string)
			Phone number (string)
			Age (byte)
			earning per hour (float)
			Then output the following:
			
			Your name is 	: (firstname and lastname)
			Your address 	: (whole address)
			Your age is 	: (age)
			Your age in light year
			Your earning 	:
			Your earning in 100 years ago: (earning / age)
			Your earning in a near future: (earning x 1.7 + age)*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your first name");
		String firstName = sc.nextLine();
		System.out.println("Your name is: "+ firstName);
		
		System.out.print("Please enter your last name");
		String lastName = sc.next();
		sc.nextLine();
		System.out.println("Your last name is: "+ lastName);
		
		System.out.print("Please enter your adress");
		String adress = sc.nextLine();
		System.out.println("Your adress is: "+ adress);
		
		
		System.out.print("Please enter your city");
		String city = sc.next();
		sc.nextLine();
		System.out.println("Your city is: "+ city);
		
		System.out.print("Please enter your postal code");
		String postalCode = sc.nextLine();
		System.out.println("Your postal code is: "+ postalCode);
		
		System.out.print("Please enter your phone number");
		String phoneNumber = sc.next();
		System.out.println("Your phone number is: "+ phoneNumber);
		
		
		System.out.print("Please enter your age");
		byte age = sc.nextByte();
		long ageLight = age * 9460730472580800l;
		System.out.println("Your age is "+ age + " and your age in light years is " + ageLight);
		
		
		
		System.out.print("Please enter your hourly pay");
		float hourlyPay = sc.nextFloat();
		System.out.println("Your hourly pay is: "+ hourlyPay);
		
		System.out.println("your earnings 100 years ago was: "+ hourlyPay/age);
		
		
		System.out.println("and your earnings in the near future will be: " + hourlyPay*1.7+age);
		
		
		
		
		

	}

}
