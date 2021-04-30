package main;

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
	
	static void generate_jobs () throws Exception {
		// Iqaluit
		job_values.put("calgary - edmonton", 299); // TODO
		job_values.put("calgary - goose bay", 5161); // TODO
		job_values.put("calgary - inuvik", 3473); // TODO
		job_values.put("calgary - montreal", 3534); // TODO
		job_values.put("calgary - ottawa", 3338); // TODO
		job_values.put("calgary - quebec city", 3783); // TODO
		job_values.put("calgary - thunder bay", 2021); // TODO
		job_values.put("calgary - toronto", 3238); // TODO
		job_values.put("calgary - vancouver", 1076); // TODO
		job_values.put("calgary - whitehorse", 2248); // TODO
		job_values.put("calgary - winnipeg", 1327); // TODO
		job_values.put("calgary - yellowknife", 1748); // TODO
		job_values.put("edmonton - calgary", 300); // TODO
		job_values.put("edmonton - goose bay", 5139); // TODO
		job_values.put("edmonton - inuvik", 3215); // TODO
		job_values.put("edmonton - montreal", 3583); // TODO
		job_values.put("edmonton - ottawa", 3392); // TODO
		job_values.put("edmonton - quebec city", 3819); // TODO
		job_values.put("edmonton - thunder bay", 2015); // TODO
		job_values.put("edmonton - toronto", 3229); // TODO
		job_values.put("edmonton - vancouver", 1159); // TODO
		job_values.put("edmonton - whitehorse", 1990); // TODO
		job_values.put("edmonton - winnipeg", 1305);
		job_values.put("edmonton - yellowknife", 1451); // TODO
		job_values.put("goose bay - calgary", 5163); // TODO
		job_values.put("goose bay - edmonton", 5128); // TODO
		job_values.put("goose bay - inuvik", 8335); // TODO
		job_values.put("goose bay - montreal", 1771);
		job_values.put("goose bay - ottawa", 1959);
		job_values.put("goose bay - quebec city", 1514);
		job_values.put("goose bay - thunder bay", 3148);
		job_values.put("goose bay - toronto", 2319); // TODO
		job_values.put("goose bay - vancouver", 6325);
		job_values.put("goose bay - whitehorse", 7111);
		job_values.put("goose bay - winnipeg", 3825);
		job_values.put("goose bay - yellowknife", 6550);
		job_values.put("inuvik - calgary", 3474);
		job_values.put("inuvk - edmonton", 3218);
		job_values.put("inuvik - goose bay", 8350);
		job_values.put("inuvik - montreal", 6794);
		job_values.put("inuvik - ottawa", 6664);
		job_values.put("inuvik - quebec city", 7029);
		job_values.put("inuvik - thunder bay", 5226);
		job_values.put("inuvik - toronto", 6510);
		job_values.put("inuvik - vancouver", 3619);
		job_values.put("inuvik - whitehorse", 1227);
		job_values.put("inuvik - winnipeg", 4515);
		job_values.put("inuvik - yelloknife", 3105);
		job_values.put("montreal - calgary", 3524);
		job_values.put("montreal - edmonton", 3572);
		job_values.put("montreal - goose bay", 1770);
		job_values.put("montreal - inuvik", 6780);
		job_values.put("montreal - ottawa", 198);
		job_values.put("montreal - quebec city", 263);
		job_values.put("montreal - thunder bay", 1592);
		job_values.put("montreal - toronto", 542);
		job_values.put("montreal - vancouver", 4554);
		job_values.put("montreal - whitehorse", 5555);
		job_values.put("montreal - winnipeg", 2269);
		job_values.put("montreal - yellowknife", 4994);
		job_values.put("ottawa - calgary", 3328);
		job_values.put("ottawa - edmonton", 3443);
		job_values.put("ottawa - goose bay", 1960);
		job_values.put("ottawa - inuvik", 6650);
		job_values.put("ottawa - montreal", 198);
		job_values.put("ottawa - quebec city", 444);
		job_values.put("ottawa - thunder bay", 1463);
		job_values.put("ottawa - toronto", 411);
		job_values.put("ottawa - vancouver", 4359);
		job_values.put("ottawa - whitehorse", 5425);
		job_values.put("ottawa - winnipeg", 2140);
		job_values.put("ottawa - yellowknife", 4865);
		job_values.put("quebec city - calgary", 3844);
		job_values.put("quebec city - edmonton", 3810);
		job_values.put("quebec city - goose bay", 1515);
		job_values.put("quebec city - inuvik", 7017);
		job_values.put("quebec city - montreal", 263);
		job_values.put("quebec city - ottawa", 444);
		job_values.put("quebec city - thunder bay", 1830);
		job_values.put("quebec city - toronto", 806);
		job_values.put("quebec city - vancouver", 4810);
		job_values.put("quebec city - whitehorse", 5792);
		job_values.put("quebec city - winnipeg", 2507);
		job_values.put("quebec city - yellowknife", 5232);
		job_values.put("thunder bay - calgary", 2040);
		job_values.put("thunder bay - edmonton", 2005);
		job_values.put("thunder bay - goose bay", 3143);
		job_values.put("thunder bay - inuvik", 5213);
		job_values.put("thunder bay - montreal", 1587);
		job_values.put("thunder bay - ottawa", 1458);
		job_values.put("thunder bay - montreal", 1587);
		job_values.put("thunder bay - toronto", 1394);
		job_values.put("thunder bay - vancouver", 3197);
		job_values.put("thunder bay - whitehorse", 3988);
		job_values.put("thunder bay - winnipeg", 702);
		job_values.put("thunder bay - yellowknife", 3428);
		job_values.put("toronto - calgary", 3406);
		job_values.put("toronto - edmonton", 3465);
		job_values.put("toronto - goose bay", 2321);
		job_values.put("toronto - inuvik", 6673);
		job_values.put("toronto - montreal", 541);
		job_values.put("toronto - ottawa", 411);
		job_values.put("toronto - thunder bay", 1399);
		job_values.put("toronto - vancouver", 4373);
		job_values.put("toronto - whitehorse", 5448);
		job_values.put("toronto - winnipeg", 2223);
		job_values.put("toronto - yellowknife", 4888);
		job_values.put("vancouver - calgary", 1074);
		job_values.put("vancouver - edmonton", 1160);
		job_values.put("vancouver - goose bay", 6322);
		job_values.put("vancouver - inuvik", 3621);
		job_values.put("vancouver - montreal", 4556);
		job_values.put("vancouver - ottawa", 4361);
		job_values.put("vancouver - thunder bay", 3197);
		job_values.put("vancouver - toronto", 4207);
		job_values.put("vancouver - whitehorse", 2396);
		job_values.put("vancouver - winnipeg", 2397);
		job_values.put("vancouver - yellowknife", 2276);
		job_values.put("whitehorse - calgary", 2249);
		job_values.put("whitehorse - edmonton", 1193);
		job_values.put("whitehorse - goose bay", 7125);
		job_values.put("whitehorse - inuvik", 1227);
		job_values.put("whitehorse - montreal", 5569);
		job_values.put("whitehorse - ottawa", 5440);
		job_values.put("whitehorse - thunder bay", 4001);
		job_values.put("whitehorse - toronto", 5285);
		job_values.put("whitehorse - vancouver", 2394);
		job_values.put("whitehorse - winnipeg", 3290);
		job_values.put("whitehorse - yellowknie", 1880);
		job_values.put("winnipeg - calgary", 1329);
		job_values.put("winnipeg - edmonton", 1305);
		job_values.put("winnipeg - goose bay", 3826);
		job_values.put("winnipeg - inuvik", 4512);
		job_values.put("winnipeg - montreal", 2269);
		job_values.put("winnipeg - ottawa", 2140);
		job_values.put("winnipeg - thunder bay", 702);
		job_values.put("winnipeg - toronto", 2059);
		job_values.put("winnipeg - vancouver", 2400);
		job_values.put("winnipeg - whitehorse", 3288);
		job_values.put("winnipeg - yellowknife", 2727);
		job_values.put("yellowknife - calgary", 1749);
		job_values.put("yellowknife - edmonton", 1454);
		job_values.put("yellowknife - goose bay", 6564);
		job_values.put("yellowknife - inuvik", 3769);
		job_values.put("yellowknife - montreal", 5008);
		job_values.put("yellowknife - ottawa", 4879);
		job_values.put("yellowknife - thunder bay", 3440);
		job_values.put("yellowknife - toronto", 4724);
		job_values.put("yellowknife - vancouver", 2277);
		job_values.put("yellowknife - whitehorse", 1880);
		job_values.put("yellowknife - winnipeg", 2730);
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
			player.job(available_jobs.get(choice - 1));
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
