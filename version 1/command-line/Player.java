import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
class Player {
	private String location;
	private String job;
	private double money;
	private int sign;
	private int gps;
	public Player () {
		this.location = "boise";
		this.job = "";
		this.money = 0;
		this.sign = 10;
		this.gps = 1;
	}
	public void load () {
		try {
			File file = new File ("save.txt");
			Scanner fileScanner = new Scanner (file);
			setLocation(fileScanner.nextLine());
			setMoney(fileScanner.nextDouble());
			setSign(fileScanner.nextInt());
			setGps(fileScanner.nextInt());
			fileScanner.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
	}
	public void save () {
		try {
			File file = new File ("save.txt");
			FileWriter fileWriter = new FileWriter (file);
			fileWriter.write(getLocation() + "\n" + getMoney() + "\n" + getSign() + "\n" + getGps() + "\n");
			fileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
	}
	public String getLocation () {
		return location;
	}
	public String getJob () {
		return job;
	}
	public double getMoney () {
		return money;
	}
	public int getSign () {
		return sign;
	}
	public int getGps () {
		return gps;
	}
	public void setLocation (String location) {
		this.location = location;
	}
	public void setJob (String job) {
		this.job = job;
	}
	public void setMoney (double money) {
		this.money = money;
	}
	public void setSign (int sign) {
		this.sign = sign;
	}
	public void setGps (int gps) {
		this.gps = gps;
	}
}