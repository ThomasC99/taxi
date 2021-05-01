package roads.north_america.canada.saskatchewan.primary_highways;

import java.util.Scanner;

import main.Main;
import main.Player;

public class SK1 {
	static Scanner input = new Scanner (System.in);
	public static void sk_1_sk_39_east (Player player) {
		System.out.println("1. Continue on SK-1 east");
		if (player.sign() >= 4467) {
			System.out.println("   Goose Bay - 4,467");
		}
		System.out.println("2. Take exit for SK-39");
		if (player.sign () >= 2839) {
			System.out.println("   Montreal - 2,839");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("\n\n");
		if (choice == 1) {
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
		} else if (choice == 2) {
			// straight on US-52
			// straight on US-2
			// straight on I-35 east
			// exit 253A for US-2
			// left on M-28
			// right on north teal lake avenue
			// left on east main street
			// right on south healy avenue
			// left on county road 480
			// right on US-41
		}
	}
}