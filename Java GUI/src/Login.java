import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
		
	JFrame frame;
	JLabel lblTitle, lblEmail, lblPassword;
	JTextField txtEmail;
	JPasswordField txtPassword;
	JButton btnLogin;

	
	void InitialComponent() {
		
		lblTitle = new JLabel("Amore POS");
		lblEmail = new JLabel("Email");
		lblPassword = new JLabel("Password");
		
		txtEmail = new JTextField();
		txtPassword = new JPasswordField();
		
		btnLogin = new JButton("Login");
		
	}
	
	void Header() {
		JPanel panel = new JPanel(new FlowLayout());
		panel.add(lblTitle);
		
		add(panel , BorderLayout.NORTH);
	}
	
	void Center() {
		JPanel panel = new JPanel(new GridLayout(2,1));
		
		JPanel panel2 = new JPanel(new GridLayout(1,2));
		panel2.add(lblEmail);
		panel2.add(txtEmail);
		panel.add(panel2);
		
		panel2 = new JPanel(new GridLayout(1,2));
		panel2.add(lblPassword);
		panel2.add(txtPassword);
		panel.add(panel2);
		
		add(panel, BorderLayout.CENTER);
	}
	
	void Footer() {
		JPanel panel = new JPanel(new FlowLayout());
		panel.add(btnLogin);
		
		add(panel, BorderLayout.SOUTH);
	}
	
	void InternalFrame() {
		setTitle("Amore POS");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public Login() {
		InitialComponent();
		InternalFrame();
		Header();
		Center();
		Footer();
	}

	public static void main(String[] args) {
		new Login();
	}

}
