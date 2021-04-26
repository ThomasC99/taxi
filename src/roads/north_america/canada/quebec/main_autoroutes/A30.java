package roads.north_america.canada.quebec.main_autoroutes;

import java.util.Scanner;

import main.Player;

public class A30 {
	static Scanner input;
	static {
		input = new Scanner (System.in);
	}
	public static void east_69 (Player player) { // TODO
		System.out.println("1. Continue on A-30 east");
		if (player.sign() >= 246) {
			System.out.println("   Quebec city - 246");
		}
		System.out.println("2. Take exit 69 for Grande Allee (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_73(player);
		} else if (choice == 2) {
		}
	}
	static void east_73 (Player player) { // TODO
		System.out.println("1. Continue on A-30 east");
		if (player.sign() >= 242) {
			System.out.println("   Quebec city - 242");
		}
		System.out.println("2. Take exit 73 for QC-112 / Chambly road (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_76(player);
		} else if (choice == 2) {
		}
	}
	static void east_76 (Player player) { // TODO
		System.out.println("1. Continue on A-30 east");
		if (player.sign() >= 239) {
			System.out.println("   Quebec city - 239");
		}
		System.out.println("2. Take exit 76 for QC-116 / Montee des promenades (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_78(player);
		} else if (choice == 2) {
		}
	}
	static void east_78 (Player player) { // TODO
		System.out.println("1. Continue on A-30 east");
		if (player.sign() >= 237) {
			System.out.println("   Quebec city");
		}
		System.out.println("2. Take exit 78 for Rue marie-victorin (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_80(player);
		} else if (choice == 2) {
		}
	}
	static void east_80 (Player player) { // TODO
		System.out.println("1. Continue on A-30 east");
		if (player.sign() >= 235) {
			System.out.println("   Quebec city - 235");
		}
		System.out.println("2. Take exit 80 for Montee montarville (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_83(player);
		} else if (choice == 2) {
		}
	}
	static void east_83 (Player player) { // TODO
		System.out.println("1. Continue on A-30 east (under construction)");
		System.out.println("2. Take exit 83 for A-20");
		if (player.sign() >= 232) {
			System.out.println("   Quebec city - 232");
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
			System.out.println("1. Take exit for A-20 west (under construction)");
			System.out.println("2. Take exit for A-20 east");
			if (player.sign() >= 231) {
				System.out.println("   Quebec city - 231");
			}
			do {
				choice = input.nextInt();
			} while (choice != 2);
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
			} else if (choice == 2) {
				A20.east_102(player);
			}
		}
	}
}
