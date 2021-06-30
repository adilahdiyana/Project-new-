package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class LcustomerClothType extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldQuantity;
	private JTextField textFieldprice;
	public JComboBox<String> comboBoxBrand;
	private String brand;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					LcustomerClothType frame = new LcustomerClothType();
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
	public LcustomerClothType() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1061, 714);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(210, 105, 30)));
		panel.setBackground(new Color(250, 240, 230));
		panel.setBounds(0, 0, 1049, 667);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(250, 235, 215));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LLogin L = new LLogin();
				L.setModalExclusionType(null);
				L.setVisible(true);
				dispose();
			}
		});
		btnExit.setFont(new Font("STZhongsong", Font.PLAIN, 20));
		btnExit.setBounds(471, 532, 101, 59);
		panel.add(btnExit);

		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(210, 105, 30)));
		panel_1.setBackground(new Color(250, 240, 230));
		panel_1.setBounds(126, 36, 799, 113);
		panel.add(panel_1);
		
		JLabel lbTypeVLabel = new JLabel("Information of Cloth");
		lbTypeVLabel.setFont(new Font("Script MT Bold", Font.BOLD, 40));
		lbTypeVLabel.setBounds(156, 13, 491, 87);
		panel_1.add(lbTypeVLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(210, 105, 30)));
		panel_3.setBackground(new Color(250, 240, 230));
		panel_3.setBounds(211, 197, 571, 288);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblType_1 = new JLabel("Type");
		lblType_1.setFont(new Font("STXinwei", Font.BOLD, 30));
		lblType_1.setBounds(12, 23, 144, 42);
		panel_3.add(lblType_1);
		
		JLabel lblBrand = new JLabel("Brand");
		lblBrand.setFont(new Font("STXinwei", Font.BOLD, 30));
		lblBrand.setBounds(12, 93, 266, 42);
		panel_3.add(lblBrand);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("STXinwei", Font.BOLD, 30));
		lblQuantity.setBounds(12, 149, 207, 42);
		panel_3.add(lblQuantity);
		
		JLabel lblPricedayrm = new JLabel("Price/day(RM)");
		lblPricedayrm.setFont(new Font("STXinwei", Font.BOLD, 30));
		lblPricedayrm.setBounds(12, 208, 224, 42);
		panel_3.add(lblPricedayrm);
		
		JComboBox comboBoxType = new JComboBox();
		comboBoxType.setBackground(new Color(255, 192, 203));
		comboBoxType.setModel(new DefaultComboBoxModel(new String[] {"Select ", "Fashion Modern", "Traditional Customs", "Dinner Dress"}));
		comboBoxType.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JTable t = LAdminInfo.getTable();
				//comboBoxBrand.removeAllItems();
				//comboBoxBrand.setSelectedItem(null);
				if(comboBoxType.getSelectedItem().equals("Fashion Modern")) {
					//comboBoxBrand.removeAllItems();
					//comboBoxBrand.setSelectedItem(null);
					comboBoxBrand.addItem("NIKE, ZARA");
					comboBoxBrand.addItem("GUCCI, PRADA");
					comboBoxBrand.addItem("MONCLER, VERSACE");
					
					comboBoxBrand.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							String quantity,price;
								for(int i=0; i<t.getRowCount(); i++) {
									if(comboBoxBrand.getSelectedItem().equals(t.getValueAt(i, 1))) {
										quantity = String.valueOf(t.getValueAt(i, 2));
										price = String.valueOf(t.getValueAt(i, 3));
										textFieldQuantity.setText(quantity);
										textFieldprice.setText(price);
									}
								}
						}
					});
				}
				
						else 
							if(comboBoxType.getSelectedItem().equals("Traditional Customs")) {
								//comboBoxBrand.removeAllItems();
								//comboBoxBrand.setSelectedItem(null);
								comboBoxBrand.addItem("Kilts, Tracht");
								comboBoxBrand.addItem("Gho, Radition");
								comboBoxBrand.addItem("Mezcal, Organic");
								
								comboBoxBrand.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										String quantity,price;
										//comboBoxModel.removeAllItems();
											for(int i=0; i<t.getRowCount(); i++) {
												if(comboBoxBrand.getSelectedItem().equals(t.getValueAt(i, 1))) {
													quantity = String.valueOf(t.getValueAt(i, 2));
													price = String.valueOf(t.getValueAt(i, 3));
													textFieldQuantity.setText(quantity);
													textFieldprice.setText(price);
												} 
											}
									}
								});
						}
				
								else 
									/*if(comboBoxType.getSelectedItem().equals("Dinner Dress))*/ {
										//comboBoxBrand.removeAllItems();
										//comboBoxBrand.setSelectedItem(null);
										comboBoxBrand.addItem("Frozen, Roll");
										comboBoxBrand.addItem("Viltage, Francy");
										comboBoxBrand.addItem("Novia, De Polaris");
										
										comboBoxBrand.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												//JTable t = ClothingInfo.getTable();
												String quantity,price;
													for(int i=0; i<t.getRowCount(); i++) {
														if(comboBoxBrand.getSelectedItem().equals(t.getValueAt(i, 1))) {
															quantity = String.valueOf(t.getValueAt(i, 2));
															price = String.valueOf(t.getValueAt(i, 3));
															textFieldQuantity.setText(quantity);
															textFieldprice.setText(price);
														}
													}
											}
										});
									}
			}
			
		});
		comboBoxType.setFont(new Font("STXinwei", Font.PLAIN, 20));
		comboBoxType.setBounds(279, 30, 280, 48);
		panel_3.add(comboBoxType);
		
		comboBoxBrand = new JComboBox();
		comboBoxBrand.setBackground(new Color(255, 192, 203));
		comboBoxBrand.setFont(new Font("Tahoma", Font.PLAIN, 30));
		comboBoxBrand.setBounds(279, 99, 280, 36);
		panel_3.add(comboBoxBrand);
		
		textFieldQuantity = new JTextField();
		textFieldQuantity.setBackground(new Color(230, 230, 250));
		textFieldQuantity.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldQuantity.setBounds(280, 151, 279, 40);
		panel_3.add(textFieldQuantity);
		textFieldQuantity.setColumns(10);
		
		textFieldprice = new JTextField();
		textFieldprice.setBackground(new Color(230, 230, 250));
		textFieldprice.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldprice.setColumns(10);
		textFieldprice.setBounds(279, 210, 280, 40);
		panel_3.add(textFieldprice);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(250, 240, 230));
		lblNewLabel_1.setBounds(-1, 36, 1050, 631);
		panel.add(lblNewLabel_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(-4, 0, 1053, 36);
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
		mnNewMenu.setBackground(Color.WHITE);
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Clothing Info");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LcustomerClothType CVT = new LcustomerClothType();
				CVT.setModalExclusionType(null);
				CVT.setVisible(true);
				dispose();
			}
		});
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
	}
}
