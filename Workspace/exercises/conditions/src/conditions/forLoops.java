package conditions;

import java.util.Scanner;

public class forLoops {

	public static void main(String[] args) {
		
		for (int i=0 ; i<11 ; i++) {
			//System.out.println("count is " + i);
		}
		for (int i=1000 ; i>0 ; i--) {
			System.out.println("count is " + i);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		
		for (int i=age ; i<age+30 ; i++) {
			System.out.println(i);
			
		}
		for (int i = 0 ; i<15 ; i++) 
		{	for (int j = 1; j<=i; j++);
			System.out.println("#");	
		}
		
		System.out.println("\n");
	}

		
}
	
		
