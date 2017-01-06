import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CustomGreeter implements ActionListener {
JFrame fromey = new JFrame("Greetings");
JTextField bob = new JTextField(10);
JPanel Paney = new JPanel();
JButton Butt = new JButton("Enter Name");
JButton buttt = new JButton("Greeting");	
String name = "";
public static void main(String[] args) {
	CustomGreeter billymays = new CustomGreeter();
	billymays.setup();
}
void setup(){
	fromey.setVisible(true);
	fromey.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fromey.add(Paney);
	Paney.add(Butt);
	Paney.add(bob);
	Paney.add(buttt);
	fromey.pack();
	Butt.addActionListener(this);
	buttt.addActionListener(this);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==Butt){
		name = JOptionPane.showInputDialog("What's your name?");
	}else{
		JOptionPane.showMessageDialog(null, "Hello " + name+ ".");
	}
	
}
	

}
