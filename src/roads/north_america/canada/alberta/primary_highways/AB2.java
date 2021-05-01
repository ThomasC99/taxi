package roads.north_america.canada.alberta.primary_highways;

import java.util.Scanner;

import main.Main;
import main.Player;
import roads.north_america.canada.yukon.highways.YT1;

public class AB2 {
	static Scanner input = new Scanner (System.in);
	public static void north_258 (Player player) {
		System.out.println("1. Continue on AB-2 north");
		if (player.sign() >= 293) {
			System.out.println("   Edmonton - 293");
		}
		if (player.sign() >= 2242) {
			System.out.println("   Whitehorse - 2,242");
		}
		if (player.sign() >= 3466) {
			System.out.println("   Inuvik - 3,466");
		}
		System.out.println("2. Take exit 258 for AB-1");
		if (player.sign() >= 5155) {
			System.out.println("   Goose Bay - 5,155");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("\n\n");
		if (choice == 1) {
			north_365(player);
		} else if (choice == 2) {
			// exit for AB-1 east
			// straight on SK-1
			// straight on ring road
			// exit for victoria avenue east
			// straight on SK-1
			// straight on MB-1
			// right on MB-334
			// left on MB-241 / MB-334
			// ramp to MB-100 south
			// ramp to MB-1 east
			// straight on ON-17
			// straight on ON-17A
			// straight on ON-17
			// left on ON-102
			// left on ON-11 / ON-17
			// left on ON-11
			// left on ON-101
			// straight on QC-388
			// right on AC-393
			// right on 1er-et-10e rang
			// left on QC-101
			// right on QC-390
			// right on QC-111
			// left on QC-386
			// right on QC-397
			// left on QC-113
			// right on QC-167
			// right on rang double nord
			// straight on boulevard st felicien
			// right on QC-169
			// straight on QC-170
			// left on QC-169 / QC-170
			// right on QC-170
			// ramp to A-70 east
			// exit 45 for boulevard saint paul
			// right on boulevard saint paul
			// straight on QC-372
			// straight on QC-375
			// exit for rue roussel
			// right on rue roussel
			// left on QC-172
			// right on QC-138
			// 3rd exit on the roundabout for Chemin Rex Fort
			// straight on Chemin de la scierie
			// right
			// right
			// left on QC-389
			// straight on NL-500
			// right on hamilton river road
			// left on 10th street
			System.out.println("Arriving in Goose Bay\n\n\n");
			player.location("goose bay");
			if (Main.is_job_complete()) {
				Main.complete_job();
			}
			Main.main_menu();
		}
	}
	public static void north_365 (Player player) {
		System.out.println("1. Continue on AB-2 north");
		if (player.sign() >= 185) {
			System.out.println("   Edmonton - 185");
		}
		System.out.println("2. Take exit 365 for AB-54 / Range road 284 A");
		if (player.sign() >= 2134) {
			System.out.println("   Whitehorse - 2134");
		}
		if (player.sign() >= 3359) {
			System.out.println("   Inuvik - 3,359");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("\n\n");
		if (choice == 1) {
			// straight on gateway boulevard
			// right on saskatchewan northwest
			// left onto queen elizabeth park road
			// straight on 105 street northwest
			// right on 104 avenue northwest
			System.out.println("Arriving in Edmonton");
			System.out.println("\n\n");
			player.location("edmonton");
			if (Main.is_job_complete()) {
				Main.complete_job();
			}
			Main.main_menu();
		} else if (choice == 2) {
			// right on AB-54
			// right on AB-781
			// right on AB-11
			// left on AB-20
			// left on AB-39
			// right on AB-759
			// left on AB-624
			// right on AB-22
			// left on AB-43
			// straight on AB-43X
			// exit for AB-43 west
			// straight on BC-2
			// right on Rolla road
			// left on BC-49
			// roundabout 2nd exit for BC-2
			// straight on BC-97
			YT1.yt_1_south_access_road_north(player);
			Main.main_menu();
		}
	}
}
