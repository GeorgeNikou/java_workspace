import java.util.Random;

public class Question1 {

	public static void main(String[] args) {
		Random r = new Random();
		/*
		 * 1. Create a 2dArray of size 100 fill with random numbers. Write a program to
		 * output the sum of each row of the 2dArray Write a program to output the sum
		 * of each column of 2dArray Write a program to output the maximum element of
		 * each row in the 2dArray
		 */
		int[][] rNumbers = new int[10][10];
		int row = 0, col = 0;
		int sumRow = 0;
		int[] sumCol = new int[10];
		int maxNumbers = 0;

		// CREATED A 2DARRAY OF SIZE 100 WITH RANDOM NUMBERS
		/*
		 * for (int i = 0; i < rNumbers.length; i++) { for (int j = 0; j <
		 * rNumbers[i].length; j++) { rNumbers[i][j] = r.nextInt(25) + 25;
		 * System.out.print(rNumbers[i][j] + " | ");
		 * 
		 * }System.out.println();
		 * 
		 * }
		 */

		// SUM OF THE ROW AND COLOUMN
		for (int i = 0; i < rNumbers.length; i++) {
			maxNumbers = rNumbers[i][0];
			for (int j = 0; j < rNumbers[i].length; j++) {
				rNumbers[i][j] = r.nextInt(10) + 1;
				System.out.print(rNumbers[i][j] + "  |  ");
				sumRow += rNumbers[i][j];
				sumCol[j] += rNumbers[i][j];
				maxNumbers = Math.max(maxNumbers, rNumbers[i][j]);

			}
			System.out.println("Sum of row: " + sumRow + " | maximum in this row: " + maxNumbers);
			sumRow = 0;
			System.out.println();

		}
		for (int i : sumCol) {
			System.out.print(i + "    ");
		}

	}

}
