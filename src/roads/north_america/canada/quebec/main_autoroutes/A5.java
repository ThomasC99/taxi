import java.util.Scanner;
import main.Player;
class A5 {
	static Scanner input = new Scanner (System.in);
	public static void north_1 (Player player) {
		System.out.println("1. Continue on A-5 north");
		System.out.println("2. Take exit 1 for Bouleavard Fournier / Boulevard Maisonneuve / " +
		"Boulevard Sacré-Coeur / Rue Dussault");
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
		} else if (choice == 2) {
		}
	}
}
