// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
public static void main(String[] args) {
	
	// 1. Make a main method that includes all the steps below….

	// 2. Make a variable that will hold a random number and put a random number into this variable using ""
		int number = new Random().nextInt(4);
	// 3. Print out this variable
		
	// 4. Get the user to enter a question for the 8 ball
	JOptionPane.showInputDialog("Ask me a question, any question!");
	// 5. If the random number is 0
	if (number == (0))
	{
		JOptionPane.showMessageDialog(null, "Yes");
	}
	// -- tell the user "Yes"
	else if (number == (1))
	// 6. If the random number is 1
	{
		JOptionPane.showMessageDialog(null, "no");
	}
	// -- tell the user "No"

	// 7. If the random number is 2
	else if (number == (2))
	// -- tell the user "Maybe you should ask Google?"
	{
		JOptionPane.showMessageDialog(null, "Maybe you should go ask Google?");
	}
	// 8. If the random number is 3
	else if (number == (3))
	{
		JOptionPane.showMessageDialog(null, "Maybe you should go ask mom!");
	}
	// -- write your own answer

}
}
