import java.util.ArrayList;
import java.util.Scanner;

public class Question3phonebook {

	public static void main(String[] args) {
		/*
		 * PHONE BOOK ID Name Phone# 1. George Boursiquot 514-578-9875 2. Carl Olivier
		 * 514-987-5434 3. Stephane Rousseau 514-523-8746 4. Artom Lifshitz 514-876-3167
		 * 5. Ronald Grayton 514-973-1357
		 * 
		 * 
		 * Create a phone book with a couple entries. Give the user the following
		 * options
		 * 
		 * 1. Add Add a new entry to the phonebook Name and Phone number
		 * 
		 * 2. Edit Edit an existed entry
		 * 
		 * 3. Delete Delete an existed entry
		 * 
		 * 4. Display Display all the entries
		 * 
		 * 5. Exit Exit the program
		 * 
		 * 
		 * User friendly is a must. User's entry validation is expected for all 3
		 * programs. Unless stated otherwise, you are allow to use 1D, 2D or 3D Arrays.
		 * All programs should be extendable for we will be using them later on.
		 */

		Scanner sc = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> numbers = new ArrayList<>();
		boolean exit = false;
		String entry = "";
		String tmp = "";
		int numEntry = 0, num = 0;

		name.add("George Bourisquot");
		name.add("Stephane Rousseau");
		name.add("Carl Olivier");
		name.add("Artom Lifshitz");
		name.add("Ronald Grayton");

		numbers.add("514-578-9875");
		numbers.add("514-987-5434");
		numbers.add("514-523-8746");
		numbers.add("514-876-3167");
		numbers.add("514-973-1357");

		for (int i = 0; i < name.size(); i++) {
			System.out.println((i + 1) + "." + " " + name.get(i) + "  " + "  " + numbers.get(i));
		}
		System.out.println();

		while (!exit) {
			System.out.println("please choose one of the following options");
			System.out.println("A: " + "Add a new phone entry");
			System.out.println("DEL: " + "delete a phone entry");
			System.out.println("E: " + "edit a phone entry");
			System.out.println("D: " + "Display all phone entries");
			System.out.println("X: " + "EXIT program");
			entry = sc.nextLine();

			if (entry.equalsIgnoreCase("a")) {
				System.out.println("please enter the name of the person you want to add: ");
				entry = sc.nextLine();
				name.add(entry);
				System.out.println("enter the number of this person: ");
				entry = sc.nextLine();
				numbers.add(entry);

			} else if (entry.equalsIgnoreCase("del")) {
				System.out.println(
						"Please type the number of the person you would like to delete (example: 2 for Stephane Rousseau)");
				for (int i = 0; i < name.size(); i++) {
					System.out.println((i + 1) + "." + " " + name.get(i) + "  " + "  " + numbers.get(i));
				}
				numEntry = sc.nextInt();
				name.remove(numEntry - 1);
				numbers.remove(numEntry - 1);

			} else if (entry.equalsIgnoreCase("e")) {
				System.out.println("Which entry would you like to edit?(example: 2 for Stephane Rousseau)");
				numEntry = sc.nextInt();
				sc.nextLine();
				System.out.println("Please enter the new name");
				entry = sc.nextLine();
				name.set(numEntry - 1, entry);
				System.out.println("please enter the new number");
				tmp = sc.nextLine();
				numbers.set(numEntry - 1, tmp);
				for (int i = 0; i < name.size(); i++)
					System.out.println((i + 1) + "." + " " + name.get(i) + "  " + "  " + numbers.get(i));
				System.out.println("==========================================");

			}else if(entry.equalsIgnoreCase("d")) {
				System.out.println("==========================================");
				for (int i = 0; i < name.size(); i++) 
					System.out.println((i + 1) + "." + " " + name.get(i) + "  " + "  " + numbers.get(i));
				System.out.println("==========================================");
			}else if(entry.equalsIgnoreCase("x")) {
				exit = true;
			}
		}

	}
}