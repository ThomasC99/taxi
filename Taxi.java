import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class Taxi {
	static void carmacks (String location, String job, double money, int sign) {
		System.out.println("1. Head east on YT-2");
		if (sign >= 182) {
			System.out.println("   Faro - 182");
		}
		if (sign >= 229) {
			System.out.println("   Mayo - 229");
		}
		if (sign >= 355) {
			System.out.println("   Dawson - 355");
		}
		System.out.println("2. Head west on YT-2");
		if (sign >= 303) {
			System.out.println("   Haines Junction - 303");
		}
		if (sign >= 353) {
			System.out.println("   Teslin - 355");
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
			yt_2_yt_4_north(location, job, money, sign);
		} else if (choice == 2) {
			System.out.println("Arriving in Haine Junction");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			location = "haines junction";
			if (isJobComplete(location, job)) {
				money += completeJob(job);
				job = "";
			}
			saveGame(location, money, sign);
			mainMenu(location, job, money, sign);
		}
	}
	static void carmacksEast (String location, String job, double money, int sign) {
		System.out.println("1. Park in Carmacks");
		System.out.println("2. Continue on YT-2");
		if (sign >= 182) {
			System.out.println("   Faro - 182");
		}
		if (sign >= 229) {
			System.out.println("   Mayo - 229");
		}
		if (sign >= 355) {
			System.out.println("   Dawson - 355");
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
			location = "carmacks";
			if(isJobComplete(location, job)) {
				money += completeJob(job);
				job = "";
			}
			saveGame(location, money, sign);
			mainMenu(location, job, money, sign);
		} else if (choice == 2) {
			yt_2_yt_4_north(location, job, money, sign);
		}
		input.close();
	}
	static void carmacksWest (String location, String job, double money, int sign) {
		System.out.println("1. Park in Carmacks");
		System.out.println("2. Continue on YT-2");
		if (sign >= 303) {
			System.out.println("   Haines Junction - 303");
		}
		if (sign >= 353) {
			System.out.println("   Teslin - 353");
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
			location = "carmacks";
			if (isJobComplete(location, job)) {
				money += completeJob(job);
				job = "";
			}
			saveGame(location, money, sign);
			mainMenu(location, job, money, sign);
		} else if (choice == 2) {
			System.out.println("Arriving in Haines Junction");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			location = "haines junction";
			if (isJobComplete(location, job)) {
				money += completeJob(job);
				job = "";
			}
			saveGame(location, money, sign);
			mainMenu(location, job, money, sign);
		}
		input.close();
	}
	static double completeJob (String job) {
		System.out.println("Job complete !");
		if (job.equals("carmacks - faro") || job.equals("faro - carmacks")) {
			System.out.println("+ 182");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			return 182;
		} else if (job.equals("carmacks - mayo") || job.equals("mayo - carmakcs")) {
			System.out.println("+ 229");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			return 229;
		} else if (job.equals("dawson - mayo") || job.equals("mayo - dawson")) {
			System.out.println("+ 230");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			return 230;
		} else if (job.equals("carmacks - haines junction") ||
		job.equals("haines junction - carmacks")) {
			System.out.println("+ 303");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			return 303;
		} else if (job.equals("faro - teslin") || job.equals("teslin - faro") ||
		job.equals("faro - haines junction")) {
			System.out.println("+ 330");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			return 330;
		} else if (job.equals("haines junction - teslin")) {
			System.out.println("+ 332");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			return 332;
		} else if (job.equals("teslin - carmacks")) {
			System.out.println("+ 353");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			return 353;
		} else if (job.equals("carmacks - dawson") || job.equals("carmacks - teslin")) {
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
		} else if (job.equals("faro - mayo") || job.equals("mayo - faro")) {
			System.out.println("+ 404");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			return 404;
		} else if (job.equals("faro - haines junction") ||
		job.equals("haines junction - faro")) {
			System.out.println("+ 484");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			return 484;
		} else if (job.equals("dawson - faro") || job.equals("faro - dawson")) {
			System.out.println("+ 531");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			return 531;
		} else if (job.equals("haines junction - mayo") ||
		job.equals("mayo - haines junction")) {
			System.out.println("+ 532");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			return 532;
		} else if (job.equals("teslin - mayo")) {
			System.out.println("+ 582");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			return 582;
		} else if (job.equals("mayo - teslin")) {
			System.out.println("+ 584");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			return 584;
		} else if (job.equals("dawson - haines junction") ||
		job.equals("haines junction - dawson")) {
			System.out.println("+ 658");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			return 658;
		} else if (job.equals("teslin - dawson")) {
			System.out.println("+ 708");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			return 708;
		} else if (job.equals("dawson - teslin")) {
			System.out.println("+ 710");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			return 710;
		}
		return 0;
	}
	static void dawson (String location, String job, double money, int sign) {
		System.out.println("Heading southeast on Princess Street");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		yt_2_yt_11_east(location, job, money, sign);
	}
	static void faro (String location, String job, double money, int sign) {
		yt_2_yt_4_west(location, job, money, sign);
	}
	static void hainesJunction (String location, String job, double money, int sign) {
		carmacksEast(location, job, money, sign);
	}
	static boolean isJobComplete (String location, String job) {
		if (location.equals("carmacks")) {
			if (job.equals("dawson - carmacks")) {
				return true;
			} else if (job.equals("faro - carmacks")) {
				return true;
			} else if (job.equals("haines junction - carmacks")) {
				return true;
			} else if (job.equals("mayo - carmacks")) {
				return true;
			} else if (job.equals("teslin - carmacks")) {
				return true;
			} else {
				return false;
			}
		} else if (location.equals("dawson")) {
			if (job.equals("carmacks - dawson")) {
				return true;
			} else if (job.equals("faro - dawson")) {
				return true;
			} else if (job.equals("haines junction - dawson")) {
				return true;
			} else if (job.equals("mayo - dawson")) {
				return true;
			} else if (job.equals("teslin - dawson")) {
				return true;
			} else {
				return false;
			}
		} else if (location.equals("faro")) {
			if (job.equals("carmakcs - faro")) {
				return true;
			} else if (job.equals("dawson - faro")) {
				return true;
			} else if (job.equals("haines junction - faro")) {
				return true;
			} else if (job.equals("mayo - faro")) {
				return true;
			} else if (job.equals("teslin - faro")) {
				return true;
			}
		} else if (location.equals("haines junction")) {
			if (job.equals("carmacks - haines junction")) {
				return true;
			} else if (job.equals("dawson - haines junction")) {
				return true;
			} else if (job.equals("faro - haines junction")) {
				return true;
			} else if (job.equals("mayo - haines junction")) {
				return true;
			} else if (job.equals("teslin - haines junction")) {
				return true;
			}
		} else if (location.equals("mayo")) {
			if (job.equals("carmacks - mayo")) {
				return true;
			} else if (job.equals("dawson - mayo")) {
				return true;
			} else if (job.equals("faro - mayo")) {
				return true;
			} else if (job.equals("haines junction - mayo")) {
				return true;
			} else if (job.equals("teslin - mayo")) {
				return true;
			}
		} else if (location.equals("teslin") {
		}
		return false;
	} 
	static void jobMenu (String location, String job, double money, int sign) {
		int choice;
		Scanner input = new Scanner (System.in);
		if (location.equals("carmacks")) {
			System.out.println("1. Carmacks - Dawson (355)");
			System.out.println("2. Carmacks - Faro (182)");
			System.out.println("3. Carmacks - Haines Junction (303)");
			System.out.println("4. Carmacks - Mayo (229)");
			System.out.println("5. Back");
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2) && (choice != 3) &&
			(choice != 4) && (choice != 5));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				carmacks(location, "carmacks - dawson", money, sign);
			} else if (choice == 2) {
				carmacks(location, "carmakcs - faro", money, sign);
			} else if (choice == 3) {
				carmacks(location, "carmacks - haines junction", money, sign);
			} else if (choice == 4) {
				carmacks(location, "carmacks - mayo", money, sign);
			} else if (choice == 5) {
				mainMenu(location, job, money, sign);
			}
		} else if (location.equals("dawson")) {
			System.out.println("1. Dawson - Carmacks (356)");
			System.out.println("2. Dawson - Faro (531)");
			System.out.println("3. Dawson - Haines Junction (658)");
			System.out.println("4. Dawson - Mayo (230)");
			System.out.println("5. Back");
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2) && (choice != 3) &&
			(choice != 4) && (choice != 5));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				dawson(location, "dawson - carmacks", money, sign);
			} else if (choice == 2) {
				dawson(location, "dawson - faro", money, sign);
			} else if (choice == 3) {
				dawson(location, "dawson - haines junction", money, sign);
			} else if (choice == 4) {
				dawson(location, "dawson - mayo", money, sign);
			} else if (choice == 5) {
				mainMenu(location, job, money, sign);
			}
		} else if (location.equals("faro")) {
			System.out.println("1. Faro - Carmacks (182)");
			System.out.println("2. Faro - Dawson (531)");
			System.out.println("3. Faro - Haines Junction (484)");
			System.out.println("4. Faro - Mayo (404)");
			System.out.println("5. Back");
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2) && (choice != 3) &&
			(choice != 4) && (choice != 5));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				faro(location, "faro - carmacks", money, sign);
			} else if (choice == 2) {
				faro (location, "faro - dawson", money, sign);
			} else if (choice == 3) {
				faro(location, "faro - haines junction", money, sign);
			} else if (choice == 4) {
				faro(location, "faro - mayo", money, sign);
			} else if (choice == 5) {
				mainMenu(location, job, money, sign);
			}
		} else if (location.equals("haines junction")) {
			System.out.println("1. Haines Junction - Carmacks (303)");
			System.out.println("2. Haines Junction - Dawson (658)");
			System.out.println("3. Haines Junction - Faro (484)");
			System.out.println("4. Haines Junction - Mayo (532)");
			System.out.println("5. Back");
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2) && (choice != 3) &&
			(choice != 4) && (choice != 5));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				hainesJunction(location, "haines junction - carmacks", money,
				sign);
			} else if (choice == 2) {
				hainesJunction(location, "haines junction - dawson", money,
				sign);
			} else if (choice == 3) {
				hainesJunction(location, "haines junction - faro", money, sign);
			} else if (choice == 4) {
				hainesJunction(location, "haines junction - mayo", money, sign);
			} else if (choice == 5) {
				mainMenu(location, job, money, sign);
			}
		} else if (location.equals("mayo")) {
			System.out.println("1. Mayo - Carmacks (229)");
			System.out.println("2. Mayo - Dawson (230)");
			System.out.println("3. Mayo - Faro (404)");
			System.out.println("4. Mayo - Haines Junction (532)");
			System.out.println("5. Back");
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2) && (choice != 3) &&
			(choice != 4) && (choice != 5));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				mayo(location, "mayo - carmacks", money, sign);
			} else if (choice == 2) {
				mayo(location, "mayo - dawson", money, sign);
			} else if (choice == 3) {
				mayo(location, "mayo - faro", money, sign);
			} else if (choice == 4) {
				mayo(location, "mayo - haines junction", money, sign);
			} else if (choice == 5) {
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
	static void mainMenu(String location, String job, double money, int sign) {
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
			} else if (location.equals("haines junction")) {
				hainesJunction(location, job, money, sign);
			} else if (location.equals("mayo")) {
				mayo(location, job, money, sign);
			}
		} else if (choice == 3) {
			upgrades(location, job, money, sign);
		} else if (choice == 4) {
			saveGame(location, money, sign);
		}
		input.close();
	}
	static void mayo (String location, String job, double money, int sign) {
		yt_2_yt_11_west(location, job, money, sign);
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
		if (sign >= 226) {
			System.out.println("   Mayo - 226");
		}
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
			yt_2_yt_11_north(location, job, money, sign);
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
	static void yt_2_yt_4_south (String location, String job, double money, int sign) {
		System.out.println("1. Turn left on YT-4");
		if (sign >= 179) {
			System.out.println("   Faro - 179");
		}
		System.out.println("2. Continue straight on YT-2");
		if (sign >= 3.2) {
			System.out.println("   Carmacks - 3.2");
		}
		if (sign >= 306) {
			System.out.println("   Haines Junction - 306");
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
		} else if (choice == 2) {
			carmacksWest(location, job, money, sign);
		}
		input.close();
	}
	static void yt_2_yt_4_west (String location, String job, double money, int sign) {
		System.out.println("1. Turn left on YT-2");
		if (sign >= 3.2) {
			System.out.println("   Carmacks - 3.2");
		}
		if (sign >= 306) {
			System.out.println("   Haines Junction - 306");
		}
		System.out.println("2. Turn right on YT-2");
		if (sign >= 226) {
			System.out.println("   Mayo - 226");
		}
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
			carmacksWest(location, job, money, sign);
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
	static void yt_2_yt_11_east(String location, String job, double money, int sign) {
		System.out.println("1. Continue straight on YT-11");
		if (sign >= 52) {
			System.out.println("   Mayo - 52");
		}
		System.out.println("2. Turn right on YT-2");
		if (sign >= 177) {
			System.out.println("   Carmacks - 177");
		}
		if (sign >= 353) {
			System.out.println("   Faro - 353");
		}
		if (sign >= 480) {
			System.out.println("   Haines Junction - 480");
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
			System.out.println("Arriving in Mayo");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			location = "mayo";
			if (isJobComplete(location, job)) {
				money += completeJob(job);
				job = "";
			}
			saveGame(location, money, sign);
			mainMenu(location, job, money, sign);
		} else if (choice == 2) {
			yt_2_yt_4_south(location, job, money, sign);
		}
	}
	static void yt_2_yt_11_north(String location, String job, double money, int sign) {
		System.out.println("1. Turn left on YT-2");
		if (sign >= 178) {
			System.out.println("   Dawson - 178");
		}
		System.out.println("2. Turn right on YT-11");
		if (sign >= 52) {
			System.out.println("   Mayo = 52");
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
			System.out.println("Arriving in Mayo");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			location = "mayo";
			if (isJobComplete(location, job)) {
				money += completeJob(job);
				job = "";
			}
			saveGame(location, money, sign);
			mainMenu(location, job, money, sign);
		}
	}
	static void yt_2_yt_11_west(String location, String job, double money, int sign) {
		System.out.println("1. Turn left on YT-2");
		if (sign >= 177) {
			System.out.println("   Carmacks - 177");
		}
		if (sign >= 353) {
			System.out.println("   Faro - 353");
		}
		if (sign >= 480) {
			System.out.println("   Haines Junction - 480");
		}
		System.out.println("2. Continue straight on YT-2");
		if (sign >= 178) {
			System.out.println("   Dawson - 178");
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
			yt_2_yt_4_south(location, job, money, sign);
		} else if (choice == 2) {
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
		}
	}
}
