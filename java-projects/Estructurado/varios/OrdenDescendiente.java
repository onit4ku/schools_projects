package varios;

import java.util.Scanner;

/*
 * Write a program that prompts the user to enter three names. Your program
 * should display the names in descending order.
 */
public class OrdenDescendiente {

	public static void main(String[] args) {
		String name1, name2, name3; // To hold three names

		// Create a Scanner object to read input.
		Scanner console = new Scanner(System.in);

		// Get names from the user.
		System.out.print("Enter name 1: ");
		name1 = console.nextLine();

		System.out.print("Enter name 2: ");
		name2 = console.nextLine();

		System.out.print("Enter name 3: ");
		name3 = console.nextLine();

		// Arrange names in Descending order
		if (name1.compareTo(name2) > 0 && name1.compareTo(name3) > 0) {
			System.out.println(name1);
			if (name2.compareTo(name3) > 0) {
				System.out.println(name2);
				System.out.println(name3);
			} else {
				System.out.println(name3);
				System.out.println(name2);
			}
		}

		else if (name2.compareTo(name1) > 0 && name2.compareTo(name3) > 0) {
			System.out.println(name2);
			if (name1.compareTo(name3) > 0) {
				System.out.println(name1);
				System.out.println(name3);
			} else {
				System.out.println(name3);
				System.out.println(name1);
			}
		}

		else {
			System.out.println(name3);
			if (name1.compareTo(name2) > 0) {
				System.out.println(name1);
				System.out.println(name2);
			} else {
				System.out.println(name2);
				System.out.println(name1);
			}
		}
	}
}