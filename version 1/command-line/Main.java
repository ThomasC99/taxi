import java.io.File;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;
class Main {
	static Scanner input;
	static String location;
	static double money;
	static int sign;
	static int gps;
	static void boise () {
		System.out.println("Arriving in Cheyenne");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		location = "cheyenne";
		if (is_job_complete()) {
			complete_job();
		}
		main_menu();
	}
	static void cheyenne () {
		System.out.println("Arriving in Boise");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		locatioon = "boise";
		if (is_job_complete()) {
			complete_job();
		}
		main_menu();
	}
	static void chicago () {
	}
	static void complete_job () {
		System.out.println("Job Complete");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (job.equals("boise - cheyenne")) {
			System.out.println("+ 1,184");
			money += 1184;
		} else if (job.equals("boise - chicago")) {
			System.out.println("+ 2,727");
			money += 2727;
		} else if (job.equals("cheyenne - boise")) {
			System.out.pritnln("+ 1,184");
			money += 1184;
		} else if (job.equals("cheyenne - chicago")) {
			System.out.println("+ 1,547");
			money += 1547;
		} else if (job.equals("chicago - boise")) {
			System.out.println("+ 2,724");
			money += 2724;
		} else if (job.equals("chicago - cheyenne")) {
			System.out.println("+ 1,545");
			money += 1545;
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		job = "";
	}
	static boolean is_job_complete () {
		if (location.equals("boise")) {
			if (job.equals("cheyenne - boise")) {
				return true;
			} else if (job.equals("chicago - boise")) {
				return true;
			} else {
				return false;
			}
		} else if (location.equals("cheyenne")) {
			if (job.equals("boise - cheyenne")) {
				return true;
			} else if (job.equals("chicago - cheyenne")) {
				return true;
			} else {
				return false;
			}
		} else if (location.equals("chicago")) {
			if (job.equals("boise - chicago")) {
				return true;
			} else if (job.equals("cheyenne - chicago")) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	static void free_roam () {
		if (location.equals("boise")) {
			boise();
		} else if (location.equals("cheyenne")) {
			cheyenne();
		} else if (location.equals("chicago")) {
			chicago();
		}
	}
	static void job_menu () {
		if (location.equals("boise")) {
			System.out.println("1. Boise - Cheyenne (1,184)");
			System.out.println("2. Boise - Chicago (2,727)");
			System.out.println("3. Back");
			int choice;
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2) && (choice != 3));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				job = "boise - cheyenne";
				boise();
			} else if (choice == 3) {
				main_menu();
			}
		} else if (location.equals("cheyenne")) {
			System.out.println("1. Cheyenne - Boise (1,184)");
			System.out.println("2. Back");
			int choice;
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				job = "cheyenne - boise";
				cheyenne();
			} else if (choice == 2) {
				main_menu();
			}
		}
	}
	static void load () {
		try {
			File file = new File ("save.txt");
			Scanner fileScanner = new Scanner (file);
			location = fileScanner.nextLine();
			money = fileScanner.nextDouble();
			sign = fileScanner.nextInt();
			gps = fileScanner.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
	}
	public static void main (String [] args) {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("1. New Game");
		System.out.println("2. Load Game");
		int choice;
		input = new Scanner (System.in);
		location = "boise";
		money = 0;
		sign = 0;
		gps = 0;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 2) {
			load();
		}
		main_menu();
	}
	static void main_menu () {
		System.out.println("1. Job Menu");
		System.out.println("2. Free Roam");
		System.out.println("3. Upgrades");
		System.out.println("4. Save");
		System.out.println("5. Quit");
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2) && (choice != 3) && (choice != 4) && (choice != 5));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			job_menu();
		} else if (choice == 2) {
			free_roam();
		} else if (choice == 3) {
			upgrades();
		} else if (choice == 4) {
			save();
			main_menu();
		}
	}
	static void save () {
		try {
			File file = new File ("save.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(location + "\n" + money + "\n" + sign + "\n" + gps + "\n")
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
	}
	static void upgrades () {
		System.out.println("Money : " + money);
		System.out.println("");
		System.out.println("1. Upgrade signs");
		System.out.println("   Current range : " + sign + " km");
		System.out.println("   After upgrade : " + (sign + 10) + " km");
		System.out.println("   Cost : " + sign);
		System.out.println("2. Upgrade GPS");
		System.out.println("   Current range : " + gps + " km");
		System.out.println("   After upgrade : " + (gps + 1) + " km");
		System.out.println("   Cost : " + (gps * 10));
		System.out.println("3. Back");
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			if (money >= sign) {
				money -= sign;
				sign += 10;
			}
			upgrades();
		} else if (choice == 2) {
			if (money >= (gps * 10)) {
				money -= (gps * 10);
				gps++;
			}
			upgrades();
		} else if (choice == 3) {
			main_menu();
		}
	}
} // 259
// boise
// Cheyenne
//
// Chicago
// Cincinnati
// Denver
// Detroit
// Helena
// Indianapolis
// Las Vegas
// Los Angeles
// Louisville
// Phoenix
// Reno
// Salt Lake City
// San Francisco