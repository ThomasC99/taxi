import java.io.File;
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
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
	}
	public void save () {
		try {
		} catch (Exception e) {
			e.printStackTrace();
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