import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class MenuCashier extends JFrame implements ActionListener, MenuListener{
	
	JMenuBar menuBar;
	JMenu menuAccount, menuTransaction;
	JMenuItem menuLogout, menuCreateTransaction;

	
	void InitialComponent() {
		menuBar = new JMenuBar();
		
		menuAccount = new JMenu("Account");
		menuTransaction = new JMenu("Transaction");
		
		menuLogout = new JMenuItem("Logout");
		menuCreateTransaction = new JMenuItem("Create Transaciton");	
	}
	
	void Setup() {
		menuBar.add(menuAccount);
		menuBar.add(menuTransaction);
		
		menuAccount.add(menuLogout);
		menuTransaction.add(menuCreateTransaction);	
		
		menuAccount.addMenuListener(this);
		menuTransaction.addMenuListener(this);
		
		menuLogout.addActionListener(this);
		menuCreateTransaction.addActionListener(this);
			
	}
	
	void InternalFrame() {
		setJMenuBar(menuBar);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Amore POS");
		setSize(1200,1000);
		setLocationRelativeTo(null);
		setVisible(true);	
		
	}

	public MenuCashier() {
		InitialComponent();
		Setup();
		InternalFrame();
	}
	
	public static void main(String[] args) {
		new MenuCashier();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == menuCreateTransaction);
		this.dispose();
		new CreateTransaction();
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
