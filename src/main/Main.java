package main; // 1,835 1,764 1,724 1,092 760 487 333 220 118 95 - 45

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
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
	static HashMap <String, Integer> job_values = new HashMap <String, Integer> (); // 200 
	
	static void generate_jobs (){
		// Barrow
		// Havana
		// Hilo
		// Honolulu
		// Iqaluit
		// Nome
		// Nuuk
		job_values.put("anchorage - atlanta", 6906); // TODO
		job_values.put("anchorage - bismark", 4465); // TODO
		job_values.put("anchorage - boston", 7190); // TODO
		job_values.put("anchorage - calgary", 3380); // TODO
		job_values.put("anchorage - cancun", 9304); // TODO
		job_values.put("anchorage - charleton", 7215); // TODO
		job_values.put("anchorage - chicago", 5750); // TODO
		job_values.put("anchorage - chihuahua", 6514); // TODO
		job_values.put("anchorage - cincinnati", 6224); // TODO
		job_values.put("anchorage - dallas", 6262); // TODO
		job_values.put("anchorage - denver", 5122); // TODO
		job_values.put("anchorage - detroit", 6181); // TODO
		job_values.put("anchorage - edmonton", 3124); // TODO
		job_values.put("anchorage - fairbanks", 578); // TODO
		job_values.put("anchorage - goose bay", 8256); // TODO
		job_values.put("anchorage - guatemala", 9139); // TODO
		job_values.put("anchorage - houston", 6645); // TODO
		job_values.put("anchorage - inuvik", 2331); // TODO
		job_values.put("anchorage - juneau", 1365); // TODO
		job_values.put("anchorage - kansas city", 5637); // TODO
		job_values.put("anchorage - ketchikan", 2696); // TODO
		job_values.put("anchorage - las vegas", 5430); // TODO
		job_values.put("anchorage - los angeles", 5463); // TODO
		job_values.put("anchorage - mexico city", 7880); // TODO
		job_values.put("anchorage - miami", 7972); // TODO
		job_values.put("anchorage - minneapolis", 7972); // TODO
		job_values.put("anchorage - monterrey", 7036); // TODO
		job_values.put("anchorage - montreal", 6700); // TODO
		job_values.put("anchorage - new orleans", 6994); // TODO
		job_values.put("anchorage - new york", 7018); // TODO
		job_values.put("anchorage - oaxaca", 8303); // TODO
		job_values.put("anchorage - orlando", 7610); // TODO
		job_values.put("anchorage - ottawa", 6509); // TODO
		job_values.put("anchorage - panama city", 11002); // TODO
		job_values.put("anchorage - philadelphia", 6968); // TODO
		job_values.put("anchorage - phoenix", 5819); // TODO
		job_values.put("anchorage - portland", 3926); // TODO
		job_values.put("anchorage - quebec city", 6936); // TODO
		job_values.put("anchorage - salt lake city", 4756); // TODO
		job_values.put("anchorage - san diego", 5656); // TODO
		job_values.put("anchorage - san francisco", 4936); // TODO
		job_values.put("anchorage - san jose", 10277); // TODO
		job_values.put("anchorage - saskatoon", 3638); // TODO
		job_values.put("anchorage - seattle", 3637); // TODO
		job_values.put("anchorage - spokane", 3802); // TODO
		job_values.put("anchorage - st louis", 5991); // TODO
		job_values.put("anchorage - thunder bay", 5133); // TODO
		job_values.put("anchorage - toronto", 6416); // TODO
		job_values.put("anchorage - vancouver", 3526); // TODO
		job_values.put("anchorage - washington d.c.", 6867); // TODO
		job_values.put("anchorage - whitehorse", 1133); // TODO
		job_values.put("anchorage - winnipeg", 4424); // TODO
		job_values.put("anchroage - yellowknife", 3012); // TODO
		
		job_values.put("goose bay - montreal", 1771);
		job_values.put("goose bay - ottawa", 1959);
		job_values.put("goose bay - quebec city", 1514);
		job_values.put("goose bay - toronto", 2319); // TODO
		job_values.put("montreal - goose bay", 1770);
		job_values.put("montreal - ottawa", 198);
		job_values.put("montreal - quebec city", 263);
		job_values.put("ottawa - goose bay", 1960);
		job_values.put("ottawa - montreal", 198);
		job_values.put("ottawa - quebec city", 444);
		job_values.put("quebec city - goose bay", 1515);
		job_values.put("quebec city - montreal", 263);
		job_values.put("quebec city - ottawa", 444);
		// goose bay - toronto
		// montreal - toronto
		// ottawa - toronto
		// quebec city - toronto
		// toronto - goose bay
		// toronto - montreal
		// toronto - ottawa
		// toronto - quebec city
	}
	
	// Helper methods
	public static void complete_job () { // TODO
		System.out.println("Job complete");
		System.out.println("+ " + job_values.get(player.job()));
		player.money(job_values.get(player.job()) + player.money());
		player.job("");
		System.out.println("\n\n");
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
		ArrayList <String> jobs_for_location = new ArrayList <String>();
		for (int i = 0; i < jobs.toArray().length; i++) {
			if (((String)jobs.toArray()[i]).contains(player.location() + " - ")) {
				jobs_for_location.add((String)jobs.toArray()[i]);
			}
		}
		Random rand = new Random();
		ArrayList<String> available_jobs = new ArrayList<String>();
		while (available_jobs.size() < 5) {
			int index = rand.nextInt(jobs_for_location.size());
			available_jobs.add(jobs_for_location.get(index));
			jobs_for_location.remove(index);
		}
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + ". " + available_jobs.get(i) + " (" + job_values.get(available_jobs.get(i)) + ")");
		}
		System.out.println("6. Back");
		int choice;
		do {
			choice = input.nextInt();
		} while (!Arrays.asList(1, 2, 3, 4, 5, 6).contains(choice));
		System.out.println("\n\n");
		if (choice < 6) {
			free_roam();
		} else if (choice == 6) {
			main_menu();
		}
	}
	public static void main (String [] args) throws Exception {
		// File testing = new File ("testing.txt");
		// input = new Scanner (testing);
		generate_jobs();
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
		if (player.sign() >= 1770) {
			System.out.println("   Goose Bay - 1,770");
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