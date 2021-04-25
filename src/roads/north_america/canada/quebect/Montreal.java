package roads.north_america.canada.quebect;

import java.util.Scanner;

import main.Main;
import main.Player;
import roads.north_america.canada.quebec.main_autoroutes.A10;

public class Montreal {
	static Scanner input = new Scanner (System.in);
	public static void boulevard_robert_bourassa_notre_dame_street_west_south_east (Player player) { // TODO
		System.out.println("1. Turn left on Notre-dame street west (under construction)");
		System.out.println("2. Continue on Boulevard robert-bourassa");
		if (player.sign() >= 262) {
			System.out.println("   Quebec City - 262");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 2);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
		} else if (choice == 2) {
			Main.boulevard_robert_bourassa_william_street_south_east();
		}
	}
	public static void boulevard_robert_bourassa_ottawa_street_south_east (Player player) { // TODO
		System.out.println("1. Turn left on Ottawa street (under construction)");
		System.out.println("2. Continue straight on Boulevard robert-bourassa");
		if (player.sign() >= 261) {
			System.out.println("   Quebec City - 261");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 2);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
		} else if (choice == 2) {
			A10.a_10_boulevard_robert_bourassa_wellington_street_south_east(player);
		}
	}
}
