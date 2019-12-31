import java.util.Random;
import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// 12. Write a program Deal.java that takes a command-line argument N and prints
		// N poker hands (five cards each) from a shuffled deck, as shown below.
		Scanner sc = new Scanner(System.in);
		String[] suits = { "hearts", "clover", "diamond", "spades" };
		String[] num = { " A ", " 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 ", " 8 ", " 9 ", " 10 ", " j ", " Q ", " K " };
		String[] deck = new String[suits.length * num.length];
		Random r = new Random();
		int randIndex = 0;
		int entry = 0;

		// creating the deck
		int p = 0;
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < num.length; j++) {

				while (deck[randIndex] != null)
					randIndex = r.nextInt(deck.length);

				// System.out.println(randIndex);
				deck[randIndex] = suits[i] + num[j];

			}

		}

		// display the deck
		for (int i = 0; i < deck.length; i++) {
			System.out.print(deck[i] + " ");

		}
		System.out.println();
		while (true) {
			System.out.print("how many players will play?");
			entry = sc.nextInt();
			break;
		}
		for (int i = 0; i <= entry * 5; i++) {
			System.out.println(deck[i] + " ");
			if(i %5==0) {
				System.out.println();
				
			}
				
			
				
				
			}
			
		}

	}


