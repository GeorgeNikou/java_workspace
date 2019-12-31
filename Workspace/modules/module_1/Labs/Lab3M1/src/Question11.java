
public class Question11 {

	public static void main(String[] args) {
		/*
		 * 11. Write a code fragment Transpose.java to transpose a square
		 * two-dimensional array in place without creating a second array.
		 */

		int[][] a = new int[][] { { 1, 3, 5 }, { 2, 5, 7 }, { 4, 8, 10 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				System.out.print(a[i][j] + "\t");
			}

			System.out.println();
		}System.out.println("------------------");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				System.out.print(a[j][i] + "\t");

			}
			System.out.println();
		}

	}
}