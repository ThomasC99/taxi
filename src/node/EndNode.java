package node;

import main.Main;
import main.Player;

public class EndNode extends Node {
	private String town;
	public EndNode (String town) {
		this.town = town;
	}
	@Override
	public void go (Player player) {
		System.out.println("Arriving in " + town);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		player.location(town);
		if (Main.is_job_complete()) {
			Main.complete_job();
		}
		Main.main_menu();
	}
}
