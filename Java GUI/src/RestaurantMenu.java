import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class RestaurantMenu extends JFrame {
	
	JPanel panel1;
	JLabel lblID, lblName, lblSellPrice, lblIngredientPrice;
	JTextArea txtName, txtSellPrice, txtIngredientPrice;
	JButton btnInsert, btnUpdate, btnDelete;
	JTable tableMenu;
	
	void InitialComponent() {
		btnInsert = new JButton("Insert");
		btnUpdate = new JButton("Update");
		btnDelete = new JButton("Delete");
		
		lblID = new JLabel("ID");
		lblName = new JLabel("Name");
		lblSellPrice = new JLabel("Sell Price");
		lblIngredientPrice = new JLabel("Ingredient Price");
		
		txtName = new JTextArea();
		txtSellPrice = new JTextArea();
		txtIngredientPrice = new JTextArea();
		
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
		JPanel panel = new JPanel(new GridLayout(4,1));
		
		JPanel list = new JPanel(new GridLayout(1,2));
		list.add(lblID);
		panel.add(list);
		
		list = new JPanel(new GridLayout(2,1));
		list.add(lblName);
		list.add(txtName);
		panel.add(list);
		
		list = new JPanel(new GridLayout(2,1));
		list.add(lblSellPrice);
		list.add(txtSellPrice);
		panel.add(list);
		
		list = new JPanel(new GridLayout(2,1));
		list.add(lblIngredientPrice);
		list.add(txtIngredientPrice);
		panel.add(list);
		
		
		add(panel, BorderLayout.CENTER);	
	}
	
	
	void InternalFrame() {
		
		setSize(700,700);
		setTitle("Manage Restaurant Menu");
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public RestaurantMenu() {
		InitialComponent();
		panel1();
		panel2();
		InternalFrame();
		
	}

	public static void main(String[] args) {
		new RestaurantMenu();

	}

}
