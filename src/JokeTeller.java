import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JokeTeller implements ActionListener {
	JFrame framey = new JFrame("Life");
	JPanel pan = new JPanel();
	JButton haha = new JButton("Joke");
	JButton hoho = new JButton("Punchline");

	public static void main(String[] args) {

		JokeTeller Keme = new JokeTeller();
		Keme.setup();

	}

	void setup() {
		framey.setVisible(true);
		framey.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framey.add(pan);
		pan.add(haha);
		pan.add(hoho);
		framey.pack();
		haha.addActionListener(this);
		hoho.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == haha) {
			JOptionPane.showMessageDialog(null, "ha");
		} else {
			JOptionPane.showMessageDialog(null, "ha");
		}

	}
}
