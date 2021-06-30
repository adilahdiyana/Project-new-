package Project;

import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
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
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
public class LEmployee extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable model;
	private JTextField textFieldName;
	private JTextField textFieldAge;
	private JTextField textFieldAddress;
	private JTextField textFieldPhoneNume;
	private JTextField textFieldSalary;
	private JTextField textFieldNetSalary;
	private JTextField textFieldDay;
	private JTextField textFieldTotSalary;
	private JFrame frame;
	protected double total;
	private static JTable tablesalary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					LEmployee frame = new LEmployee();
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
	public LEmployee() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 866);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 240, 230));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(210, 105, 30)));
		panel.setBounds(0, 0, 1286, 807);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(250, 240, 230));
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(210, 105, 30)));
		panel_1.setBounds(39, 180, 919, 335);
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
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblAge.setBounds(12, 98, 126, 37);
		panel_1.add(lblAge);
		
		JLabel lblPhoneNum = new JLabel("Phone Number");
		lblPhoneNum.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblPhoneNum.setBounds(12, 190, 146, 37);
		panel_1.add(lblPhoneNum);
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblPosition.setBounds(12, 230, 126, 37);
		panel_1.add(lblPosition);
		
		JLabel lblDay = new JLabel("Day (for part-timer only)");
		lblDay.setBackground(new Color(240, 240, 240));
		lblDay.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblDay.setBounds(447, 64, 238, 37);
		panel_1.add(lblDay);
		
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
		ComboBoxGender.setModel(new DefaultComboBoxModel(new String[] {"Select the gender", "Male", "Female"}));
		ComboBoxGender.setBounds(195, 64, 189, 21);
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
		
		JComboBox comboPosition = new JComboBox();
		comboPosition.setBackground(new Color(255, 192, 203));
		comboPosition.setModel(new DefaultComboBoxModel(new String[] {"Select", "Clerk", "Supervisor", "Manager"}));
		comboPosition.setFont(new Font("STXinwei", Font.PLAIN, 20));
		comboPosition.setBounds(195, 240, 189, 27);
		panel_1.add(comboPosition);
		
		JComboBox comboTypeJob = new JComboBox();
		comboTypeJob.setBackground(new Color(255, 192, 203));
		comboTypeJob.setModel(new DefaultComboBoxModel(new String[] {"Select", "Part Time", "Full Time"}));
		comboTypeJob.setFont(new Font("STXinwei", Font.PLAIN, 20));
		comboTypeJob.setBounds(680, 30, 189, 27);
		panel_1.add(comboTypeJob);
		
		textFieldSalary = new JTextField();
		textFieldSalary.setBackground(new Color(230, 230, 250));
		textFieldSalary.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldSalary.setColumns(10);
		textFieldSalary.setBounds(680, 109, 189, 37);
		panel_1.add(textFieldSalary);
		
		textFieldNetSalary = new JTextField();
		textFieldNetSalary.setBackground(new Color(230, 230, 250));
		textFieldNetSalary.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldNetSalary.setColumns(10);
		textFieldNetSalary.setBounds(680, 156, 189, 37);
		panel_1.add(textFieldNetSalary);
		
		textFieldDay = new JTextField();
		textFieldDay.setBackground(new Color(230, 230, 250));
		textFieldDay.setBounds(680, 64, 189, 37);
		panel_1.add(textFieldDay);
		textFieldDay.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldDay.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBackground(new Color(250, 235, 215));
		btnConfirm.setHorizontalAlignment(SwingConstants.LEFT);
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int day = 0;
				double Rsalary=0;
				double NetSalary;
				double epf;
				String selection = (String) comboPosition.getSelectedItem();
				String choose = (String) comboTypeJob.getSelectedItem();
				//2.2 Exception handling
				try {
				if (selection.equals("Clerk")){
					
					if(choose.equals("Part Time")) {
						LPayment clerk = new LtotalSalary(); //2.5 Interface
						Rsalary = clerk.Rentprice(selection, choose, day);//salary for part time clerk
						textFieldSalary.setText(Double.toString(Rsalary));
						day = Integer.parseInt(textFieldDay.getText());
						NetSalary = clerk.getPayment(selection, choose, day);
						textFieldNetSalary.setText(Double.toString(NetSalary));}
					
					else {
					  		LPayment clerk = new LtotalSalary();  //2.5 Interface
							Rsalary = clerk.Rentprice(selection, choose, day);
					  		textFieldSalary.setText(Double.toString(Rsalary));
					  		epf = clerk.discount();
					  		NetSalary = clerk.getPayment(selection, choose, day, epf);
					  		textFieldNetSalary.setText(Double.toString(NetSalary));}
					}
				
				if (selection.equals("Supervisor")){

					if(choose.equals("Part Time")) {
						LPayment supervisor = new LtotalSalary(); //2.5 Interface
						Rsalary = supervisor.Rentprice(selection, choose, day);//salary for part time clerk
						textFieldSalary.setText(Double.toString(Rsalary));
						day = Integer.parseInt(textFieldDay.getText());
						NetSalary = supervisor.getPayment(selection, choose, day);
						textFieldNetSalary.setText(Double.toString(NetSalary));}
					
					  else {
						  	LPayment supervisor = new LtotalSalary();  //2.5 Interface
							Rsalary = supervisor.Rentprice(selection, choose, day);
					  		textFieldSalary.setText(Double.toString(Rsalary));
					  		epf = supervisor.discount();
					  		NetSalary = supervisor.getPayment(selection, choose, day, epf);
					  		textFieldNetSalary.setText(Double.toString(NetSalary));}
				}
				
				if (selection.equals("Manager")){

					if(choose.equals("Part Time")) {
						LPayment manager = new LtotalSalary(); //2.5 Interface
						Rsalary = manager.Rentprice(selection, choose, day);//salary for part time clerk
						textFieldSalary.setText(Double.toString(Rsalary));
						day = Integer.parseInt(textFieldDay.getText());
						NetSalary = manager.getPayment(selection, choose, day);
						textFieldNetSalary.setText(Double.toString(NetSalary));}
					
					  else {
						  	LPayment manager = new LtotalSalary();  //2.5 Interface
							Rsalary = manager.Rentprice(selection, choose, day);
					  		textFieldSalary.setText(Double.toString(Rsalary));
					  		epf = manager.discount();
					  		NetSalary = manager.getPayment(selection, choose, day, epf);
					  		textFieldNetSalary.setText(Double.toString(NetSalary));}
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right info", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
			
		});
		btnConfirm.setBounds(447, 260, 139, 37);
		panel_1.add(btnConfirm);
		btnConfirm.setFont(new Font("STZhongsong", Font.BOLD, 20));
		
		JLabel lblNetSalary = new JLabel("Net Salary (RM)");
		lblNetSalary.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblNetSalary.setBounds(447, 156, 176, 37);
		panel_1.add(lblNetSalary);
		
		textFieldTotSalary = new JTextField();
		textFieldTotSalary.setBackground(new Color(230, 230, 250));
		textFieldTotSalary.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldTotSalary.setColumns(10);
		textFieldTotSalary.setBounds(680, 203, 189, 37);
		panel_1.add(textFieldTotSalary);
		
		JButton btnTotalSalary = new JButton("Total Salary (RM)");
		btnTotalSalary.setBackground(new Color(250, 235, 215));
		btnTotalSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
			    // iterate over all columns
			    for (int i = 0 ; i < model.getRowCount() ; i++) {
			        // null or not Integer will throw exception
			        String s = String.valueOf(model.getValueAt(i, 9));
			        
			        total += Double.parseDouble(s);
			    }
				String result=String.valueOf(total);  
				textFieldTotSalary.setText(result); 
				
				DefaultTableModel model1 = (DefaultTableModel)getTablesalary().getModel();
				model1.addRow(new Object[]{
						textFieldTotSalary.getText(),
				});
			}
		});
		btnTotalSalary.setBounds(447, 203, 225, 37);
		panel_1.add(btnTotalSalary);
		btnTotalSalary.setFont(new Font("STZhongsong", Font.BOLD, 20));
		
		JLabel lblTypeOfJob = new JLabel("Type of job");
		lblTypeOfJob.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblTypeOfJob.setBounds(447, 25, 126, 37);
		panel_1.add(lblTypeOfJob);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(447, 212, 15, 21);
		panel_1.add(scrollPane_1);
		
		//2.3 File IO
		tablesalary = new JTable();
		tablesalary.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Salary"
			}
		));
		scrollPane_1.setViewportView(tablesalary);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblSalary.setBounds(447, 113, 119, 35);
		panel_1.add(lblSalary);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(250, 240, 230));
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(210, 105, 30)));
		panel_2.setBounds(85, 59, 787, 100);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LEmployee Recruitment");
		lblNewLabel.setFont(new Font("Script MT Bold", Font.BOLD, 40));
		lblNewLabel.setBounds(155, 13, 585, 74);
		panel_2.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1282, 26);
		panel.add(menuBar);
		
		JMenu mnProfile = new JMenu("Profile");
		mnProfile.setForeground(Color.BLACK);
		mnProfile.setFont(new Font("Segoe UI", Font.BOLD, 16));
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
		
		JMenu mnVehicle = new JMenu("Clothing Info");
		mnVehicle.setForeground(Color.BLACK);
		mnVehicle.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnVehicle);
		
		JMenuItem mntmVehicle = new JMenuItem("Clothing Info");
		mntmVehicle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LAdminInfo AVI = new LAdminInfo();
				AVI.setModalExclusionType(null);
				AVI.setVisible(true);
				dispose();
			}
		});
		mntmVehicle.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnVehicle.add(mntmVehicle);
		
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 550, 928, 180);
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
					comboPosition.setSelectedItem(model.getValueAt(i,5).toString());
					comboTypeJob.setSelectedItem(model.getValueAt(i,6).toString());  
					textFieldDay.setText(model.getValueAt(i,7).toString());
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
				"Name", "Gender", "Age", "Address", "Phone Number", "Position", "Type of Job", "Day(Part-timer)", "Rough Salary(RM)", "Net Salary(RM)"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setBackground(new Color(250, 235, 215));
		btnPrint.setBounds(1047, 247, 143, 55);
		panel.add(btnPrint);
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//2.2 Exception Handling
				try {
					table.print();
				} catch (java.awt.print.PrinterException e1) {
					System.err.format("No printer found!", e1.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("STZhongsong", Font.BOLD, 20));
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBackground(new Color(250, 235, 215));
		btnDelete.setBounds(1047, 345, 152, 55);
		panel.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete for now!",
								"LEmployee Recruitment.", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Please select a row to delete!",
								"LEmployee Recruitment", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		
		btnDelete.setFont(new Font("STZhongsong", Font.BOLD, 20));
		
		JButton btnNewButton_1 = new JButton("Add Record");
		btnNewButton_1.setBackground(new Color(250, 235, 215));
		btnNewButton_1.setBounds(1054, 457, 152, 55);
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
						comboPosition.getSelectedItem(),
						comboTypeJob.getSelectedItem(),
						textFieldDay.getText(),
						textFieldSalary.getText(),
						textFieldNetSalary.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "LEmployee Information confirm updated!", "LEmployee Recruitment.",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnNewButton_1.setFont(new Font("STZhongsong", Font.BOLD, 20));
		
		JButton button_1 = new JButton("Reset");
		button_1.setBackground(new Color(250, 235, 215));
		button_1.setBounds(1034, 59, 143, 55);
		panel.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFieldName.setText("");
				ComboBoxGender.setSelectedItem("Select the gender!");
				textFieldAge.setText("");
				textFieldAddress.setText("");
				textFieldPhoneNume.setText("");
				comboPosition.setSelectedItem("Select the position!");
				comboTypeJob.setSelectedItem("Select the type!");
				textFieldDay.setText("");
				textFieldSalary.setText("");
				textFieldNetSalary.setText("");
			}
		});
		button_1.setFont(new Font("STZhongsong", Font.BOLD, 20));
		
		JButton button = new JButton("Update");
		button.setBackground(new Color(250, 235, 215));
		button.setBounds(1054, 556, 152, 55);
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
			    	model.setValueAt(comboPosition.getSelectedItem(),i,5);
			    	model.setValueAt(comboTypeJob.getSelectedItem(),i,6);
			    	model.setValueAt(textFieldDay.getText(),i,7);
			    	model.setValueAt(textFieldSalary.getText(),i,8);
			    	model.setValueAt(textFieldNetSalary.getText(),i,9);
					JOptionPane.showMessageDialog(null, "Update Successfully!");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		button.setFont(new Font("STZhongsong", Font.BOLD, 20));
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(250, 235, 215));
		btnExit.setBounds(1054, 650, 152, 55);
		panel.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LLogin L = new LLogin();
				L.setModalExclusionType(null);
				L.setVisible(true);
				dispose();
			}
		});
		btnExit.setFont(new Font("STZhongsong", Font.BOLD, 20));
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.setBackground(new Color(250, 235, 215));
		btnUpload.setBounds(1034, 148, 156, 55);
		panel.add(btnUpload);
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//2.2 Exception Handling
				try {
					File file = new File("C:\\Users\\Lenovo\\OneDrive - UNIVERSITY UTARA MALAYSIA\\Desktop\\PROG2\\LEmployee.txt");
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
	public static void AddRowToJtablesalary(Object[] dataRow) {
		DefaultTableModel model1 = (DefaultTableModel)getTablesalary().getModel();
		model1.addRow(dataRow);
	}

	public static JTable getTablesalary() {
		return tablesalary;
	}

	public static void setTablesalary(JTable tablesalary) {
		LEmployee.tablesalary = tablesalary;
	}
}
