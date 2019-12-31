package exo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Cards {

	private String deck[];
	private String suit[];
	private String value[];
	private String game = "";
	public static int numDeck = 1;
	ArrayList<String> tmpDeck = new ArrayList<>(); // ****

	// constructor (building the deck)
	public Cards(String suit[], String value[], String game) {
		this.suit = suit;
		this.value = value;
		this.game = game;
		this.numDeck = numDeck;
		this.tmpDeck = tmpDeck;
		createDeck();
	}

	// function to show description
	public String description() {
		String desc = "Class: " + this.getClass().getSimpleName() + "\n";
		desc += "Name of the game: " + this.game + "\n";
		desc += "Number of decks: " + this.numDeck + "\n";
		desc += "initial number of cards: " + this.suit.length * this.value.length + "\n";
		desc += "deck: " + Arrays.deepToString(this.deck) + "\n";
		return desc;
	}

	// function to create deck
	public void createDeck() {
		int x = 0;
		this.deck = new String[this.suit.length * this.value.length];
		for (int i = 0; i < this.suit.length; i++) {
			for (int j = 0; j < this.value.length; j++) {
				this.deck[x] = (this.value[j] + " " + this.suit[i]);
				tmpDeck.add(this.value[j] + " " + this.suit[i]); // new deck arraylist ****

				x++;

			}
		}
	}

	// function to shuffle deck
	public void shuffle() {
		String tmp = "";
		String tmp2 = "";
		Random r = new Random();
		int rand;

		for (int i = 0; i < this.deck.length; i++) {
			rand = r.nextInt(this.deck.length);
			tmp = this.deck[i];
			this.deck[i] = this.deck[rand];
			this.deck[rand] = tmp;

		}
		// adding array(shuffled deck) into ArrayList using collections****
		tmpDeck.clear();
		List<String> list = Arrays.asList(this.deck);
		tmpDeck.addAll(list);
	}

	// function to deal cards
	public int dealCards(int nbPlayer, int nbCardsPerPlayer) {
		if(tmpDeck.size()<nbPlayer*nbCardsPerPlayer) {
			System.err.println("no cards were dealt");
			return 0;
		}
		int count = 0; // counter to deal cards \ \ number of cards handed out\\
		for (int i = 0; i < nbPlayer; i++) {
			System.out.println();
			for (int j = 0; j < nbCardsPerPlayer; j++) {
				System.out.println(this.deck[count]);
				
				tmpDeck.remove(0); // removing card from deck
				count++;
			}
		}
		System.out.println(Arrays.toString(tmpDeck.toArray()));
		System.out.println(tmpDeck.size() + " cards left in the deck"); // ****
		return count;
	}

	// function to deal one card from the deck
	public void dealCard() {
		int count = 0;
		System.out.println(this.deck[count]);
		tmpDeck.remove(0); // removing card from ArrayList(deck)
		count++;
	}

	// function to deal 5 cards from the deck
	public void dealFiveCards() {
		int count = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println(this.deck[count]);
			tmpDeck.remove(0); // removing card from ArrayList(deck)
			count++;
		}

	}

	// deal five cards same suit
	public void NextFiveCardsSameSuit() {
		String []countSuit = new String[5];
		int i = 0;
		String suit = "";
		int count = 0;
		suit = this.deck[i].substring(3);
		for (i = 0; i < this.deck.length; i++) {
			if (this.deck[i].substring(3).equals(suit)) {
				System.out.println(this.deck[i]);
				count++;
				if(count == 5)
					break;
			}
			
		}
		
	}

	/**
	 * @return the deck
	 */
	public String[] getDeck() {
		return deck;
	}

	/**
	 * @param deck the deck to set
	 */
	public void setDeck(String[] deck) {
		this.deck = deck;
	}

	/**
	 * @return the suit
	 */
	public String[] getSuit() {
		return suit;
	}

	/**
	 * @param suit the suit to set
	 */
	public void setSuit(String[] suit) {
		this.suit = suit;
	}

	/**
	 * @return the value
	 */
	public String[] getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String[] value) {
		this.value = value;
	}

	/**
	 * @return the game
	 */
	public String getGame() {
		return game;
	}

	/**
	 * @param game the game to set
	 */
	public void setGame(String game) {
		this.game = game;
	}

	/**
	 * @return the numDeck
	 */
	public static int getNumDeck() {
		return numDeck;
	}

	/**
	 * @param numDeck the numDeck to set
	 */
	public static void setNumDeck(int numDeck) {
		Cards.numDeck = numDeck;
	}

	/**
	 * @return the cardsTotal
	 */
	/*
	 * public int getCardsTotal() { return cardsTotal; }
	 */

	/**
	 * @param cardsTotal the cardsTotal to set
	 */
	public void setCardsTotal(int cardsTotal) {
		cardsTotal = cardsTotal;
	}

	/**
	 * @return the cardsLeft
	 */
	/*
	 * public int getCardsLeft() { return cardsLeft; }
	 */

	/**
	 * @param cardsLeft the cardsLeft to set
	 */
	public void setCardsLeft(int cardsLeft) {
		cardsLeft = cardsLeft;
	}

	/**
	 * @return the tmpDeck
	 */
	public ArrayList<String> getTmpDeck() {
		return tmpDeck;
	}

	/**
	 * @param tmpDeck the tmpDeck to set
	 */
	public void setTmpDeck(ArrayList<String> tmpDeck) {
		this.tmpDeck = tmpDeck;
	}

}
