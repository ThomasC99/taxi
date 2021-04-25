package roads.north_america.canada.quebec.main_autoroutes;

import java.util.Scanner;

import main.Main;
import main.Player;
import node.HighwayNode;
import node.Node;
import roads.north_america.canada.quebec.spur_autoroutes.A720;

public class A15 {
	
	static Scanner input;
	
	public static HighwayNode a_15_north_66 = new HighwayNode ("Continue on A-15 north", "Take exit 66 for Decaire Boulevard (under construction)", null, null,
			new int [] {192}, new int [] {}, new String [] {"ottawa"}, new String [] {}); // TODO
			
			static HighwayNode a_15_north_69 = new HighwayNode ("Continue on A-15 north", "Take exit 69 for Decaire Boulevard (under construction)", null, null,
			new int [] {189}, new int [] {}, new String [] {"ottawa"}, new String [] {}); // TODO
			
			static HighwayNode a_15_north_70o = new HighwayNode ("Continue on A-15 north / A-40 east (under construction)", "Take exit 70O for A-40 west",
			new Node () {
				@Override
				public void go (Player player) {
					System.out.println("1. Take exit for A-40 West / Chemin de la Cote-de-Liesse");
					if (player.sign() >= 187) {
						System.out.println("   Ottawa - 187");
					}
					System.out.println("2. Take exit for QC-117");
					int choice;
					do {
						choice = input.nextInt();
					} while ((choice != 1) && (choice != 2));
					System.out.println("");
					System.out.println("");
					System.out.println("");
					if (choice == 1) {
						System.out.println("1. Take exit for A-40 West");
						if (player.sign() >= 187) {
							System.out.println("   Ottawa - 187");
						}
						System.out.println("2. Take exit for Chemin de la Cote-de-Liesse");
						do {
							choice = input.nextInt();
						} while ((choice != 1) && (choice != 2));
						System.out.println("");
						System.out.println("");
						System.out.println("");
						if (choice == 1) {
							A40.west_65(player);
						} else if (choice == 2) {
							Main.main_menu();
						}
					} else if (choice == 2) {
						Main.main_menu();
					}
				}
			}, null, new int [] {}, new int [] {187}, new String [] {}, new String [] {"ottawa"});
	
	static {
		input = new Scanner (System.in);
	}
	
	public static void south_64 (Player player) { // TODO
		System.out.println("1. Continue on A-15 south");
		if (player.sign() >= 6) {
			System.out.println("   Montreal - 6");
		}
		System.out.println("2. Take exit 64 for QC-138 / Addington Street / Chemin de la cote-saint-antoine / Rue bortel (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			System.out.println("1. Continue on A-15 south");
			if (player.sign() >= 6) {
				System.out.println("   Montreal - 6");
			}
			System.out.println("2. Take exit for Boulevard de Maisonneuve ouest (under construction)");
			do {
				choice = input.nextInt();
			} while (choice != 1);
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				System.out.println("1. Continue on A-15 south");
				if (player.sign() >= 5) {
					System.out.println("   Montreal - 5");
				}
				System.out.println("2. Take exit for A-15 south / A-72 east (under construction)");
				do {
					choice = input.nextInt();
				} while (choice != 1);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				if (choice == 1) {
					System.out.println("1. Continue on A-15 south (under construction)");
					System.out.println("2. Take exit for A-720 east");
					if (player.sign() >= 5) {
						System.out.println("   Montreal - 5");
					}
					do {
						choice = input.nextInt();
					} while (choice != 1);
					System.out.println("");
					System.out.println("");
					System.out.println("");
					if (choice == 1) {
					} else if (choice == 2) {
						A720.east_2(player);
					}
				} else if (choice == 2) {
				}
			} else if (choice == 2) {
			}
		} else if (choice == 2) {
		}
	}
	public static void south_66 (Player player) { // TODO
		System.out.println("1. Continue on A-15 south");
		if (player.sign() >= 8) {
			System.out.println("   Montreal - 8");
		}
		System.out.println("2. Take exit 66 for Decarie boulevard (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			A15.south_64(player);
		} else if (choice == 2) {
		}
	}
	public static void south_69 (Player player) { // TODO
		System.out.println("1. Continue on A-15 south");
		if (player.sign() >= 10) {
			System.out.println("   Montreal - 10");
		}
		System.out.println("2. Take exit 69 for Decarie boulevard (under construction)");
		int choice;
		do {
			choice = input.nextInt();
		} while (choice != 1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			A15.south_66(player);
		} else if (choice == 2) {
		}
	}
}