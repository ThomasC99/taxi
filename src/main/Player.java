package main;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Player {
	private String location, job;
	private double money;
	private int sign, gps, autopilot;
	public Player () {
		this.location = "calgary";
		this.job = "";
		this.money = 0;
		this.sign = 0;
		this.gps = 0;
		this.autopilot = 0;
	}
	public void save () {
		try {
			File file = new File ("save.txt");
			FileWriter writer = new FileWriter(file, false);
			writer.write(location() + "\n" + money + "\n" + sign + "\n" + gps + "\n" + autopilot + "\n");
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\n\n");
		}
	}
	public void load () {
		try {
			File file = new File ("save.txt");
			Scanner reader = new Scanner(file);
			location(reader.nextLine());
			money(reader.nextDouble());
			sign(reader.nextInt());
			gps(reader.nextInt());
			autopilot(reader.nextInt());
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\n\n");
		}
	}
	public String location () {
		return location;
	}
	public void location (String location) {
		this.location = location;
	}
	public String job () {
		return job;
	}
	public void job (String job) {
		this.job = job;
	}
	public double money () {
		return money;
	}
	public void money (double money) {
		this.money = money;
	}
	public int sign () {
		return sign;
	}
	public void sign (int sign) {
		this.sign = sign;
	}
	public int gps () {
		return gps;
	}
	public void gps (int gps) {
		this.gps = gps;
	}
	public int autopilot () {
		return autopilot;
	}
	public void autopilot (int range) {
		this.autopilot = range;
	}
}