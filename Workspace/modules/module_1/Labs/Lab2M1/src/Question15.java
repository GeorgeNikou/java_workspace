import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		// 15. Read 10 values from the user and print the lowest and highest value
		// entered

		Scanner sc = new Scanner(System.in);
		int min = 0, max = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Please enter a number");
			int entry = sc.nextInt();
			if (i == 1) {
				min = entry;
				max = entry;
			}

			if (entry > max) {
				max = entry;

			}
			if (entry < min) {
				min = entry;
			}
		}
		System.out.println("The min is " + min + " and the max is " + max);

	}

}
