import java.util.Scanner;
class Taxi {
	static String location;
	static String job;
	static double money;
	static int sign;
	static Scanner input;
	static void chicago () {
		System.out.println("Heading south on South Federal Street");
		System.out.println("Turning right on West Van Buren Street");
		System.out.println("Turning left on South Clark Street");
		System.out.println("Turning right on West Cermak Road");
		System.out.println("Turning left onto the ramp to I-55 west / I-90 east / I-94 east");
		System.out.println("Taking ramp to I-90 east / I-94 east");
		System.out.println("Taking ramp to I-90 express east / I-94 express east");
		System.out.println("Taking exit to I-90 east / I-94 east");
		System.out.println("Taking exit to I-90 east");
		System.out.println("Taking exit to I-80 east");
		System.out.println("Taking exit to I-280 east"); // TODO
	}
	static void completeJob () {
		System.out.println("Job Complete");
		if (job.equals("chicago - los angeles")) {
			System.out.println("+ 3,243");
			money += 3243;
		} else if (job.equals("chicago - mexico city")) {
			System.out.println("+ 3,392");
			money += 3392;
		} else if (job.equals("chicago - new york")) {
			System.out.println("+ 1,270");
			money += 1270;
		} else if (job.equals("los angeles - chicago")) {
			System.out.println("+ 3,244");
			money += 3244;
		} else if (job.equals("los angeles - mexico city")) {
			System.out.println("+ 2,947");
			money += 2947;
		} else if (job.equals("los angeles - new york")) {
			System.out.println("+ 4,489");
			money += 4489;
		} else if (job.equals("mexico city - chicago")) {
			System.out.println("+ 3,390");
			money += 3390;
		} else if (job.equals("mexico city - los angeles")) {
			System.out.println("+ 3,069");
			money += 3069;
		} else if (job.equals("mexico city - new york")) {
			System.out.println("+ 4,149");
			money += 4149;
		} else if (job.equals("new york - chicago")) {
			System.out.println("+ 1,272");
			money += 1272;
		} else if (job.equals("new york - los angeles")) {
			System.out.println("+ 4,467");
			money += 4467;
		} else if (job.equals("new york - mexico city")) {
			System.out.println("+ 4,149");
			money += 4149;
		}
		job = "";
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
	static boolean isJobComplete () {
		if (location.equals("chicago")) {
			if (job.equals("los angeles - chicago")) {
				return true;
			} else if (job.equals("mexico city - chicago")) {
				return true;
			} else if (job.equals("new york - chicago")) {
				return true;
			} else {
				return false;
			}
		} else if (location.equals("los angeles")) {
			if (job.equals("chicago - los angeles")) {
				return true;
			} else if (job.equals("mexico city - los angeles")) {
				return true;
			} else if (job.equals("new york - los angeles")) {
				return true;
			} else {
				return false;
			}
		} else if (location.equals("mexico city")) {
			if (job.equals("chicago - mexico city")) {
				return true;
			} else if (job.equals("los angeles - mexico city")) {
				return true;
			} else if (job.equals("new york - mexico city")) {
				return true;
			} else {
				return false;
			}
		} else if (location.equals("new york")) {
			if (job.equals("chicago - new york")) {
				return true;
			} else if (job.equals("los angeles - new york")) {
				return true;
			} else if (job.equals("mexico city - new york")) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	static void jobMenu () {
		int choice;
		if (location.equals("chicago")) {
			System.out.println("1. Chicago - Los Angeles (3,243)");
			System.out.println("2. Chicago - Mexico City (3,392)");
			System.out.println("3. Chicago - New York (1,270)");
			System.out.println("4. Back");
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2) && (choice != 3) && (choice != 4));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				job = "chicago - los angeles";
				chicago();
			} else if (choice == 2) {
				job = "chicago - mexico city";
				chicago();
			} else if (choice == 3) {
				job = "chicago - new york";
				chicago();
			} else if (choice == 4) {
				mainMenu();
			}
		} else if (location.equals("los angeles")) {
			System.out.println("1. Los Angeles - Chicago (3,224)");
			System.out.println("2. Los Angeles - Mexico City (2,947)");
			System.out.println("3. Los Angeles - New York (4,498)");
			System.out.println("4. Back");
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2) && (choice != 3) && (choice != 4));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				job = "los angeles - chicago";
				losAngeles();
			} else if (choice == 2) {
				job = "los angeles - mexico city";
				losAngeles();
			} else if (choice == 3) {
				job = "los angeles - new york";
				losAngeles();
			} else if (choice == 4) {
				mainMenu();
			}
		} else if (location.equals("mexico city")) {
			System.out.println("1. Mexico City - Chicago (3,390)");
			System.out.println("2. Mexico City - Los Angeles (3,069)");
			System.out.println("3. Mexico City - New York (4,162)");
			System.out.println("4. Back");
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2) && (choice != 3) && (choice != 4));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				job = "mexico city - chicago";
				mexicoCity();
			} else if (choice == 2) {
				job = "mexico city - los angeles";
				mexicoCity();
			} else if (choice == 3) {
				job = "mexico city - new york";
				mexicoCity();
			} else if (choice == 4) {
				mainMenu();
			}
		} else if (location.equals("new york")) {
			System.out.println("1. New York - Chicago (1,272)");
			System.out.println("2. New York - Los Angeles (4,490)");
			System.out.println("3. New York - Mexico City (4,149)");
			System.out.println("4. Back");
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2) && (choice != 3) && (choice != 4));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				job = "new york - chicago";
				newYork();
			} else if (choice == 2) {
				job = "new york - los angeles";
				newYork();
			} else if (choice == 3) {
				job = "new york - mexico city";
				newYork();
			} else if (choice == 4) {
				mainMenu();
			}
		}
	}
	static void losAngeles () {
	} // TODO
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
		System.out.println("4. Quit");
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
	} // TODO
	static void newYork () {
	} // TODO
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
