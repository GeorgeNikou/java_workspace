import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		/*
		 * 12. Write a Java program that asks the user if he/she likes Java programming.
		 * If the user answers yes, then it displays a congratulating message (use your
		 * imagination), and terminates the program. Now, if the user answers no, then
		 * the fun begins. The program should ask “Are you sure you don't like Java
		 * programming?” If the user answers no, then it should display Hope you'll get
		 * to like it more. Otherwise, if the user answers yes, it should ask “Are you
		 * really sure you don't like Java programming?” If the user keeps saying yes,
		 * then the program keeps asking “Are you really really sure you don't like Java
		 * programming?”, then “Are you really really really sure you don't like Java
		 * programming?” And so on, every time printing one more really. This should
		 * stop the program prints “really” 5 times. At that point, if the user still
		 * answers yes, it should print “Too bad”, and terminate. Do you like Java
		 * programming? [y/n]: n Are you sure you don't like Java programming? [y/n]: y
		 * Are you really sure you don't like Java programming? [y/n]: y Are you really
		 * really sure you don't like Java programming? [y/n]: n Hope you'll get to like
		 * it more.
		 * 
		 * Do you like Java programming? [y/n]: n Are you sure you don't like Java
		 * programming? [y/n]: y Are you really sure you don't like Java programming?
		 * [y/n]: y Are you really really sure you don't like Java programming? [y/n]: y
		 * Are you really really really sure you don't like Java programming? [y/n]: y
		 * Are you really really really really sure you don't like Java programming?
		 * [y/n]: y Are you really really really really really sure you don't like Java
		 * programming? [y/n]: y Too bad.
		 */

		Scanner sc = new Scanner(System.in);
	

		
			System.out.println("Do you like java programming? \n(y/n)");
			String entry = sc.nextLine();
			if (entry.equals("y")) {
				System.out.println("Congratulations");

			}
			if (entry.equals("n")) {
				System.out.println("Are you really sure you don't like Java programming?\n[y/n]");
				String entry2 = sc.nextLine();

				if (entry2.equals("y")) {
					System.out.println("Are you really really sure you don't like Java programming?\n[y/n]");
					String entry3 = sc.nextLine();

					if (entry3.equals("y")) {
						System.out.println("Are you really really really sure you don't like Java programming?\n[y/n]");
						String entry4 = sc.nextLine();

						if (entry4.equals("y")) {
							System.out.println(
									"Are you really really really really sure you don't like Java programming?\n[y/n]");
									String entry5 = sc.nextLine();
						if (entry5.equals("y")) {
							System.out.println("Too bad");
								
						}

						}
					}
				}
			}
		}
	}


