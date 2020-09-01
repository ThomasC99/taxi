import java.util.Scanner;
class Taxi {
	static String location;
	static String job;
	static double money;
	static int sign;
	static Scanner input;
	static void chicago () {
	}
	static void jobMenu () {
		if (location.equals("chicago")) {
		}
	}
	static void losAngeles () {
	}
	public static void main (String [] args) {
		location = "chicago";
		job = "";
		money = 0;
		sign = 0;
		input = new Scanner(System.in);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		mainMenu();
		input.close();
	}
	static void mainMenu () {
		System.out.println("Location : " + location);
		System.out.println("");
		System.out.println("1. Job Menu");
		System.out.println("2. Free Roam");
		System.out.println("3. Upgrades");
		System.out.pritnln("4. Quit");
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2) && (choice != 3) && (choice != 4));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			jobMenu();
		} else if (choice == 2) {
			if (location.equals("chicago")) {
				chicago();
			} else if (location.equals("los angeles")) {
				losAngeles();
			} else if (location.equals("mexico city")) {
				mexicoCity();
			} else if (location.equals("new york")) {
				newYork();
			}
		} else if (choice == 3) {
			upgrades();
		}
	}
	static void mexicoCity () {
	}
	static void newYork () {
	}
	static void upgrades () {
	}
}