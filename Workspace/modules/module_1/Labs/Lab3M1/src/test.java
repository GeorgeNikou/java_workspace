import java.util.Random;

public class test {

	public static void main(String[] args) {
		// 12. Write a program Deal.java that takes a command-line argument N and prints
        // N poker hands (five cards each) from a shuffled deck, as shown below.

        String[] suits = {"hearts", "clover", "diamond", "spades"};
        String[] num = {" A "," 1 ", " 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 ", " 8 ", " 9 ", " 10 ", " j ", " Q ", " K "};
        String[] deck = new String[suits.length * num.length];

        // creating the deck
        int p = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < num.length; j++) {
                deck[p] = suits[i] + num[j];
                p++;
            }
        }
       
      
        // shuffle deck
        System.out.println("\n\nAfter shuffling");
        
        int n = deck.length;
        Random random = new Random();
        random.nextInt();

        for (int i = 0; i < n; i++) {
            int change = i + random.nextInt(n - i);
            String temp = deck[i];
            deck[i] = deck[change];
            deck[change] = temp;
            
            
        }

      
            for (int i = 0; i < deck.length; i++) {
    			System.out.println(deck[i] + " ");

    			if (i > 0 && i % 5 == 0)
    				System.out.println(" ");
        }
    }

	}


