package roads.north_america.canada.alberta;

import java.util.Scanner;

import main.Player;

public class Calgary {
	static Scanner input = new Scanner (System.in);
	public static void two_street_southwest_nine_avenue_southwest_east (Player player) {
		if (player.job().contains(" - edmonton") && player.autopilot() >= 299) {
		} else if (player.job().contains(" - goose bay") && player.autopilot() >= 5161) {
		} else if (player.job().contains(" - inuvik") && player.autopilot() >= 3472) {
		} else if (player.job().contains(" - montreal") && player.autopilot() >= 3533) {
		} else if (player.job().contains(" - ottawa") && player.autopilot() >= 3338) {
		} else if (player.job().contains(" - quebec city") && player.autopilot() >= 3841) {
		} else if (player.job().contains(" - thunder bay") && player.autopilot() >= 2038) {
		} else if (player.job().contains(" - toronto") && player.autopilot() >= 3238) {
		} else if (player.job().contains(" - vancouver") && player.autopilot() >= 972) {
			System.out.println("Turning left on 2 street southwest");
			// left on 6 avenue southwest
			// straight on bow trail southwest
			// right on sarcee trail southwest
			// ramp to AB-1
			// exit to AB-1 east
			// straight on BC-1
			// straight on BC-5
			// straight on BC-3
			// straight on BC-1
			// exit 27 for 1st avenue / east 1st avenue
			// left on east 1st avenue
			// straight on terminal avenue
			// right on BC-1A / BC-99A
			// right on ramp for BC-1A
			// left on Howe street
			System.out.println("Arriving in Vancouver\n\n\n");
			player.location("vancouver");
			if (Main.is_job_complete()) {
	
			}
		} else if (player.job().contains(" - whitehorse") && player.autopilot() >= 2248) {
		} else if (player.job().contains(" - winnipeg") && player.autopilot() >= 1327) {
		} else if (player.job().contains(" - yellowknife") && player.autopilot() >= 1748) {
		} else {
			if (player.job().contains(" - edmonton") && player.gps() >= 299) {
				System.out.println("GPS : continue straight on 9 avenue southwest (299)");
			} else if (player.job().contains(" - goose bay") && player.gps() >= 5161) {
				System.out.println("GPS : continue straight on 9 avenue southwest (5,161)");
			} else if (player.job().contains(" - inuvik") && player.gps() >= 3472) {
				System.out.println("GPS : continue straight on 9 avenue southwest (3,472)");
			}
		}
	}
}