package roads.north_america.canada.yukon.highways;

import java.util.Scanner;

import main.Main;
import main.Player;

public class YT1 {
	static Scanner input = new Scanner (System.in);
	public static void yt_1_south_access_road_north (Player player) {
		System.out.println("1. Continue straight on YT-1 / YT-2");
		if (player.sign() >= 1230) {
			System.out.println("   Inuvik - 1,230");
		}
		System.out.println("2. Turn right on South Access Road");
		if (player.sign() >= 5) {
			System.out.println("   Inuvik - 5");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("\n\n");
		if (choice == 1) {
			// right on YT-2
			// right on YT-5
			// straight on NT-8
			// left on mackenzie road
			// right on gwich'in road
			System.out.println("Arriving in Inuvik\n\n\n");
			player.location("inuvik");
			if (Main.is_job_complete()) {
				Main.complete_job();
			}
			Main.main_menu();
		} else if (choice == 2) {
			// 3rd roundabout exit for 4th avenue
			// right on secret mission street
			System.out.println("Arriving in Whitehorse\n\n\n");
			player.location("whitehorse");
			if (Main.is_job_complete()) {
				Main.complete_job();
			}
		}
	}
}