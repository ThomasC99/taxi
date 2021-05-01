package roads.north_america.canada.quebec;

import java.util.Scanner;

import main.Main;
import main.Player;
import roads.north_america.canada.quebec.main_autoroutes.A10;
import roads.north_america.canada.quebec.main_autoroutes.A20;
import roads.north_america.canada.quebec.primary_highways.QC112;
import roads.north_america.canada.quebec.spur_autoroutes.A720;

public class Montreal {
	static Scanner input = new Scanner (System.in);
	public static void boulevard_robert_bourassa_notre_dame_street_west_south_east (Player player) { // TODO
		System.out.println("1. Turn left on Notre-dame street west (under construction)");
		System.out.println("2. Continue on Boulevard robert-bourassa");
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
		} else if (choice == 2) {
			boulevard_robert_bourassa_william_street_south_east(player);
		}
	}
	public static void boulevard_robert_bourassa_ottawa_street_south_east (Player player) { // TODO
		System.out.println("1. Turn left on Ottawa street (under construction)");
		System.out.println("2. Continue straight on Boulevard robert-bourassa");
		if (player.sign() >= 261) {
			System.out.println("   Quebec City - 261");
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
			A10.a_10_boulevard_robert_bourassa_wellington_street_south_east(player);
		}
	}
	public static void boulevard_robert_bourassa_rene_levesque_boulevard_west_north_east (Player player) { // TODO
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
				if (Main.is_job_complete()) {
					Main.complete_job();
				}
				Main.main_menu();
			} else if (choice == 2) {
				boulevard_robert_bourassa_rue_belmont_south_east(player);
			}
		}
	}
	public static void boulevard_robert_bourassa_rue_belmont_south_east (Player player) { // TODO
		if (player.job().contains(" - ottawa") && player.gps() >= 198) {
			System.out.println("GPS : Continue straight on Boulevard Robert-Bourassa (198)\n");
		}
		System.out.println("1. Turn left on Rue Belmont (under construction)");
		System.out.println("2. Continue straight on Boulevard Robert-Bourassa");
		if (player.sign() >= 198) {
			System.out.println("   Ottawa - 198");
		}
		System.out.println("3. Turn right on Rue Belmont");
		if (player.sign() >= 1770) {
			System.out.println("   Goose Bay - 1,770");
		}
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
			Main.main_menu();
		} else if (choice == 2) {
			boulevard_robert_bourassa_rue_de_la_gauchetiere_ouest_south_east(player);
		} else if (choice == 3) {
			Main.main_menu();
		} else if (choice == 4) {
			A20.east_102(player);
		}
	}
	static void boulevard_robert_bourassa_rue_de_la_gauchetiere_ouest_south_east (Player player) { // TODO
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
			boulevard_robert_bourassa_saint_antoine_street_west_south_east(player);
		} else if (choice == 3) {
			Main.main_menu();
		}
	}
	static void boulevard_robert_bourassa_rue_saint_jaques_south_east (Player player) { // TODO
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
			boulevard_robert_bourassa_notre_dame_street_west_south_east(player);
		} else if (choice == 3) {
		}
	}
	static void boulevard_robert_bourassa_saint_antoine_street_west_south_east (Player player) { // TODO
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
		} while ((choice != 2) && (choice != 3));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			Main.main_menu();
		} else if (choice == 2) {
			boulevard_robert_bourassa_rue_saint_jaques_south_east(player);
		} else if (choice == 3) {
			mansfield_street_saint_antoine_street_west_south_west(player);
		}
	}
	public static void boulevard_robert_bourassa_william_street_south_east (Player player) { // TODO
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
			boulevard_robert_bourassa_ottawa_street_south_east(player);
		} else if (choice == 2) {
		}
	}
	static void mansfield_street_rene_levesque_boulevard_west_north_east (Player player) { // TODO
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
			boulevard_robert_bourassa_rene_levesque_boulevard_west_north_east(player);
		}
	}
	static void mansfield_street_saint_antoine_street_west_south_west (Player player) { // TODO
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
			rue_sainte_cecile_saint_antoine_street_west_south_west(player);
		} else if (choice == 2) {
			Main.main_menu();
		}
	}
	static void rene_levesque_boulevard_west_avenue_amesbury_north_east (Player player) { // TODO
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
			rene_levesque_boulevard_west_guy_street_north_east(player);
		} else if (choice == 2) {
		}
	}
	static void rene_levesque_boulevard_west_drummond_street_north_east (Player player) { // TODO
		System.out.println("1. Turn left on Drummond street (under construction)");
		System.out.println("2. Continue straight on Rene-levesque boulevard west");
		System.out.println("3. Turn right on Drummond street (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 2);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
		} else if (choice == 2) {
			rene_levesque_boulevard_west_stanley_street_north_east(player);
		} else if (choice == 3) {
		}
	}
	static void rene_levesque_boulevard_west_guy_street_north_east (Player player) { // TODO
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
			rene_levesque_boulevard_west_mckay_street_north_east(player);
		} else if (choice == 3) {
		}
	}
	static void rene_levesque_boulevard_west_mckay_street_north_east(Player player) { // TODO
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
			rene_levesque_boulevard_west_rue_lucien_lallier_north_east(player);
		} else if (choice == 2) {
		}
	}
	public static void rene_levesque_boulevard_west_rue_de_la_cathedrale_north_east (Player player) { // TODO
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
			mansfield_street_rene_levesque_boulevard_west_north_east(player);
		} else if (choice == 2) {
		}
	}
	static void rene_levesque_boulevard_west_rue_de_la_montange_north_east (Player player) { // TODO
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
			rene_levesque_boulevard_west_drummond_street_north_east(player);
		} else if (choice == 2) {
		}
	}
	static void rene_levesque_boulevard_west_rue_joseph_monseau_north_east (Player player) { // TODO
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
			rene_levesque_boulevard_west_saint_mathieu_street_north_east(player);
		} else if (choice == 2) {
		}
	}
	static void rene_levesque_boulevard_west_rue_lucien_lallier_north_east (Player player) { // TODO
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
			rene_levesque_boulevard_west_rue_de_la_montange_north_east(player);
		} else if (choice == 2) {
		}
	}
	public static void rene_levesque_bouleward_west_rue_saint_marc_north_west (Player player) { // TODO
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
			rene_levesque_boulevard_west_rue_joseph_monseau_north_east(player);
		}
	}
	static void rene_levesque_boulevard_west_saint_mathieu_street_north_east (Player player) { // TODO
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
			rene_levesque_boulevard_west_avenue_amesbury_north_east(player);
		} else if (choice == 2) {
		}
	}
	static void rene_levesque_boulevard_west_stanley_street_north_east (Player player) { // TODO
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
	static void rue_de_la_cathedrale_saint_antoine_street_west (Player player) { // TODO
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
			Main.main_menu();
		} else if (choice == 2) {
			QC112.qc_112_saint_antoine_street_west_south_west(player);
		}
	}
	static void rue_de_la_montagne_saint_antoine_street_west_south_west (Player player) { // TODO
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
			Main.main_menu();
		} else if (choice == 2) {
			rue_lucien_lallier_saint_antoine_street_west_south_west(player);
		} else if (choice == 3) {
			Main.main_menu();
		}
	}
	static void rue_lucien_lallier_saint_antoine_street_west_south_west (Player player) { // TODO
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
			Main.main_menu();
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
				Main.main_menu();
			} else if (choice == 2) {
				A720.west_2(player);
			}
		}
	}
	public static void rue_saint_felix_saint_antoine_street_west_south_west (Player player) { // TODO
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
			Main.main_menu();
		} else if (choice == 2) {
			rue_de_la_montagne_saint_antoine_street_west_south_west(player);
		}
	}
	static void rue_sainte_cecile_saint_antoine_street_west_south_west (Player player) { // TODO
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
			Main.main_menu();
		} else if (choice == 2) {
			rue_de_la_cathedrale_saint_antoine_street_west(player);
		}
	}
}
