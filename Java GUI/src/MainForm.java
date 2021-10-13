import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class MainForm extends JFrame implements ActionListener, MenuListener {
	
	JMenuBar menuBar;
	JMenu menuAccount, menuManage, menuFinance, menuTransaction;
	JMenuItem menuLogout, menuManageAccounts, menuManageRestaurantMenu, menuViewMonthlyReport, menuCreateTransaction;
	

	void InitialComponent() {
		
		menuBar = new JMenuBar();
		
		menuAccount = new JMenu("Account");
		menuManage = new JMenu("Manage");
		menuFinance = new JMenu("Finance");
		menuTransaction = new JMenu("Transaction");
		
		menuLogout = new JMenuItem("Logout");
		menuManageAccounts = new JMenuItem("Accounts");
		menuManageRestaurantMenu = new JMenuItem("Restaurant Menu");
		menuViewMonthlyReport = new JMenuItem("View Monthly Report");
		menuCreateTransaction = new JMenuItem("Create Transaction");
	}
	
	void Setup() {
		
		menuBar.add(menuAccount);
		menuBar.add(menuManage);
		menuBar.add(menuFinance);
		menuBar.add(menuTransaction);
		
		menuAccount.add(menuLogout);
		
		menuManage.add(menuManageAccounts);
		menuManage.add(menuManageRestaurantMenu);
		
		menuFinance.add(menuViewMonthlyReport);
		
		menuTransaction.add(menuCreateTransaction);
		
		menuAccount.addMenuListener(this);
		menuManage.addMenuListener(this);
		menuFinance.addMenuListener(this);
		menuTransaction.addMenuListener(this);
		
		menuLogout.addActionListener(this);
		menuManageAccounts.addActionListener(this);
		menuManageRestaurantMenu.addActionListener(this);
		menuViewMonthlyReport.addActionListener(this);
		menuCreateTransaction.addActionListener(this);
	}
	
	void InternalFrame() {
		
		setJMenuBar(menuBar);
		setSize(1200, 1000);
		setTitle("Amore POS");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
	}
	public MainForm() {
		InitialComponent();
		Setup();
		InternalFrame();
			
	}

	public static void main(String[] args) {
		new MainForm();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == menuLogout) {
			this.dispose();
			new Login();
			
		}
		
		else if(e.getSource() == menuManageAccounts) {
			this.dispose();
			new ManageAccounts();
		}
		
		else if(e.getSource() == menuManageRestaurantMenu) {
			this.dispose();
			new RestaurantMenu();
		}
		
		else if(e.getSource() == menuViewMonthlyReport) {
			this.dispose();
			new ViewMonthlyReport();
		}
		
		else if(e.getSource() == menuCreateTransaction) {
			this.dispose();
			new CreateTransaction();
		}
			

	}
	@Override
	public void menuCanceled(MenuEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menuDeselected(MenuEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menuSelected(MenuEvent arg0) {
		// TODO Auto-generated method stub
		
	}
		

}
