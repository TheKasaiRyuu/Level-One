import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Survey implements ActionListener {
JFrame op = new JFrame("Survey");
JPanel pa = new JPanel();
JButton bu = new JButton("Roll");
JLabel yo = new JLabel("0");
JLabel oy = new JLabel("0");
JLabel kyoto = new JLabel("How much do you want to bet");
JTextField ip = new JTextField(10);
int betss = 1000;
JLabel bet = new JLabel(""+betss);
int first;
int last;
	public static void main(String[] args) {
	Survey haha = new Survey();
	haha.setup();
}

void setup(){
	op.setVisible(true);
	op.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	op.add(pa);
	pa.add(bu);
	pa.add(yo);
	pa.add(oy);
	pa.add(kyoto);
	pa.add(ip);
	pa.add(bet);
	op.pack();
	bu.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String sert = ip.getText();
	int act = Integer.parseInt(sert);
	if(e.getSource()==bu){
		first = new Random().nextInt(6)+1;
		last = new Random().nextInt(6)+1;
		yo.setText(""+first);
		oy.setText(""+last);
		if(first == last){
			JOptionPane.showMessageDialog(null, "YOU WIN MOONEY");
			betss = betss + act;
			bet.setText(""+ betss);
		}
		else{
			JOptionPane.showMessageDialog(null, "YOU LOSE MOONEY");
			betss = betss - act;
			bet.setText(""+ betss);
		}
	}
	}

private Random Random() {
	// TODO Auto-generated method stub
	return null;
}
}
