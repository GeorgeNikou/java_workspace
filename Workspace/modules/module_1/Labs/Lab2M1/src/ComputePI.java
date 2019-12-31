import java.util.Scanner;

public class ComputePI {

	public static void main(String[] args) {
		/*
		 * 8. Write a program called ComputePI to compute the value of π, using the
		 * following series expansion. You have to decide on the termination criterion
		 * used in the computation (such as the number of terms used or the magnitude of
		 * an additional term). Is this series suitable for computing π?
		 * 
		 * JDK maintains the value of π in a double constant called Math.PI. Compare the
		 * values obtained, in terms of the ratio between the value computed and the
		 * Math.PI, in percents.
		 * 
		 * Hint: Add to sum if the denominator modulus 4 is 1, and subtract from sum if
		 * it is 3.
		 */
		Scanner sc = new Scanner(System.in);
		long termination = 0;
		double sum = 0;
		boolean exit = false;
		
		System.out.println("please enter a termination: ");
		
		while (!sc.hasNextLong()) {
			System.out.println("please enter a termination: ");
			sc.nextLine();
		}
		//loop calculation pi decimals
		for (int x = 0; x < 1000; x++) {
			if (x % 4 == 1)
				sum += 1.0 / x;

			if (x % 4 == 3)
				sum -= 1.0 / x;

		}//multiply decimals to 4
		double myPi = 4*sum;
		System.out.println("My PI: " + myPi);
		System.out.println("real Pi: " + Math.PI);
		
		//calculate the precision
		System.out.println("precision " + (100-(myPi - Math.abs(myPi -  Math.PI)/ Math.PI )));
	}

}
