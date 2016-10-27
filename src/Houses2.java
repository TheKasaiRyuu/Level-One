import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class Houses2 {
	static Tortoise JesusChrist = new Tortoise();

	public static void main(String[] args) {
		JesusChrist.getBackgroundWindow().setColor(Color.black.brighter());
		JesusChrist.setSpeed(6);
		JesusChrist.setX(10);
		JesusChrist.setY(430);
		for (int i = 0; i < 10; i++) {
			String poop = JOptionPane.showInputDialog("What Size Do YOU Want?\nSmall, Medium, or Large");
			String poopy = JOptionPane.showInputDialog("What Color House Do YOU Want?\nRed, Grey, or Blue");
			String flat = JOptionPane.showInputDialog("What Do You Want A Flat Roof??\nYes or No");

			makeHouse(poop, poopy, flat);
		}
	}

	static void makeHouse(String height, String Colors, String Pointy) {
		int building = 0;

		if (height.equalsIgnoreCase("large")) {
			building = 250;
		}
		if (height.equalsIgnoreCase("medium")) {
			building = 120;
		}
		if (height.equalsIgnoreCase("small")) {
			building = 60;
		}
		if (Colors.equalsIgnoreCase("red")) {
			JesusChrist.setPenColor(Color.RED);
		}
		if (Colors.equalsIgnoreCase("grey")) {
			JesusChrist.setPenColor(Color.GRAY);
		}
		if (Colors.equalsIgnoreCase("blue")) {
			JesusChrist.setPenColor(Color.BLUE);
		}
		JesusChrist.move(building);
		if (Pointy.equalsIgnoreCase("yes")) {
			JesusChrist.turn(45);
			JesusChrist.move(25);
			JesusChrist.turn(90);
			JesusChrist.move(25);
			JesusChrist.turn(45);
		} else {
			JesusChrist.turn(90);
			JesusChrist.move(50);
			JesusChrist.turn(90);
		}
		JesusChrist.move(building);
		JesusChrist.turn(-90);
		JesusChrist.setPenColor(Color.GREEN);
		JesusChrist.move(35);
		JesusChrist.turn(-90);
	}

}
