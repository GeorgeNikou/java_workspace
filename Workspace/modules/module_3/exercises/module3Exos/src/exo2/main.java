package exo2;

public class main {

	public static void main(String[] args) {

		String suit[] = { "HEARTS", "DIAMONDS", "CLUBS", "SPADES" };
		String value[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String game = "Poker";
		
		

		Cards deck1 = new Cards(suit, value, game); //**creating deck and name of the game
		deck1.shuffle();  //**shuffling the deck
		
		System.out.println(deck1.description()); //**description function
		
		deck1.dealCard(); // **deal 1 card
		
		deck1.dealFiveCards(); // **deal the next five cards
		
		
		System.out.println(deck1.dealCards(4, 5)); // **deal cards based on how number of players and cards chosen per round
		//System.out.println(deck1.dealCards(4, 5));
		//System.out.println(deck1.dealCards(4, 5));
		deck1.NextFiveCardsSameSuit(); //**dealing the next five cards with the same suit
		
		
		
		

	}

}
