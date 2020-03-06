import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LoggedIn extends JFrame{
	JLabel message;
	LoggedIn() {
		setSize(350, 350);
		message = new JLabel("Congrats! You Have Logged In");
		message.setBounds(200, 200, 100, 80);
		add(message);
		setVisible(true);
		setLayout(null);
	}

	public static void main(String[] args) {
		
	}
}