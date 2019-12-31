import java.util.ArrayList;
import java.util.Scanner;

public class exam1Edit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// importing scanner for user input
		int count = 0; // creating counter to ask the user 3 times for correct cashier#
		int entry = 0, entry2 = 0; // User Input
		String addItem = "", temp = "";// needed to grab users new items
		double itemPrice = 0, grandTotal = 0, x = 1, y = 1;// needed to grab the users item price
		boolean exit = false; // x and y is my multiplier to obtain the grand total

		do {
			System.out.println("Please enter cashier number");
			entry = sc.nextInt();
			if (entry == 147852) {
				System.out.println("WELCOME BACK FELICIA");
				exit = true;
			} else {
				System.err.println("WRONG");
				count += 1;
			}
			if (count == 3)
				System.out.println("YOU HAVE EXCEEDED THE NUMBER OF TRIES, ARE YOU SURE YOU HAVE THE RIGHT NUMBER?");

		} while (!exit);
		exit = false;
		System.out.println();

		ArrayList<String> options = new ArrayList<>();
		ArrayList<String> items = new ArrayList<>();
		ArrayList<Double> price = new ArrayList<>();

		// adding our 3 main options to the ArrayList
		options.add("Add new items");
		options.add("purchase items");
		options.add("exit");

		// adding items to the ArrayList
		items.add("water");
		items.add("juice");
		items.add("RedBull");
		items.add("Sandwich");
		items.add("Beer");
		items.add("Bagel");
		items.add("Coffee");

		// adding item prices
		price.add(0.99);
		price.add(1.55);
		price.add(2.99);
		price.add(4.99);
		price.add(5.00);
		price.add(3.65);
		price.add(1.25);

		while (!exit) {
			System.out.println("=====Please select one of the following options=====");
			System.out.println();
			for (int i = 0; i < options.size(); i++) {
				System.out.println((i + 1) + ". " + options.get(i));// displaying our menu

			}
			entry = sc.nextInt();// Saving user input
			if (entry == 1) {
				System.out.println();
				for (int i = 0; i < items.size(); i++) {
					System.out.println((i + 1) + ". " + items.get(i) + " " + price.get(i));// displaying the items and
																							// prices
				}
				try{
					System.out.println("Please enter the new item");
					addItem = sc.next();
				}catch(Exception e2) {
					System.out.println("invalid");
				}
				
				System.out.println("Please enter the price of this item");
				itemPrice = sc.nextDouble();
				// adding the item and price to the menu
				items.add(addItem);
				price.add(itemPrice);

			}
			System.out.println();
			if (entry == 2) {
				for (int i = 0; i < items.size(); i++) {
					System.out.println((i + 1) + ". " + items.get(i) + " " + price.get(i));// displaying our items and
																							// prices
				}

				while (true) {
					for (int i = 0; i < items.size(); i++) {
						System.out.println((i + 1) + ". " + items.get(i) + " " + price.get(i));// displaying our
																								// items and
																								// prices
					}
					System.out.println("Which item would you like to purchase?");// grabbing selection from the user
					entry = sc.nextInt();
					y = price.get(entry - 1);
					System.out.println("How many of this item would you like?");// obtaining quantity selected
					entry2 = sc.nextInt();
					System.out.println("the item you requested: " + items.get(entry - 1)); // displaying the item
																							// selected

					System.out.println("the quantity you entered: " + entry2);// displaying the quantity selected
					System.out.println("total: " + "$" + y * entry2);
					System.out.println("Is that all? y/n");
					temp = sc.next();
					grandTotal += y * entry2;

					if (temp.equalsIgnoreCase("y")) {
						System.out.println("Your total is " + "$" + grandTotal + "dollars");
						break;
					}
				}

			}
			if (entry == 3)
				exit = true;

		}
	}

}
