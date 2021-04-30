package roads.north_america.canada.quebec.main_autoroutes;

import java.util.Scanner;

import main.Player;

public class A13 {
	static Scanner input = new Scanner (System.in);
	public static void south_20 (Player player) {
		System.out.println("1. Continue south on A-13");
		System.out.println("2. Take exit 20 for Rue hector lanthier");
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("\n\n");
		if (choice == 1) {
		} else if (choice == 2) {
		}
	}
}