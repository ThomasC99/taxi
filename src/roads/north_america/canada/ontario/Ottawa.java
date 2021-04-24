package roads.north_america.canada.ontario;

import java.util.Scanner;

import main.Main;
import main.Player;

public class Ottawa {
	static Scanner input = new Scanner (System.in);
	public static void rr_40_rr_87_south_east (Player player) { // TODO
		System.out.println("1. Turn left on Ottawa regional road 40 (under construction)");
		System.out.println("2. Continue straight on Ottawa regional road 87");
		if (player.sign() >= 198) {
			System.out.println("   Monteal - 198");
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
			Main.ottawa_48_ottawa_87_south_east();
		}
	}
}
