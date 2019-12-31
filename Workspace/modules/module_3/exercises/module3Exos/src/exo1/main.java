package exo1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		author a1 = new author();
	
		
		System.out.println("enter name: ");
		a1.setName(sc.nextLine());
		System.out.println("enter email: ");
		a1.setEmail(sc.nextLine());
		System.out.println("enter book name: ");
		a1.setBookName(sc.nextLine());
		
		System.out.print(a1.description());
		
		
		
		
		
		

	}

}
