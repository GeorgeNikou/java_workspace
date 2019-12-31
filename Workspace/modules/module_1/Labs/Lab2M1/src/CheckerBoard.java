
public class CheckerBoard {

	public static void main(String[] args) {
		/*
		 * 10. Using only two for loops and without returning in your notes from
		 * PrepCourse, write a program called CheckerBoard that displays the following
		 * 7x7 checkerboard pattern:
		 * 
		 * # # # # # # # # # #
		 *  # # # # # # # # # #
		 * # # # # # # # # # # 
		 *  # # # # # # # # #
		 * # # # # # # # # # #
		 */
		
		for (int i = 1; i<=7; i++) {
			if (i%2==0)
				System.out.print(" ");
				for (int j = 1; j<=7; j++) {
					System.out.print("# ");
			}
		System.out.println();
		}
		

	}
	
}

