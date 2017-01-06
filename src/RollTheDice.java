import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RollTheDice implements ActionListener {
JFrame bob = new JFrame();
JPanel boo = new JPanel();
JButton koo = new JButton();
	public static void main(String[] args) {
	RollTheDice jooo = new RollTheDice();
	jooo.setup();
	}
	void setup(){
		bob.setVisible(true);
		bob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bob.add(boo);
		boo.add(koo);
		bob.pack();
		koo.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==koo){
			int op = new Random().nextInt(6);

			System.out.println(""+op);
		}
	}
}
