package roads.north_america.canada.ontario;

import java.util.Scanner;

import main.Main;
import main.Player;
import node.EndNode;
import node.Node;
import roads.north_america.canada.ontario.series400.ON417;
import roads.north_america.canada.quebec.main_autoroutes.A40;

public class Ottawa {
	static Scanner input = new Scanner (System.in);
	public static void rr_40_rr_87_south_east (Player player) { // TODO
		if (player.job().contains(" - montreal") && player.autopilot() >= 198) {
			rr_48_rr_87_south_east(player);
		} else {
			if (player.job().contains(" - montreal") && player.gps() >= 198) {
				System.out.println("GPS : continue straight on Ottawa regional road 87 (198)\n");
			}
			System.out.println("1. Turn left on Ottawa regional road 40 (under construction)");
			System.out.println("2. Continue straight on Ottawa regional road 87");
			if (player.sign() >= 198) {
				System.out.println("   Monteal - 198");
			}
			if (player.sign() >= 4358) {
				System.out.println("   Vancouver - 4,358");
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
	}
	public static void rr_42_rr_87_south_west (Player player) { // TODO
		if (player.job().contains(" - montreal") && (player.autopilot() >= 198)) {
			System.out.println("Turning left on Ottawa regional road 87\n");
			rr_40_rr_87_south_east(player);
		} else {
			if (player.job().contains(" - montreal") && player.gps() >= 198) {
				System.out.println("GPS : Turn left on Ottawa regional road 87 (198)\n");
			}
			System.out.println("1. Turn left on Ottawa regional road 87");
			if (player.sign() >= 199) {
				System.out.println("   Montreal - 198");
			}
			if (player.sign() >= 4358) {
				System.out.println("   Vancouver - 4358");
			}
			System.out.println("2. Continue on Ottawa regional road 42");
			if (player.sign() >= 444) {
				System.out.println("   Quebec City - 444");
			}
			if (player.sign() >= 1960) {
				System.out.println("   Goose Bay - 1,960");
			}
			int choice;
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2));
			System.out.println("\n\n");
			if (choice == 1) {
				rr_40_rr_87_south_east(player);
			} else if (choice == 2) {
				// straight on RR 42
				// left on RR 83
				// left on RR 34
				// right on portage bridge
				// straight on boulevard maisonneuve
				// straight on boulevard fournier
				// left on ramp to A-50 east
				// exit 292E for A-15 south
				// exit 20 for A-640 east
				// exit 52E for A-40 east
				// exit 192S for A-40 east / A-55 south
				// exit 182 for A-40 east
				A40.east_307n(player);
				System.out.println("Arriving in Quebec City");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				player.location("quebec city");
				if (Main.is_job_complete()) {
					Main.complete_job();
				}
				Main.main_menu();
			}
		}
	}
	public static void rr_42_rr_89_south_west (Player player) { // TODO
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
		if (player.job().contains(" - montreal") && player.autopilot() >= 198) {
			System.out.println("Turning left on Ottawa regional road 48");
			rr_48_rr_89_north_east(player);
		} else {
			if (player.job().contains(" - montreal") && (player.gps() >= 198)) {
				System.out.println("GPS : Turn left on Ottawa regional road 48 (198)");
			}
			System.out.println("1 Turn left on Ottawa regional road 48");
			if (player.sign() >= 198) {
				System.out.println("   Montreal - 198");
			}
			System.out.println("2. Continue straight on Ottawa regional road 87");
			if (player.sign() >= 4358) {
				System.out.println("   Vancouver - 4,358");
			}
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
				// ramp to ON-417 west
				// straight on ON-17
				// straight on trunk road
				// straight on wellington street east
				// left on cathcart street
				// left on huron street
				// right on sault ste marie international bridge
				// straight on I-75 south
				// exit 386 for M-28
				// right on M-28
				// straight on cherry creek road
				// right on county road 480
				// right on south healy avenue
			} else if (choice == 3) {
			}
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
