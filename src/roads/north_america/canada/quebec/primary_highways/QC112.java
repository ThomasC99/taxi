package roads.north_america.canada.quebec.primary_highways;

import java.util.Scanner;

import main.Main;
import main.Player;
import roads.north_america.canada.quebec.Montreal;

public class QC112 {
	static Scanner input = new Scanner (System.in);
	public static void qc_112_rene_levesque_boulevard_west_north_east (Player player) { // TODO
		System.out.println("1. Turn left o QC-112 (under construction)");
		System.out.println("2. Continue straght on Rene-levesque boulevard west");
		if (player.sign() >= 1) {
			System.out.println("   Montreal - 1");
		}
		System.out.println("3. Turn right on QC-112 (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 2);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
		} else if (choice == 2) {
			Montreal.rene_levesque_boulevard_west_rue_de_la_cathedrale_north_east(player);
		} else if (choice == 3) {
		}
	}
	public static void qc_112_saint_antoine_street_west_south_west (Player player) { // TODO
		System.out.println("1. Turn left on QC-112");
		System.out.println("2. Continue on Saint antoine street west");
		if (player.sign() >= 197) {
			System.out.println("   Ottawa - 197");
		}
		System.out.println("3. Turn right on QC-112");
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
			Montreal.rue_saint_felix_saint_antoine_street_west_south_west(player);
		} else if (choice == 3) {
			Main.main_menu();
		}
	}
}
