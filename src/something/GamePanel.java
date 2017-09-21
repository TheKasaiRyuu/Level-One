package something;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

//import org.teachingextensions.logo.Colors;
//import org.teachingextensions.logo.Colors.Blues;
//import org.teachingextensions.logo.Colors.Reds;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer tick = new Timer(1000 / 60, this);
	GameObject Objecto = new GameObject(0,700,50,50);
	int RocketX = 250;
	RocketShip rocketo = new RocketShip(RocketX,700,50,50);
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	Font titleFont;
	int currentState = MENU_STATE;

	void startGame() {
		tick.start();
		
	}

	GamePanel() {
		titleFont = new Font("Arial",Font.PLAIN,48);
		startGame();
	}

	void updateMenuState() {
	
	}

	void updateGameState() {
		rocketo.update();
	}
	
	void updateEndState() {
	
	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(0, 0, LeagueInvaders.finalW, LeagueInvaders.finalH);
		g.setFont(titleFont);
		g.setColor(Color.black);
		g.drawString("League Invaders", 225, 250);
	}

	void drawGameState(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, LeagueInvaders.finalW, LeagueInvaders.finalH);
		rocketo.draw(g);
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(0, 0, LeagueInvaders.finalW, LeagueInvaders.finalH);
		g.setFont(titleFont);
		g.setColor(Color.black);
		g.drawString("You Lose, Score:", 225, 250);
	}

	public void paintComponent(Graphics g) {
		if(currentState == MENU_STATE){
			drawMenuState(g);
		}else if(currentState == GAME_STATE){
			drawGameState(g);
		}else if(currentState == END_STATE){
			drawEndState(g);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
			if(currentState == MENU_STATE){
			updateMenuState();
				}else if(currentState == GAME_STATE){
			updateGameState();
				}else if(currentState == END_STATE){
			updateEndState();
				}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyCode());
		if(e.getKeyCode() == 10){
			//System.out.println("enter");
			if(currentState == MENU_STATE){
				currentState = GAME_STATE;
			}
			else if(currentState == END_STATE){
				currentState = MENU_STATE;
			}
			else if(currentState == GAME_STATE){
				currentState = END_STATE;
			}
		}	
		if(e.getKeyCode() == 37){
			System.out.println("Left");
			rocketo.x = rocketo.x-10;
			
		}else if(e.getKeyCode() == 39){
			System.out.println("Right");
			rocketo.x = rocketo.x+10;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		

	}
}
