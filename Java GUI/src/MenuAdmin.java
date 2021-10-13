import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class MenuAdmin extends JFrame implements ActionListener, MenuListener {
	
	JMenuBar menuBar;
	JMenu menuAccount, menuManage;
	JMenuItem menuLogout, menuAccounts, menuRestaurant;
	
	
	void InitialComponet() {
		menuBar = new JMenuBar();
		
		menuAccount = new JMenu("Account");
		menuManage = new JMenu("Manage");
		
		menuLogout = new JMenuItem("Logout");
		menuAccounts = new JMenuItem("Accounts");
		menuRestaurant = new JMenuItem("Restaurant Menu");
		
	}
	
	void Setup() {
		menuBar.add(menuAccount);
		menuBar.add(menuManage);
		
		menuAccount.add(menuLogout);
		menuManage.add(menuAccounts);
		menuManage.add(menuRestaurant);
		
		
		menuAccount.addMenuListener(this);
		menuManage.addMenuListener(this);
		
		menuLogout.addActionListener(this);
		menuAccounts.addActionListener(this);
		menuRestaurant.addActionListener(this);
	}
	
	void InternalFrame() {
		setJMenuBar(menuBar);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Amore POS");
		setSize(1200,1000);
		setLocationRelativeTo(null);
		setVisible(true);	
	}
	
	public MenuAdmin() {
		InitialComponet();
		Setup();
		InternalFrame();
	}
	
	public static void main(String[] args) {
		new MenuAdmin();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == menuAccounts) {
			this.dispose();
			new ManageAccounts();
			
		}
			
		else if (e.getSource() == menuLogout) {
			this.dispose();
			new Login();
		}
			
		else if (e.getSource() ==  menuRestaurant) {
			this.dispose();
			new RestaurantMenu();
		}
	}

	@Override
	public void menuCanceled(MenuEvent arg0) {
		
		
	}

	@Override
	public void menuDeselected(MenuEvent arg0) {
		
		
	}

	@Override
	public void menuSelected(MenuEvent arg0) {
	
	}

}
