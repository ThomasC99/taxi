import java.util.Scanner;
class Taxi {
	static String location;
	static String job;
	static double money;
	static int sign;
	static Scanner input;
	static void chicago () {
		System.out.println("Heading south on South Federal Street");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		chicago_south_federal_street_west_van_buren_street_south();
	}
	static void chicago_south_federal_street_west_van_buren_street_south () {
		System.out.println("1. Continue straight on South Federal Street");
		if (sign >= 3242) {
			System.out.println("   Los Angeles - 3,242");
		}
		System.out.println("2. Turn right on West Van Buren Street");
		if (sign >= 1278) {
			System.out.println("   New York - 1,278");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			System.out.println("Arriving in Los Angeles");
			location = "los angeles";
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (isJobComplete()) {
				completeJob();
			}
			mainMenu();
		} else if (choice == 2) {
			i_90_express_east_i_94_express_east();
		}
	} // 0
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
	static void i_2_east () {
		i_2_east_130 ();
	}
	static void i_2_east_130 () {
	}
	// 3,135
	static void i_10_east_58a () {
		System.out.println("1. Continue on I-10 east");
		if (sign >= 2881) {
			System.out.println("   Mexico City - 2,881");
		}
		System.out.println("2. Take ramp to I-15 north");
		if (sign >= 3177) {
			System.out.println("   Chicago - 3,177");
		}
		if (sign >= 4423) {
			System.out.println("   New York - 4,423");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			System.out.println("Arriving in Mexico City");
			location = "mexico city";
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (isJobComplete()) {
				completeJob();
			}
			mainMenu();
		} else if (choice == 2) {
			i_80_east_290();
		}
	}
	static void i_80_east_290 () {
		System.out.println("1. Continue on I-80 east");
		if (sign >= 283) {
			System.out.println("   Chicago - 283");
		}
		System.out.println("2. Take exit for I-280 east");
		if (sign >= 1529) {
			System.out.println("   New York - 1,529");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			System.out.println("Arriving in Chicago");
			location = "chicago";
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (isJobComplete()) {
				completeJob();
			}	
			mainMenu();
		} else if (choice == 2) {
			System.out.println("Arriving in New York");
			location = "new york";
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (isJobComplete()) {
				completeJob();
			}
			mainMenu();
		}
	}
	static void i_90_express_east_i_94_express_east () {
		System.out.println("1. Contine on I-90 Express East / I-94 Express East");
		if (sign >= 3358) {
			System.out.println("   Mexico City - 3,358");
		}
		System.out.println("2. Take exit to I-90 east / I-94 east");
		if (sign >= 1268) {
			System.out.println("   New York - 1,268");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			System.out.println("Arriving in Mexico City");
			location = "mexico city";
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (isJobComplete()) {
				completeJob();
			}
			mainMenu();
		} else if (choice == 2) {
			System.out.println("Arriving in New York");
			location = "new york";
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (isJobComplete()) {
				completeJob();
			}
			mainMenu();
		}
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
		i_10_east_58a();
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
		System.out.println("1. Turn left on Av 20 de Noviembre");
		if (sign >= 3066) {
			System.out.println("   Los Angeles - 3,066");
		}
		if (sign >= 3387) {
			System.out.println("   Chicago - 3,387");
		}
		System.out.println("2. Continue straight on Mexico Federal Highway 113");
		if (sign >= 4159) {
			System.out.println("   New York - 4,159");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			System.out.println("1. Continue on Mexico Federal Highway 57");
			if (sign >= 3218) {
				System.out.println("   Chicago - 3,218");
			}
			System.out.println("2. Take exit to Mexico Autopista 47D");
			if (sign >= 3066) {
				System.out.println("Los Angeles - 3,066");
			}
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				System.out.println("Arriving in Chicago");
				location = "chicago";
				System.out.println("");
				System.out.println("");
				System.out.println("");
				if (isJobComplete()) {
					completeJob();
				}
				mainMenu();
			} else if (choice == 2) {
				System.out.println("Arriving in Los Angeles");
				location = "los angeles";
				System.out.println("");
				System.out.println("");
				System.out.println("");
				if (isJobComplete()) {
					completeJob();
				}
				mainMenu();
			}
		} else if (choice == 2) {
			System.out.println("Arriving in New York");
			location = "new york";
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (isJobComplete()) {
				completeJob();
			}
			mainMenu();
		}
	}
	static void  new_jersey_highway_139_west () {
	} // 20
	static void newYork () {
		new_jersey_highway_139_west();
		System.out.println("1. Continue on New Jersey Highway 139 west");
		if (sign >= 4116) {
			System.out.println("   Mexico City - 4,116");
		}
		if (sign >= 4459) {
			System.out.println("   Los Angeles - 4,459");
		}
		System.out.println("2. Take exit for US-9");
		if (sign >= 1265) {
			System.out.println("   Chicago - 1,265");
		}
		int choice;
		do {
			choice = input.nextInt();
		} while ((choice != 1) && (choice != 2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if (choice == 1) {
			System.out.println("Arriving in Chicago");
			location = "chicago";
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (isJobComplete()) {
				completeJob();
			}
			mainMenu();
		} else if (choice == 2) {
			System.out.println("1. Take ramp to I-40 west");
			if (sign >= 3481) {
				System.out.println("   Los Angeles - 3,481");
			}
			System.out.println("2. Take ramp ro I-75 South");
			if (sign >= 2957) {
				System.out.println("   Mexico City - 2,957");
			}
			do {
				choice = input.nextInt();
			} while ((choice != 1) && (choice != 2));
			System.out.println("");
			System.out.println("");
			System.out.println("");
			if (choice == 1) {
				System.out.println("Arriving in Los Angeles");
				location = "los angeles";
				System.out.println("");
				System.out.println("");
				System.out.println("");
				if (isJobComplete()) {
					completeJob();
				}
				mainMenu();
			} else if (choice == 2) {
				System.out.println("Arriving in Mexico City");
				location = "mexico city";
				System.out.println("");
				System.out.println("");
				System.out.println("");
				if (isJobComplete()) {
					completeJob();
				}
				mainMenu();
			}
		}
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
