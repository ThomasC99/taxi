package roads.north_america.canada.ontario.series400;

import java.util.Scanner;

import main.Main;
import main.Player;
import roads.north_america.canada.ontario.Ottawa;
import roads.north_america.canada.quebec.main_autoroutes.A40;

public class ON417 {
	static Scanner input = new Scanner (System.in);
	static void east_5 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 east");
		if (player.sign() >= 83.6) {
			System.out.println("   Montreal - 84");
		}
		System.out.println("2. Take exit 5 for Prescott and russel county road 14 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			A40.east_1(player);
		} else if (choice == 2) {
		}
	}
	static void east_17 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 east");
		if (player.sign() >= 95.3 ) {
			System.out.println("   Montreal - 95");
		}
		System.out.println("2. Take exit 17 for Prescott and Russell county road 10 (under construction)");
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
	static void east_27 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 east");
		if (player.sign() >= 107) {
			System.out.println("   Ottawa - 107");
		}
		System.out.println("2. Take exit 27 for ON-34 / Stormount, dundas and glengarry county road 34 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_17(player);
		} else if (choice == 2) {
		}
	}
	static void east_35 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 east");
		if (player.sign() >= 113) {
			System.out.println("   Montreal - 113");
		}
		System.out.println("2. Take exit 35 for Stormount, dunsdas and glengarry county road 23 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_27(player);
		} else if (choice == 2) {
		}
	}
	static void east_51 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 east");
		if (player.sign() >= 130) {
			System.out.println("   Montreal - 130");
		}
		System.out.println("2. Take exit 51 for Stormount, dundas and glengarry country road 9 / 20 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_35(player);
		} else if (choice == 2) {
		}
	}
	static void east_58 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 east");
		if (player.sign() >= 137) {
			System.out.println("   Montreal - 137");
		}
		System.out.println("2. Take exit 58 for ON-138 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_51(player);
		} else if (choice == 2) {
		}
	}
	static void east_66 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 east");
		if (player.sign() >= 145) {
			System.out.println("   Montreal - 145");
		}
		System.out.println("2. Take exit 66 for Stormount, dundas and glengarry county road 7 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_58(player);
		} else if (choice == 2) {
		}
	}
	static void east_79 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 east");
		if (player.sign() >= 158) {
			System.out.println("   Montreal - 158");
		}
		System.out.println("2. Take exit 79 for Stormount, dundas and glengarry county road 5 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_66(player);
		} else if (choice == 2) {
		}
	}
	static void east_88 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 east");
		if (player.sign() >= 167) {
			System.out.println("   Montreal - 167");
		}
		System.out.println("2. Take exit 88 for Ottawa regional road 33 / 28 (under cconstruction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_79(player);
		} else if (choice == 2) {
		}
	}
	static void east_96 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 east");
		if (player.sign() >= 175) {
			System.out.println("   Montreal - 175");
		}
		System.out.println("2. Take exit 96 for Ottawa regional road 41 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_88(player);
		} else if (choice == 2) {
		}
	}
	static void east_104 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 east");
		if (player.sign() >= 182) {
			System.out.println("   Montreal - 182");
		}
		System.out.println("2. Take exit 104 for Ottawa regional road 27 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_96(player);
		} else if (choice == 2) {
		}
	}
	static void east_109 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 east");
		if (player.sign() >= 186) {
			System.out.println("   Montreal - 186");
		}
		System.out.println("2. Take exit 109 for Ottawa regional road 32 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_104(player);
		} else if (choice == 2) {
		}
	}
	static void east_110 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 east");
		if (player.sign() >= 188) {
			System.out.println("   Montreal - 188");
		}
		System.out.println("2. Take exit 110 for Ottawa regional road 74 (under construction)");
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
	static void east_112 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 east");
		if (player.sign() >= 191) {
			System.out.println("   Monreal - 191");
		}
		System.out.println("2. Take exit 112 for Ottawa regional road 30 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_110(player);
		} else if (choice == 2) {
		}
	}
	static void east_113 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 east");
		if (player.sign() >= 192) {
			System.out.println("   Monteal - 192");
		}
		System.out.println("2. Take exit 113 for Ottawa regional road 174 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_112(player);
		} else if (choice == 2) {
		}
	}
	static void east_115 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 east");
		if (player.sign() >= 193) {
			System.out.println("   Montreal - 193");
		}
		System.out.println("2. Take exit 115 for Ottawa regional road 26 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_113(player);
		} else if (choice == 2) {
		}
	}
	public static void east_117 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 east");
		if (player.sign() >= 195) {
			System.out.println("   Montreal - 195");
		}
		System.out.println("2. Take exit 117 for Ottawa regional road 19 / Tremblay road (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_115(player);
		} else if (choice == 2) {
		}
	}
	public static void west_5 (Player player) { // TODO
		System.out.println("1. Continue on ON-417");
		if (player.sign() >= 116) {
			System.out.println("   Ottawa - 116");
		}
		System.out.println("2. Take exit 5 for Prescott and russell county road 4 / 14 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_9(player);
		} else if (choice == 2) {
		}
	}
	static void west_9 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 west");
		if (player.sign() >= 112) {
			System.out.println("   Ottawa - 112");
		}
		System.out.println("2. Take exit 9 for Prescott and Russell county road 17 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_17(player);
		} else if (choice == 2) {
		}
	}
	static void west_17 (Player player) { // TODO
		System.out.println("1. Continue on ON-147 west");
		if (player.sign() >= 104) {
			System.out.println("   Ottawa - 104");
		}
		System.out.println("2. Take exit 17 for Prescott and Russel county road 10 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_27(player);
		} else if (choice == 2) {
		}
	}
	static void west_27 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 west");
		if (player.sign() >= 93.6) {
			System.out.println("   Ottawa - 94");
		}
		System.out.println("2. Take exit 27 for ON-34 / Nixon road (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_35(player);
		} else if (choice == 2) {
		}
	}
	static void west_35 (Player player) { // TODO
		System.out.println("1. Continue on ON-417");
		if (player.sign() >= 87) {
			System.out.println("   Ottawa - 87");
		}
		System.out.println("2. Take exit 35 for Sormount, dundas and glengarry county road 23 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_51(player);
		} else if (choice == 2) {
		}
	}
	static void west_51 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 west");
		if (player.sign() >= 70.1) {
			System.out.println("   Ottawa - 70");
		}
		System.out.println("2. Take exit 51 for Stormount, dundas and glengarry county road 9 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_58(player);
		} else if (choice == 2) {
		}
	}
	static void west_58 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 west");
		if (player.sign() >= 63) {
			System.out.println("   Ottawa - 63");
		}
		System.out.println("2. Take exit 58 for ON-134 / Stormount, dundas and glengarry county road 8 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_66(player);
		} else if (choice == 2) {
		}
	}
	static void west_66 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 west");
		if (player.sign() >= 55) {
			System.out.println("   Ottawa - 55");
		}
		System.out.println("2. Take exit 66 for Stormount, dundas and glengary county road 7 (under construction");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_79(player);
		} else if (choice == 2) {
		}
	}
	static void west_79 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 west");
		if (player.sign() >= 41.6) {
			System.out.println("   Ottawa - 42");
		}
		System.out.println("2. Take exit 79 for Stormount, dundas, and glengary county road 5 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_88(player);
		} else if (choice == 2) {
		}
	}
	static void west_88 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 west");
		if (player.sign() >= 32.8) {
			System.out.println("   Ottawa - 33");
		}
		System.out.println("2. Take exit 88 for Ottawa regional road 33 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_96(player);
		} else if (choice == 2) {
		}
	}
	static void west_96 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 west");
		if (player.sign() >= 24.7) {
			System.out.println("   Ottawa - 25");
		}
		System.out.println("2. Take exit 96 for Ottawa regional road 41 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_104(player);
		} else if (choice == 2) {
		}
	}
	static void west_104 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 west");
		if (player.sign () >= 17) {
			System.out.println("   Ottawa - 17");
		}
		System.out.println("2. Take exit 104 for Ottawa regional road 27 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_109(player);
		} else if (choice == 2) {
		}
	}
	static void west_109 (Player player) { // TODO
		System.out.println("1. Continue on ON-417");
		if (player.sign() >= 12.6) {
			System.out.println("   Ottawa - 13");
		}
		System.out.println("2. Take exit 109 for Ottawa regional road 32 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_110(player);
		} else if (choice == 2) {
		}
	}
	static void west_110 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 west");
		if (player.sign() >= 11.4) {
			System.out.println("   Ottawa - 11");
		}
		System.out.println("2. Take exit 110 for Ottawa regional road 74 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_112(player);
		} else if (choice == 2) {
		}
	}
	static void west_112 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 west");
		if (player.sign() >= 8.6) {
			System.out.println("   Ottawa - 9");
		}
		System.out.println("2. Take exit 112 for Ottawa regional road 30 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_113a(player);
		} else if (choice == 2) {
		}
	}
	static void west_113a (Player player) { // TODO
		System.out.println("1. Continue on ON-417 west");
		if (player.sign() >= 7.4) {
			System.out.println("   Ottawa - 7");
		}
		System.out.println("2. Take exit 113A for Ottawa regioanl road 174 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_113b(player);
		} else if (choice == 2) {
		}
	}
	static void west_113b (Player player) { // TODO
		System.out.println("1. Continue on ON-417 west");
		if (player.sign() >= 6.9) {
			System.out.println("   Ottawa - 7");
		}
		System.out.println("2. Take exit 113B for Aviation Parkway (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_117(player);
		} else if (choice == 2) {
		}
	}
	static void west_117 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 west");
		if (player.sign() >= 4.2) {
			System.out.println("   Ottawa - 4");
		}
		System.out.println("2. Take exit 117 for Ottawa regional road 19 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_118(player);
		} else if (choice == 2) {
		}
	}
	static void west_118 (Player player) { // TODO
		System.out.println("1. Continue on ON-417 west (under construction)");
		System.out.println("2. Take exit 118 for Ottawa regioanl road 95 / Lees avenue / Mann Avenue");
		if (player.sign() >= 2.8) {
			System.out.println("   Ottawa - 3");
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
			System.out.println("1. Take exit for Ottawa regioanl road 95");
			if (player.sign() >= 2.8) {
				System.out.println("   Ottawa - 3");
			}
			System.out.println("2. Take exit for Lees avenue / Mann avenue (under construction)");
			do {
				choice = input.nextInt();
			} while (choice != 1);
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				Ottawa.rr_95_waller_street_north_west(player);
			} else if (choice == 2) {
			}
		}
	}
}