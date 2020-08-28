import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class Taxi {
	static void carmacks (String location, String job, double money, int sign) { // TODO
		System.out.println("1. Head east on YT-2");
		if (sign >= 182) {
			System.out.println("   Faro - 182");
		}
		if (sign >= 355) {
			System.out.println("   Dawson - 355");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		yt_2_yt_4_north(location, job, money, sign);
	}
	static void carmacksEast (String location, String job, double money, int sign) { // TODO
	}
	static void carmacksWest (String location, String job, double money, int sign) { // TODO
	}
	static double completeJob (String job) { // TODO
		System.out.println("Job complete !");
		if (job.equals("carmacks - faro") || job.equals("faro - carmacks")) {
			System.out.println("+ 182");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			return 182;
		} else if (job.equals("carmacks - dawson")) {
			System.out.println("+ 355");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			return 355;
		} else if (job.equals("dawson - carmacks")) {
			System.out.println("+ 356");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			return 356;
		} else if (job.equals("dawson - faro") || job.equals("faro - dawson")) {
			System.out.println("+ 531");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			return 531;
		}
		return 0;
	}
	static void dawson (String location, String job, double money, int sign) {
		System.out.println("Heading southeast on Princess Street");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		yt_2_yt_4_south(location, job, money, sign);
	}
	static void faro (String location, String job, double money, int sign) {
		yt_2_yt_4_west(location, job, money, sign);
	}
	static void hainesJunction (String location, String job, double money, int sign) { // TODO
	}
	static boolean isJobComplete (String location, String job) { // TODO
		if (location.equals("carmacks")) {
			if (job.equals("dawson - carmacks")) {
				return true;
			} else if (job.equals("faro - carmacks")) {
				return true;
			} else {
				return false;
			}
		} else if (location.equals("dawson")) {
			if (job.equals("carmacks - dawson")) {
				return true;
			} else if (job.equals("faro - dawson")) {
				return true;
			} else {
				return false;
			}
		} else if (location.equals("faro")) {
			if (job.equals("carmakcs - faro")) {
				return true;
			} else if (job.equals("dawson - faro")) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	} 
	static void jobMenu (String location, String job, double money, int sign) { // TODO
		int choice;
		Scanner input = new Scanner (System.in);
		if (location.equals("carmacks")) {
			System.out.println("1. Carmacks - Dawson (355)");
			System.out.println("2. Carmacks - Faro (182)");
			System.out.println("3. Back");
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2) && (choice != 3));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				carmacks(location, "carmacks - dawson", money, sign);
			} else if (choice == 2) {
				carmacks(location, "carmakcs - faro", money, sign);
			} else if (choice == 3) {
				mainMenu(location, job, money, sign);
			}
		} else if (location.equals("dawson")) {
			System.out.println("1. Dawson - Carmacks (356)");
			System.out.println("2. Dawson - Faro (531)");
			System.out.println("3. Back");
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2) && (choice != 3));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				dawson(location, "dawson - carmacks", money, sign);
			} else if (choice == 2) {
				dawson(location, "dawson - faro", money, sign);
			} else if (choice == 3) {
				mainMenu(location, job, money, sign);
			}
		} else if (location.equals("faro")) {
			System.out.println("1. Faro - Carmacks (182)");
			System.out.println("2. Faro - Dawson (531)");
			System.out.println("3. Back");
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				faro(location, "faro - carmacks", money, sign);
			} else if (choice == 2) {
				faro (location, "faro - dawson", money, sign);
			} else {
				mainMenu(location, job, money, sign);
			}
		}
		input.close();
	}
	static void loadGame () {
		File file = new File("save");
		if (file.exists()) {
			Scanner fileReader;
			try {
				fileReader = new Scanner (file);
				String location = fileReader.nextLine();
				double money = Double.parseDouble(fileReader.nextLine());
				int sign = Integer.parseInt(fileReader.nextLine());
				mainMenu(location, "", money, sign);
				fileReader.close();
			} catch (FileNotFoundException e) {
			}
		} else {
			System.out.println("Unable to load save, starting new game");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			mainMenu("carmacks", "", 0, 0);
		}
	}
	public static void main (String [] args) {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("1. Load Game");
		System.out.println("2. New Game");
		int choice;
		Scanner input = new Scanner (System.in);
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			loadGame();
		} else if (choice == 2) {
			mainMenu("carmacks", "", 0, 0);
		}
		input.close();
	}
	static void mainMenu(String location, String job, double money, int sign) { // TODO
		System.out.println("Location : " + location);
		System.out.println("");
		System.out.println("1. Job Menu");
		System.out.println("2. Free Roam");
		System.out.println("3. Upgrades");
		System.out.println("4. Quit");
		int choice;
		Scanner input = new Scanner (System.in);
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2) && (choice != 3) && (choice != 4));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			jobMenu(location, job, money, sign);
		} else if (choice == 2) {
			if (location.equals("carmacks")) {
				carmacks(location, job, money, sign);
			} else if (location.equals("dawson")) {
				dawson(location, job, money, sign);
			} else if (location.equals("faro")) {
				faro(location, job, money, sign);
			}
		} else if (choice == 3) {
			upgrades(location, job, money, sign);
		} else if (choice == 4) {
			saveGame(location, money, sign);
		}
		input.close();
	}
	static void saveGame (String location, double money, int sign) {
		FileWriter fileWriter;
		File file = new File ("save");
		if (file.exists()) {
			file.delete();
			try {
				file.createNewFile();
				fileWriter = new FileWriter("save");
				fileWriter.write(location + "\n" + money + "\n" + sign + "\n");
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Unable to save");
				System.out.println("");
				System.out.println("");
				System.out.println("");
			}
		} else {
			try {
				file.createNewFile();
				fileWriter = new FileWriter("save");
				fileWriter.write(location + "\n" + money + "\n" + sign + "\n");
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("unable to save");
				System.out.println("");
				System.out.println("");
				System.out.println("");
			}
		}
	}
	static void upgrades(String location, String job, double money, int sign) {
		System.out.println("Money : " + money);
		System.out.println("");
		System.out.println("1. Upgrade road signs");
		System.out.println("   Current - " + sign);
		System.out.println("   Cost - " + (sign + 10));
		System.out.println("   After upgrade - " + (sign + 10));
		System.out.println("2. Back");
		int choice;
		Scanner input = new Scanner (System.in);
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2) && (choice != 3));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			if (money >= (sign + 10)) {
				sign += 10;
				money -= sign;
			}
			upgrades(location, job, money, sign);
		} else if (choice == 2) {
			mainMenu(location, job, money, sign);
		}
		input.close();
	}
	static void yt_2_yt_4_north (String location, String job, double money, int sign) {
		System.out.println("1. Continue on YT-2");
		if (sign >= 353) {
			System.out.println("   Dawson - 353");
		}
		System.out.println("2. Turn right on YT-4");
		if (sign >= 179) {
			System.out.println("   Faro - 179");
		}
		int choice;
		Scanner input = new Scanner(System.in);
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			System.out.println("Arriving in Dawson");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			location = "dawson";
			if (isJobComplete(location, job)) {
				money += completeJob(job);
				job = "";
			}
			saveGame(location, money, sign);
			mainMenu(location, job, money, sign);
		} else if (choice == 2) {
			System.out.println("Arriving in Faro");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			location = "faro";
			if (isJobComplete(location, job)) {
				money += completeJob(job);
				job = "";
			}
			saveGame(location, money, sign);
			mainMenu(location, job, money, sign);
		}
		input.close();
	}
	static void yt_2_yt_4_south (String location, String job, double money, int sign) { // TODO
		System.out.println("1. Turn left on YT-4");
		if (sign >= 179) {
			System.out.println("   Faro - 179");
		}
		System.out.println("2. Continue straight on YT-2");
		if (sign >= 3.2) {
			System.out.println("   Carmacks - 3.2");
		}
		int choice;
		Scanner input = new Scanner (System.in);
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			System.out.println("Arriving in Faro");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			location = "faro";
			if (isJobComplete(location, job)) {
				money += completeJob(job);
				job = "";
			}
			saveGame(location, money, sign);
			mainMenu(location, job, money, sign);
		}
		input.close();
	}
	static void yt_2_yt_4_west (String location, String job, double money, int sign) { // TODO
		System.out.println("1. Turn left on YT-2");
		if (sign >= 3.2) {
			System.out.println("   Carmacks - 3.2");
		}
		System.out.println("2. Turn right on YT-2");
		if (sign >= 352) {
			System.out.println("   Dawson - 352");
		}
		int choice;
		Scanner input = new Scanner (System.in);
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			System.out.println("Arriving in Carmacks");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			location = "carmacks";
			if(isJobComplete(location, job)) {
				money += completeJob(job);
				job = "";
			}
			saveGame(location, money, sign);
			mainMenu(location, job, money, sign);
		} else if (choice == 2) {
			System.out.println("Arriving in Dawson");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			location = "dawson";
			if(isJobComplete(location, job)) {
				money += completeJob(job);
				job = "";
			}
			saveGame(location, money, sign);
			mainMenu(location, job, money, sign);
		}
		input.close();
	}
}
