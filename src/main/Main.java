package main; // 1,835 1,764 1,724 220 118 95

import node.HighwayNode;
import node.Node;
import roads.north_america.canada.ontario.Ottawa;
import roads.north_america.canada.quebec.main_autoroutes.A10;
import roads.north_america.canada.quebec.main_autoroutes.A40;
import roads.north_america.canada.quebec.primary_highways.QC112;
import roads.north_america.canada.quebec.spur_autoroutes.A720;
import roads.north_america.canada.quebect.Montreal;

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
					A40.west_65(player);
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
		Ottawa.rr_42_rr_87_south_west(player);
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


	// Local Roads
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
			Montreal.boulevard_robert_bourassa_notre_dame_street_west_south_east(player);
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
	public static void boulevard_robert_bourassa_william_street_south_east () { // TODO
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
			Montreal.boulevard_robert_bourassa_ottawa_street_south_east(player);
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