package Project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class LAdminCompany extends JFrame {

	private JPanel contentPane;
	private static JTable table;
	private JTextField textFieldName;
	private JTextField textFieldAddress;
	private JTextField textFieldPhone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					LAdminCompany frame = new LAdminCompany();
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
	public LAdminCompany() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1082, 605);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 100, 0));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(210, 105, 30)));
		panel.setBackground(new Color(250, 240, 230));
		panel.setBounds(0, 0, 1064, 558);
		contentPane.add(panel);
		panel.setLayout(null);;
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(210, 105, 30)));
		panel_2.setBackground(new Color(250, 240, 230));
		panel_2.setBounds(12, 146, 1040, 308);
		panel.add(panel_2);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblAddress.setBounds(396, 16, 255, 49);
		panel_2.add(lblAddress);
		
		JLabel lblPhone = new JLabel("Phone Number");
		lblPhone.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblPhone.setBounds(731, 16, 255, 49);
		panel_2.add(lblPhone);
		
		JLabel lblCompanyWebsite = new JLabel("Company Website");
		lblCompanyWebsite.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblCompanyWebsite.setBounds(47, 166, 255, 49);
		panel_2.add(lblCompanyWebsite);
		
		JButton btnNewButton = new JButton("https://www.instagram.com/rental_clothing_world/");
		btnNewButton.setBackground(new Color(250, 235, 215));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop browser = Desktop.getDesktop();
				//2.2 Exception Handling
				try {
					browser.browse(new URI("https://www.instagram.com/rental_clothing_world/"));
				}
				
				catch(IOException err) {
					
				}
				catch(URISyntaxException err) {
					
				}
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("DialogInput", Font.BOLD, 20));
		btnNewButton.setBounds(237, 176, 701, 25);
		panel_2.add(btnNewButton);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBackground(new Color(250, 235, 215));
		btnConfirm.setBounds(354, 241, 130, 59);
		panel_2.add(btnConfirm);
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//2.2 Exception handling
				try {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						textFieldName.getText(),	
						textFieldAddress.getText(),
						textFieldPhone.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "LDiscount Update confirmed", "LAdvertisement",
								JOptionPane.OK_OPTION);
					}
				}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right USER NAME and PASSWORD!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnConfirm.setFont(new Font("STZhongsong", Font.PLAIN, 20));
		
		JLabel lblCompanyName = new JLabel("Name");
		lblCompanyName.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblCompanyName.setBounds(98, 16, 255, 49);
		panel_2.add(lblCompanyName);
		
		textFieldName = new JTextField();
		textFieldName.setBackground(new Color(230, 230, 250));
		textFieldName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldName.setBounds(34, 75, 236, 40);
		panel_2.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setBackground(new Color(230, 230, 250));
		textFieldAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(354, 75, 255, 40);
		panel_2.add(textFieldAddress);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setBackground(new Color(230, 230, 250));
		textFieldPhone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldPhone.setColumns(10);
		textFieldPhone.setBounds(695, 75, 243, 40);
		panel_2.add(textFieldPhone);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(599, 243, 99, 55);
		panel_2.add(btnExit);
		btnExit.setBackground(new Color(250, 235, 215));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LLogin L = new LLogin();
				L.setModalExclusionType(null);
				L.setVisible(true);
				dispose();
			}
		});
		btnExit.setFont(new Font("STZhongsong", Font.BOLD, 20));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 467, 1030, 78);
		panel.add(scrollPane);
		
		//2.3 File IO
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 20));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Address", "Phone"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(210, 105, 30)));
		panel_1.setBackground(new Color(250, 240, 230));
		panel_1.setBounds(199, 56, 629, 72);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Company Background for LAdminCompany");
		lblNewLabel.setBackground(new Color(250, 240, 230));
		lblNewLabel.setFont(new Font("Script MT Bold", Font.BOLD, 30));
		lblNewLabel.setBounds(115, 16, 457, 46);
		panel_1.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1064, 26);
		panel.add(menuBar);
		
		JMenu mnProfile = new JMenu("Profile");
		mnProfile.setBackground(new Color(233, 150, 122));
		mnProfile.setForeground(Color.BLACK);
		mnProfile.setFont(new Font("SansSerif", Font.BOLD, 15));
		menuBar.add(mnProfile);
		
		JMenuItem mntmProfile = new JMenuItem("Profile");
		mntmProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LAdminCompany ACB = new LAdminCompany();
				ACB.setModalExclusionType(null);
				ACB.setVisible(true);
				dispose();
			}
		});
		mntmProfile.setForeground(Color.BLACK);
		mntmProfile.setFont(new Font("SansSerif", Font.PLAIN, 15));
		mnProfile.add(mntmProfile);
		
		JMenu mnAdvertise = new JMenu("LAdvertisement");
		mnAdvertise.setBackground(new Color(233, 150, 122));
		mnAdvertise.setForeground(Color.BLACK);
		mnAdvertise.setFont(new Font("SansSerif", Font.BOLD, 15));
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
		mntmAdvertise.setFont(new Font("SansSerif", Font.PLAIN, 15));
		mnAdvertise.add(mntmAdvertise);
		
		JMenu clothingInfo = new JMenu("Clothing Info");
		clothingInfo.setBackground(new Color(233, 150, 122));
		clothingInfo.setForeground(Color.BLACK);
		clothingInfo.setFont(new Font("SansSerif", Font.BOLD, 15));
		menuBar.add(clothingInfo);
		
		JMenuItem mntmCloth = new JMenuItem("Clothing Info");
		mntmCloth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LAdminInfo AVI = new LAdminInfo();
				AVI.setModalExclusionType(null);
				AVI.setVisible(true);
				dispose();
			}
		});
		mntmCloth.setFont(new Font("SansSerif", Font.PLAIN, 15));
		clothingInfo.add(mntmCloth);
		
		JMenu mnEmployee = new JMenu("LEmployee");
		mnEmployee.setBackground(new Color(233, 150, 122));
		mnEmployee.setForeground(Color.BLACK);
		mnEmployee.setFont(new Font("SansSerif", Font.BOLD, 15));
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
		mntnEmployee.setFont(new Font("SansSerif", Font.PLAIN, 15));
		mnEmployee.add(mntnEmployee);
		
		JMenu mnFinance = new JMenu("LFinance");
		mnFinance.setBackground(new Color(233, 150, 122));
		mnFinance.setForeground(Color.BLACK);
		mnFinance.setFont(new Font("SansSerif", Font.BOLD, 15));
		menuBar.add(mnFinance);
		
		JMenuItem mntmFinance = new JMenuItem("LFinance");
		mntmFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LFinance F = new LFinance();
				F.setModalExclusionType(null);
				F.setVisible(true);
				dispose();
			}
		});
		mntmFinance.setForeground(Color.BLACK);
		mntmFinance.setFont(new Font("SansSerif", Font.PLAIN, 15));
		mnFinance.add(mntmFinance);
	}
	public static void AddRowToJtable(Object[] dataRow) {
		DefaultTableModel model = (DefaultTableModel)getTable().getModel();
		model.addRow(dataRow);
	}

	public static JTable getTable() {
		return table;
	}

	public static void setTable(JTable table) {
		LAdminCompany.table = table;
	}
}
