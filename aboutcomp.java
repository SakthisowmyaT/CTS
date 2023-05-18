package cts;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class aboutcomp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aboutcomp window = new aboutcomp();
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
	public aboutcomp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1151, 699);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1135, 86);
		panel.setBackground(new Color(255, 0, 0));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ABOUT KELLOGG  COMPANY");
		lblNewLabel.setBounds(68, 11, 1067, 64);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				customerpage a = new customerpage();
				a.show();
				frame.dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\bb.png"));
		btnNewButton.setBounds(27, 30, 32, 32);
		
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\KKKKK.jpeg"));
		lblNewLabel_1.setBounds(632, 315, 481, 272);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("STAYING FOCUSSED FOR GOING FURTHER");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(632, 130, 476, 29);
		frame.getContentPane().add(lblNewLabel_2);
		
		JTextArea txtrOurVisionAgood = new JTextArea();
		txtrOurVisionAgood.setForeground(new Color(0, 0, 0));
		txtrOurVisionAgood.setText("OUR VISION:  Agood and just world where \r\npeople are not just fed bul fulfilled\r\n\r\n\r\nOUR PUPOSE:  Creating better days and\r\na place at the table for everyone through our\r\ntrusted food brands.");
		txtrOurVisionAgood.setBounds(632, 177, 389, 153);
		txtrOurVisionAgood.setEditable(false);
		frame.getContentPane().add(txtrOurVisionAgood);
		
		JLabel lblNewLabel_3 = new JLabel("KELLOG HISTORY");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(151, 135, 230, 29);
		frame.getContentPane().add(lblNewLabel_3);
		
		JTextArea txtrWk = new JTextArea();
		txtrWk.setForeground(new Color(0, 0, 0));
		txtrWk.setText("1894 - W.K. Kellog changed breakfast forever by creating Corn Flakes.\r\n1906 - W.K. Kellog opened the battle creek toasted corn flake company\r\n1914 - Kellog's corn flake =s was introduced in canada.\r\n1915 - Kellog introduces bran flakes, the first high-fiber cereal\r\n1923 - Kellog hired a dietitian, Mary Barber, to help create a proper diet\r\n1930s- The W.K. Kellog foundation was founded to help children realize thier potential\r\n1940s- Kellog's employee produced K-rations for the U.S armed forces during WWII\r\n1950 - Corn pops released\r\n1952   Tony and tiger was introduced along with sugar frosted flakes\r\n1953 - The present day honey smaks was introduced as sugar smakes\r\n1955 - SPECIAl  was released and became the first cereal with seven vitamins and iron\r\n1958 - Introduction of cornelius\r\n1964 - Intoduction of pop trts\r\n1965 - Kellog created an apple-cinnamon flovor cereal, called apple jacks\r\n1997 - The W.K. kellog institute for food and nutrition was opened\r\n2000 - Kellog acquired kashi cereal\r\n2012 - Krave cereal was introduced and kellog acquired pringles\r\n2015 - Acquired parati, leading brazilian biscuit company.\r\n2020 - W.K. Kellog by kids cereal in europe ws introduces\r\n2021 - Pop tarts released a limited-edition box.\r\n2022 - Kellog announces plan to separate its north american cereal and plant based business");
		txtrWk.setBounds(34, 193, 612, 437);
		txtrWk.setEditable(false);
		frame.getContentPane().add(txtrWk);
	}

	public void show() {
		// TODO Auto-generated method stub
		frame.setVisible(true);
	}
}
