package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class LFirstTimeRegister extends JFrame {

	private JPanel contentPane;
	protected JTextField Unametxt;
	private JTextField Emailtxt;
	protected JTextField Passtxt;
	private JTextField ConPasstxt;
	public static JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					LFirstTimeRegister frame = new LFirstTimeRegister();
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
	public LFirstTimeRegister() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 979, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(210, 105, 30)));
		panel.setBackground(new Color(250, 240, 230));
		panel.setBounds(0, 0, 961, 386);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(210, 105, 30)));
		panel_1.setBackground(new Color(250, 240, 230));
		panel_1.setBounds(244, 25, 500, 78);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Register for First Time");
		lblNewLabel.setBackground(new Color(230, 230, 250));
		lblNewLabel.setFont(new Font("Script MT Bold", Font.BOLD, 30));
		lblNewLabel.setBounds(76, 0, 439, 75);
		panel_1.add(lblNewLabel);
		
		JLabel lblFname = new JLabel("Username");
		lblFname.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblFname.setBounds(12, 127, 163, 41);
		panel.add(lblFname);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblEmail.setBounds(12, 181, 163, 41);
		panel.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblPassword.setBounds(12, 233, 163, 41);
		panel.add(lblPassword);
		
		JLabel lblConformPassword = new JLabel("Confirm Password");
		lblConformPassword.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblConformPassword.setBounds(12, 287, 189, 41);
		panel.add(lblConformPassword);
		
		Unametxt = new JTextField();
		Unametxt.setBackground(new Color(230, 230, 250));
		Unametxt.setFont(new Font("Tahoma", Font.BOLD, 20));
		Unametxt.setBounds(203, 125, 201, 41);
		panel.add(Unametxt);
		Unametxt.setColumns(10);
		
		Emailtxt = new JTextField();
		Emailtxt.setBackground(new Color(230, 230, 250));
		Emailtxt.setFont(new Font("Tahoma", Font.BOLD, 20));
		Emailtxt.setColumns(10);
		Emailtxt.setBounds(203, 179, 201, 41);
		panel.add(Emailtxt);
		
		Passtxt = new JTextField();
		Passtxt.setBackground(new Color(230, 230, 250));
		Passtxt.setFont(new Font("Tahoma", Font.BOLD, 20));
		Passtxt.setColumns(10);
		Passtxt.setBounds(203, 231, 201, 41);
		panel.add(Passtxt);
		
		ConPasstxt = new JTextField();
		ConPasstxt.setBackground(new Color(230, 230, 250));
		ConPasstxt.setFont(new Font("Tahoma", Font.BOLD, 20));
		ConPasstxt.setColumns(10);
		ConPasstxt.setBounds(203, 285, 201, 41);
		panel.add(ConPasstxt);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(414, 136, 370, 201);
		panel.add(scrollPane);
		
		//2.3 File IO
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Username", "Email", "Password"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBackground(new Color(250, 235, 215));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//2.2 Exception handling
				try {
				String Fname = Unametxt.getText();
				String Email = Emailtxt.getText();
				String Password = Passtxt.getText();
				String Cpassword = ConPasstxt.getText();
				
				if(Fname.equals("")) 
					JOptionPane.showMessageDialog(null, "Usernname cannot be empty\nYour registration unsuccessful!");
				
				else if(Email.equals("")) 
					JOptionPane.showMessageDialog(null, "Please enter your email!\nYour registration unsuccessful!");
				
				else if(Password.equals("")) 
					JOptionPane.showMessageDialog(null, "Please enter your password!\nYour registration unsuccessful!");
				
				else if(!Cpassword.equals(Password)) 
					JOptionPane.showMessageDialog(null, "Password is not same!\nYouregistration unsuccessful!");
				
				else {
					
					JOptionPane.showMessageDialog(null, "Registration is successful!");
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[]{
						Unametxt.getText(),
						Emailtxt.getText(),
						Passtxt.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Your register Information confirm updated!", "Registration",
								JOptionPane.OK_OPTION);
					}
				}
			}
		  } catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter your right username and password!", "Error", JOptionPane.ERROR_MESSAGE);
				}
		}
		});
		btnSubmit.setForeground(Color.BLACK);
		btnSubmit.setFont(new Font("STZhongsong", Font.BOLD, 20));
		btnSubmit.setBounds(814, 179, 129, 41);
		panel.add(btnSubmit);
		
		JButton ResetBtn = new JButton("Reset");
		ResetBtn.setBackground(new Color(250, 235, 215));
		ResetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Unametxt.setText("");
				Emailtxt.setText("");
				Passtxt.setText("");
				ConPasstxt.setText("");
			}
		});
		
		ResetBtn.setForeground(Color.BLACK);
		ResetBtn.setFont(new Font("STZhongsong", Font.BOLD, 20));
		ResetBtn.setBounds(814, 243, 129, 41);
		panel.add(ResetBtn);
		
		JButton btnBackToLogin = new JButton("Back ");
		btnBackToLogin.setBackground(new Color(250, 235, 215));
		btnBackToLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LCustomerLogin CL = new LCustomerLogin();
				CL.setModalExclusionType(null);
				CL.setVisible(true);
				dispose();
			}
		});
		btnBackToLogin.setForeground(Color.BLACK);
		btnBackToLogin.setFont(new Font("STZhongsong", Font.BOLD, 20));
		btnBackToLogin.setBounds(811, 306, 129, 41);
		panel.add(btnBackToLogin);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.setBackground(new Color(250, 235, 215));
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//2.2 Exception Handling
				try {
					File file = new File("C:\\Users\\Lenovo\\OneDrive - UNIVERSITY UTARA MALAYSIA\\Desktop\\PROG2\\LFirstTimeRegister.txt");
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
		btnUpload.setForeground(Color.BLACK);
		btnUpload.setFont(new Font("STZhongsong", Font.BOLD, 20));
		btnUpload.setBounds(814, 127, 129, 41);
		panel.add(btnUpload);
	}
	
	public static void AddRowToJtable(Object[] dataRow) {
		DefaultTableModel model = (DefaultTableModel)getTable().getModel();
		model.addRow(dataRow);
	}

	public static JTable getTable() {
		return table;
	}

	public static void setTable(JTable table) {
		LFirstTimeRegister.table = table;
	}
}
