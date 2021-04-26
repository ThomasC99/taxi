package roads.north_america.canada.quebec.primary_highways;

import java.util.Scanner;

import main.Main;
import main.Player;
import north_america.canada.quebec.spur_autoroutes.A440.QuebecCity;

public class QC136 {
	static Scanner input = new Scanner (System.in);
	public static void qc_136_rue_saint_nicolas_rue_saint_paul (Player player) {
		System.out.println("1. Turn left on Rue saint-paul");
		if (player.sign() >= 1514) {
			System.out.println("   Goose Bay - 1,514");
		}
		System.out.println("2. Continue straight on QC-136");
		if (player.sign() >= 255) {
			System.out.println("   Montreal - 255");
		}
		if (player.sign() >= 443) {
			System.out.println("   Ottawa - 443");
		}
		System.out.println("3. Turn right on Rue saint nicolas (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			// right on cote de la potasse
			// right on ramp to A-440 east
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
		} else if (choice == 2) {
			// straight on rue saint-paul
			// straight on boulevard charest est
			// straight on boulevard charest ouest
			// straight on A-440 west
			QuebecCity.west_12n(player);
		}
	}
}