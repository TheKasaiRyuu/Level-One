import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.PenColors.Blues;
import org.teachingextensions.logo.PenColors.Pinks;
import org.teachingextensions.logo.Pizza;
import org.teachingextensions.logo.Tortoise;

public class Houses {
public static void main(String[] args) {
	Tortoise Shingles = new Tortoise();
	
	Shingles.setX(10);
	Shingles.setY(430);
	Shingles.turn(360);
	Shingles.setSpeed(10);
	for (int i = 0; i < 10; i++) {
		
		int RNG = new Random().nextInt(255);	
		int RNG1 = new Random().nextInt(255);	
		int RNG2 = new Random().nextInt(255);	
		Team_valor(Shingles,"small", new Color(RNG, RNG1, RNG2));
		Team_valor(Shingles,"medium",  new Color(RNG1, RNG2, RNG));
		Team_valor(Shingles,"big", new Color(RNG1, RNG2, RNG));
		Team_valor(Shingles,"big", new Color(RNG2, RNG, RNG1));
		Team_valor(Shingles,"medium", new Color(RNG1, RNG, RNG2));
		Team_valor(Shingles,"small", new Color(RNG2, RNG1, RNG));

	}
	//Shingles.setPenColor(new Color(rgb) );
	
	
	
}

private static void Team_valor(Tortoise Shingles,String thom, Color Colour) {
int straws= 0;
	if (thom.equals("big")) {
	straws=straws+420;
}
	if (thom.equals("medium")) {
		straws=straws+210;
	}
	if (thom.equals("small")) {
		straws=straws+105;
	}
Shingles.setPenColor(Colour);
Shingles.penDown();
Shingles.move(straws);
Shingles.turn(90);
Shingles.move(100);
Shingles.turn(90);
Shingles.move(straws);
Shingles.setPenColor(Blues.Cyan);
Shingles.turn(-90);
Shingles.move(70);
Shingles.turn(-90);
}
}
