package roads.north_america.canada.quebec.spur_autoroutes.A440;

import java.util.Scanner;

import main.Player;
import roads.north_america.canada.ontario.Ottawa;
import roads.north_america.canada.quebec.Montreal;
import roads.north_america.canada.quebec.main_autoroutes.A15;

public class QuebecCity {
	static Scanner input = new Scanner (System.in);
	public static void west_12n (Player player) {
		System.out.println("1. Continue on A-440 east");
		if (player.sign() >= 435) {
			System.out.println("   Ottawa - 435");
		}
		if (player.sign() >= 3835) {
			System.out.println("   Calgary - 3,835");
		}
		System.out.println("2. Take exit 12N for A-73 south");
		if (player.sign() >= 250) {
			System.out.println("   Montreal - 250");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			// Straight on A-40
			// exit for A-40 west / A-55 north
			// exit 186 for A-40 west
			// exit 96o for A-640 west
			// exit 20 for A-15 north
			A15.north_35(player);
		} else if (choice == 2) {
			// exit 131O for A-20 west
			// exit 82 for Taschereau boulevard
			// ramp to QC-134
			// exit doe Avenue de lormier
			// right on A-720
			// exit 5 for mansfield street
			// right on rene-levesque boulevard west
			Montreal.boulevard_robert_bourassa_rene_levesque_boulevard_west_north_east(player);
		}
	}
}