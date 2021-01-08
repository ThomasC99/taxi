import java.util.Scanner;
class Main {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		Player player = new Player();
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("1. New Game");
		System.out.println("2. Load Game");
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 2) {
			player.load();
		}
		Utils utils = new Utils(player);
		utils.main_menu();
	}
}