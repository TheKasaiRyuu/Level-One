import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginTest implements ActionListener {
	JFrame ko = new JFrame("Login");
	JPanel el = new JPanel();
	JTextField haha = new JTextField(25);
	JLabel ol = new JLabel("Login");
	JButton up = new JButton("Enter");

	public static void main(String[] args) {
		LoginTest okkk = new LoginTest();
		okkk.setup();
	}

	void setup() {
		ko.setVisible(true);
		ko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ko.add(el);
		el.add(ol);
		el.add(haha);
		el.add(up);
		ko.pack();
		up.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == up) {
			String poop = haha.getText();
			if (poop.equals("im2cool")) {
				JOptionPane.showMessageDialog(null, "You Loged In");
			}
		}
	}
}
