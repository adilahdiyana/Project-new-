package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
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
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class LAdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField UserNametextField;
	private JTextField PasswordtextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					LAdminLogin frame = new LAdminLogin();
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
	public LAdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(210, 105, 30)));
		panel.setBackground(new Color(250, 240, 230));
		panel.setBounds(0, 0, 733, 503);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(250, 235, 215));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserNametextField.setText("");
				PasswordtextField.setText("");
			}
		});
		
		JButton button = new JButton("Back");
		button.setBackground(new Color(250, 235, 215));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LLogin L = new LLogin();
				L.setModalExclusionType(null);
				L.setVisible(true);
				dispose();
			}
		});
		
		button.setFont(new Font("STZhongsong", Font.PLAIN, 20));
		button.setBounds(324, 397, 101, 66);
		panel.add(button);
		btnReset.setFont(new Font("STZhongsong", Font.BOLD, 20));
		btnReset.setBounds(307, 322, 140, 65);
		panel.add(btnReset);
		
		JLabel UserNameJLabel = new JLabel("Username");
		UserNameJLabel.setBounds(69, 119, 247, 60);
		UserNameJLabel.setForeground(new Color(0, 0, 0));
		UserNameJLabel.setFont(new Font("STXinwei", Font.BOLD, 20));
		panel.add(UserNameJLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(486, 119, 247, 60);
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setFont(new Font("STXinwei", Font.BOLD, 20));
		panel.add(lblPassword);
		
		UserNametextField = new JTextField();
		UserNametextField.setBackground(new Color(230, 230, 250));
		UserNametextField.setBounds(48, 173, 160, 50);
		UserNametextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(UserNametextField);
		UserNametextField.setColumns(10);
		
		PasswordtextField = new JTextField();
		PasswordtextField.setBackground(new Color(230, 230, 250));
		PasswordtextField.setBounds(465, 173, 168, 50);
		PasswordtextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PasswordtextField.setColumns(10);
		panel.add(PasswordtextField);
		
		JButton btnLoginButton = new JButton("LLogin");
		btnLoginButton.setBackground(new Color(250, 235, 215));
		btnLoginButton.setBounds(307, 252, 140, 60);
		btnLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//2.2 Exception Handling
				try {  
					if(UserNametextField.getText().equals("Adilah")&& PasswordtextField.getText().equals("ad")) {
						JOptionPane.showMessageDialog(null, "LLogin Succesful!");
						LAdminCompany AC = new LAdminCompany();
						AC.setModalExclusionType(null);
						AC.setVisible(true);
						dispose();}
					
					else 
						JOptionPane.showMessageDialog(null, "LLogin UnSuccesful!");
						
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter your right user name and password!");
				}
			}
		});
		btnLoginButton.setFont(new Font("STZhongsong", Font.BOLD, 20));
		panel.add(btnLoginButton);
		
		JLabel lblAdminLoginPage = new JLabel("LAdminCompany LLogin ");
		lblAdminLoginPage.setBounds(107, 33, 482, 60);
		lblAdminLoginPage.setForeground(new Color(0, 0, 0));
		lblAdminLoginPage.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminLoginPage.setFont(new Font("Script MT Bold", Font.BOLD, 40));
		panel.add(lblAdminLoginPage);
	}
}
