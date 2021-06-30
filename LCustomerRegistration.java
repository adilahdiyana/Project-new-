package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class LCustomerRegistration extends JFrame {

	private JPanel contentPane;
	private static JTable table;
	private JTable model;
	private JTextField textFieldName;
	private JTextField textFieldAge;
	private JTextField textFieldAddress;
	private JTextField textFieldPhoneNume;
	private JTextField textFieldPrice;
	private JTextField textFieldAmount;
	private JTextField textFieldDay;
	private JTextField textFieldTotAmount;
	private JFrame frame;
	protected double total;
	private static JTable tablesales;
	private JTextField textFieldPlate;
	private JTextField textFieldQuantity;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					LCustomerRegistration frame = new LCustomerRegistration();
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
	public LCustomerRegistration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 866);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 240, 230));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(210, 105, 30)));
		panel.setBounds(0, 0, 975, 819);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(250, 240, 230));
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(210, 105, 30)));
		panel_1.setBounds(44, 128, 879, 396);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblName.setBounds(12, 13, 126, 37);
		panel_1.add(lblName);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblGender.setBounds(12, 54, 126, 37);
		panel_1.add(lblGender);
		
		JLabel lblPhoneNum = new JLabel("Phone Number");
		lblPhoneNum.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblPhoneNum.setBounds(12, 190, 173, 37);
		panel_1.add(lblPhoneNum);
		
		JLabel lblTypeOfCloth = new JLabel("Type of cloth");
		lblTypeOfCloth.setBackground(new Color(240, 240, 240));
		lblTypeOfCloth.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblTypeOfCloth.setBounds(12, 230, 158, 37);
		panel_1.add(lblTypeOfCloth);
		
		JLabel lblBrand = new JLabel("Brand");
		lblBrand.setBackground(new Color(240, 240, 240));
		lblBrand.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblBrand.setBounds(465, 13, 126, 37);
		panel_1.add(lblBrand);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblQuantity.setBounds(465, 54, 126, 37);
		panel_1.add(lblQuantity);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblAddress.setBounds(12, 146, 126, 37);
		panel_1.add(lblAddress);
		
		textFieldName = new JTextField();
		textFieldName.setBackground(new Color(230, 230, 250));
		textFieldName.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldName.setBounds(195, 13, 189, 37);
		panel_1.add(textFieldName);
		textFieldName.setColumns(10);
		
		JComboBox ComboBoxGender = new JComboBox();
		ComboBoxGender.setBackground(new Color(255, 192, 203));
		ComboBoxGender.setFont(new Font("STXinwei", Font.PLAIN, 20));
		ComboBoxGender.setModel(new DefaultComboBoxModel(new String[] {"Select", "Male", "Female"}));
		ComboBoxGender.setBounds(195, 54, 189, 31);
		panel_1.add(ComboBoxGender);
		
		textFieldAge = new JTextField();
		textFieldAge.setBackground(new Color(230, 230, 250));
		textFieldAge.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldAge.setColumns(10);
		textFieldAge.setBounds(195, 101, 189, 37);
		panel_1.add(textFieldAge);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setBackground(new Color(230, 230, 250));
		textFieldAddress.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(195, 145, 189, 37);
		panel_1.add(textFieldAddress);
		
		textFieldPhoneNume = new JTextField();
		textFieldPhoneNume.setBackground(new Color(230, 230, 250));
		textFieldPhoneNume.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldPhoneNume.setColumns(10);
		textFieldPhoneNume.setBounds(195, 190, 189, 37);
		panel_1.add(textFieldPhoneNume);
		
		JComboBox comboBoxBrand = new JComboBox();
		comboBoxBrand.setBackground(new Color(255, 192, 203));
		comboBoxBrand.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		comboBoxBrand.setBounds(648, 19, 189, 27);
		panel_1.add(comboBoxBrand);
		
		JComboBox comboBoxTypeCloth = new JComboBox();
		comboBoxTypeCloth.setBackground(new Color(255, 192, 203));
		comboBoxTypeCloth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxTypeCloth.getSelectedItem().equals("Fashion Modern")) {
					comboBoxBrand.removeAllItems();
					comboBoxBrand.setSelectedItem(null);
					comboBoxBrand.addItem("NIKE, ZARA");
					comboBoxBrand.addItem("GUCCI, PRADA");
					comboBoxBrand.addItem("MONCLER, VERSACE");
				}
				
				else 
					if(comboBoxTypeCloth.getSelectedItem().equals("Traditional Customs")) {
						comboBoxBrand.removeAllItems();
						comboBoxBrand.setSelectedItem(null);
						comboBoxBrand.addItem("Kilts, Tracht");
						comboBoxBrand.addItem("Gho, Radition");
						comboBoxBrand.addItem("Mezcal, Organic");				}
				
					else 
						if(comboBoxTypeCloth.getSelectedItem().equals("Dinner Dress")) {
							comboBoxBrand.removeAllItems();
							comboBoxBrand.setSelectedItem(null);
							comboBoxBrand.addItem("Frozen, Roll");
							comboBoxBrand.addItem("Viltage, Francy");
							comboBoxBrand.addItem("Novia, De Polaris");
							
					}
			}
		});
		comboBoxTypeCloth.setModel(new DefaultComboBoxModel(new String[] {"Select", "Fashion Modern", "Traditional Customs", "Dinner Dress"}));
		comboBoxTypeCloth.setFont(new Font("STXinwei", Font.PLAIN, 20));
		comboBoxTypeCloth.setBounds(195, 240, 189, 27);
		panel_1.add(comboBoxTypeCloth);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setBackground(new Color(230, 230, 250));
		textFieldPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldPrice.setColumns(10);
		textFieldPrice.setBounds(648, 148, 189, 37);
		panel_1.add(textFieldPrice);
		
		textFieldAmount = new JTextField();
		textFieldAmount.setBackground(new Color(230, 230, 250));
		textFieldAmount.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldAmount.setColumns(10);
		textFieldAmount.setBounds(648, 197, 189, 37);
		panel_1.add(textFieldAmount);
		
		textFieldDay = new JTextField();
		textFieldDay.setBackground(new Color(230, 230, 250));
		textFieldDay.setBounds(648, 101, 189, 37);
		panel_1.add(textFieldDay);
		textFieldDay.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldDay.setColumns(10);
		
		JLabel lblAmountrm = new JLabel("Amount (RM)");
		lblAmountrm.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblAmountrm.setBounds(465, 197, 158, 37);
		panel_1.add(lblAmountrm);
		
		textFieldTotAmount = new JTextField();
		textFieldTotAmount.setBackground(new Color(230, 230, 250));
		textFieldTotAmount.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldTotAmount.setColumns(10);
		textFieldTotAmount.setBounds(728, 257, 106, 37);
		panel_1.add(textFieldTotAmount);
		
		JButton btnTotalAmountrm = new JButton("Total Amount (RM)");
		btnTotalAmountrm.setBackground(new Color(250, 235, 215));
		btnTotalAmountrm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
			    // iterate over all columns
			    for (int i = 0 ; i < model.getRowCount() ; i++) {
			        // null or not Integer will throw exception
			        String s = String.valueOf(model.getValueAt(i, 11)); 
			        total += Double.parseDouble(s);
			    } 
			    String result=String.valueOf(total);  
				textFieldTotAmount.setText(result); 
				
				DefaultTableModel model1 = (DefaultTableModel)getTablesales().getModel();
				model1.addRow(new Object[]{
						textFieldTotAmount.getText(),
				});
			}
		});
		
		btnTotalAmountrm.setBounds(457, 258, 261, 37);
		panel_1.add(btnTotalAmountrm);
		btnTotalAmountrm.setFont(new Font("STZhongsong", Font.BOLD, 20));
		
		JLabel lblDay = new JLabel("Day");
		lblDay.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblDay.setBounds(465, 103, 126, 37);
		panel_1.add(lblDay);
		
		
		JLabel lblPricedayrm = new JLabel("Price/day (RM)");
		lblPricedayrm.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblPricedayrm.setBounds(465, 150, 171, 37);
		panel_1.add(lblPricedayrm);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(12, 101, 126, 37);
		panel_1.add(lblAge);
		lblAge.setFont(new Font("STXinwei", Font.BOLD, 20));
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.setBounds(485, 317, 189, 37);
		panel_1.add(btnNewButton);
		btnNewButton.setBackground(new Color(250, 235, 215));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int day = 0;
				double price=0;
				double amount;
				double discount;
				String selection = (String)comboBoxTypeCloth.getSelectedItem();
				String choose = (String)comboBoxBrand.getSelectedItem();
				
				day = Integer.parseInt(textFieldDay.getText());
				//2.2 Exception handling
				try {
				if (selection.equals("Fashion Modern")) {
					
					if (choose.equals("NIKE, ZARA")){
						  
						  if (day <= 10) {
							  LPayment NIKE = new LtotalRentPrice();
							  price = NIKE.Rentprice(selection, choose,day);
							  textFieldPrice.setText(Double.toString(price));
							  amount = NIKE.getPayment(selection, choose, day);
							  textFieldAmount.setText(Double.toString(amount));}
						  
						  else {
							    LPayment NIKE = new LtotalRentPrice();
							    discount = NIKE.discount();
							    price = NIKE.Rentprice(selection, choose, day);
							    textFieldPrice.setText(Double.toString(price));
								amount = NIKE.getPayment(selection, choose, day, discount);
							    textFieldAmount.setText(Double.toString(amount));}
					}
					
							if (choose.equals("GUCCI, PRADA")){
								  
								  if (day <=7) {
									  LPayment PRADA = new LtotalRentPrice();
									  price = PRADA.Rentprice(selection, choose, day);
									  textFieldPrice.setText(Double.toString(price));
									  amount = PRADA.getPayment(selection, choose, day);
									  textFieldAmount.setText(Double.toString(amount));}
								  
								  else {
									    LPayment PRADA = new LtotalRentPrice();
									    discount = PRADA.discount();
									    price = PRADA.Rentprice(selection, choose, day);
									    textFieldPrice.setText(Double.toString(price));
										amount = PRADA.getPayment(selection, choose, day, discount);
									    textFieldAmount.setText(Double.toString(amount));}
							}
					
									if (choose.equals("MONCLER, VERSACE")){
										  
										  if (day <= 7) {
											  LPayment MONCLER = new LtotalRentPrice();
											  price = MONCLER.Rentprice(selection, choose, day);
											  textFieldPrice.setText(Double.toString(price));
											  amount = MONCLER.getPayment(selection, choose, day);
											  textFieldAmount.setText(Double.toString(amount));}
										  
										  else {
											    LPayment MONCLER = new LtotalRentPrice();
											    discount = MONCLER.discount();
											    price = MONCLER.Rentprice(selection, choose, day);
											    textFieldPrice.setText(Double.toString(price));
												amount = MONCLER.getPayment(selection, choose, day, discount);
											    textFieldAmount.setText(Double.toString(amount));}
									}
				}//end of Fashion Modern
									
									if (selection.equals("Traditional Customs")) {
										
										if (choose.equals("Kilts, Tracht")){
											  
											  if (day<=7) {
												  LPayment Kilts = new LtotalRentPrice();
												  price = Kilts.Rentprice(selection, choose, day);
												  textFieldPrice.setText(Double.toString(price));
												  amount = Kilts.getPayment(selection, choose, day);
												  textFieldAmount.setText(Double.toString(amount));}
											  
											  else {
												    LPayment Kilts = new LtotalRentPrice();
												    discount = Kilts.discount();
												    price = Kilts.Rentprice(selection, choose, day);
												    textFieldPrice.setText(Double.toString(price));
													amount = Kilts.getPayment(selection, choose, day, discount);
												    textFieldAmount.setText(Double.toString(amount));}
										}
										
												if (choose.equals("Gho, Radition")){
													  
													  if (day<=7) {
														  LPayment Gho = new LtotalRentPrice();
														  price = Gho.Rentprice(selection, choose, day);
														  textFieldPrice.setText(Double.toString(price));
														  amount = Gho.getPayment(selection, choose, day);
														  textFieldAmount.setText(Double.toString(amount));}
													  
													  else {
														    LPayment Gho = new LtotalRentPrice();
														    discount = Gho.discount();
														    price = Gho.Rentprice(selection, choose, day);
														    textFieldPrice.setText(Double.toString(price));
															amount = Gho.getPayment(selection, choose, day, discount);
														    textFieldAmount.setText(Double.toString(amount));}
												}
										
														if (choose.equals("Mezcal, Organic")){
															  
															  if (day<=7) {
																  LPayment Organic = new LtotalRentPrice();
																  price = Organic.Rentprice(selection, choose, day);
																  textFieldPrice.setText(Double.toString(price));
																  amount = Organic.getPayment(selection, choose, day);
																  textFieldAmount.setText(Double.toString(amount));}
															  
															  else {
																    LPayment Organic = new LtotalRentPrice();
																    discount = Organic.discount();
																    price = Organic.Rentprice(selection, choose, day);
																    textFieldPrice.setText(Double.toString(price));
																	amount = Organic.getPayment(selection, choose, day, discount);
																    textFieldAmount.setText(Double.toString(amount));}
														}

									}//end of Traditional Customs
									
												if (selection.equals("Dinner Dress")) {
													
													if (choose.equals("Frozen, Roll")){
														  
														  if (day<=7) {
															  LPayment Roll = new LtotalRentPrice();
															  price = Roll.Rentprice(selection, choose, day);
															  textFieldPrice.setText(Double.toString(price));
															  amount = Roll.getPayment(selection, choose, day);
															  textFieldAmount.setText(Double.toString(amount));}
														  
														  else {
															    LPayment Roll = new LtotalRentPrice();
															    discount = Roll.discount();
															    price = Roll.Rentprice(selection, choose, day);
															    textFieldPrice.setText(Double.toString(price));
																amount = Roll.getPayment(selection, choose, day, discount);
															    textFieldAmount.setText(Double.toString(amount));}
													}
													
															if (choose.equals("Viltage, Francy")){
																  
																  if (day<=7) {
																	  LPayment Francy = new LtotalRentPrice();
																	  price = Francy.Rentprice(selection, choose, day);
																	  textFieldPrice.setText(Double.toString(price));
																	  amount = Francy.getPayment(selection, choose, day);
																	  textFieldAmount.setText(Double.toString(amount));}
																  
																  else {
																	    LPayment Francy = new LtotalRentPrice();
																	    discount = Francy.discount();
																	    price = Francy.Rentprice(selection, choose, day);
																	    textFieldPrice.setText(Double.toString(price));
																		amount = Francy.getPayment(selection, choose,day, discount);
																	    textFieldAmount.setText(Double.toString(amount));}
															}
													
																	if (choose.equals("Movia, De Polaris")){
																		  
																		  if (day<=7) {
																			  LPayment Movia = new LtotalRentPrice();
																			  price = Movia.Rentprice(selection, choose, day);
																			  textFieldPrice.setText(Double.toString(price));
																			  amount = Movia.getPayment(selection, choose, day);
																			  textFieldAmount.setText(Double.toString(amount));}
																		  
																		  else {
																			    LPayment Movia = new LtotalRentPrice();
																			    discount = Movia.discount();
																			    price = Movia.Rentprice(selection, choose, day);
																			    textFieldPrice.setText(Double.toString(price));
																				amount = Movia.getPayment(selection, choose, day, discount);
																			    textFieldAmount.setText(Double.toString(amount));}
																	}
			
												}//end of Dinner Dress
												JTable t = LAdminInfo.getTable();
												String quantity="";
												for(int i = 0; i<t.getRowCount(); i++) { 
													if (selection.equals(t.getValueAt(i, 0))&&choose.equals(t.getValueAt(i, 1))) {
													quantity= String.valueOf(t.getValueAt(i, 2));}
													}
												textFieldQuantity.setText(quantity);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter your right username and password!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
			
		});
		btnNewButton.setFont(new Font("STZhongsong", Font.BOLD, 20));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(250, 240, 230));
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(210, 105, 30)));
		panel_2.setBounds(223, 37, 646, 81);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(465, 278, 17, 15);
		panel_1.add(scrollPane_1);
		
		textFieldQuantity = new JTextField();
		textFieldQuantity.setBackground(new Color(230, 230, 250));
		textFieldQuantity.setBounds(648, 65, 189, 26);
		panel_1.add(textFieldQuantity);
		textFieldQuantity.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Customer Registration");
		lblNewLabel.setFont(new Font("Script MT Bold", Font.BOLD, 40));
		lblNewLabel.setBounds(93, 0, 585, 74);
		panel_2.add(lblNewLabel);
		
		JButton btnExit_1 = new JButton("Exit");
		btnExit_1.setBackground(new Color(250, 235, 215));
		btnExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LLogin L = new LLogin();
				L.setModalExclusionType(null);
				L.setVisible(true);
				dispose();
			}
		});
		btnExit_1.setFont(new Font("STZhongsong", Font.PLAIN, 20));
		btnExit_1.setBounds(850, 718, 75, 59);
		panel.add(btnExit_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1282, 36);
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
				LcustomerClothType CCT = new LcustomerClothType();
				CCT.setModalExclusionType(null);
				CCT.setVisible(true);
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(44, 539, 879, 165);
		panel.add(scrollPane);
		
		//2.3 File IO
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 10));
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int i = table.getSelectedRow();
				if(i>=0) {
					textFieldName.setText(model.getValueAt(i,0).toString());
					ComboBoxGender.setSelectedItem(model.getValueAt(i,1).toString());
					textFieldAge.setText(model.getValueAt(i,2).toString());
					textFieldAddress.setText(model.getValueAt(i,3).toString());
					textFieldPhoneNume.setText(model.getValueAt(i,4).toString());
					comboBoxTypeCloth.setSelectedItem(model.getValueAt(i,5).toString());
					comboBoxBrand.setSelectedItem(model.getValueAt(i,6).toString());  
					textFieldDay.setText(model.getValueAt(i,7).toString());
					textFieldQuantity.setText(model.getValueAt(i,8).toString());
					textFieldPrice.setText(model.getValueAt(i,9).toString());
					textFieldAmount.setText(model.getValueAt(i,10).toString());
					
					JOptionPane.showMessageDialog(null, "Update Successfully!");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please select a row first!");
				}
				
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Gender", "Age", "Address", "Phone Number", "Type", "Brand", "Day", "Quantity", "Price/day(RM)", "Amount(RM)"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("Add Record");
		btnNewButton_1.setBackground(new Color(250, 235, 215));
		btnNewButton_1.setBounds(313, 720, 152, 55);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						textFieldName.getText(),
						ComboBoxGender.getSelectedItem(),
						textFieldAge.getText(),
						textFieldAddress.getText(),
						textFieldPhoneNume.getText(),
						comboBoxTypeCloth.getSelectedItem(),
						comboBoxBrand.getSelectedItem(),
						textFieldDay.getText(),
						textFieldQuantity.getText(),
						textFieldPrice.getText(),
						textFieldAmount.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Customer Information Update confirmed", "Customer Registration",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnNewButton_1.setFont(new Font("STZhongsong", Font.BOLD, 20));
		
		JButton button = new JButton("Update");
		button.setBackground(new Color(250, 235, 215));
		button.setBounds(580, 720, 119, 55);
		panel.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(textFieldName.getText(),i,0);
			    	model.setValueAt(ComboBoxGender.getSelectedItem(),i,1);
			    	model.setValueAt(textFieldAge.getText(),i,2);
			    	model.setValueAt(textFieldAddress.getText(),i,3);
			    	model.setValueAt(textFieldPhoneNume.getText(),i,4);
			    	model.setValueAt(comboBoxTypeCloth.getSelectedItem(),i,5);
			    	model.setValueAt(comboBoxBrand.getSelectedItem(),i,6);
			    	model.setValueAt(textFieldDay.getText(),i,7);
			    	model.setValueAt(textFieldQuantity.getText(), i,8);
			    	model.setValueAt(textFieldPrice.getText(),i,9);
			    	model.setValueAt(textFieldAmount.getText(),i,10);
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		button.setFont(new Font("STZhongsong", Font.BOLD, 20));
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setBackground(new Color(250, 235, 215));
		btnPrint.setBounds(44, 720, 99, 55);
		panel.add(btnPrint);
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//2.2 Exception Handling
				try {
					table.print();
				} catch (java.awt.print.PrinterException e1) {
					System.err.format("No printer found", e1.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("STZhongsong", Font.BOLD, 20));
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBackground(new Color(250, 235, 215));
		btnDelete.setBounds(151, 720, 152, 55);
		panel.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Customer Registration", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Customer Registration", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("STZhongsong", Font.BOLD, 20));
		
		JButton button_1 = new JButton("Reset");
		button_1.setBackground(new Color(250, 235, 215));
		button_1.setBounds(475, 720, 99, 55);
		panel.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFieldName.setText("");
				ComboBoxGender.setSelectedItem("Male");
				textFieldAge.setText("");
				textFieldAddress.setText("");
				textFieldPhoneNume.setText("");
				comboBoxTypeCloth.setSelectedItem("Fashion Modern");
				comboBoxBrand.setSelectedItem("");
				textFieldDay.setText("");
				textFieldQuantity.setText("");
				textFieldPrice.setText("");
				textFieldAmount.setText("");
			}
		});
		button_1.setFont(new Font("STZhongsong", Font.BOLD, 20));
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.setBackground(new Color(250, 235, 215));
		btnUpload.setBounds(709, 720, 131, 55);
		panel.add(btnUpload);
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//2.2 Exception Handling
				try {
					File file = new File("C:\\Users\\Lenovo\\OneDrive - UNIVERSITY UTARA MALAYSIA\\Desktop\\PROG2\\LCustomerRegistration.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
							}
						bw.write("\n________\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Exported!");
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
			}
		});
		btnUpload.setFont(new Font("STZhongsong", Font.BOLD, 20));
	}
	public static void AddRowToJtable(Object[] dataRow) {
		DefaultTableModel model = (DefaultTableModel)getTable().getModel();
		model.addRow(dataRow);
	}

	public static JTable getTable() {
		return table;
	}

	public static void setTable(JTable table) {
		LCustomerRegistration.table = table;
	}
	
	public static void AddRowToJtablesales(Object[] dataRow) {
		DefaultTableModel model1 = (DefaultTableModel)getTablesales().getModel();
		model1.addRow(dataRow);
	}

	public static JTable getTablesales() {
		return getTablesales();
	}

	public static void setTable_1(JTable tablesales) {
		LCustomerRegistration.tablesales = tablesales;
	}
}
