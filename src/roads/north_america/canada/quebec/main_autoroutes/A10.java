package roads.north_america.canada.quebec.main_autoroutes;

import main.Main;
import main.Player;

import java.util.Scanner;

public class A10 {
	
	static Scanner input;
	
	static {
		input = new Scanner (System.in);
	}
	
	public static void a_10_boulevard_robert_bourassa_wellington_street_south_east (Player player) { // TODO
		System.out.println("1. Turn left on Wellington street (under construction)");
		System.out.println("2. Continue straight on A-10 east");
		if (player.sign() >= 261) {
			System.out.println("   Quebec City - 261");
		}
		System.out.println("3. Turn right on Wellington street (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 2);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
		} else if (choice == 2) {
			east_2(player);
		} else if (choice == 3) {
		}
	}
	
	public static void east_2 (Player player) { // TODO
		System.out.println("1. Continue on A-10 east");
		if (player.sign() >= 261) {
			System.out.println("   Quebec City - 261");
		}
		System.out.println("2. Take exit 2 for Chemin des moulins (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_3(player);
		} else if (choice == 2) {
		}
	}
	public static void east_3 (Player player) { // TODO
		System.out.println("1. Continue on A-10 east");
		if (player.sign() >= 260) {
			System.out.println("   Quebec City - 260");
		}
		System.out.println("2. Take exit 3 for Carrie derick street (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_4(player);
		} else if (choice == 2) {
		}
	}
	public static void east_4 (Player player) { // TODO
		System.out.println("1. Continue on A-10 east");
		if (player.sign() >= 259) {
			System.out.println("   Quebec City - 259");
		}
		System.out.println("2. Take exit 4 for Boulevard Geaten laberge (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_5(player);
		} else if (choice == 2) {
		}
	}
	public static void east_5 (Player player) { // TODO
		System.out.println("1. Continue on A-10 east");
		if (player.sign() >= 258) {
			System.out.println("   Quebec City - 258");
		}
		System.out.println("2. Take exit 5 for Boulevard de l'ile des soeurs (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_6(player);
		} else if (choice == 2) {
		}
	}
	public static void east_6 (Player player) { // TODO
		System.out.println("1. Continue on A-10 east");
		if (player.sign() >= 253) {
			System.out.println("   Quebec City - 253");
		}
		System.out.println("2. Take exit 6 for A-20 east");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_8(player);
		} else if (choice == 2) {
		}
	}
	public static void east_8 (Player player) { // TODO
		System.out.println("1. Continue on A-10 east");
		if (player.sign() >= 252) {
			System.out.println("   Quebec City - 252");
		}
		System.out.println("2. Take exit 8 for QC-134 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_9(player);
		} else if (choice == 2) {
		}
	}
	public static void east_9 (Player player) { // TODO
		System.out.println("1. Continue on A-10 east");
		if (player.sign() >= 251) {
			System.out.println("   Quebec city - 251");
		}
		System.out.println("2. Take exit 9 for Avenue Malo (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_11(player);
		} else if (choice == 2) {
		}
	}
	public static void east_11 (Player player) { // TODO
		System.out.println("1. Continue straight on A-10 (under construction)");
		System.out.println("2. Take exit 11 for A-30 / Boulevard de quartier / Boulevard Leduc / Chemin des praries");
		if (player.sign() >= 249) {
			System.out.println("   Quebec city - 249");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 2);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_22(player);
		} else if (choice == 2) {
			System.out.println("1. Take exit for A-30 / Boulevard de quartier / Chemin de praries");
			if (player.sign() >= 249) {
				System.out.println("   Quebec city - 249");
			}
			System.out.println("2. Take exit for Boulevard Leduc (under construction)");
			do {
				choice = input.nextInt();
			} while (choice != 1);
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				System.out.println("1. Take exit for A-30 east / Chemin des praries");
				if (player.sign() >= 248) {
					System.out.println("   Quebec city - 248");
				}
				System.out.println("2. Take exit for A-30 west / Boulevard de quartier (under construction)");
				do {
					choice = input.nextInt();
				} while (choice != 1);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				if (choice == 1) {
					System.out.println("1. Take exit for Chemin des praries (under construction)");
					System.out.println("2. Take exit for A-30 east");
					if (player.sign() >= 247) {
						System.out.println("   Quebec City - 247");
					}
					do {
						choice = input.nextInt();
					} while (choice != 2);
					System.out.println("");
					System.out.println("");
					System.out.println("");
					if (choice == 1) {
					} else if (choice == 2) {
						System.out.println("1. Take exit for A-30 east");
						if (player.sign() >= 247) {
							System.out.println("   Quebec city - 247");
						}
						System.out.println("2. Take exit for A-10 west (under construction)");
						do {
							choice = input.nextInt();
						} while (choice != 1);
						System.out.println("");
						System.out.println("");
						System.out.println("");
						if (choice == 1) {
							A30.east_69(player);
						} else if (choice == 2) {
						}
					}
				} else if (choice == 2) {
				}
			} else if (choice == 2) {
			}
		}
	}
	public static void east_22 (Player player) { // TODO
		System.out.println("1. Continue on A-10 east");
		System.out.println("2. Take exit 22 for A-35");
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