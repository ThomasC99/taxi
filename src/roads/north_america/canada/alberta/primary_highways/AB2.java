package roads.north_america.canada.alberta.primary_highways;

import java.util.Scanner;

import main.Main;
import main.Player;
import roads.north_america.canada.saskatchewan.primary_highways.SK1;
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
		if (player.sign() >= 3527) {
			System.out.println("   Montreal - 3,527");
		}
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
			SK1.sk_1_sk_39_east(player);
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
