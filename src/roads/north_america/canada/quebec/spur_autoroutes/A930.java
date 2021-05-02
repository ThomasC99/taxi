package roads.north_america.canada.quebec.spur_autoroutes;

import java.util.Scanner;

import main.Player;

public class A930 {
	static Scanner input = new Scanner (System.in);
	public static void east_1 (Player player) {
		if (player.job().contains(" - calgary") && player.autopilot() >= 3538) {
			// TODO
		} else if (player.job().contains(" - edmonton") && player.autopilot() >= 3582) {
			System.out.println("Taking exit for Chemin saint-francois-xavier / Voie de service sud");
		} else {
			if (player.job().contains(" - calgary") && player.gps() >= 3538) {
				System.out.println("GPS : continue on A-930 east (3,538)\n");
			}
			System.out.println("1. Continue on A-930 east");
			if (player.sign() >= 3538) {
				System.out.println("   Calgary - 3538");
			}
			System.out.println("2. Take exit for Chemin saint-francois-xavier / Voie de service sud");

		}
	}
}

// Calgary
// Edmonton
// Goose Bay
// Inuvik
// Montreal
// Ottawa
// Quebec City
// Thunder Bay
// Toronto
// Vancouver
// Whitehorse
// Winnipeg
// Yellowknife