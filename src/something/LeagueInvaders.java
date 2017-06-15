package something;
import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame = new javax.swing.JFrame("League Invaders");
	GamePanel pan = new GamePanel();
	final int finalH = 800;
	final int finalW = 500;
	public static void main(String[] args) {
		LeagueInvaders tyrone = new LeagueInvaders();
		tyrone.setup();
		
	}
	void setup(){
	frame.add(pan);
	frame.addKeyListener(pan);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	pan.startGame();
	
	}
	LeagueInvaders(){
	frame.setVisible(true);
	frame.setSize(finalH, finalH);
		
	}
	
}
