package main;

import node.EndNode; // 220
import node.HighwayNode;
import node.Node;
import roads.north_america.canada.ontario.Ottawa;
import roads.north_america.canada.quebec.main_autoroutes.A10;
import roads.north_america.canada.quebec.main_autoroutes.A15;
import roads.north_america.canada.quebec.main_autoroutes.A40;
import roads.north_america.canada.quebec.primary_highways.QC112;
import roads.north_america.canada.quebec.spur_autoroutes.A720;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Main {
	
	// variables
	static Player player;
	static Scanner input;
	
	// Nodes - Quebec Main autoroutes
	
	public static HighwayNode a_15_north_66 = new HighwayNode ("Continue on A-15 north", "Take exit 66 for Decaire Boulevard (under construction)", null, null,
	new int [] {192}, new int [] {}, new String [] {"ottawa"}, new String [] {}); // TODO
	
	static HighwayNode a_15_north_69 = new HighwayNode ("Continue on A-15 north", "Take exit 69 for Decaire Boulevard (under construction)", null, null,
	new int [] {189}, new int [] {}, new String [] {"ottawa"}, new String [] {}); // TODO
	
	static HighwayNode a_15_north_70o = new HighwayNode ("Continue on A-15 north / A-40 east (under construction)", "Take exit 70O for A-40 west",
	new Node () {
		@Override
		public void go (Player player) {
			System.out.println("1. Take exit for A-40 West / Chemin de la Cote-de-Liesse");
			if (player.sign() >= 187) {
				System.out.println("   Ottawa - 187");
			}
			System.out.println("2. Take exit for QC-117");
			int choice;
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				System.out.println("1. Take exit for A-40 West");
				if (player.sign() >= 187) {
					System.out.println("   Ottawa - 187");
				}
				System.out.println("2. Take exit for Chemin de la Cote-de-Liesse");
				do {
					choice = input.nextInt();
				} while ((choice != 1) && (choice != 2));
				System.out.println("");
				System.out.println("");
				System.out.println("");
				if (choice == 1) {
					a_40_west_65();
				} else if (choice == 2) {
					main_menu();
				}
			} else if (choice == 2) {
				main_menu();
			}
		}
	}, null, new int [] {}, new int [] {187}, new String [] {}, new String [] {"ottawa"});
	
	static {
		a_15_north_66.continueNode(a_15_north_69);
		a_15_north_69.continueNode(a_15_north_70o);
	}
	
	// Helper methods
	public static void complete_job () { // TODO
		System.out.println("Job complete");
		if (player.job().equals("montreal - ottawa")) {
			System.out.println("+ 198");
			player.money(198 + player.money());
		} else if (player.job().equals("montreal - quebec city")) {
			System.out.println("+ 255");
			player.money(255 + player.money());
		} else if (player.job().equals("ottawa - montreal")) {
			System.out.println("+ 198");
			player.money(198 + player.money());
		}
		player.job("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
	static void free_roam () {
		if (player.location().equals("calgary")) {
			calgary();
		} else if (player.location().equals("edmonton")) {
			edmonton();
		} else if (player.location().equals("goose bay")) {
			goose_bay();
		} else if (player.location().equals("inuvik")) {
			inuvik();
		} else if (player.location().equals("montreal")) {
			montreal();
		} else if (player.location().equals("ottawa")) {
			ottawa();
		} else if (player.location().equals("quebec city")) {
			quebec_city();
		} else if (player.location().equals("saskatoon")) {
			saskatoon();
		} else if (player.location().equals("thunder bay")) {
			thunder_bay();
		} else if (player.location().equals("toronto")) {
			toronto();
		} else if (player.location().equals("vancouver")) {
			vancouver();
		} else if (player.location().equals("whitehorse")) {
			whitehorse();
		} else if (player.location().equals("winnipeg")) {
			winnipeg();
		} else if (player.location().equals("yellowknife")) {
			yellowknife();
		}
	}
	public static boolean is_job_complete () {
		return player.job().contains(" - " + player.location());
	}
	static void job_menu () { // TODO
		if (player.location().equals("calgary")) {
		} else if (player.location().equals("edmonton")) {
		} else if (player.location().equals("goose bay")) {
		} else if (player.location().equals("inuvik")) {
		} else if (player.location().equals("montreal")) {
			System.out.println("1. Montreal - Ottawa (198)");
			System.out.println("2. Montreal - Quebec City (255)");
			System.out.println("3. Back");
			int choice;
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2) && (choice != 3));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				player.job("montreal - ottawa");
				montreal();
			} else if (choice == 2) {
				player.job("montreal - quebec city");
				montreal();
			}
		} else if (player.location().equals("ottawa")) {
			System.out.println("1. Ottawa - Montreal (198)");
			System.out.println("2. Back");
			int choice;
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				player.job("ottawa - montreal");
				ottawa();
			} else if (choice == 2) {
				main_menu();
			}
		} else if (player.location().equals("quebec city")) {
		} else if (player.location().equals("saskatoon")) {
		} else if (player.location().equals("thunder bay")) {
		} else if (player.location().equals("toronto")) {
		} else if (player.location().equals("vancouver")) {
		} else if (player.location().equals("whitehorse")) {
		} else if (player.location().equals("winnipeg")) {
		} else if (player.location().equals("yellowknife")) {
		}
	}
	public static void main (String [] args) throws Exception {
		// File testing = new File ("testing.txt");
		// input = new Scanner (testing);
		input = new Scanner (System.in);
		player = new Player();
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("1. New game");
		System.out.println("2. Load game");
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 2) {
			player.load();
		}
		try {
			main_menu();
		} catch (Exception e) {
			try {
				File file = new File ("log.txt");
				if (!file.exists()) {
					file.createNewFile();
				}
				FileWriter writer = new FileWriter(file, false);
				for (int i = 0; i < e.getStackTrace().length; i++) {
					writer.write(e.getStackTrace()[i].toString() + "\n");
				}
				writer.close();
			} catch (Exception x) {
				x.printStackTrace();
				System.out.println("");
				System.out.println("");
				System.out.println("");
			}
			throw e;
		}
		input.close();
	}
	public static void main_menu () {
		System.out.println("1. Job menu");
		System.out.println("2. Free roam");
		System.out.println("3. Upgrades");
		System.out.println("4. Save");
		System.out.println("5. Quit");
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2) && (choice != 3) && (choice != 4) && (choice != 5));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			job_menu();
		} else if (choice == 2) {
			free_roam();
		} else if (choice == 3) {
			upgrades();
		} else if (choice == 4) {
			player.save();
			main_menu();
		}
	}
	static void upgrades () {
		System.out.println("Money : " + player.money());
		System.out.println("");
		System.out.println("1. Upgrade road signs");
		System.out.println("   Current : " + player.sign());
		System.out.println("   Cost : " + player.sign());
		System.out.println("   After upgrade : " + (player.sign() + 10));
		System.out.println("2. Upgrade gps");
		System.out.println("   Current : " + player.gps());
		System.out.println("   Cost : " + (player.gps() * 10));
		System.out.println("   After upgrade : " + (player.gps() + 1));
		System.out.println("3. Back");
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2) && (choice != 3));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			if (player.money() >= player.sign()) {
				player.money(player.money() - player.sign());
				player.sign(player.sign() + 10);
			}
			upgrades();
		} else if (choice == 2) {
			if (player.money() >= (player.gps() * 10)) {
				player.money(player.money() - player.gps() * 10);
				player.gps(player.gps() + 1);
			}
			upgrades();
		} else if (choice == 3) {
			main_menu();
		}
	}
	
	// Towns
	static void calgary () { // TODO
	}
	static void edmonton () { // TODO
	}
	static void goose_bay () { // TODO
	}
	static void inuvik () { // TODO
	}
	static void montreal () { // TODO
		System.out.println("1. Head north west on Boulevard Robert-Bourassa");
		System.out.println("2. Head south east on Boulevard Robert-Bourassa");
		if (player.sign() >= 198) {
			System.out.println("   Ottawa - 198");
		}
		if (player.sign() >= 255) {
			System.out.println("   Quebec City - 255");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			main_menu();
		} else if (choice == 2) {
			boulevard_robert_bourassa_rue_belmont_south_east();
		}
	}
	static void ottawa () {
		System.out.println("Heading sout west on Ottawa Regional Road 47");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		ottawa_42_ottawa_87_south_west();
	}
	static void quebec_city () { // TODO
	}
	static void saskatoon () { // TODO
	}
	static void thunder_bay () { // TODO
	}
	static void toronto () { // TODO
	}
	static void vancouver () { // TODO
	}
	static void whitehorse () { // TODO
	}
	static void winnipeg () { // TODO
	}
	static void yellowknife () { // TODO
	}
	
	// Quebec - Main Autoroutes
	static void a_10_boulevard_robert_bourassa_wellington_street_south_east () { // TODO
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
			A10.east_2(player);
		} else if (choice == 3) {
		}
	}
	public static void a_40_east_60 () { // TODO
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
			a_40_east_62();
		} else if (choice == 2) {
		}
	}
	static void a_40_east_62 () { // TODO
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
			a_40_east_64();
		} else if (choice == 2) {
		}
	}
	static void a_40_east_64 () { // TODO
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
			a_40_east_65();
		} else if (choice == 2) {
		}
	}
	static void a_40_east_65 () { // TODO
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
			a_40_east_70();
		} else if (choice == 2) {
		}
	}
	static void a_40_east_70 () { // TODO
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
	static void a_40_west_1 () { // TODO
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
			ontario_417_west_5();
		} else if (choice == 2) {
		}
	}
	static void a_40_west_2 () { // TODO
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
			a_40_west_1();
		} else if (choice == 2) {
		}
	}
	static void a_40_west_6 () { // TODO
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
			a_40_west_2();
		} else if (choice == 2) {
		}
	}
	static void a_40_west_9 () { // TODO
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
			a_40_west_6();
		} else if (choice == 2) {
		}
	}
	static void a_40_west_12 () { // TODO
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
			a_40_west_9();
		} else if (choice == 2) {
		}
	}
	static void a_40_west_17 () { // TODO
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
			a_40_west_12();
		} else if (choice == 2) {
		}
	}
	static void a_40_west_22 () { // TODO
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
			a_40_west_17();
		} else if (choice == 2) {
		}
	}
	static void a_40_west_26 () { // TODO
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
			a_40_west_22();
		} else if (choice == 2) {
		}
	}
	static void a_40_west_28 () { // TODO
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
			a_40_west_26();
		} else if (choice == 2) {
		}
	}
	static void a_40_west_32 () { // TODO
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
			a_40_west_28();
		} else if (choice == 2) {
		}
	}
	static void a_30_west_35 () { // TODO
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
			a_40_west_32();
		} else if (choice == 2) {
		}
	}
	static void a_40_west_36 () { // TODO
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
			a_30_west_35();
		} else if (choice == 2) {
		}
	}
	static void a_40_west_40 () { // TODO
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
			a_40_west_36();
		} else if (choice == 2) {
		}
	}
	static void a_40_west_41 () { // TODO
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
			a_40_west_40();
		} else if (choice == 2) {
		}
	}
	static void a_40_west_44 () { // TODO
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
			a_40_west_41();
		} else if (choice == 2) {
		}
	}
	static void a_40_west_49 () { // TODO
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
			a_40_west_44();
		} else if (choice == 2) {
		}
	}
	static void a_40_west_50 () { // TODO
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
			a_40_west_49();
		} else if (choice == 2) {
		}
	}
	static void a_40_west_52 () { // TODO
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
			a_40_west_50();
		} else if (choice == 2) {
		}
	}
	static void a_40_west_55 () { // TODO
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
			a_40_west_52();
		} else if (choice == 2) {
		}
	}
	static void a_40_west_60 () { // TODO
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
			a_40_west_55();
		} else if (choice == 2) {
		}
	}
	static void a_40_west_62 () { // TODO
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
			a_40_west_60();
		} else if (choice == 2) {
		}
	}
	static void a_40_west_64 () { // TODO
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
			a_40_west_62();
		} else if (choice == 2) {
		}
	}
	static void a_40_west_65 () { // TODO
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
			a_40_west_64();
		} else if (choice == 2) {
		}
	}
	
	// Ontario - 400 Series
	static void ontario_417_east_5 () { // TODO
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
	static void ontario_417_east_17 () { // TODO
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
			ontario_417_east_5();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_east_27 () { // TODO
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
			ontario_417_east_17();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_east_35 () { // TODO
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
			ontario_417_east_27();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_east_51 () { // TODO
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
			ontario_417_east_35();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_east_58 () { // TODO
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
			ontario_417_east_51();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_east_66 () { // TODO
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
			ontario_417_east_58();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_east_79 () { // TODO
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
			ontario_417_east_66();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_east_88 () { // TODO
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
			ontario_417_east_79();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_east_96 () { // TODO
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
			ontario_417_east_88();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_east_104 () { // TODO
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
			ontario_417_east_96();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_east_109 () { // TODO
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
			ontario_417_east_104();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_east_110 () { // TODO
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
			ontario_417_east_109();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_east_112 () { // TODO
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
			ontario_417_east_110();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_east_113 () { // TODO
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
			ontario_417_east_112();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_east_115 () { // TODO
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
			ontario_417_east_113();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_east_117 () { // TODO
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
			ontario_417_east_115();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_west_5 () { // TODO
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
			ontario_417_west_9();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_west_9 () { // TODO
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
			ontario_417_west_17();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_west_17 () { // TODO
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
			ontario_417_west_27();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_west_27 () { // TODO
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
			ontario_417_west_35();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_west_35 () { // TODO
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
			ontario_417_west_51();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_west_51 () { // TODO
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
			ontario_417_west_58();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_west_58 () { // TODO
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
			ontario_417_west_66();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_west_66 () { // TODO
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
			ontario_417_west_79();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_west_79 () { // TODO
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
			ontario_417_west_88();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_west_88 () { // TODO
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
			ontario_417_west_96();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_west_96 () { // TODO
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
			ontario_417_west_104();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_west_104 () { // TODO
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
			ontario_417_west_109();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_west_109 () { // TODO
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
			ontario_417_west_110();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_west_110 () { // TODO
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
			ontario_417_west_112();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_west_112 () { // TODO
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
			ontario_417_west_113a();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_west_113a () { // TODO
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
			ontario_417_west_113b();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_west_113b () { // TODO
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
			ontario_417_west_117();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_west_117 () { // TODO
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
			ontario_417_west_118();
		} else if (choice == 2) {
		}
	}
	static void ontario_417_west_118 () { // TODO
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
				ottawa_95_waller_street_north_west();
			} else if (choice == 2) {
			}
		}
	}
	
	// Ontario - Ottawa Regional roads
	static void ottawa_42_ottawa_87_south_west () { // TODO
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
			Ottawa.rr_40_rr_87_south_east(player);
		} else if (choice == 2) {
		}
	}
	static void ottawa_42_ottawa_89_south_west () { // TODO
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
	static void ottawa_42_ottawa_91_south_west () { // TODO
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
			ottawa_42_ottawa_89_south_west();
		} else if (choice == 3) {
		}
	}
	public static void ottawa_48_ottawa_87_south_east () { // TODO
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
			ottawa_48_ottawa_89_north_east();
		} else if (choice == 2) {
		} else if (choice == 3) {
		}
	}
	static void ottawa_48_ottawa_89_north_east () { // TODO
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
			ottawa_48_ottawa_91_north_east();
		}
	}
	static void ottawa_48_ottawa_91_north_east () { // TODO
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
				ottawa_48_ottawa_95_east();
			} else if (choice == 2) {
			}
		} else if (choice == 3) {
		}
	}
	static void ottawa_48_ottawa_95_east () { // TODO
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
				ontario_417_east_117();
			} else if (choice == 2) {
			}
		}
	}
	static void ottawa_48_ottawa_95_north () { // TODO
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
				ottawa_97_mackenzie_king_bridge_north();
			}
		} else if (choice == 3) {
		}
	}
	static void ottawa_95_waller_street_north_west () { // TODO
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
			ottawa_48_ottawa_95_north();
		} else if (choice == 2) {
		}
	}
	static void ottawa_97_mackenzie_king_bridge_north () { // TODO
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
			ottawa_42_ottawa_91_south_west();
		} else if (choice == 2) {
		}
	}

	// Local Roads
	static void boulevard_robert_bourassa_notre_dame_street_west_south_east () { // TODO
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
			boulevard_robert_bourassa_william_street_south_east();
		}
	}
	static void boulevard_robert_bourassa_ottawa_street_south_east () { // TODO
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
			a_10_boulevard_robert_bourassa_wellington_street_south_east();
		}
	}
	static void boulevard_robert_bourassa_rene_levesque_boulevard_west_north_east () { // TODO
		System.out.println("1. Turn left on Boulevard robert-bourassa (under construction)");
		System.out.println("2. Continue straight on Rene-levesque boulevard west (under construction)");
		System.out.println("3. Turn right on Boulevard robert-bourassa");
		if (player.sign() >= 1) {
			System.out.println("   Montreal - 1");
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
			System.out.println("1. Stop in Montreal");
			System.out.println("2. Continue straight on Boulevard robert-bourassa");
			if (player.sign() >= 198) {
				System.out.println("   Ottawa - 198");
			}
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				System.out.println("Arriving in Montreal");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				player.location("montreal");
				if (is_job_complete()) {
					complete_job();
				}
				main_menu();
			} else if (choice == 2) {
				boulevard_robert_bourassa_rue_belmont_south_east();
			}
		}
	}
	static void boulevard_robert_bourassa_rue_belmont_south_east () { // TODO
		System.out.println("1. Turn left on Rue Belmont (under construction)");
		System.out.println("2. Continue straight on Boulevard Robert-Bourassa");
		if (player.sign() >= 198) {
			System.out.println("   Ottawa - 198");
		}
		System.out.println("3. Turn right on Rue Belmont (under construction)");
		System.out.println("4. Make a u-turn on Boulevard Robert-Bourassa (under construction)");
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
			main_menu();
		} else if (choice == 2) {
			boulevard_robert_bourassa_rue_de_la_gauchetiere_ouest_south_east();
		} else if (choice == 3) {
			main_menu();
		} else if (choice == 4) {
		}
		main_menu();
	}
	static void boulevard_robert_bourassa_rue_de_la_gauchetiere_ouest_south_east () { // TODO
		System.out.println("1. Continue on Boulevard robert-bourassa");
		if (player.sign() >= 198) {
			System.out.println("   Ottawa - 198");
		}
		if (player.sign() >= 262) {
			System.out.println("   Quebec City - 262");
		}
		System.out.println("2. Turn right on Rue de la gauchetiere ouest");
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			boulevard_robert_bourassa_saint_antoine_street_west_south_east();
		} else if (choice == 3) {
			main_menu();
		}
	}
	static void boulevard_robert_bourassa_rue_saint_jaques_south_east () { // TODO
		System.out.println("1. Turn left on Rue saint-jaques (under construction)");
		System.out.println("2. Continue on Boulevard robert bourassa");
		if (player.sign() >= 262) {
			System.out.println("   Quebec City - 262");
		}
		System.out.println("3. Turn right on Rue saint-jaques (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 2);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
		} else if (choice == 2) {
			boulevard_robert_bourassa_notre_dame_street_west_south_east();
		} else if (choice == 3) {
		}
	}
	static void boulevard_robert_bourassa_saint_antoine_street_west_south_east () { // TODO
		System.out.println("1. Turn left on Saint-Antoine street west (under construction)");
		System.out.println("2. Continue straight on Boulevard robert-bourassa");
		System.out.println("3. Turn right on Saint-antoine street west");
		if (player.sign() >= 198) {
			System.out.println("   Ottawa - 198");
		}
		if (player.sign() >= 262) {
			System.out.println("   Quebec City - 262");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 3);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			main_menu();
		} else if (choice == 2) {
			boulevard_robert_bourassa_rue_saint_jaques_south_east();
		} else if (choice == 3) {
			mansfield_street_saint_antoine_street_west_south_west();
		}
	}
	static void boulevard_robert_bourassa_william_street_south_east () { // TODO
		System.out.println("1. Continue straight on Boulevard robert-bourassa");
		if (player.sign() >= 262) {
			System.out.println("   Quebec City - 262");
		}
		System.out.println("2. Turn right on William street (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			boulevard_robert_bourassa_ottawa_street_south_east();
		} else if (choice == 2) {
		}
	}
	static void mansfield_street_rene_levesque_boulevard_west_north_east () { // TODO
		System.out.println("1. Turn left on Mansfield street (under construction)");
		System.out.println("2. Continue straight on Rene-levesque boulevard west");
		if (player.sign() >= 1) {
			System.out.println("   Montreal - 1");
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
			boulevard_robert_bourassa_rene_levesque_boulevard_west_north_east();
		}
	}
	static void mansfield_street_saint_antoine_street_west_south_west () { // TODO
		System.out.println("1. Continue on Saint-antoine street west");
		if (player.sign() >= 198) {
			System.out.println("   Ottawa - 198");
		}
		System.out.println("2. Turn right on Mansfield Street");
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			rue_sainte_cecile_saint_antoine_street_west_south_west();
		} else if (choice == 2) {
			main_menu();
		}
	}
	static void rene_levesque_boulevard_west_avenue_amesbury_north_east () { // TODO
		System.out.println("1. Continue on Rene levesque boulevard west");
		if (player.sign() >= 1) {
			System.out.println("   Montreal - 1");
		}
		System.out.println("2. Turn right on Avenue amesbury (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			rene_levesque_boulevard_west_guy_street_north_east();
		} else if (choice == 2) {
		}
	}
	static void rene_levesque_boulevard_west_drummond_street_north_east () { // TODO
		System.out.println("1. Turn left on Drummond street (under construction)");
		System.out.println("2. Continue straight on Rene-levesque boulevard west");
		System.out.println("3. Turn right on Drummon street (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
		} else if (choice == 2) {
			rene_levesque_boulevard_west_stanley_street_north_east();
		} else if (choice == 3) {
		}
	}
	static void rene_levesque_boulevard_west_guy_street_north_east () { // TODO
		System.out.println("1. Turn left on Guy street (under construction)");
		System.out.println("2. Continue straight on Reve-levesque boulevard west");
		if (player.sign() >= 1) {
			System.out.println("   Montreal - 1");
		}
		System.out.println("3. Turn right on Guy street (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 2);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
		} else if (choice == 2) {
			rene_levesque_boulevard_west_mckay_street_north_east();
		} else if (choice == 3) {
		}
	}
	static void rene_levesque_boulevard_west_mckay_street_north_east() { // TODO
		System.out.println("1. Continue straight on Rene levesque boulevard west");
		if (player.sign() >= 1) {
			System.out.println("   Montreal - 1");
		}
		System.out.println("2. Turn right on McKay street (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			rene_levesque_boulevard_west_rue_lucien_lallier_north_east();
		} else if (choice == 2) {
		}
	}
	public static void rene_levesque_boulevard_west_rue_de_la_cathedrale_north_east () { // TODO
		System.out.println("1. Continue straight on Rene-levesque boulevard west");
		if (player.sign() >= 1) {
			System.out.println("   Montreal - 1");
		}
		System.out.println("2. Turn right on Rue de la cathedrale (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			mansfield_street_rene_levesque_boulevard_west_north_east();
		} else if (choice == 2) {
		}
	}
	static void rene_levesque_boulevard_west_rue_de_la_montange_north_east () { // TODO
		System.out.println("1. Continue straight on Rene-levesque boulevard west");
		if (player.sign() >= 1) {
			System.out.println("   Montreal - 1");
		}
		System.out.println("2. Turn right on Rue de la montange (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			rene_levesque_boulevard_west_drummond_street_north_east();
		} else if (choice == 2) {
		}
	}
	static void rene_levesque_boulevard_west_rue_joseph_monseau_north_east () { // TODO
		System.out.println("1. Continue straight on Rene-levesque boulevard west");
		if (player.sign() >= 1) {
			System.out.println("   Montreal - 1");
		}
		System.out.println("2. Turn right on Rue joseph monseau (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			rene_levesque_boulevard_west_saint_mathieu_street_north_east();
		} else if (choice == 2) {
		}
	}
	static void rene_levesque_boulevard_west_rue_lucien_lallier_north_east () { // TODO
		System.out.println("1. Continue straight on Rene-levesque boulevard west");
		if (player.sign() >= 1) {
			System.out.println("   Montreal - 1");
		}
		System.out.println("2. Turn right on Rue lucien l'allier (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			rene_levesque_boulevard_west_rue_de_la_montange_north_east();
		} else if (choice == 2) {
		}
	}
	public static void rene_levesque_bouleward_west_rue_saint_marc_north_west () { // TODO
		System.out.println("1. Turn left on Rene-levesque boulevard west (under construction)");
		System.out.println("2. Continue straight on Rue saint-marc (under construction)");
		System.out.println("3. Turn right on Rene-levesque boulevard west");
		if (player.sign() >= 1) {
			System.out.println("   Montreal - 1");
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
			rene_levesque_boulevard_west_rue_joseph_monseau_north_east();
		}
	}
	static void rene_levesque_boulevard_west_saint_mathieu_street_north_east () { // TODO
		System.out.println("1. Continue straight on Rene levesque bouleavrd west");
		if (player.sign() >= 1) {
			System.out.println("   Montreal - 1");
		}
		System.out.println("2. Turn right on Saint mathieu street (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			rene_levesque_boulevard_west_avenue_amesbury_north_east();
		} else if (choice == 2) {
		}
	}
	static void rene_levesque_boulevard_west_stanley_street_north_east () { // TODO
		System.out.println("1. Continue straight on Rene-levesque boulevard west");
		if (player.sign() >= 1) {
			System.out.println("   Montreal - 1");
		}
		System.out.println("2. Turn right on Stanley street (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			QC112.qc_112_rene_levesque_boulevard_west_north_east(player);
		} else if (choice == 2) {
		}
	}
	static void rue_de_la_cathedrale_saint_antoine_street_west () { // TODO
		System.out.println("1. Turn left on Rue de la cathedrale");
		System.out.println("2. Continue on Saint Antoine Street west");
		if (player.sign() >= 198) {
			System.out.println("   Ottawa - 198");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			main_menu();
		} else if (choice == 2) {
			QC112.qc_112_saint_antoine_street_west_south_west(player);
		}
	}
	static void rue_de_la_montagne_saint_antoine_street_west_south_west () { // TODO
		System.out.println("1. Turn left on Rue de la Montagne");
		System.out.println("2. Continue on Saint-antoine street west");
		if (player.sign() >= 197) {
			System.out.println("   Ottawa - 197");
		}
		System.out.println("3. Turn right on Rue de la Montagne");
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2) && (choice != 3));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			main_menu();
		} else if (choice == 2) {
			rue_lucien_lallier_saint_antoine_street_west_south_west();
		} else if (choice == 3) {
			main_menu();
		}
	}
	static void rue_lucien_lallier_saint_antoine_street_west_south_west () { // TODO
		System.out.println("1. Turn left on Rue lucien-L'Allier");
		System.out.println("2. Continue on Saint-antoine street west");
		if (player.sign() >= 197) {
			System.out.println("   Ottawa - 197");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			main_menu();
		} else if (choice == 2) {
			System.out.println("1. Continue on Saint-antoine street west");
			System.out.println("2. Take ramp to A-720 west");
			if (player.sign() >= 197) {
				System.out.println("   Ottawa - 197");
			}
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				main_menu();
			} else if (choice == 2) {
				A720.west_2(player);
			}
		}
	}
	public static void rue_saint_felix_saint_antoine_street_west_south_west () { // TODO
		System.out.println("1. Turn left on Rue saint-felix (under construction)");
		System.out.println("2. Continue on Saint-antoine street west");
		if (player.sign() >= 197) {
			System.out.println("   Ottawa - 197");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 2);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			main_menu();
		} else if (choice == 2) {
			rue_de_la_montagne_saint_antoine_street_west_south_west();
		}
	}
	static void rue_sainte_cecile_saint_antoine_street_west_south_west () { // TODO
		System.out.println("1. Turn left on Rue sainte-cecile (under construction)");
		System.out.println("2. Continue on Saint-antoine street west");
		if (player.sign() >= 198) {
			System.out.println("   Ottawa - 198");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 2);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			main_menu();
		} else if (choice == 2) {
			rue_de_la_cathedrale_saint_antoine_street_west();
		}
	}
}