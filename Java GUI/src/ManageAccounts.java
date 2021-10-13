import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class ManageAccounts extends JFrame {
	
	JPanel panel1;
	JLabel lblID, lblFullname, lblRole, lblEmail, lblPassword;
	JComboBox cbkRole;
	JTextArea txtFullname, txtEmail, txtPassword;
	JButton btnInsert, btnUpdate, btnDelete;
	JTable tableData;
	
	
	void InitialComponent() {
		btnInsert = new JButton("Insert");
		btnUpdate = new JButton("Update");
		btnDelete = new JButton("Delete");
		
		
		lblID = new JLabel("ID");
		lblFullname = new JLabel("Fullname");
		lblRole = new JLabel("Role");
		lblEmail = new JLabel("Email");
		lblPassword = new JLabel("Password");
		
		txtFullname = new JTextArea();
		txtEmail = new JTextArea();
		txtPassword = new JTextArea();
		
		Vector<String> role = new Vector<>();
		role.add("Accountant");
		role.add("Admin");
		role.add("Cashier");
		
		cbkRole = new JComboBox(role);
		
// 		tableData = new JTable();
	}
	
	void panel1() {
		panel1 = new JPanel();
		
		JPanel panelInside = new JPanel();
		panelInside.setLayout(new GridLayout(3,0));
		
		
		panelInside.add(btnInsert);
		panelInside.add(btnUpdate);
		panelInside.add(btnDelete);
		
		panel1.add(panelInside);
		add(panel1, BorderLayout.EAST);	
	}
	
	void panel2() {
		JPanel panel = new JPanel(new GridLayout(5,1));
		
		JPanel list = new JPanel(new GridLayout(1,2));
		list.add(lblID);
		panel.add(list);
		
		list = new JPanel(new GridLayout(2,1));
		list.add(lblFullname);
		list.add(txtFullname);
		panel.add(list);
		
		list = new JPanel(new GridLayout(1,2));
		list.add(lblRole);
		list.add(cbkRole);
		panel.add(list);
		
		list = new JPanel(new GridLayout(2,1));
		list.add(lblEmail);
		list.add(txtEmail);
		panel.add(list);
		
		list = new JPanel(new GridLayout(2,1));
		list.add(lblPassword);
		list.add(txtPassword);
		panel.add(list);
		
		
//		String[] data = {"", "", "", ""};
//		String[] columns = {"ID", "Fullname", "Role", "Email", "Password"};
//			
//		JTable tableData = new JTable(columns, data);
//		
		add(panel, BorderLayout.CENTER);
		
	}
	
	void InternalFrame() {
		setSize(700,1000);
		setTitle("Manage Account Menu");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public ManageAccounts() {
		InitialComponent();
		panel1();
		panel2();
		InternalFrame();
	}

	public static void main(String[] args) {
		new ManageAccounts();

	}

}
