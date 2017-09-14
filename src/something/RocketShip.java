package something;

import java.awt.Color;
import java.awt.Graphics;

public class RocketShip extends GameObject{
	int speed;
	
	RocketShip(int x,int y,int width,int height){
		super(x,y,width,height);
		speed = 5;
		
	}
	void update(){
		
	}
	void draw(Graphics g){
		g.setColor(Color.blue.CYAN);
		g.fillRect(x, y, width, height);
	}
	
	
	
	
	
}
