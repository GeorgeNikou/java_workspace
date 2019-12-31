
public class SumAndAverage {

	public static void main(String[] args) {
		/*
		 * 7. Write a program called SumAndAverage to produce the sum from 111 to 8989.
		 * Also compute and display the average. The output shall look like: The sum is
		 * 40399450 The average is 4550.0 Using a for loop. Using a while loop. Using a
		 * do while loop.
		 */

		// FOR LOOP

		int sum = 0, average = 0;
		for (int i = 111; i <= 8990; i++) {
			sum += i;
			if (i == 8989) {
				average = sum / 8879;

			}
		}
		System.out.println("The sum is " + sum + " and the average is " + average);

		// WHILE LOOP
		int average2 = 0;
		int sum2 = 0;
		int i = 111;
		while (true) {
			if (i <= 8989) {
				sum2 += i;
				i++;
				average2 = sum2 / 8879;

			} else {
				System.out.println("The sum is " + sum2 + " and the average is " + average2);
				break;
			}

		}

		int i3 = 111, sum3 = 0, average3 = 0;
		do {

			if (i3 <= 8989) {
				sum3 += i3;
				i3++;

				average3 = sum3 / 8879;

			}

		} while (i3 <= 8989);
		System.out.println("The sum is " + sum3 + " and the average is " + average3);

	}
}
