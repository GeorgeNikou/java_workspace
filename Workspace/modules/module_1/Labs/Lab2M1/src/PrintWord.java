import java.util.Scanner;

public class PrintWord {

	public static void main(String[] args) {
		/*
		 * 6. Write a program called PrintWord which prints "ONE", "TWO",... , "NINE",
		 * "OTHER" if the int variable "number" is 1, 2,... , 9 or other, respectively.
		 * Use (a) a "nested-if" statement; (b) a "switch-case" statement.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Please choose a number between 1 and 9: ");
		int number = sc.nextInt();
		
		switch (number) {
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		case 6:
			System.out.println("SIX");
			break;
		case 7:
			System.out.println("SEVEN");
			break;
		case 8:
			System.out.println("EIGHT");
			break;
		case 9:
			System.out.println("NINE");
			break;
		case 0:
			System.out.println("OTHER");
			break;
		default:
			System.out.println("invalid answer");
			break;

		}
		System.out.println("Please choose a number between 1 and 9: ");
		int number2 = sc.nextInt();
		
		if(number2 == 1) {
			System.out.println("ONE");
		}else if(number2 == 2) {
			System.out.println("TWO");
		}else if(number2 == 3) {
			System.out.println("THREE");
		}else if(number2 == 4) {
			System.out.println("FOUR");
		}else if(number2 == 5) {
			System.out.println("FIVE");
		}else if(number2 == 6) {
			System.out.println("SIX");
		}else if(number2 == 7) {
			System.out.println("SEVEN");
		}else if(number2 == 8) {
			System.out.println("EIGHT");
		}else if(number2 == 9) {
			System.out.println("NINE");
		}else if(number2<=0 || number2>9) {
			System.out.println("invalid answer");
		}else {
			System.out.println("OTHER");
		}
		
	}

}
