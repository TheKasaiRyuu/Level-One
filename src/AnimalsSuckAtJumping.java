
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AnimalsSuckAtJumping {
	public static void main(String[] happyCheese) throws MalformedURLException {
		String urlOfAnimalSuckingAtJumping = "http://66.media.tumblr.com/732566e8da647df1ff3709c4c358eba0/tumblr_n6al0kAFax1s612eao1_250.gif";

		/*
		 * We want to show an animation of an animal sucking at jumping inside a
		 * JFrame. Once you have chosen from
		 * http://animalssuckingatjumping.tumblr.com/, right click and
		 * "Copy Image URL" or “Copy Image Address” Your program must: - show
		 * the animation in full without any user interaction. You don’t need a
		 * JPanel since it’s only one JComponent. - show the animation in the
		 * center of the screen. Clue: frame.setLocationRelativeTo(null) - have
		 * a title such as "Gerbil Fail"
		 */
		JFrame frame = new JFrame();
		JLabel poof = createImage(urlOfAnimalSuckingAtJumping);
		frame.setVisible(true);
		frame.setLocationRelativeTo(poof);
		frame.add(poof);
	}

	static JLabel createImage(String imageURL) throws MalformedURLException {
		URL url = new URL(imageURL);
		Icon icon = new ImageIcon(url);
		return new JLabel(icon);
	}
}
