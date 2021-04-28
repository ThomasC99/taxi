package roads.north_america.canada.quebec.main_autoroutes;
import java.util.Scanner;
import main.Player;
class A5 {
	static Scanner input = new Scanner (System.in);
	public static void north_1 (Player player) {
		System.out.println("1. Continue on A-5 north");
		System.out.println("2. Take exit 1 for Bouleavard Fournier / Boulevard Maisonneuve / " +
		"Boulevard Sacre-Coeur / Rue Dussault");
		if (player.sign() >= 205) {
			System.out.println("   Montreal - 205");
		}
		if (player.sign() >= 441) {
			System.out.println("   Quebec City - 441");
		}
		if (player.sign() >= 1957) {
			System.out.println("   Goose City - 1,957");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			north_2(player);
		} else if (choice == 2) {
			System.out.println("1. Take exit for Boulevard Maisonneuve / Boulevard Sacre-Coeur");
			System.out.println("2. Take exit for Boulevard Fournier / Rue Dussault");
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				System.out.println("1. Take exit for Boulevard Maisonneuve");
				System.out.println("2. Take exit for Boulevard Sacre-coeur");
				do {
					choice = input.nextInt();
				} while ((choice != 1) && (choice != 2));
				System.out.println("");
				System.out.println("");
				System.out.println("");
				if (choice == 1) {
				} else if (choice == 2) {
				}
			} else if (choice == 2) {
				System.out.println("1. Take exit for Boulevard Fournier");
				System.out.println("2. Take exit for Rue Dussault");
				do {
					choice = input.nextInt();
				} while ((choice != 1) && (choice != 2));
				System.out.println("");
				System.out.println("");
				System.out.println("");
				if (choice == 1) {
				} else if (choice == 2) {
				}
			}
		}
	}
	public static void north_2 (Player player) {
		System.out.println("1. Continue on A-5 north");
		System.out.println("2. Take exit 2 for A-50 east");
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
		} else if (choice == 2) {
		}
	}
	public static void north_3 (Player player) {
		System.out.println("1. Continue on A-5 north");
		System.out.println("2. Take exit 3 for Boulevard du casino");
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			north_5n(player);
		} else if (choice == 2) {
		}
	}
	public static void north_5n (Player player) {
		System.out.println("1. Continue on A-5 north");
		System.out.println("2. Take exit 5N for QC-105");
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			north_5s(player);
		} else if (choice == 2) {
		}
	}
	public static void north_5s (Player player) {
		System.out.println("1. Continue on A-5 north");
		System.out.println("2. Take exit 5S for QC-105");
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			north_8(player);
		} else if (choice == 2) {
		}
	}
	public static void north_8 (Player player) {
		System.out.println("1. Continue on A-5 north");
		System.out.println("2. Take exit 8 for Boulevard de la technologie / Boulevard des hautes-plaines");
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			north_12(player);
		} else if (choice == 2) {
		}
	}
	public static void north_12 (Player player) {
		System.out.println("1. Continue on A-5 north");
		System.out.println("2. Take exit 12 for Chemin old chelsea");
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			north_13(player);
		} else if (choice == 2) {
		}
	}
	public static void north_13 (Player player) {
		System.out.println("1. Continue on A-5 north");
		System.out.println("2. Take exit 13 for Chemin scott");
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			north_21(player);
		} else if (choice == 2) {
		}
	}
	public static void north_21 (Player player) {
		System.out.println("1. Continue on A-5 north");
		System.out.println("2. Take exit 13 for Chemin de la riviere");
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			north_24(player);
		} else if (choice == 2) {
		}
	}
	public static void north_24 (Player player) {
		System.out.println("1. Continue on A-5 north");
		System.out.println("2. Take exit 24 for Chemin Cross Loop");
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			north_28(player);
		} else if (choice == 2) {
		}
	}
	public static void north_28 (Player player) {
		System.out.println("1. Continue on A-5 north");
		System.out.println("2. Take exit 28 for QC-105 / QC-66 / Chemin de la vallee de wakefield");
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
		} else if (choice == 2) {
		}
	}
}
