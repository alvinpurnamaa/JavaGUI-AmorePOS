import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;

public class CreateTransaction extends JFrame {
	
	JPanel panel1, panel2;
	JLabel lblIDTitle, lblMenuID, lblNameTitle, lblMenuName, lblMenuTitle, lblCartTitle, lblTotalTitle, lblTotalPrice, lblQtyTitle;
	JButton btnAdd, btnUpdate, btnRemove, btnFinish, btnCancel;
	JSpinner spnQty;
	JTable tableMenu, tableCart;
	
	
	void InitialComponent() {
		lblIDTitle = new JLabel("Title");
		lblMenuID = new JLabel("");
		lblNameTitle = new JLabel("Name");
		lblMenuName = new JLabel("");
		lblMenuTitle = new JLabel("Menu");
		lblCartTitle = new JLabel("Cart");
		
		lblTotalTitle = new JLabel("Total");
		lblTotalTitle.setVerticalAlignment(JLabel.BOTTOM);
		lblTotalTitle.setHorizontalAlignment(JLabel.LEFT);
		
		lblTotalPrice = new JLabel("");
		lblQtyTitle = new JLabel("Quantity");
		
		btnAdd = new JButton("Add");
		btnUpdate = new JButton("Update");
		btnRemove = new JButton("Remove");
		btnFinish = new JButton("Finish");
		btnCancel = new JButton("Cancel");
		
		SpinnerNumberModel spnNumb = new SpinnerNumberModel(1,1,80,1);
		spnQty = new JSpinner();
		spnQty.setModel(spnNumb);

	}
	
	void panel1 () {
		panel1 = new JPanel();
		
		JPanel panelInside = new JPanel();
		panelInside.setLayout(new GridLayout(3,0));
		
		
		panelInside.add(btnAdd);
		panelInside.add(btnUpdate);
		panelInside.add(btnRemove);
		
		panel1.add(panelInside);
		add(panel1, BorderLayout.EAST);	
	}
	
	void panel2 () {
		JPanel panel = new JPanel(new GridLayout(3,1));
		
		JPanel list = new JPanel(new GridLayout(1,2));
		list.add(lblIDTitle);
		list.add(lblMenuID);
		panel.add(list);
		
		list = new JPanel(new GridLayout(1,2));
		list.add(lblNameTitle);
		list.add(lblMenuName);
		panel.add(list);
		
		list = new JPanel(new GridLayout(2,1));
		list.add(lblQtyTitle);
		list.add(spnQty);
		panel.add(list);
		
		add(panel, BorderLayout.WEST);
	}
	
	void panel3() {
		panel2 = new JPanel();

		JPanel panelInside = new JPanel(new GridLayout(2,1));
		
		panelInside.setLayout(new GridLayout(1,1));
		panelInside.add(btnCancel);
		panelInside.add(btnFinish);
		panel2.add(panelInside);
		
		panelInside = new JPanel(new GridLayout(1,1));
		panelInside.add(lblTotalTitle);
		panelInside.add(lblTotalPrice);

		panel2.add(panelInside);
		
		add(panel2, BorderLayout.SOUTH);	
		
	}
	
	void InternalFrame() {
		setSize(1000,700);
		setTitle("Transaction");
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public CreateTransaction () {
		InitialComponent();
		panel1();
		panel2();
		panel3();
		InternalFrame();
	}
	
	public static void main(String[] args) {
		new CreateTransaction();

	}

}
