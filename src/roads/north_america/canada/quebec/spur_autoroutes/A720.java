package roads.north_america.canada.quebec.spur_autoroutes;

import main.Main;
import main.Player;
import roads.north_america.canada.quebec.main_autoroutes.A15;
import roads.north_america.canada.quebect.Montreal;

import java.util.Scanner;

public class A720 {
	private static Scanner input;
	static {
		input = new Scanner (System.in);
	}
	
	public static void east_2 (Player player) { // TODO
		System.out.println("1. Continue on A-720 east");
		if (player.sign() >= 3) {
			System.out.println("   Montreal - 3");
		}
		System.out.println("2. Take exit 2 for Rose of lima street / Saint-antoine street (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_3(player);
		} else if (choice == 2) {
		}
	}
	static void east_3 (Player player) {
		System.out.println("1. Continue on A-720 east (under construction)");
		System.out.println("2. Take exit 3 for Rene-levesque boulevard west / Rue saint-marc");
		if (player.sign() >= 2) {
			System.out.println("   Montreal - 2");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			east_4(player);
		} else if (choice == 2) {
			Montreal.rene_levesque_bouleward_west_rue_saint_marc_north_west(player);
		}
	}
	static void east_4 (Player player) { // TODO
		System.out.println("1. Continue on A-720 east");
		System.out.println("2. Take exit 4 for Jean d'estrees street / Rue de la montange (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) { 
			east_6(player);
		} else if (choice == 2) {
		}
	}
	static void east_6 (Player player) { // TODO
		System.out.println("1. Continue on A-720 east (under construction)");
		System.out.println("2. Take exit 6 for Rue saint-antoine est (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
	}
	static void west_1n (Player player) { // TODO
		System.out.println("1. Continue on A-720 west (under construction)");
		System.out.println("2. Take exit 1C for A-15 north");
		if (player.sign() >= 194) {
			System.out.println("   Ottawa - 194");
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
			A15.a_15_north_66.go(player);
		}
	}
	public static void west_2 (Player player) { // TODO
		System.out.println("1. Cotninue on A-720 west");
		if (player.sign() >= 194) {
			System.out.println("   Ottawa - 194");
		}
		System.out.println("2. Take exit 2 for A-15 south, Rue pullman, Rue saint-jacques (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			west_1n(player);
		} else if (choice == 2) {
		}
	}
}