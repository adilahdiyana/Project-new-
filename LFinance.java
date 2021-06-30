package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class LFinance extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUF;
	private JTextField textFieldMF;
	private JTextField textFieldAF;
	private JTextField textFieldGE;
	private JTextField textFieldTotalEx;
	public JTextField textFieldSalary;
	public JTextField textFieldSales;
	private JTextField textFieldTE;
	private JTextField textFieldSalesss;
	private JTextField textFieldES;
	private JTextField textFieldNProfit;
	private static String result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					LFinance frame = new LFinance();
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
	public LFinance() {//}
	//public LFinance(String s) {
		//this.result = s;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1009, 705);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(210, 105, 30)));
		panel.setBackground(new Color(250, 240, 230));
		panel.setBounds(0, 10, 991, 658);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Financial Report");
		lblNewLabel.setFont(new Font("Script MT Bold", Font.BOLD | Font.ITALIC, 31));
		lblNewLabel.setBounds(324, 31, 336, 80);
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(210, 105, 30)));
		panel_2.setBackground(new Color(250, 240, 230));
		panel_2.setBounds(261, 419, 372, 110);
		panel.add(panel_2);
		
		JLabel lblEmployeeSalary = new JLabel("LEmployee Salary (RM)");
		lblEmployeeSalary.setFont(new Font("STXihei", Font.BOLD, 20));
		lblEmployeeSalary.setBounds(12, 13, 231, 33);
		panel_2.add(lblEmployeeSalary);
		
		textFieldSalary = new JTextField();
		textFieldSalary.setBackground(new Color(230, 230, 250));
		JTable t = LEmployee.getTablesalary();
		String salary="";
				for(int i = 0; i<t.getRowCount(); i++) { 
				salary= String.valueOf(t.getValueAt(i, 0));}
				textFieldSalary.setText(salary);
		textFieldSalary.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldSalary.setColumns(10);
		textFieldSalary.setBounds(259, 14, 103, 33);
		panel_2.add(textFieldSalary);
		
		JLabel lblSalesrm = new JLabel("LSales (RM)");
		lblSalesrm.setBounds(23, 67, 124, 33);
		panel_2.add(lblSalesrm);
		lblSalesrm.setFont(new Font("STXihei", Font.BOLD, 20));
		
		textFieldSales = new JTextField();
		textFieldSales.setBackground(new Color(230, 230, 250));
		JTable t1 = LCustomerRegistration.getTablesales();
		String sales="";
				for(int i = 0; i<t.getRowCount(); i++) { 
				sales= String.valueOf(t1.getValueAt(i, 0));}
				textFieldSales.setText(sales);
		textFieldSales.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldSales.setColumns(10);
		textFieldSales.setBounds(259, 68, 103, 33);
		panel_2.add(textFieldSales);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(210, 105, 30)));
		panel_4.setBackground(new Color(250, 240, 230));
		panel_4.setBounds(24, 103, 395, 285);
		panel.add(panel_4);
		
		JLabel lblF = new JLabel("Financial Statement");
		lblF.setFont(new Font("STXihei", Font.BOLD, 25));
		lblF.setBounds(10, 16, 283, 33);
		panel_4.add(lblF);
		
		textFieldTE = new JTextField();
		textFieldTE.setBackground(new Color(230, 230, 250));
		textFieldTE.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldTE.setColumns(10);
		textFieldTE.setBounds(259, 102, 124, 33);
		panel_4.add(textFieldTE);
		
		JLabel lblTotalExpensesrm = new JLabel("Total Expenses (RM)");
		lblTotalExpensesrm.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblTotalExpensesrm.setBounds(12, 102, 214, 33);
		panel_4.add(lblTotalExpensesrm);
		
		JLabel lblSalesrm_1 = new JLabel("Total LSales (RM)");
		lblSalesrm_1.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblSalesrm_1.setBounds(12, 59, 214, 33);
		panel_4.add(lblSalesrm_1);
		
		textFieldSalesss = new JTextField();
		textFieldSalesss.setBackground(new Color(230, 230, 250));
		textFieldSalesss.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldSalesss.setColumns(10);
		textFieldSalesss.setBounds(259, 59, 124, 33);
		panel_4.add(textFieldSalesss);
		
		JLabel lblEmployeeSalaryrm = new JLabel("LEmployee Salary (RM)");
		lblEmployeeSalaryrm.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblEmployeeSalaryrm.setBounds(12, 148, 225, 33);
		panel_4.add(lblEmployeeSalaryrm);
		
		textFieldES = new JTextField();
		textFieldES.setBackground(new Color(230, 230, 250));
		textFieldES.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldES.setColumns(10);
		textFieldES.setBounds(259, 148, 124, 33);
		panel_4.add(textFieldES);
		
		JLabel lblNetProfitrm = new JLabel("Net Profit (RM)");
		lblNetProfitrm.setFont(new Font("STXihei", Font.BOLD, 20));
		lblNetProfitrm.setBounds(10, 190, 165, 33);
		panel_4.add(lblNetProfitrm);
		
		textFieldNProfit = new JTextField();
		textFieldNProfit.setBackground(new Color(230, 230, 250));
		textFieldNProfit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldNProfit.setColumns(10);
		textFieldNProfit.setBounds(259, 191, 124, 33);
		panel_4.add(textFieldNProfit);
		
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
		btnExit_1.setFont(new Font("STZhongsong", Font.BOLD, 20));
		btnExit_1.setBounds(531, 563, 99, 55);
		panel.add(btnExit_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 991, 26);
		panel.add(menuBar);
		
		JMenu mnProfile = new JMenu("Profile");
		mnProfile.setForeground(Color.BLACK);
		mnProfile.setFont(new Font("SansSerif", Font.BOLD, 15));
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
			public void actionPerformed(ActionEvent e) {
				LFinance F = new LFinance();
				F.setModalExclusionType(null);
				F.setVisible(true);
				dispose();
			}
		});
		mntmFinance.setForeground(Color.BLACK);
		mntmFinance.setFont(new Font("SansSerif", Font.PLAIN, 15));
		mnFinance.add(mntmFinance);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(476, 103, 395, 285);
		panel.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(210, 105, 30)));
		panel_1.setBackground(new Color(250, 240, 230));
		
		JLabel lblNewLabel_1 = new JLabel("Expenses");
		lblNewLabel_1.setFont(new Font("STXihei", Font.BOLD, 20));
		lblNewLabel_1.setBounds(12, 13, 104, 33);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblUF = new JLabel("Utility fee (RM)");
		lblUF.setFont(new Font("STXinwei", Font.PLAIN, 18));
		lblUF.setBounds(12, 44, 130, 33);
		panel_1.add(lblUF);
		
		JLabel lblMaintenanceFeerm = new JLabel("Maintenance fee (RM)");
		lblMaintenanceFeerm.setFont(new Font("STXinwei", Font.PLAIN, 18));
		lblMaintenanceFeerm.setBounds(12, 79, 232, 33);
		panel_1.add(lblMaintenanceFeerm);
		
		JLabel lblAdvertisementFeerm = new JLabel("LAdvertisement fee (RM)");
		lblAdvertisementFeerm.setFont(new Font("STXinwei", Font.PLAIN, 18));
		lblAdvertisementFeerm.setBounds(12, 113, 187, 33);
		panel_1.add(lblAdvertisementFeerm);
		
		JLabel lblGeneraltFeerm = new JLabel("General expenses (RM)");
		lblGeneraltFeerm.setFont(new Font("STXinwei", Font.PLAIN, 18));
		lblGeneraltFeerm.setBounds(12, 147, 187, 33);
		panel_1.add(lblGeneraltFeerm);
		
		JButton btnNewButton = new JButton("Total Expenses (RM)");
		btnNewButton.setBackground(new Color(250, 235, 215));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double uf,mf,af,ge, totalE;
				//2.2 Exception Handling
				try {
					    uf = Double.parseDouble(textFieldUF.getText());
					    mf = Double.parseDouble(textFieldMF.getText());
					    af = Double.parseDouble(textFieldAF.getText());
					    ge = Double.parseDouble(textFieldGE.getText());
					  
					    totalE = uf+mf+af+ge;
					    textFieldTotalEx.setText(Double.toString(totalE));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the number correctly");
				}
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("STZhongsong", Font.BOLD, 18));
		btnNewButton.setBounds(12, 192, 232, 41);
		panel_1.add(btnNewButton);
		
		textFieldUF = new JTextField();
		textFieldUF.setBackground(new Color(230, 230, 250));
		textFieldUF.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldUF.setBounds(220, 47, 141, 22);
		panel_1.add(textFieldUF);
		textFieldUF.setColumns(10);
		
		textFieldMF = new JTextField();
		textFieldMF.setBackground(new Color(230, 230, 250));
		textFieldMF.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldMF.setColumns(10);
		textFieldMF.setBounds(220, 82, 141, 22);
		panel_1.add(textFieldMF);
		
		textFieldAF = new JTextField();
		textFieldAF.setBackground(new Color(230, 230, 250));
		textFieldAF.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldAF.setColumns(10);
		textFieldAF.setBounds(220, 116, 141, 22);
		panel_1.add(textFieldAF);
		
		textFieldGE = new JTextField();
		textFieldGE.setBackground(new Color(230, 230, 250));
		textFieldGE.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldGE.setColumns(10);
		textFieldGE.setBounds(220, 150, 141, 22);
		panel_1.add(textFieldGE);
		
		textFieldTotalEx = new JTextField();
		textFieldTotalEx.setBackground(new Color(230, 230, 250));
		textFieldTotalEx.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldTotalEx.setBounds(253, 196, 104, 33);
		panel_1.add(textFieldTotalEx);
		textFieldTotalEx.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(273, 563, 139, 55);
		panel.add(btnCalculate);
		btnCalculate.setBackground(new Color(250, 235, 215));
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//2.2 Exception handling
				try {
				textFieldSalesss.setText(textFieldSales.getText());
				textFieldTE.setText(textFieldTotalEx.getText());
				textFieldES.setText(textFieldSalary.getText());
				
				double Sales = Double.parseDouble(textFieldSalesss.getText());
				double Exp = Double.parseDouble(textFieldTE.getText());
				double salary = Double.parseDouble(textFieldES.getText());
				
				double netprofit = Sales - Exp - salary;
				textFieldNProfit.setText(Double.toString(netprofit));
				
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the data correctly!", "Error.", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnCalculate.setFont(new Font("STZhongsong", Font.BOLD, 20));
		
		JButton buttonReset = new JButton("Reset");
		buttonReset.setBounds(422, 563, 99, 55);
		panel.add(buttonReset);
		buttonReset.setBackground(new Color(250, 235, 215));
		buttonReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldUF.setText("");
				textFieldMF.setText("");
				textFieldAF.setText("");
				textFieldGE.setText("");
				textFieldTotalEx.setText("");
				textFieldSalesss.setText("");
				textFieldTE.setText("");
				textFieldES.setText("");
				textFieldNProfit.setText("");
			}
		});
		buttonReset.setFont(new Font("STZhongsong", Font.BOLD, 20));
	}
}
