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
		int choice;
		if (location.equals("chicago")) {
			System.out.println("1. Chicago - Los Angeles (3,243)");
		} else if (location.equals("los angeles")) {
		} else if (location.equals("mexico city")) {
		} else if (location.equals("new york")) {
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
		System.out.println("Money : " + money);
		System.out.println("");
		System.out.println("1. Upgrade road signs");
		System.out.println("   current - " + sign);
		System.out.println("   cost - " + (sign + 10));
		System.out.println("   after upgrade - " + (sign + 10));
		System.out.println("2. Back");
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			if (money >= (sign + 10)) {
				sign += 10;
				money -= sign;
			}
			upgrades();
		} else if (choice == 2) {
			mainMenu();
		}
	}
}
