package roads.north_america.canada.quebec.main_autoroutes;

import java.util.Scanner;

import main.Main;
import main.Player;
import roads.north_america.canada.ontario.series400.ON417;

public class A40 {
	static Scanner input;
	static {
		input = new Scanner (System.in);
	}
	public static void east_1 (Player player) { // TODO
		System.out.println("1. Continue on A-40 east");
		if (player.sign() >= 77.6) {
			System.out.println("   Montreal - 78");
		}
		System.out.println("2. Take exit 1 for Montee Janssen (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_2(player);
		} else if (choice == 2) {
		}
	}
	public static void east_2 (Player player) { // TODO
		System.out.println("1. Continue on A-40 east");
		if (player.sign() >= 75.6) {
			System.out.println("   Montreal - 76");
		}
		System.out.println("2. Take exit 2 for Montee Jenssen / Voie de service (under construction)");
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
		System.out.println("1. Continue on A-40 east");
		if (player.sign() >= 72.2) {
			System.out.println("   Montreal - 72");
		}
		System.out.println("2. Take exit 6 for Montee de la baie-saint-thomas (under construction)");
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
		System.out.println("1. Continue on A-40 east");
		if (player.sign() >= 68.8) {
			System.out.println("   Montreal - 69");
		}
		System.out.println("2. Take exit 9 for Rue jean-marc-seguin (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_12(player);
		} else if (choice == 2) {
		}
	}
	public static void east_12 (Player player) { // TODO
		System.out.println("1. Continue on A-40 east");
		if (player.sign() >= 65.6) {
			System.out.println("   Montreal - 66");
		}
		System.out.println("2. Take exit 12 for Chemin Jean-rene-gauthier (under construction)");
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
	static void east_17 (Player player) { // TODO
		System.out.println("1. Continue on A-40 east");
		if (player.sign() >= 61.3) {
			System.out.println("   Montral - 61");
		}
		System.out.println("2. Take exit 17 for QC-201 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_22(player);
		} else if (choice == 2) {
		}
	}
	static void east_22 (Player player) { // TODO
		System.out.println("1. Continue on A-40 east");
		if (player.sign() >= 56.1) {
			System.out.println("   Montreal - 56");
		}
		System.out.println("2. Take exit 22 for Chemin saint-louis / Cote saint-charles (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_26(player);
		} else if (choice == 2) {
		}
	}
	static void east_26 (Player player) { // TODO
		System.out.println("1. Continue on A-40 east");
		if (player.sign() >= 51.9) {
			System.out.println("   Montreal - 52");
		}
		System.out.println("2. Take exit 56 for Chemin Daoust (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_32(player);
		} else if (choice == 2) {
		}
	}
	static void east_32 (Player player) { // TODO
		System.out.println("1. Continue on A-40 east");
		if (player.sign() >= 45.8) {
			System.out.println("   Montreal - 46");
		}
		System.out.println("2. Take exit 32 for A-30 east (under construction)");
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
	static void east_35 (Player player) { // TODO
		System.out.println("1. Continue on A-40 east");
		if (player.sign() >= 42.8) {
			System.out.println("   Montreal - 43");
		}
		System.out.println("2. Take exit 35 for boulevard de la cite-des-jeunes / Rue broivert (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_41(player);
		} else if (choice == 2) {
		}
	}
	static void east_41 (Player player) { // TODO
		System.out.println("1. Continue on A-40 east");
		if (player.sign() >= 36) {
			System.out.println("   Montreal - 36");
		}
		System.out.println("2. Take exit 41 for Boulevard des ancien-combattants (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_44(player);
		} else if (choice == 2) {
		}
	}
	static void east_44 (Player player) { // TODO
		System.out.println("1. Continue on A-40 east");
		if (player.sign() >= 33) {
			System.out.println("   Montreal - 33");
		}
		System.out.println("2. Take exit 44 for Voie de service sud (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_49(player);
		} else if (choice == 2) {
		}
	}
	static void east_49 (Player player) { // TODO
		System.out.println("1. Continue on A-40 east");
		if (player.sign() >= 31) {
			System.out.println("   Montreal - 31");
		}
		System.out.println("2. Take exit 49 for Voie de service nord (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_50(player);
		} else if (choice == 2) {
		}
	}
	static void east_50 (Player player) { // TODO
		System.out.println("1. Continue on A-40 east");
		if (player.sign() >= 28) {
			System.out.println("   Montreal - 29");
		}
		System.out.println("2. Take exit 50 for Voie de service sud (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_52(player);
		} else if (choice == 2) {
		}
	}
	static void east_52 (Player player) { // TODO
		System.out.println("1. Continue on A-40 east");
		if (player.sign() >= 26) {
			System.out.println("   Montreal - 26");
		}
		System.out.println("2. Take exit 52 for Voie de service sud (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_55(player);
		} else if (choice == 2) {
		}
	}
	static void east_55 (Player player) { // TODO
		System.out.println("1. Continue on A-40 east");
		if (player.sign() >= 23) {
			System.out.println("   Montreal - 23");
		}
		System.out.println("2. Take exit 55 for South service road (under construction)");
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
	static void east_58 (Player player) { // TODO
		System.out.println("1. Continue on A-40 east");
		if (player.sign() >= 20) {
			System.out.println("   Montreal - 20");
		}
		System.out.println("2. Take exit 58 for South service road (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_60(player);
		} else if (choice == 2) {
		}
	}
	public static void east_60 (Player player) { // TODO
		System.out.println("1. Continue on A-40 east");
		if (player.sign() >= 18) {
			System.out.println("   Montreal - 18");
		}
		System.out.println("2. Take exit 60 for South service road (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_62(player);
		} else if (choice == 2) {
		}
	}
	static void east_62 (Player player) { // TODO
		System.out.println("1. Continue on A-40 east");
		if (player.sign() >= 16) {
			System.out.println("   Montreal - 16");
		}
		System.out.println("2. Take exit 62 for Trans canada route (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_64(player);
		} else if (choice == 2) {
		}
	}
	static void east_64 (Player player) { // TODO
		System.out.println("1. Continue on A-40 east");
		if (player.sign() >= 15) {
			System.out.println("   Montreal - 15");
		}
		System.out.println("2. Take exit 64 for Trans canada route (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_65(player);
		} else if (choice == 2) {
		}
	}
	static void east_65 (Player player) { // TODO
		System.out.println("1. Continue on A-40 east");
		if (player.sign() >= 13) {
			System.out.println("   Montreal - 13");
		}
		System.out.println("2. Take exit 65 for Trans canada route (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_70(player);
		} else if (choice == 2) {
		}
	}
	static void east_70 (Player player) { // TODO
		System.out.println("1. Continue on A-40 (under construction)");
		System.out.println("2. Take exit 70 for A-15 south");
		if (player.sign() >= 11) {
			System.out.println("   Montreal - 11");
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
			A15.south_69(player);
		}
	}
	public static void east_307n (Player player) { // TODO
		System.out.println("1. Continue on A-440 east");
		if (player.sign() >= 9) {
			System.out.println("   Quebec City - 9");
		}
		System.out.println("2. Take exit 307N for A-40 east / A-73 north");
		if (player.sign() >= 1525) {
			System.out.println("   Goose Bay - 1,525");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			// straight on boulevard charest ouest
			// straight on boulevard charest est
			// straight on rue saint-paul
			// straight on QC-136
			System.out.println("Arriving in Quebec City");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			player.location("quebec city");
			if (Main.is_job_complete()) {
				Main.complete_job();
			}
			Main.main_menu();
		} else if (choice == 2) {
			// exit 142E for A-40 east
			// straight on QC-138
			// 3rd exit on the roundabout for Chemin Rex Fort
			// straight on Chemin de la scierie
			// right
			// right
			// left on QC-389
			// straight on NL-500
			// right on hamilton river road
			// left on 10th street
			System.out.println("Arriving in Goose Bay");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			player.location("goose bay");
			if (Main.is_job_complete()) {
				Main.complete_job();
			}
			Main.main_menu();
		}
	}
	static void west_1 (Player player) { // TODO
		System.out.println("1. Continue on A-40 west");
		if (player.sign() >= 121) {
			System.out.println("   Ottawa - 121");
		}
		System.out.println("2. Take exit 1 for QC-342 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			ON417.west_5(player);
		} else if (choice == 2) {
		}
	}
	static void west_2 (Player player) { // TODO
		System.out.println("1. Continue on A-40 west");
		if (player.sign() >= 124) {
			System.out.println("   Ottawa - 124");
		}
		System.out.println("2. Take exit 2 for Voie de service (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_1(player);
		} else if (choice == 2) {
		}
	}
	static void west_6 (Player player) { // TODO
		System.out.println("1. Continue on A-40 west");
		if (player.sign() >= 126) {
			System.out.println("   Ottawa - 126");
		}
		System.out.println("2. Take exit 6 for Voie de service (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_2(player);
		} else if (choice == 2) {
		}
	}
	static void west_9 (Player player) { // TODO
		System.out.println("1. Continue on A-40 west");
		if (player.sign() >= 129) {
			System.out.println("   Ottawa - 129");
		}
		System.out.println("2. Take exit 9 for QC-342 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_6(player);
		} else if (choice == 2) {
		}
	}
	static void west_12 (Player player) { // TODO
		System.out.println("1. Continue on A-40 west");
		if (player.sign() >= 133) {
			System.out.println("   Ottawa - 133");
		}
		System.out.println("2. Take exit 12 for QC-342 (under construction)");
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
	public static void west_17 (Player player) { // TODO
		System.out.println("1. Continue on A-40 west");
		if (player.sign() >= 138) {
			System.out.println("   Ottawa - 138");
		}
		System.out.println("2. Take exit 17 for QC-201 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_12(player);
		} else if (choice == 2) {
		}
	}
	static void west_22 (Player player) { // TODO
		System.out.println("1. Continue on A-40 west");
		if (player.sign() >= 143) {
			System.out.println("   Ottawa - 143");
		}
		System.out.println("2. Take exit 22 for Cote saint-charles (under construction)");
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
	static void west_26 (Player player) { // TODO
		System.out.println("1. Continue on A-40");
		if (player.sign() >= 148) {
			System.out.println("   Ottawa - 148");
		}
		System.out.println("2. Take exit 26 for Chemin Daoust (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_22(player);
		} else if (choice == 2) {
		}
	}
	static void west_28 (Player player) { // TODO
		System.out.println("1. Continue on A-40");
		if (player.sign() >= 148) {
			System.out.println("   Ottawa - 148");
		}
		System.out.println("2. Take exit 28 for QC-342 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_26(player);
		} else if (choice == 2) {
		}
	}
	static void west_32 (Player player) { // TODO
		System.out.println("1. Continue on A-40 west");
		if (player.sign() >= 153) {
			System.out.println("   Ottawa - 153");
		}
		System.out.println("2. Take exit 32 for A-30 east (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_28(player);
		} else if (choice == 2) {
		}
	}
	static void west_35 (Player player) { // TODO
		System.out.println("1. Continue on A-40 west");
		if (player.sign() >= 156) {
			System.out.println("   Ottawa - 156");
		}
		System.out.println("2. Take exit 35 for Avenue Saint-Charles / Rue Joseph-cartier (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_32(player);
		} else if (choice == 2) {
		}
	}
	static void west_36 (Player player) { // TODO
		System.out.println("1. Continue on A-40 west");
		if (player.sign() >= 157) {
			System.out.println("   Ottawa - 157");
		}
		System.out.println("2. Take exit 36 for Chemin Dumphry (under construction)");
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
	static void west_40 (Player player) { // TODO
		System.out.println("1. Continue on A-40 west");
		if (player.sign() >= 161) {
			System.out.println("   Ottawa - 161");
		}
		System.out.println("Take exit 40 for Senneville road (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_36(player);
		} else if (choice == 2) {
		}
	}
	static void west_41 (Player player) { // TODO
		System.out.println("1. Continue on A-40 west");
		if (player.sign() >= 164) {
			System.out.println("   Ottawa - 164");
		}
		System.out.println("2. Take exit 41 for Voie de service nord (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_40(player);
		} else if (choice == 2) {
		}
	}
	static void west_44 (Player player) { // TODO
		System.out.println("1. Continue on A-40 west");
		if (player.sign() >= 165) {
			System.out.println("   Ottawa - 165");
		}
		System.out.println("Take exit 44 for Sainte Marie Road / Voie de service nord (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_41(player);
		} else if (choice == 2) {
		}
	}
	static void west_49 (Player player) { // TODO
		System.out.println("1. Continue on A-40 west");
		if (player.sign() >= 168) {
			System.out.println("  Ottawa - 168");
		}
		System.out.println("2. Take exit 49 for Voie de service nord (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_44(player);
		} else if (choice == 2) {
		}
	}
	static void west_50 (Player player) { // TODO
		System.out.println("1. Continue on A-40 west");
		if (player.sign() >= 171) {
			System.out.println("   Ottawa - 171");
		}
		System.out.println("2. Take exit 50 for Voie de servie nord (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_49(player);
		} else if (choice == 2) {
		}
	}
	static void west_52 (Player player) { // TODO
		System.out.println("1. Continue on A-40 west");
		if (player.sign() >= 174) {
			System.out.println("   Ottawa - 174");
		}
		System.out.println("2. Take exit 52 for North service road (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_50(player);
		} else if (choice == 2) {
		}
	}
	static void west_55 (Player player) { // TODO
		System.out.println("1. Continue on A-40 west");
		if (player.sign() >= 177) {
			System.out.println("   Ottawa - 177");
		}
		System.out.println("2. Take exit 55 for Trans canada route (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_52(player);
		} else if (choice == 2) {
		}
	}
	static void west_60 (Player player) { // TODO
		System.out.println("1. Continue on A-40 west");
		if (player.sign() >= 182) {
			System.out.println("   Ottawa - 182");
		}
		System.out.println("2. Take exit 60 for A-13 north / Trans canada route (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_55(player);
		} else if (choice == 2) {
		}
	}
	static void west_62 (Player player) { // TODO
		System.out.println("1. Continue on A-40 west");
		if (player.sign() >= 183) {
			System.out.println("   Ottawa - 183");
		}
		System.out.println("2. Take exit 62 for Trans canada route (under construction");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_60(player);
		} else if (choice == 2) {
		}
	}
	static void west_64 (Player player) { // TODO
		System.out.println("1. Continue on A-40 west");
		if (player.sign() >= 185) {
			System.out.println("   Ottawa - 185");
		}
		System.out.println("2. Take exit 64 for Trans canada route (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_62(player);
		} else if (choice == 2) {
		}
	}
	public static void west_65 (Player player) { // TODO
		System.out.println("1. Continue on A-40 west");
		if (player.sign() >= 186) {
			System.out.println("   Ottawa - 186");
		}
		System.out.println("2. Take exit 65 for chemin de la ote-de-liesse (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_64(player);
		} else if (choice == 2) {
		}
	}
}
