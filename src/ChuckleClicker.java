import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton bignigrig = new JButton();
	JButton LiddleFiddleDiddleWiddle = new JButton();
public static void main(String[] args) {
	ChuckleClicker bob = new ChuckleClicker();
	bob.makeButtons();
}
void makeButtons(){
	JFrame xXFaZEXx = new JFrame(); 
	xXFaZEXx.setVisible(true);
	xXFaZEXx.setSize(500, 500);
	JPanel HughMungusHwua = new JPanel();
	
	
	xXFaZEXx.add(HughMungusHwua);
	HughMungusHwua.add(bignigrig);
	HughMungusHwua.add(LiddleFiddleDiddleWiddle);
	bignigrig.addActionListener(this);
	LiddleFiddleDiddleWiddle.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if(e.getSource() == bignigrig){
	JOptionPane.showMessageDialog(null, "What's sad and pathetic ;)");
	}
	if(e.getSource() == LiddleFiddleDiddleWiddle){
	JOptionPane.showMessageDialog(null, "Edwin's Sad Pathetic life, i should end it all");
	}
}
}