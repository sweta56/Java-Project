import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class form extends JFrame implements ActionListener{
		JLabel l1,l2,l3, passwordEmpty;
		JTextField t1;
		JPasswordField t2;
		JButton b1, b2;
		form() {
			Font f= new Font("Arial",Font.BOLD,24);
			l1= new JLabel("Login Page");
			l1.setFont(f);
			l2 = new JLabel("User Name");
			t1 = new JTextField();
			l3 = new JLabel("Password");
			passwordEmpty = new JLabel("please fill this out!");
			t2 = new JPasswordField();
			b1 = new JButton("Login");
			b2 = new JButton("Reset");
			l1.setBounds(70,40,200,40);
			l2.setBounds(70,100,100,20);//username
			t1.setBounds(70,120,200,30);//textfield
			l3.setBounds(70,170,100,20);//password
			t2.setBounds(70,190,200,30);
			b1.setBounds(190,240,80,30);
			b2.setBounds(70,240,80,30);
			passwordEmpty.setBounds(70, 220, 150, 20);
			add(l1);
			add(l2);
			add(t1);
			add(l3);
			add(t2);
			add(b1);
			add(b2);
			setLayout(null);
			setVisible(true);
			setSize(400,400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			b1.addActionListener(this);
			b2.addActionListener(this);
			
		}
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == b1) {
				if (t1.getText().equals("") || t2.getText().equals("")) {
					t1.setText("please fill both these fields!!!");
				} else {
					LoggedIn l = new LoggedIn();
				}

			}
			if (e.getSource() == b2) {
				t1.setText("");
				t2.setText("");
			}
		}

	public static void main(String[] args) {
	
			form fo = new form();
		
	}
}