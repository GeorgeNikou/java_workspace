package conditions;

import java.util.Random;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		boolean exit = false;

		/*// int[] intArray = {1,2,3,4,5,6,7};

		// for (int i = 0; i<intArray.length; i++ )
		// System.out.println("index: " + i + " : " + intArray[i]);

		// int[] numbers = { 1, 5, 6, 9, 10, 22, 35, 65, 77, 89 };
		// for (int i = 0; i<numbers.length; i++ )
		// System.out.println("index: " + i + " : " + numbers[i]);

		// for (int i = numbers.length-1; i>0; i-- )
		// System.out.println(numbers[i]);

		// ERROR
		// for (int i = 0; i <3 ; i++)
		// System.out.println(numbers[3] + numbers[5] + numbers[8]);
		// int value[]= new int[10];

		// for(int i = 0; i<10; i++) {
		// System.out.println("please enter a number: ");
		// value[i] = sc.nextInt();

		// }System.out.println(Arrays.toString(value));

		int[] number = new int[10];
		String entry;
		boolean exit = false;
		
		//getting 10 numbers and storing them into an array
		for (int i = 0; i < number.length; i++) {
			do {
				System.out.println("please enter number " + (i + 1));

				if (!sc.hasNextInt())
					sc.nextLine();
				else
					exit = true;
			} while (!exit);
			
			
		}//display the array
		/*for(int i = 0;i<numbers.length;i++)
			System.out.println("index: " i++);
			
			
*/	
		String[] words = new String[10];
		
		for(int i = 0; i<words.length; i++) {
			do {
				System.out.println("enter word");
				words[i] = sc.nextLine();
				
				if (!sc.hasNextInt())
					sc.nextLine();
				else
					exit = true;
				
			}while(!exit);
			System.out.println(words);
		}
			String[] passwords = {"pass", "pass2","pass3","pass4","pass5"};
			String entry;
			
			System.out.println("please enter your password");
			entry = sc.nextLine();
			
			for(String str : passwords)
				if(str.equals(entry));
					
			String [][] students = new String[2][6];
			
			students[0][0] = "janny";
			students[0][1] = "janny";
			students[0][2] = "janny";
			
			students[0][3] = "janny";
			students[0][4] = "janny";
			students[0][5] = "janny";
			
			students[1][0] = "janny";
			students[1][1] = "janny";
			students[1][2] = "janny";
			
			students[1][3] = "janny";
			students[1][4] = "janny";
			students[1][5] = "janny";
			
			for (int row = 0; row < students.length; row++) {
				for (int col = 0; col < students[row].length; col++)
					System.out.println(students[row][col] + "\t");
			}
			System.out.println();
	}
			
}
