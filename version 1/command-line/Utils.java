import java.util.Scanner;
class Utils {
	private Scanner input;
	private Player player;
	public Utils (Player player) {
		this.input = new Scanner (System.in);
		this.player = player;
	}
	public static void complete_job () {
	}
	public static void free_roam () {
		if (player.getLocation().equals("boise")) {
		} else if (player.getLocation().equals("cheyenne")) {
		}
	}
	public boolean is_job_complete () {
		return false;
	}
	public static void job_menu () {
	}
	public static void main_menu () {
	}
	public static void upgrades () {
	}
}