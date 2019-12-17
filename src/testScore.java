import javax.swing.JOptionPane;

public class testScore {
public static void main(String[] args) {
	String userScore = JOptionPane.showInputDialog("What did you get on your test?");
	double userScoreNumber = Double.parseDouble(userScore);
	if(userScoreNumber > 90) {
		JOptionPane.showMessageDialog(null, "Good job. Don't fail on the next one.");
	}
	else if(userScoreNumber > 80) {
		JOptionPane.showMessageDialog(null, "Typical.");
	}
	else if(userScoreNumber > 70) {
		JOptionPane.showMessageDialog(null, "C's get degrees.");
	}
	else if(userScoreNumber > 60) {
		JOptionPane.showMessageDialog(null, "Maybe try a little harder?");
	}
	else {
		JOptionPane.showMessageDialog(null, "Just a straight up bomb, huh buckaroo?");
	}
}
}
