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
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class LCustomerLogin extends JFrame {

	private JPanel contentPane;
	protected JTextField UserNametextField;
	protected JTextField PasswordtextField;
	protected String Username;
	protected String Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					LCustomerLogin frame = new LCustomerLogin();
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
	public LCustomerLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1023, 690);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.DARK_GRAY));
		panel.setBackground(new Color(250, 240, 230));
		panel.setBounds(0, 0, 681, 571);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton button = new JButton("Reset");
		button.setBackground(new Color(250, 235, 215));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserNametextField.setText("");
				PasswordtextField.setText("");
			}
		});
		
		JButton button_1 = new JButton("Back");
		button_1.setBackground(new Color(250, 235, 215));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LLogin L = new LLogin();
				L.setModalExclusionType(null);
				L.setVisible(true);
				dispose();
			}
		});
		
		JButton btnRegister = new JButton("Register for first time user");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LFirstTimeRegister FTR = new LFirstTimeRegister();
			    FTR.setModalExclusionType(null);
				FTR.setVisible(true);
				dispose();
			}
		});
		btnRegister.setFont(new Font("STZhongsong", Font.BOLD, 20));
		btnRegister.setBounds(116, 415, 445, 70);
		panel.add(btnRegister);
		button_1.setFont(new Font("STZhongsong", Font.PLAIN, 20));
		button_1.setBounds(251, 301, 101, 70);
		panel.add(button_1);
		button.setFont(new Font("STZhongsong", Font.BOLD, 20));
		button.setBounds(410, 301, 154, 70);
		panel.add(button);
		
		JLabel UserNameJLabel = new JLabel("Username");
		UserNameJLabel.setForeground(new Color(0, 0, 0));
		UserNameJLabel.setFont(new Font("STXinwei", Font.BOLD, 20));
		UserNameJLabel.setBounds(66, 158, 247, 60);
		panel.add(UserNameJLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblPassword.setBounds(437, 158, 247, 60);
		panel.add(lblPassword);
		
		UserNametextField = new JTextField();
		UserNametextField.setBackground(new Color(230, 230, 250));
		Username = UserNametextField.getText();
		UserNametextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		UserNametextField.setBounds(44, 210, 154, 50);
		panel.add(UserNametextField);
		UserNametextField.setColumns(10);
		
		PasswordtextField = new JTextField();
		PasswordtextField.setBackground(new Color(230, 230, 250));
		PasswordtextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PasswordtextField.setColumns(10);
		PasswordtextField.setBounds(425, 210, 131, 50);
		panel.add(PasswordtextField);
		
		JButton btnLoginButton = new JButton("LLogin");
		btnLoginButton.setBackground(new Color(250, 235, 215));
		btnLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTable t = LFirstTimeRegister.getTable();
				String un;
				String pw;
				boolean login = false;
				//2.2 Exception Handling
				try {
					for(int i = 0; i<t.getRowCount(); i++) {
						un = String.valueOf(t.getValueAt(i, 0));
						pw = String.valueOf(t.getValueAt(i, 2));
						
						if(UserNametextField.getText().equals(un) && PasswordtextField.getText().equals(pw)) {
							login = true;
						}
					}
					
					if(login == true) {
						JOptionPane.showMessageDialog(null, "LLogin successful!");
						LCompanyBackground CB = new LCompanyBackground();
						CB.setModalExclusionType(null);
						CB.setVisible(true);
						dispose();
					}
					else 
						JOptionPane.showMessageDialog(null, "LLogin unsuccessful!", "Error", JOptionPane.ERROR_MESSAGE);
						
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter your right username and password!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnLoginButton.setFont(new Font("STZhongsong", Font.BOLD, 20));
		btnLoginButton.setBounds(65, 301, 148, 70);
		panel.add(btnLoginButton);
		
		JLabel lblCustomerLoginPage = new JLabel("Customer LLogin");
		lblCustomerLoginPage.setForeground(new Color(0, 0, 0));
		lblCustomerLoginPage.setFont(new Font("Script MT Bold", Font.BOLD, 40));
		lblCustomerLoginPage.setBounds(172, 88, 482, 60);
		panel.add(lblCustomerLoginPage);
		
		
	}
}
