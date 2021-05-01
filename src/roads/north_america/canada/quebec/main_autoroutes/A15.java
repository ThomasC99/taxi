package roads.north_america.canada.quebec.main_autoroutes;

import java.util.Scanner;

import main.Main;
import main.Player;
import node.HighwayNode;
import node.Node;
import roads.north_america.canada.ontario.Ottawa;
import roads.north_america.canada.quebec.spur_autoroutes.A720;

public class A15 {
	
	static Scanner input = new Scanner (System.in);
	
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
	
	public static void north_35 (Player player) { // TODO
		System.out.println("1. Continue on A-15 north");
		if (player.sign() >= 3560) {
			System.out.println("   Calgary - 3,560");
		}
		System.out.println("2. Take exit 35 for A-50 west");
		if (player.sign() >= 162) {
			System.out.println("   Ottawa - 162");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("\n\n");
		if (choice == 1) {
			// straight on QC-117
			// 1st roundabout exit
			// straight on Chemin perrault est
			// straight on Chemin du golf
			// 1st roundabout exit for QC-101
			// left on QC-393
			// left on QC-388
			// straight on ON-101
			// right on ON-11
			// right on ON-102
			// right on ON-11 / ON-17
			// straight on ON-17A
			// straight on ON-17
			// straight on MB-1
			// exit for MB-100 west
			// exit for MB-241 / Winnipeg 105
			// left on MB-241
			// right on MB-334
			// left on MB-1 / MB-334
			// straight on SK-1
			// straight on victoria avenue east
			// left on ramp to Ring road
			// straight on SK-1
			// striaght on AB-1
			// left on AB-901
			// straight on AB-22X
			// striaght on AB-22X / AB-201 
			// exit 101B for AB-2 north
			// exit 256 for memorial drive
			// exit for memorial drive west
			// exit for avenue 4 southeast
			// straight on 4 avenue southeast
			// left on 5 street southwest
			// left on 9 avenue southwest
			System.out.println("Arriving in Calgary\n\n\n");
			player.location("calgary");
			if (Main.is_job_complete()) {
				Main.complete_job();
			}
			Main.main_menu();
		} else if (choice == 2) {
			// exit 135 for A-5 south
			// exit for boteler street
			// right on boteler street
			// left on rr 93
			// straight on rr 44
			// right on rr 34
			// left on rr 91
			// right on rr 42
			Ottawa.rr_42_rr_89_south_west(player);
		}
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
				System.out.println("2. Take exit for A-15 south / A-720 east (under construction)");
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
					} while (choice != 2);
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