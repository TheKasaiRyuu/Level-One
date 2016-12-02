import javax.swing.JFrame;
import javax.swing.JPanel;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";
		int p = 0;
		// 1. Create a frame & make it visible
		Turtle bobbyfart = new Turtle();
		JFrame frame = new JFrame();
		JPanel Panel = new JPanel();
		frame.setVisible(true);
		frame.add(panel);
		panel.setBackgroundImage(galapagosIslands);
		//panel.addTurtle(bobbyfart);
		/*Turtle BenDover = new Turtle();
		panel.addTurtle(BenDover);
		BenDover.move(11);
		panel.addTurtle(Hugh);
		Hugh.move(22);
		Turtle Oprah = new Turtle();
		panel.addTurtle(Oprah);
		Oprah.move(33);*/
		
		// 6. Put 50 Turtles on the beach
		for(int i =0; i < 100;i++){
			p=p+11;
			Turtle BenDover = new Turtle();
			panel.addTurtle(BenDover);
			BenDover.setX(900);
			BenDover.setY(10+p);
	}
	}
}
