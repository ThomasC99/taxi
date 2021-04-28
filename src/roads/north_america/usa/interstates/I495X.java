package roads.north_america.usa.interstates;

import java.util.Scanner;

import main.Player;

public class I495X {
	static Scanner input = new Scanner (System.in);
	public static void north (Player player) { // TODO
		System.out.println("1. Take exit for I-495 north");
		System.out.println("2. Take exit for River Road");
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
		} else if (choice == 2) {
			System.out.println("1. Take exit for River road west");
			System.out.println("2. Take exit for River road east");
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
			} else if (choice == 2) {
			}
		}
	}
	public static void south (Player player) { // TODO
	}
}