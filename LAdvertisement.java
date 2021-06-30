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

public class LAdvertisement extends JFrame {

	private JPanel contentPane;
	public static JTable table;
	private JTextField textFieldDiscount;
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
					LAdvertisement frame = new LAdvertisement();
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
	public LAdvertisement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1065, 689);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 240, 230));
		panel.setBounds(0, 0, 1047, 340);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads//sales.jpg"));
		lblNewLabel.setBounds(337, 151, 468, 145);
		panel.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1047, 26);
		panel.add(menuBar);
		
		JMenu mnProfile = new JMenu("Profile");
		mnProfile.setForeground(Color.BLACK);
		mnProfile.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnProfile);
		
		JMenuItem mntmProfile = new JMenuItem("Profile");
		mntmProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LAdminCompany AC = new LAdminCompany();
				AC.setModalExclusionType(null);
				AC.setVisible(true);
				dispose();
			}
		});
		mntmProfile.setForeground(Color.BLACK);
		mntmProfile.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnProfile.add(mntmProfile);
		
		JMenu mnAdvertise = new JMenu("LAdvertisement");
		mnAdvertise.setForeground(Color.BLACK);
		mnAdvertise.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnAdvertise);
		
		JMenuItem mntmAdvertise = new JMenuItem("LAdvertisement");
		mntmAdvertise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LAdvertisement A = new LAdvertisement();
				A.setModalExclusionType(null);
				A.setVisible(true);
				dispose();
			}
		});
		mntmAdvertise.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnAdvertise.add(mntmAdvertise);
		
		JMenu mncloth = new JMenu("Clothing Info");
		mncloth.setForeground(Color.BLACK);
		mncloth.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mncloth);
		
		JMenuItem cloth = new JMenuItem("Clothing Info");
		cloth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LAdminInfo AI = new LAdminInfo();
				AI.setModalExclusionType(null);
				AI.setVisible(true);
				dispose();
			}
		});
		cloth.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mncloth.add(cloth);
		
		JMenu mnEmployee = new JMenu("LEmployee");
		mnEmployee.setForeground(Color.BLACK);
		mnEmployee.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnEmployee);
		
		JMenuItem mntnEmployee = new JMenuItem("LEmployee");
		mntnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LEmployee E = new LEmployee();
				E.setModalExclusionType(null);
				E.setVisible(true);
				dispose();
			}
		});
		mntnEmployee.setForeground(Color.BLACK);
		mntnEmployee.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnEmployee.add(mntnEmployee);
		
		JMenu mnFinance = new JMenu("LFinance");
		mnFinance.setForeground(Color.BLACK);
		mnFinance.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnFinance);
		
		JMenuItem mntmFinance = new JMenuItem("LFinance");
		mntmFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LFinance F = new LFinance();
				F.setModalExclusionType(null);
				F.setVisible(true);
				dispose();
			}
		});
		mntmFinance.setForeground(Color.BLACK);
		mntmFinance.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnFinance.add(mntmFinance);
		
		textFieldName = new JTextField();
		textFieldName.setBackground(new Color(250, 235, 215));
		textFieldName.setHorizontalAlignment(SwingConstants.CENTER);
		JTable t = LAdminCompany.getTable();
		String n="";

				for(int i = 0; i<t.getRowCount(); i++) { 
				n= String.valueOf(t.getValueAt(i, 0));}
				textFieldName.setText(n);
		textFieldName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		textFieldName.setBounds(247, 36, 558, 84);
		panel.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblwelcome = new JLabel("Hi our beloved customer!");
		lblwelcome.setBounds(382, 285, 449, 55);
		panel.add(lblwelcome);
		lblwelcome.setFont(new Font("STXinwei", Font.PLAIN, 28));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(250, 240, 230));
		panel_1.setBounds(0, 387, 1047, 255);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\traditional.jpg"));
		lblNewLabel_2.setBounds(352, 10, 398, 178);
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
		btnForMoreInformation.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnForMoreInformation.setBounds(0, 230, 1047, 25);
		panel_1.add(btnForMoreInformation);
		
		JLabel lblLowestPriceRm = new JLabel("Go to our website to get more informations and discounts :)");
		lblLowestPriceRm.setForeground(new Color(0, 0, 0));
		lblLowestPriceRm.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblLowestPriceRm.setBounds(233, 195, 581, 25);
		panel_1.add(lblLowestPriceRm);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(250, 235, 215));
		btnExit.setBounds(939, 176, 101, 44);
		panel_1.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LLogin L = new LLogin();
				L.setModalExclusionType(null);
				L.setVisible(true);
				dispose();
			}
		});
		btnExit.setFont(new Font("STZhongsong", Font.BOLD, 20));
		
		
		JLabel lblDiscount = new JLabel("LDiscount");
		lblDiscount.setBounds(961, 83, 101, 33);
		panel_1.add(lblDiscount);
		lblDiscount.setFont(new Font("STXinwei", Font.PLAIN, 20));
		
		textFieldDiscount = new JTextField();
		textFieldDiscount.setBackground(new Color(230, 230, 250));
		textFieldDiscount.setBounds(973, 117, 67, 38);
		panel_1.add(textFieldDiscount);
		textFieldDiscount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldDiscount.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(961, 102, 10, 14);
		panel_1.add(scrollPane);
		//2.3 File IO
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 20));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"LDiscount"
			}
		));
		scrollPane.setViewportView(table);
		
		
		JButton confirm = new JButton("Confirm");
		confirm.setBackground(new Color(250, 235, 215));
		confirm.setBounds(918, 39, 119, 44);
		panel_1.add(confirm);
		confirm.setFont(new Font("STZhongsong", Font.PLAIN, 20));
		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//2.2 Exception handling
				try {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						textFieldDiscount.getText(),	
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "LDiscount confirm updated!", "LAdvertisement",
								JOptionPane.OK_OPTION);
					}
				}
				textFieldDis.setText(textFieldDiscount.getText());
				
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
			
		});
		confirm.setBounds(822, 177, 119, 44);
		panel_1.add(confirm);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(250, 240, 230));
		panel_2.setBounds(0, 338, 1047, 50);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Our company will give off discounts for who rent 3 clothes and above for one a week!");
		lblNewLabel_1.setBounds(92, 10, 901, 25);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		
		textFieldDis = new JTextField();
		textFieldDis.setBounds(939, 10, 40, 30);
		panel_2.add(textFieldDis);
		textFieldDis.setBackground(new Color(230, 230, 250));
		textFieldDis.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 25));
		textFieldDis.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("%");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(989, 19, 45, 13);
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
