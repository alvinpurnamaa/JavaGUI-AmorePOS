import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ViewMonthlyReport extends JFrame {
	
	JPanel panel1;
	JLabel lblMonth, lblYear;
	JTextField txtMonth, txtYear;
	JButton btnView;
	JTable tabelReport;
	
	void InitialComponent() {
		lblMonth = new JLabel("Month");
		lblYear = new JLabel("Year");
		
		txtMonth = new JTextField();
		txtYear = new JTextField();
		
		btnView = new JButton("View");
		
	}
	
	void panel1() {
		panel1 = new JPanel();
		panel1.setPreferredSize(new Dimension(150, 0));
		
		JPanel panelInside = new JPanel();
		panelInside.setLayout(new GridLayout(3,0));
		
		
		panelInside.add(btnView);
		
		panel1.add(panelInside);
		add(panel1, BorderLayout.EAST);
		
	}
	
	void panel2() {
		JPanel panel = new JPanel(new GridLayout(2,1));
		
		JPanel list = new JPanel(new GridLayout(2,1));
		list.add(lblMonth);
		list.add(txtMonth);
		panel.add(list);
		
		list = new JPanel(new GridLayout(2,1));
		list.add(lblYear);
		list.add(txtYear);
		panel.add(list);
		
		
		add(panel, BorderLayout.CENTER);	
	}

	public ViewMonthlyReport() {
		InitialComponent();
		InternalFrame();
		panel1();
		panel2();
		
	}
	
	void InternalFrame () {
		setSize(700,700);
		setTitle("Finance Report");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
	}

	public static void main(String[] args) {
		new ViewMonthlyReport();

	}

}
