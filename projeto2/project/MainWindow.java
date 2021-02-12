package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import conversors.Centimeter;

class MainWindow extends JFrame implements ActionListener, FocusListener {
	private static final long serialVersionUID = 1L;
	private MainPanel mainPanel;
	private JPanel statusPanel;
	private JLabel statusLabel;
	private JMenuBar menuBar;
	private JMenu menuFile;
	private JMenu menuHelp;
	private JMenuItem menuItemExit;
	private JMenuItem menuItemHelp;
	private JMenuItem menuItemDisclaimer;
	private JMenuItem menuItemAbout;

	MainWindow(String title) throws HeadlessException {
		super(title);
		setupWindow();
		setupMenus();
		bindMenus();
		setupExtraComponents();
		bind_mainPanelComponents(this);
		setupWindowsListener();
		this.setStatus(Info.getLongVersion());
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		if (actionEvent.getSource() == this.menuItemExit) {
			exitSystem();
		}

		if (actionEvent.getSource() == this.menuItemHelp) {
			new MsgScreen(this, "Help for " + Info.getLongVersion(), Info.getHelpText());
		}

		if (actionEvent.getSource() == this.menuItemDisclaimer) {
			new MsgScreen(this, "Disclaimer " + Info.getLongVersion(), Info.getDisclaimerText());
		}

		if (actionEvent.getSource() == this.menuItemAbout) {
			new MsgScreen(this, "About " + Info.getLongVersion(), Info.getAboutText());
		}

		// MainPanel
	
		if (actionEvent.getSource() == mainPanel.getjComboBox1()) {
			mainPanel.getInPut();// get input
			String from = mainPanel.getjComboBox1().getSelectedItem().toString();// item Selected ComboBox by Index
			String to = mainPanel.getjComboBox2().getSelectedItem().toString();// item Selected ComboBox by Index
			int fromNum = mainPanel.getjComboBox1().getSelectedIndex();// item Selected ComboBox by Index
			int toNum = mainPanel.getjComboBox2().getSelectedIndex();// item Selected ComboBox by Index
			
			double in = Double.parseDouble(mainPanel.getInPut().getText());	
			
			String resultado =String.valueOf(verifica(fromNum, toNum, in));
			
			mainPanel.getOutPut().setText(resultado);
		
			DefineOutroParamento(from, to, 1);			
			
		}
		
		
		
		if (actionEvent.getSource() == mainPanel.getjComboBox2()) {
			mainPanel.getInPut();// get input
			String from = mainPanel.getjComboBox2().getSelectedItem().toString();// item Selected ComboBox by Index
			String to = mainPanel.getjComboBox1().getSelectedItem().toString();// item Selected ComboBox by Index
			int fromNum = mainPanel.getjComboBox1().getSelectedIndex();// item Selected ComboBox by Index
			int toNum = mainPanel.getjComboBox2().getSelectedIndex();// item Selected ComboBox by Index
			
			double in = Double.parseDouble(mainPanel.getInPut().getText());	
			
			String resultado =String.valueOf(verifica(fromNum, toNum, in));
			
			mainPanel.getOutPut().setText(resultado);
		
			
			DefineOutroParamento(from, to, 2);
			

		}
	}
	
	
	private double verifica(int indexFrom, int indexTo, double value) {
		System.out.println(indexFrom);
		System.out.println(indexTo);
		
		if(indexFrom <=6) {
			return convocaFuncao.defineFunctionLenght(indexFrom,indexTo, value);
		}
		if(indexFrom > 6 && indexFrom <=16) {
			return convocaFuncao.defineFunctionArea(indexFrom,indexTo, value);
		}
		if(indexFrom > 16 && indexFrom <=22) {
			return convocaFuncao.defineFunctionArea(indexFrom,indexTo, value);
		}
		if(indexFrom > 22 && indexFrom <=26) {
			return convocaFuncao.defineFunctionTime(indexFrom,indexTo, value);
		}
		
		if(indexFrom > 26) {
			return convocaFuncao.defineFunctionSPeed(indexFrom,indexTo, value);
		}
		return 0;
	}

	private void DefineOutroParamento(String NowOption, String OptionFuture, int combobox) {
		int index1 = NowOption.lastIndexOf(" ");
		String option1 = NowOption.substring(index1 + 1);

		int index2 = OptionFuture.lastIndexOf(" ");
		String option2 = OptionFuture.substring(index2 + 1);

	
		if (!option1.equals(option2)) {

			if (combobox == 1) {
				if (option1.equals("[length]")) {
					mainPanel.getjComboBox2().setSelectedIndex(0);
				}
				if (option1.equals("[area]")) {
					mainPanel.getjComboBox2().setSelectedIndex(7);
				}
				if (option1.equals("[time]")) {
					mainPanel.getjComboBox2().setSelectedIndex(22);
				}
				if (option1.equals("[speed]")) {
					mainPanel.getjComboBox2().setSelectedIndex(27);
				}
			} 
			if (combobox == 2)  {

				if (option2.equals("[length]")) {
					mainPanel.getjComboBox1().setSelectedIndex(0);
				}
				if (option2.equals("[area]")) {
					mainPanel.getjComboBox1().setSelectedIndex(7);
				}
				if (option2.equals("[time]")) {
					mainPanel.getjComboBox1().setSelectedIndex(22);
				}
				if (option2.equals("[speed]")) {
					mainPanel.getjComboBox1().setSelectedIndex(27);
				}
			}
		}
		
		
		
		

	}

	private void bindItems(ActionListener listener, JMenu menu) {
		for (Component target : menu.getMenuComponents()) {
			if (target instanceof JMenuItem) {
				((JMenuItem) target).addActionListener(this);
			}
		}
	}

	private void bind_mainPanelComponents(ActionListener listener) {
		// ADD action listener in MainPanel Components // TextField and ComboBox
		try {
			for (Component target : mainPanel.getComponents()) {
				if (target instanceof JTextField) {
					((JTextField) target).addActionListener(this);
				} else if (target instanceof JComboBox) {
					((JComboBox) target).addActionListener(this);
				}
			}
		} catch (Exception e) {
			System.out.println("Error AddListener " + e);
		}
	}

	private void bindMenus() {
		for (Component target : this.getJMenuBar().getComponents()) {
			if (target instanceof JMenu) {
				bindItems(this, (JMenu) target);
			}
		}
	}

	private JMenu createCustomizedMenu(String label, char shortcut) {
		JMenu temp = new JMenu(label);
		temp.setMnemonic(shortcut);
		return (temp);
	}

	private JMenuItem createCustomizedMenuItem(String label, char shortcut) {
		JMenuItem temp = new JMenuItem(label);
		temp.setMnemonic(shortcut);
		return (temp);
	}

	void exitSystem() {
		System.exit(0);
	}

	void go() {
		this.setVisible(true);
	}

	void setStatus(String message) {
		statusLabel.setText(message);
	}

	private void setupExtraComponents() {
		setupStatusPanel();
		setupMainPanel();
		mainPanel.getInPut().addFocusListener(this);
		this.setFocusable(true);
	}

	private void setupMainPanel() {
		this.mainPanel = new MainPanel();
		this.mainPanel.setBackground(Color.lightGray);
		this.mainPanel.setBorder(BorderFactory.createEtchedBorder());
		this.add(mainPanel, BorderLayout.CENTER);
	}

	private void setupMenus() {
		menuFile = createCustomizedMenu("File", 'F');
		menuHelp = createCustomizedMenu("Help", 'H');

		menuItemExit = createCustomizedMenuItem("Exit", 'X');
		menuItemHelp = createCustomizedMenuItem("Help", 'L');
		menuItemDisclaimer = createCustomizedMenuItem("Disclaimer", 'D');
		menuItemAbout = createCustomizedMenuItem("About", 'A');

		// First menu
		menuFile.add(menuItemExit);
		// Last menu
		menuHelp.add(menuItemHelp);
		menuHelp.add(menuItemDisclaimer);
		menuHelp.addSeparator();
		menuHelp.add(menuItemAbout);

		// JMenuBar
		menuBar = new JMenuBar();
		menuBar.add(menuFile);
		menuBar.add(menuHelp);

		this.setJMenuBar(menuBar);
	}

	private void setupStatusPanel() {
		this.statusPanel = new JPanel();
		this.statusLabel = new JLabel();
		this.statusPanel.add(statusLabel);
		this.statusPanel.setBackground(Color.gray);
		this.statusPanel.setBorder(BorderFactory.createEtchedBorder());
		this.add(statusPanel, BorderLayout.SOUTH);
	}

	private void setupWindow() {
		this.setSize((940), (300));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout(2, 2));
		this.setResizable(false);
	}

	private void setupWindowsListener() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent windowEvent) {
				exitSystem();
			}
		});
	}

	public void focusGained(FocusEvent e) {
		mainPanel.getInPut().setText("");
	}

	public void focusLost(FocusEvent arg0) {
	}
}
