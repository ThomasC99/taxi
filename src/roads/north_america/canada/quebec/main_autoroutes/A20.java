package roads.north_america.canada.quebec.main_autoroutes;

import java.util.Scanner;

import main.Main;
import main.Player;

public class A20 {

	static Scanner input;
	
	static {
		input = new Scanner (System.in);
	}
	
	public static void east_102 (Player player) { // TODO
		System.out.println("1. Continue on A-20 east");
		if (player.sign() >= 228) {
			System.out.println("   Quebec city - 228");
		}
		System.out.println("2. Take exit 102 for Rue nobel (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_105(player);
		} else if (choice == 2) {
		}
	}
	public static void east_105 (Player player) { // TODO
		System.out.println("1. Continue on A-20 east");
		if (player.sign() >= 224) {
			System.out.println("   Quebec city - 224");
		}
		System.out.println("2. Take exit 105 for QC-229 / Chemin Nobel (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_109(player);
		} else if (choice == 2) {
		}
	}
	public static void east_109 (Player player) { // TODO
		System.out.println("1. Continue on A-20 east");
		if (player.sign() >= 220) {
			System.out.println("   Quebec city - 220");
		}
		System.out.println("2. Take exit 109 for Chemin trudeau / Montee saint-jean-baptise (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
		} else if (choice == 2) {
		}
	}
}
