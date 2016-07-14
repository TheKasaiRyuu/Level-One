import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

public class Mob {
public static void main(String[] args) {
	Tortoise KoolToroiseTheThird = new Tortoise();
	KoolToroiseTheThird.setX(10);
	KoolToroiseTheThird.setY(420);
	KoolToroiseTheThird.turn(0);
	for(int i = 0; i < 420; i++){
	KuulFullHawse(KoolToroiseTheThird);
	}
}

private static void KuulFullHawse(Tortoise KoolToroiseTheThird) {
	KoolToroiseTheThird.penDown();
	KoolToroiseTheThird.setPenColor(Color.BLACK);
	KoolToroiseTheThird.setSpeed(9);
	KoolToroiseTheThird.move(100);
	KoolToroiseTheThird.turn(90);
	KoolToroiseTheThird.move(100);
	KoolToroiseTheThird.turn(90);
	KoolToroiseTheThird.move(100);
	KoolToroiseTheThird.setPenColor(Color.GREEN);
	KoolToroiseTheThird.turn(-90);
	KoolToroiseTheThird.move(15);
	KoolToroiseTheThird.turn(-90);
}
}
