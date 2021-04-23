import java.util.Scanner;
class HighwayNode extends Node {
	private String continueMessage, exitMessage;
	private Node continueNode, exitNode;
	private int [] exitSigns, continueSigns;
	private String [] exitTowns, continueTowns;
	public HighwayNode (String continueMessage, String exitMessage, Node continueNode, Node exitNode, int [] continueSigns, int [] exitSigns,
		String [] continueTowns, String [] exitTowns) {
		this.continueMessage = continueMessage;
		this.exitMessage = exitMessage;
		this.continueNode = continueNode;
		this.exitNode = exitNode;
		this.continueSigns = continueSigns;
		this.exitSigns = exitSigns;
		this.continueTowns = continueTowns;
		this.exitTowns = exitTowns;
	}
	public void continueNode (Node node) {
		this.continueNode = node;
	}
	public void exitNode (Node node) {
		this.exitNode = node;
	}
	@Override
	public void go (Player player) {
		System.out.println("1. " + continueMessage);
		for (int i = 0; i < continueSigns.length; i++) {
			if (player.sign() >= continueSigns[i]) {
				System.out.println("   " + continueTowns[i] + " - " + continueSigns[i]);
			}
		}
		System.out.println("2. " + exitMessage);
		for (int i = 0; i < exitSigns.length; i++) {
			if (player.sign () >= exitSigns[i]) {
				System.out.println("   " + exitSigns[i] + " - " + exitTowns[i]);
			}
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
			continueNode.go(player);
		} else if (choice == 2) {
			exitNode.go(player);
		}
	}
} // 67 - 50