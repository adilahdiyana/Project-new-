package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class LCustomerAdvertisement extends JFrame {

	private static JTable table;
	private JPanel contentPane;
	private JTextField textFieldDis;
	private JTextField textFieldName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					LCustomerAdvertisement frame = new LCustomerAdvertisement();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LCustomerAdvertisement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1065, 689);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 250, 250));
		panel.setBounds(0, 0, 1047, 340);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\sales.jpg"));
		lblNewLabel.setBounds(260, 128, 465, 171);
		panel.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1047, 36);
		panel.add(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("Profile");
		mnNewMenu_1.setForeground(Color.BLACK);
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Profile");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LCompanyBackground CB = new LCompanyBackground();
				CB.setModalExclusionType(null);
				CB.setVisible(true);
				dispose();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu = new JMenu("Clothing Info");
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnNewMenu.setBackground(Color.WHITE);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Clothing Info");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LcustomerClothType CVT = new LcustomerClothType();
				CVT.setModalExclusionType(null);
				CVT.setVisible(true);
				dispose();
			}
		});
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnAdvertisement = new JMenu("LAdvertisement");
		mnAdvertisement.setForeground(Color.BLACK);
		mnAdvertisement.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnAdvertisement);
		
		JMenuItem mntmAdvertisement = new JMenuItem("LAdvertisement");
		mntmAdvertisement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LCustomerAdvertisement CA = new LCustomerAdvertisement();
				CA.setModalExclusionType(null);
				CA.setVisible(true);
				dispose();
			}
		});
		mntmAdvertisement.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnAdvertisement.add(mntmAdvertisement);
		
		JMenu mnRegistration = new JMenu("Registration");
		mnRegistration.setForeground(Color.BLACK);
		mnRegistration.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnRegistration);
		
		JMenuItem mntmRegistration = new JMenuItem("Registration");
		mntmRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LCustomerRegistration CR = new LCustomerRegistration();
				CR.setModalExclusionType(null);
				CR.setVisible(true);
				dispose();
			}
		});
		mntmRegistration.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnRegistration.add(mntmRegistration);
		
		textFieldName = new JTextField();
		textFieldName.setBackground(new Color(250, 240, 230));
		textFieldName.setHorizontalAlignment(SwingConstants.CENTER);
		JTable t = LAdminCompany.getTable();
		String n="";

				for(int i = 0; i<t.getRowCount(); i++) { 
				n= String.valueOf(t.getValueAt(i, 0));}
				textFieldName.setText(n);
		textFieldName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		textFieldName.setBounds(223, 36, 522, 59);
		panel.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblWelcome = new JLabel("Hi our beloved customer!");
		lblWelcome.setBounds(357, 295, 449, 55);
		panel.add(lblWelcome);
		lblWelcome.setFont(new Font("STXinwei", Font.PLAIN, 25));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(250, 240, 230));
		panel_1.setBounds(0, 387, 1047, 255);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\traditional.jpg"));
		lblNewLabel_2.setBounds(330, 10, 321, 189);
		panel_1.add(lblNewLabel_2);
		
		JButton btnForMoreInformation = new JButton("https://www.instagram.com/rental_clothing_world");
		btnForMoreInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop browser = Desktop.getDesktop();
				//2.2 Exception Handling
				try {
					browser.browse(new URI("https://www.instagram.com/rental_clothing_world"));
				}
				
				catch(IOException err) {
					
				}
				catch(URISyntaxException err) {
					
				}
			}
		});
		btnForMoreInformation.setBackground(new Color(250, 235, 215));
		btnForMoreInformation.setFont(new Font("STXinwei", Font.PLAIN, 17));
		btnForMoreInformation.setBounds(0, 230, 1047, 25);
		panel_1.add(btnForMoreInformation);
		
		JLabel lblLogotowebsite = new JLabel("Go to our website to get more informations and discounts :)");
		lblLogotowebsite.setForeground(new Color(0, 0, 0));
		lblLogotowebsite.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
		lblLogotowebsite.setBounds(306, 195, 481, 25);
		panel_1.add(lblLogotowebsite);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(250, 235, 215));
		btnExit.setBounds(936, 161, 101, 59);
		panel_1.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LLogin L = new LLogin();
				L.setModalExclusionType(null);
				L.setVisible(true);
				dispose();
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(250, 240, 230));
		panel_2.setBounds(0, 338, 1047, 50);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Our company will give off discounts for who rent 3 clothes and above for one a week!");
		lblNewLabel_1.setBounds(121, 13, 766, 25);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		
		textFieldDis = new JTextField();
		JTable t1 = LAdvertisement.getTable();
		String discount="";

				for(int i = 0; i<t1.getRowCount(); i++) { 
				discount= String.valueOf(t1.getValueAt(i, 0));}
				textFieldDis.setText(discount);
				
		textFieldDis.setBackground(new Color(230, 230, 250));
		textFieldDis.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 25));
		textFieldDis.setBounds(842, 5, 50, 38);
		panel_2.add(textFieldDis);
		textFieldDis.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("%");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(897, 22, 45, 13);
		panel_2.add(lblNewLabel_3);
	}
	
	public static void AddRowToJtable(Object[] dataRow) {
		DefaultTableModel model = (DefaultTableModel)getTable().getModel();
		model.addRow(dataRow);
	}

	public static JTable getTable() {
		return table;
	}

	public static void setTable(JTable table) {
		LAdvertisement.table = table;
	}
}
