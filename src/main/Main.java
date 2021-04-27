package main; // 1,835 1,764 1,724 1,092 760 487 333 220 118 95 - 45

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import roads.north_america.canada.ontario.Ottawa;
import roads.north_america.canada.quebec.Montreal;
import roads.north_america.canada.quebec.primary_highways.QC136;
import roads.north_america.canada.quebec.spur_autoroutes.A440.QuebecCity;

public class Main {
	
	// variables
	static Player player;
	static Scanner input;
	static HashMap <String, Integer> job_values = new HashMap <String, Integer> ();
	
	static {
		job_values.put("goose bay - montreal", 1771);
		job_values.put("goose bay - ottawa", 1959);
		job_values.put("goose bay - quebec city", 1514);
		job_values.put("montreal - ottawa", 198);
		job_values.put("montreal - quebec city", 263);
		job_values.put("ottawa - montreal", 198);
		job_values.put("ottawa - quebec city", 444);
		job_values.put("quebec city - goose bay", 1515);
		job_values.put("quebec city - montreal", 263);
		job_values.put("quebec city - ottawa", 444);
		// montreal - goose bay
		// ottawa - goose bay
	}
	
	// Helper methods
	public static void complete_job () { // TODO
		System.out.println("Job complete");
		System.out.println("+ " + job_values.get(player.job()));
		player.money(job_values.get(player.job()) + player.money());
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
		Set <String> jobs = job_values.keySet();
		if (player.location().equals("calgary")) {
			ArrayList <String> calgary_jobs = new ArrayList <String> ();
			for (int i = 0; i < jobs.toArray().length; i++) {
				if (((String)jobs.toArray()[i]).contains("calgary - ")) {
					calgary_jobs.add((String)jobs.toArray()[i]);
				}
			}
			Random rand = new Random();
			ArrayList <String> available_jobs = new ArrayList <String> ();
			while (available_jobs.size() < 5) {
				int index = rand.nextInt(calgary_jobs.size());
				available_jobs.add(calgary_jobs.get(index));
				calgary_jobs.remove(index);
			}
		} else if (player.location().equals("edmonton")) {
		} else if (player.location().equals("goose bay")) {
			System.out.println("1. Goose Bay - Montreal (1,771)");
			System.out.println("2. Goose Bay - Ottawa (1,959)");
			System.out.println("3. Goose Bay - Quebec City (1,514)");
			System.out.println("4. Back");
			int choice;
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2) && (choice != 3) && (choice != 4));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				player.job("goose bay - montreal");
				goose_bay();
			} else if (choice == 2) {
				player.job("goose bay - ottawa");
				goose_bay();
			} else if (choice == 3) {
				player.job("goose bay - quebec city");
				goose_bay();
			} else if (choice == 4) {
				main_menu();
			}
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
			System.out.println("2. Ottawa - Quebec City (444)");
			System.out.println("3. Back");
			int choice;
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2) && (choice != 3));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				player.job("ottawa - montreal");
				ottawa();
			} else if (choice == 2) {
				player.job("ottawa - quebec city");
				ottawa();
			} else if (choice == 3) {
				main_menu();
			}
		} else if (player.location().equals("quebec city")) {
			System.out.println("1. Quebec City - Goose Bay (1,515)");
			System.out.println("2. Quebec City - Monteal (263)");
			System.out.println("3. Quebec City - Ottawa (444)");
			System.out.println("4. Back");
			int choice;
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2) && (choice != 3) && (choice != 4));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				player.job("quebec city - goose bay");
				quebec_city();
			} else if (choice == 2) {
				player.job("quebec city - montreal");
				quebec_city();
			} else if (choice == 3) {
				player.job("quebec city - ottawa");
				quebec_city();
			} else if (choice == 4) {
				main_menu();
			}
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
		// south on 10th street
		// right on hamilton river road
		// left on NL-500
		// straight on QC-389
		// right
		// left
		// straight on Chemin de la scierie
		// straight on Chemin rex fort
		// 1st roundabout exit for QC-138
		// straight on A-40 east / A-440 east
		System.out.println("1. Continue on A-440 east");
		if (player.sign() >= 10) {
			System.out.println("   Quebec City - 10");
		}
		System.out.println("2. Take exit for A-40 east");
		if (player.sign() >= 267) {
			System.out.println("   Montreal - 267");
		}
		if (player.sign() >= 455) {
			System.out.println("   Ottawa - 455");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			// exit 23 for 1re rue / 8e avenue
			// right on 1re rue
			// right on QC-136
			// ramp to Pont-Tunnel joseph-samson
			// straight on cote dinan
			// left on QC-136
			System.out.println("Arriving in Quebec City");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			player.location("quebec city");
			if (is_job_complete()) {
				complete_job();
			}
			main_menu();
		} else if (choice == 2) {
			// exit for A-40 east / A-73 south
			System.out.println("1. Continue on A-73 south");
			if (player.sign() >= 254) {
				System.out.println("   Montreal - 254");
			}
			System.out.println("2. Take exit for A-40 east");
			if (player.sign() >= 436) {
				System.out.println("   Ottawa - 436");
			}
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				// exit 131O for A-20 west
				// exit 82 for Taschereau boulevard
				// ramp to QC-134
				// exit doe Avenue de lormier
				// right on A-720
				// exit 5 for mansfield street
				// right on rene-levesque boulevard west
				Montreal.boulevard_robert_bourassa_rene_levesque_boulevard_west_north_east(player);
			} else if (choice == 2) {
				// exit for A-40 east / A-55 north
				// exit 186 for A-40 east
				// exit 96o for A-640 east
				// exit 20 for A-15 north
				// exit 35 for A-50 west
				// exit 135 for A-5 south
				// exit for boteler street
				// right on boteler street
				// left on rr 93
				// straight on rr 44
				// right on rr 34
				// left on rr 91
				// right on rr 42
				Ottawa.rr_42_rr_89_south_west(player);
			}
		}
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
			Montreal.boulevard_robert_bourassa_rue_belmont_south_east(player);
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
		// East on QC-136
		QC136.qc_136_rue_saint_nicolas_rue_saint_paul(player);
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
}

// Finished Cities : 4

// Goose Bay
// Montreal
// Ottawa
// Quebec City



// Finisehd Jobs : 7

// Goose Bay - Quebec City
// Montreal - Ottawa
// Montreal - Quebec City
// Ottawa - Montreal
// Ottawa - Quebec City
// Quebec City - Ottawa
// Quebec City - Montreal



// Cities to do : 14

// Anchorage
// Calgary
// Edmonton
// Fairbanks
// Inuvik
// Junean
// Ketchikan
// Saskatoon
// Thunder Bay
// Toronto
// Vancouver
// Whitehorse
// Winnipeg
// Yellowknife



// Jobs to do : 33

// Calgary - Edmonton
// Calgary - Goose Bay
// Calgary - Inuvik
// Calgary - Montreal
// Calgary - Ottawa
// Calgary - Quebec City
// Calgary - Saskatoon
// Calgary - Thunder Bay
// Calgary - Toronto
// Calgary - Vancouver
// Calgary - Whitehorse
// Calgary - Winnipeg
// Clgary - Yellowknife
// Edmonton - Calgary
// Edmonton - Goose Bay
// Edmonton - Inuvik
// Edmonton - Montreal
// Edmonton - Ottawa
// Edmonton - Quebec City
// Edmonton - Saskatoon
// Edmonton - Thunder Bay
// Edmonton - Toronto
// Edmonton - Vancouver
// Edmonton - Whitehorse
// Edmonton - Winnipeg
// Edmonton - Yellowknife
// Goose Bay - Calgary
// Goose Bay - Edmonton
// Goose Bay - Inuvik
// Goose Bay - Montreal
// Goose Bay - Ottawa
// Goose Bay - Saskatoon
// Goose Bay - Thunder bay
// Goose Bay - Toronto