package roads.north_america.canada.ontario;

import java.util.Scanner;

import main.Main;
import main.Player;
import node.EndNode;
import node.Node;
import roads.north_america.canada.ontario.series400.ON417;

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
			rr_48_rr_87_south_east(player);
		}
	}
	public static void rr_42_rr_87_south_west (Player player) { // TODO
		System.out.println("1. Turn left on Ottawa regional road 87");
		if (player.sign() >= 199) {
			System.out.println("   Montreal - 198");
		}
		System.out.println("2. Continue on Ottawa regional road 42 (under construction)");
		if (player.sign() >= 444) {
			System.out.println("   Quebec City - 444");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			rr_40_rr_87_south_east(player);
		} else if (choice == 2) {
		}
	}
	static void rr_42_rr_89_south_west (Player player) { // TODO
		System.out.println("1. Continue on Ottawa regional road 42");
		if (player.sign() >= 0.039) {
			System.out.println("   Ottawa - 1");
		}
		System.out.println("2. Turn right on Ottawa regional road 89 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			Node node = new EndNode ("ottawa");
			node.go(player);
		} else if (choice == 2) {
		}
	}
	static void rr_42_rr_91_south_west (Player player) { // TODO
		System.out.println("1. Turn left on Ottawa regional road 91 (under construction)");
		System.out.println("2. Continue on Ottawa regioanl road 42");
		if (player.sign() >= 0.27) {
			System.out.println("   Ottawa - 1");
		}
		System.out.println("3. Turn right on Ottawa regional road 91 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 2);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
		} else if (choice == 2) {
			rr_42_rr_89_south_west(player);
		} else if (choice == 3) {
		}
	}
	public static void rr_48_rr_87_south_east (Player player) { // TODO
		System.out.println("1 Turn left on Ottawa regional road 48");
		if (player.sign() >= 198) {
			System.out.println("   Ottawa - 198");
		}
		System.out.println("2. Cotninue on Ottawa regional road 87 (under construction)");
		System.out.println("3. Turn right on Ottawa regional road 48 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			rr_48_rr_89_north_east(player);
		} else if (choice == 2) {
		} else if (choice == 3) {
		}
	}
	static void rr_48_rr_89_north_east (Player player) { // TODO
		System.out.println("1. Turn left on Ottawa regional road 89 (under construction)");
		System.out.println("2. Continue on Ottawa regioanl road 48");
		if (player.sign() >= 198) {
			System.out.println("   Montreal - 198");
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
			rr_48_rr_91_north_east(player);
		}
	}
	static void rr_48_rr_91_north_east (Player player) { // TODO
		System.out.println("1. Turn left on Ottawa regional road 91 (under construction)");
		System.out.println("2. Continue on Ottawa regional road 48");
		if (player.sign() >= 198) {
			System.out.println("   Ottawa - 198");
		}
		System.out.println("3. Turn right on Ottawa regional road 91 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 2);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
		} else if (choice == 2) {
			System.out.println("1. Continue on Ottawa regional road 48");
			if (player.sign() >= 198) {
				System.out.println("   Montreal - 198");
			}
			System.out.println("2. Take ramp to Queen elizabeth driveway (under construction)");
			do {
				choice = input.nextInt();
			} while (choice != 1);
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				rr_48_rr_95_east(player);
			} else if (choice == 2) {
			}
		} else if (choice == 3) {
		}
	}
	static void rr_48_rr_95_east (Player player) { // TODO
		System.out.println("1. Turn left on Ottawa regional road 95 (under construction)");
		System.out.println("2. Continue straigt on Ottawa regional road 48 (under construction)");
		System.out.println("3. Turn right on Ottawa regoinal road 95");
		if (player.sign() >= 198) {
			System.out.println("   Ottawa - 198");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 3);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
		} else if (choice == 2) {
		} else if (choice == 3) {
			System.out.println("1. Take exit for ON-417 east");
			if (player.sign() >= 197) {
				System.out.println("   Montreal - 197");
			}
			System.out.println("2. Take exit for ON-417 west (under construction)");
			do {
				choice = input.nextInt();
			} while (choice != 1);
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				ON417.east_117(player);
			} else if (choice == 2) {
			}
		}
	}
	static void rr_48_rr_95_north (Player player) { // TODO
		System.out.println("1. Turn left on Ottawa regional road 48 (under construction)");
		System.out.println("2. Continue on Ottawa regional roadd 95");
		if (player.sign() >= 1) {
			System.out.println("   Ottawa - 1");
		}
		System.out.println("3. Turn right on Ottawa regioanl road 48 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 2);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
		} else if (choice == 2) {
			System.out.println("1. Make a u-turn on Ottawa regional road 95 (under construction)");
			System.out.println("2. Continue on Ottawa regional road 97");
			if (player.sign() >= 0.95) {
				System.out.println("   Ottawa - 1");
			}
			do {
				choice = input.nextInt();
			} while (choice != 2);
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
			} else if (choice == 2) {
				rr_97_mackenzie_king_bridge_north(player);
			}
		} else if (choice == 3) {
		}
	}
	public static void rr_95_waller_street_north_west (Player player) { // TODO
		System.out.println("1. Continue on Ottawa regioanl road 95");
		if (player.sign() >= 1.2) {
			System.out.println("   Ottawa - 1");
		}
		System.out.println("2. Turn right on Waller street (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			rr_48_rr_95_north(player);
		} else if (choice == 2) {
		}
	}
	static void rr_97_mackenzie_king_bridge_north (Player player) { // TODO
		System.out.println("1. Turn left on Mackenzie King bridge");
		if (player.sign() >= 0.85) {
			System.out.println("   Ottawa - 1");
		}
		System.out.println("2. Continue on Ottawa regional road 97 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			rr_42_rr_91_south_west(player);
		} else if (choice == 2) {
		}
	}
}
