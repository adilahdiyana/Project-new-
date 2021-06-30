package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class LAdminInfo extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSize;
	private JTextField textFieldPrice;
	public static JTable table;
	private JButton btnAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//Exception Handling
				try {
					LAdminInfo frame = new LAdminInfo();
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
	public LAdminInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 717);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(210, 105, 30)));
		panel.setBackground(new Color(250, 240, 230));
		panel.setBounds(0, 0, 751, 670);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(210, 105, 30)));
		panel_1.setBackground(new Color(250, 240, 230));
		panel_1.setBounds(144, 35, 444, 74);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Clothing Information");
		lblNewLabel.setFont(new Font("Script MT Bold", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(140, 13, 260, 48);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(210, 105, 30)));
		panel_1_1.setBackground(new Color(250, 240, 230));
		panel_1_1.setBounds(374, 162, 365, 197);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblTypeOfCloth = new JLabel("Type of cloth");
		lblTypeOfCloth.setBounds(12, 18, 143, 37);
		lblTypeOfCloth.setFont(new Font("STXinwei", Font.BOLD, 18));
		panel_1_1.add(lblTypeOfCloth);
		
		JLabel lblBrandOfCloth = new JLabel("Brand ");
		lblBrandOfCloth.setFont(new Font("STXinwei", Font.BOLD, 18));
		lblBrandOfCloth.setBounds(12, 58, 157, 37);
		panel_1_1.add(lblBrandOfCloth);
		
		JLabel lblPriceday = new JLabel("Price/Day(RM)");
		lblPriceday.setFont(new Font("STXinwei", Font.BOLD, 18));
		lblPriceday.setBounds(12, 144, 143, 37);
		panel_1_1.add(lblPriceday);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setFont(new Font("STXinwei", Font.BOLD, 18));
		lblSize.setBounds(12, 105, 128, 31);
		panel_1_1.add(lblSize);
		
		textFieldSize = new JTextField();
		textFieldSize.setBackground(new Color(230, 230, 250));
		textFieldSize.setFont(new Font("Tahoma", Font.BOLD, 18));
		textFieldSize.setColumns(10);
		textFieldSize.setBounds(205, 103, 155, 31);
		panel_1_1.add(textFieldSize);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setBackground(new Color(230, 230, 250));
		textFieldPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
		textFieldPrice.setColumns(10);
		textFieldPrice.setBounds(205, 145, 155, 31);
		panel_1_1.add(textFieldPrice);
		
		JComboBox comboBoxType = new JComboBox();
		comboBoxType.setBackground(new Color(250, 235, 215));
		
		comboBoxType.setModel(new DefaultComboBoxModel(new String[] {"Select", "Fashion Modern", "Traditional Customs", "Dinner Dress"}));
		comboBoxType.setFont(new Font("STXinwei", Font.PLAIN, 18));
		comboBoxType.setBounds(205, 22, 157, 28);
		panel_1_1.add(comboBoxType);
		
		JComboBox comboBoxBrand = new JComboBox();
		comboBoxBrand.setBackground(new Color(230, 230, 250));
		
		comboBoxType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBoxType.getSelectedItem().equals("Fashion Modern")) {
					comboBoxBrand.removeAllItems();
					comboBoxBrand.setSelectedItem(null);
					comboBoxBrand.addItem("NIKE, ZARRA");
					comboBoxBrand.addItem("GUCCI, BALENCIAGA");
					comboBoxBrand.addItem("MONCLER, FENDI");
				}
				
				else 
					if(comboBoxType.getSelectedItem().equals("Traditional Customs")) {
						comboBoxBrand.removeAllItems();
						comboBoxBrand.setSelectedItem(null);
						comboBoxBrand.addItem("Kilts, Tracht");
						comboBoxBrand.addItem("Gho, Mezcal");
						comboBoxBrand.addItem("Burundi, Yenimdoll");
				}
				
					else 
						if(comboBoxType.getSelectedItem().equals("Dinner Dress")) {
							comboBoxBrand.removeAllItems();
							comboBoxBrand.setSelectedItem(null);
							comboBoxBrand.addItem("Frozen, Roll");
							comboBoxBrand.addItem("Vintage, Bell");
							comboBoxBrand.addItem("De Polaris, Zalora");
						}
					
				}
			
		});
		
		comboBoxBrand.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxBrand.setBounds(205, 62, 157, 28);
		panel_1_1.add(comboBoxBrand);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 135, 354, 236);
		panel.add(scrollPane);
		//2.3 File IO
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Type of Cloth", "Brand", "Size", "Price(RM)"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBackground(new Color(250, 235, 215));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete for now.",
								"Clothing Info", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Please select a row to delete.",
								"Clothing Info", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			
			}
		});
		btnDelete.setFont(new Font("STZhongsong", Font.BOLD, 18));
		btnDelete.setBounds(494, 415, 137, 46);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBackground(new Color(250, 235, 215));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(comboBoxType.getSelectedItem(),i,0);
			    	model.setValueAt(comboBoxBrand.getSelectedItem(),i,1);
			    	model.setValueAt(textFieldSize.getText(),i,3);
			    	model.setValueAt(textFieldPrice.getText(),i,4);

					JOptionPane.showMessageDialog(null, "Update Successfully!");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Select a Row First!");
			    }
			}
		});
		btnUpdate.setFont(new Font("STZhongsong", Font.BOLD, 18));
		btnUpdate.setBounds(305, 415, 137, 46);
		panel.add(btnUpdate);
		
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(250, 235, 215));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBoxType.setSelectedItem("Select the type");
				//textFieldBrandCar.setText("");
				comboBoxBrand.setSelectedItem(null);
				textFieldSize.setText("");
				textFieldPrice.setText("");
			}
		});
		btnReset.setFont(new Font("STZhongsong", Font.BOLD, 18));
		btnReset.setBounds(109, 496, 137, 46);
		panel.add(btnReset);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 751, 26);
		panel.add(menuBar);
		
		JMenu mnProfile = new JMenu("Profile");
		mnProfile.setForeground(Color.BLACK);
		mnProfile.setFont(new Font("SansSerif", Font.BOLD, 16));
		menuBar.add(mnProfile);
		
		JMenuItem mntmProfile = new JMenuItem("Profile");
		mntmProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		
		JButton btnAdd;
		btnAdd = new JButton("Add");
		btnAdd.setBounds(109, 415, 137, 46);
		panel.add(btnAdd);
		btnAdd.setBackground(new Color(250, 235, 215));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Type = (String) comboBoxType.getSelectedItem();
				String Brand = (String) comboBoxBrand.getSelectedItem();
				String Size = textFieldSize.getText();
				String Price = textFieldPrice.getText();
				//2.2 Exception handling
				try {
				if(Size.equals("")) 
					JOptionPane.showMessageDialog(null, "Size number cannot be empty!\nYour confirmation unsuccessful!");
				
				else if(Price.equals(""))
					JOptionPane.showMessageDialog(null, "Price cannot be empty!\nYour confirmation unsuccessful!");
				
				else {
					
					JOptionPane.showMessageDialog(null, "Confirm successful!");
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[]{
						Type,
						Brand,
						Size,
						Price
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Information confirm updated!", "Clothing Info.",
								JOptionPane.OK_OPTION);
					}
				}
			}
		  } catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the info correctly!", "Error.", JOptionPane.ERROR_MESSAGE);
				}
		}
		
		});
		btnAdd.setFont(new Font("STZhongsong", Font.BOLD, 18));
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(514, 492, 99, 55);
		panel.add(btnExit);
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
		
		JButton btnUpload_1 = new JButton("Upload");
		btnUpload_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\Lenovo\\OneDrive - UNIVERSITY UTARA MALAYSIA\\Desktop\\LAdminInfo.txt");
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
						JOptionPane.showMessageDialog(null, "Data Exported");
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
			}
		});
		btnUpload_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnUpload_1.setBounds(396, 273, 137, 46);
		panel.add(btnUpload_1);
		btnUpload_1.setFont(new Font("STZhongsong", Font.BOLD, 18));
		btnUpload_1.setBackground(new Color(250, 235, 215));
		btnUpload_1.setBounds(305, 496, 137, 46);
		panel.add(btnUpload_1);
		
		
	}
	public static void AddRowToJtable(Object[] dataRow) {
		DefaultTableModel model = (DefaultTableModel)getTable().getModel();
		model.addRow(dataRow);
	}

	public static JTable getTable() {
		return table;
	}

	public static void setTable(JTable table) {
		LAdminInfo.table = table;
	}
}
