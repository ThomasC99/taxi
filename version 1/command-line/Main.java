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
	static void free_roam () {
	}
	static void job_menu () {
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
	}
} // 67
// boise
// Cheyenne
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