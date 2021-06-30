package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JDesktopPane;

public class LLogin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					LLogin frame = new LLogin();
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
	public LLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 995, 688);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(210, 105, 30)));
		panel.setBackground(new Color(250, 240, 230));
		panel.setBounds(0, 0, 977, 641);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			private Component frame;

			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "LOGIN", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("STZhongsong", Font.PLAIN, 20));
		btnExit.setBackground(new Color(250, 235, 215));
		btnExit.setBounds(381, 489, 145, 76);
		panel.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("Hi, welcome! Kindly choose the type of user :)");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setForeground(new Color(165, 42, 42));
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 30));
		lblNewLabel.setBounds(124, 82, 787, 76);
		panel.add(lblNewLabel);
		
		JButton btnAdminButton = new JButton("LAdminCompany");
		btnAdminButton.setBackground(new Color(250, 235, 215));
		btnAdminButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LAdminLogin AL = new LAdminLogin();
				AL.setModalExclusionType(null);
				AL.setVisible(true);
				dispose();
			}
		});
		btnAdminButton.setFont(new Font("STZhongsong", Font.PLAIN, 20));
		btnAdminButton.setBounds(381, 226, 145, 76);
		panel.add(btnAdminButton);
		
		JButton btnCustomer = new JButton("Customer");
		btnCustomer.setBackground(new Color(250, 235, 215));
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LCustomerLogin CL = new LCustomerLogin();
				CL.setModalExclusionType(null);
				CL.setVisible(true);
				dispose();
			}
		});
		btnCustomer.setFont(new Font("STZhongsong", Font.PLAIN, 20));
		btnCustomer.setBounds(381, 362, 145, 76);
		panel.add(btnCustomer);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(new Color(210, 105, 30));
		lblNewLabel_1.setBackground(new Color(250, 240, 230));
		lblNewLabel_1.setBounds(0, 0, 977, 641);
		panel.add(lblNewLabel_1);
	}
}
