import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {

	/*
	 * MENU 2D A restaurant has a menu, each menu has multiple items, each items has
	 * the following fields:
	 * 
	 * Item name (string) Item price (decimal) Item rate (0-10)
	 * 
	 * Create an arrayList of arrays of Menu containing the items informations.
	 * 
	 * Array should look something like this when printed:
	 * 
	 * 
	 * == Menu == Item# Name Price Rate 1: Poutine 9.99 5 2: Pizza 6.99 7 3:
	 * Hamburger 4.00 9 4: Beer 0.99 10
	 * 
	 * 
	 * When your program starts, the menu should contain the items above. Ask the
	 * user if he wants to enter new items. If so get the item and add it to the
	 * menu, then print out the menus in your console and restart until the user
	 * hits X to exit
	 */

	public static void main(String[] args) {

		boolean runMenu = true;
		ArrayList<String> menu = new ArrayList<>();
		menu.add("Poutine");
		menu.add("Pizza");
		menu.add("Hamburger");
		menu.add("Beer");

		ArrayList<Double> prices = new ArrayList<>();
		prices.add(9.99);
		prices.add(6.99);
		prices.add(4.00);
		prices.add(0.99);

		ArrayList<Integer> rate = new ArrayList<>();
		rate.add(5);
		rate.add(7);
		rate.add(9);
		rate.add(10);

		while (runMenu) {
			Scanner sc = new Scanner(System.in);
			System.out.println("=====Menu====");
			for (int i = 0; i < menu.size(); i++) {
				System.out.println(i + 1 + ": " + menu.get(i) + " $" + prices.get(i) + "  " + rate.get(i));
			}
			System.out.println("==============");

			System.out.println();
			System.out.println("A: Add an item");
			System.out.println("X: Quit");
			String answer = sc.next();

			if (answer.equals("A") || answer.equals("a")) {
				System.out.println("Enter New Menu Item :");
				menu.add(sc.next());
				do {
					System.out.println("Enter Price:");
					if (sc.hasNextDouble() || sc.hasNextInt())
						break;
					else
						sc.nextLine();
				} while (true);
				prices.add(sc.nextDouble());
				do {
					System.out.println("enter your rating");
					if (sc.hasNextInt() || sc.hasNextDouble())
						break;
					else
						sc.nextLine();
				} while (true);
				rate.add(sc.nextInt());
			} else if (answer.equals("X") || answer.equals("x")) {
				System.out.println("Goodbye!");
				runMenu = false;
			} else {
				System.out.println("Try again.");
			}
		}
	}
}
/*
 * if(answer.equals("1")){ checkout.add("Yes, yes he is"); }else
 * if(answer.equals("2")){ checkout.add("Yes, and he catches"); }
 * 
 * if(answer.equals("3")){ joshIsGay = false; }
 */