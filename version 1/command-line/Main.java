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
	public static void main (String [] args) {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("1. New Game");
		System.out.pritnln("2. Load Game");
		int choice;
		input = new Scanner (System.in);
		location = "boise";
		money = 0;
		sign = 0;
		gps = 0;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
	}
} // 10
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