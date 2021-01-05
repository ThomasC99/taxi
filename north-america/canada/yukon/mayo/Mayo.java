import java.util.Scanner;
class Mayo {
	static void yt_11_east (String location, String job, double money, int sign) {
		System.out.println("1. Turn left");
		System.out.println("2. Continue straight on YT-11");
		if (sign >= 4.3) {
			System.out.println("   Mayo - 4.3");
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
			System.out.println("Turning around");
			System.out.println("");
		} else if (choice == 2) {
		}
	}
}
