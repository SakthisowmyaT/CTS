package cts;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class ABOUTUS {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ABOUTUS window = new ABOUTUS();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ABOUTUS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1151, 699);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 1156, 660);
		frame.getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setBackground(new Color(255, 255, 255));
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 0));
		panel_1.setBounds(0, 0, 1135, 64);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ABOUT US");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(515, 31, 80, 22);
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				customerpage y = new customerpage();
				y.show();
				frame.dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\bb.png"));
		btnNewButton.setBounds(10, 22, 31, 31);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\KEERTHANA.jpeg"));
		lblNewLabel_1.setBounds(44, 75, 150, 174);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\SOWMI.jpeg"));
		lblNewLabel_3.setBounds(44, 457, 150, 190);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\safthar.jpeg"));
		lblNewLabel_5.setBounds(596, 115, 162, 183);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\POORNIMA.jpeg"));
		lblNewLabel_2.setBounds(44, 281, 150, 156);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("KEERTHANA D\r\n\r\n");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(275, 77, 134, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("POORNIMA K");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_6.setForeground(new Color(0, 0, 0));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(241, 288, 193, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("DESIGNER");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7.setBounds(298, 472, 150, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("DATA SCIENTIST");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(781, 150, 155, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("JAVA DEVELOPER");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(271, 90, 154, 14);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("WEB DEVELOPER");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(257, 303, 177, 14);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("SAKTHISOWMYA T");
		lblNewLabel_11.setForeground(new Color(0, 0, 0));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_11.setBounds(275, 457, 150, 14);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("MOHAMMED SAFTHAR HUSSAIN");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_12.setBounds(811, 135, 180, 14);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_14 = new JLabel("NAVEETH KHAN J");
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setBounds(818, 364, 124, 14);
		panel.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("FULL STACK /AI ML");
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setBounds(821, 375, 124, 14);
		panel.add(lblNewLabel_15);
		
		JTextPane txtpnKeerthanaIsAn = new JTextPane();
		txtpnKeerthanaIsAn.setFont(new Font("Arial", Font.ITALIC, 12));
		txtpnKeerthanaIsAn.setText("Keerthana is an active maintainer of numerous open source project.  She is expert in Java and has over 7 years of experience.  She holds a bechelor's degree in computer science and engineering.");
		txtpnKeerthanaIsAn.setBounds(300, 115, 226, 134);
		panel.add(txtpnKeerthanaIsAn);
		
		JTextPane txtpnSakthiIsPassionate = new JTextPane();
		txtpnSakthiIsPassionate.setText("Sakthi is passionate about solving complex problems using elegent designs. She holds a bachelor's degree in computer science and engineering from the Anna University.She like to\r\ncreate things in his spare time\r\n");
		txtpnSakthiIsPassionate.setFont(new Font("Arial", Font.ITALIC, 12));
		txtpnSakthiIsPassionate.setBounds(295, 497, 231, 150);
		panel.add(txtpnSakthiIsPassionate);
		
		JTextPane txtpnSaftharIsA = new JTextPane();
		txtpnSaftharIsA.setFont(new Font("Arial", Font.ITALIC, 12));
		txtpnSaftharIsA.setText("Safthar is a Data Scientist on the competition team.  After earning a Ph.D in Food Engineering, Safthar spent 9 years in industry working on number of interesting problems.");
		txtpnSaftharIsA.setBounds(811, 175, 271, 103);
		panel.add(txtpnSaftharIsA);
		
		JTextPane txtpnPoornimaIsA = new JTextPane();
		txtpnPoornimaIsA.setFont(new Font("Arial", Font.ITALIC, 12));
		txtpnPoornimaIsA.setText("Poornima is a software engineer who enjoys creating elegant solution to hard problems.  She holds a B.E Information Technology. First she was a backend developer for loading experience.\r\n");
		txtpnPoornimaIsA.setBounds(298, 328, 261, 97);
		panel.add(txtpnPoornimaIsA);
		
		JTextPane txtpnNaveethIsA = new JTextPane();
		txtpnNaveethIsA.setFont(new Font("Arial", Font.ITALIC, 12));
		txtpnNaveethIsA.setText("Naveeth is a full stack software engineer on Raisin team.  He studied Computer Science and engineering and also masters in Data science and also have about 10 years of experience");
		txtpnNaveethIsA.setBounds(832, 412, 250, 108);
		panel.add(txtpnNaveethIsA);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\loosu.jpeg"));
		lblNewLabel_13.setBounds(596, 364, 150, 142);
		panel.add(lblNewLabel_13);
	}

	public void show() {
		// TODO Auto-generated method stub
		frame.show();
		
	}
}
