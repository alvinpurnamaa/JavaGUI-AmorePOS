import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class MenuAccountant extends JFrame implements ActionListener, MenuListener{
	
	JMenuBar menuBar;
	JMenu menuAccount, menuFinance;
	JMenuItem menuLogout, menuViewMonthlyReport;

	
	void InitialComponent() {
		menuBar = new JMenuBar();
		
		menuAccount = new JMenu("Account");
		menuFinance = new JMenu("Finance");
		
		menuLogout = new JMenuItem("Logout");
		menuViewMonthlyReport = new JMenuItem("View Monthly Report");	
	}
	
	void Setup() {
		
		menuBar.add(menuAccount);
		menuBar.add(menuFinance);
		
		menuAccount.add(menuLogout);
		menuFinance.add(menuViewMonthlyReport);
		
		menuAccount.addMenuListener(this);
		menuFinance.addMenuListener(this);
		
		menuLogout.addActionListener(this);
		menuViewMonthlyReport.addActionListener(this);
	}
	
	void InternalFrame() {
		setJMenuBar(menuBar);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Amore POS");
		setSize(1200,1000);
		setLocationRelativeTo(null);
		setVisible(true);	
		
	}
	
	public MenuAccountant() {
		InitialComponent();
		Setup();
		InternalFrame();
		
	}
	
	public static void main(String[] args) {
		new MenuAccountant();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == menuViewMonthlyReport) {
			this.dispose();
			new ViewMonthlyReport();
		}
		
	}

	@Override
	public void menuCanceled(MenuEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menuDeselected(MenuEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menuSelected(MenuEvent e) {
		// TODO Auto-generated method stub
		
	}


}
