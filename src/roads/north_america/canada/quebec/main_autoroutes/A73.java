package roads.north_america.canada.quebec.main_autoroutes;

import java.util.Scanner;

import main.Main;
import main.Player;

public class A73 {
	static Scanner input = new Scanner (System.in);
	public static void north_139e (Player player) {
		System.out.println("1. Continue on A-73 north");
		if (player.sign() >= 1525) {
			System.out.println("   Goose Bay - 1,525");
		}
		System.out.println("2. Take ext 139E for A-440 east");
		if (player.sign() >= 9) {
			System.out.println("   Quebec City - 9");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			// exit 142E for A-40 east
			// exit for A-40 east
			// straight on QC-138
			// left on chemin rex fort
			// straight on chemin de la scierie
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
			// end of A-440 for Boulevard Charest ouest
			// straight on Boulevard charest est
			// straight on Rue saint-paul
			// straight on QC-136
			System.out.println("Arriving in Quebec City");
			player.location("quebec city");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (Main.is_job_complete()) {
				Main.complete_job();
			}
			Main.main_menu();
		}
	}
}