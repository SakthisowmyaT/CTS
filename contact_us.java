package cts;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class contact_us {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					contact_us window = new contact_us();
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
	public contact_us() {
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
		panel.setBackground(new Color(255, 0, 0));
		panel.setBounds(0, 0, 1135, 87);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CONTACT US");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(489, 30, 202, 46);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				customerpage f = new customerpage();
				f.show();
				frame.dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\bb.png"));
		btnNewButton.setBounds(22, 39, 34, 30);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\FOOD.jpg"));
		lblNewLabel_1.setBounds(73, 77, 453, 475);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CONTACT US ");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Century", Font.BOLD, 18));
		lblNewLabel_2.setBounds(586, 172, 253, 49);
		frame.getContentPane().add(lblNewLabel_2);
		
		JTextArea txtrCallMonday = new JTextArea();
		txtrCallMonday.setForeground(new Color(0, 0, 0));
		txtrCallMonday.setFont(new Font("Monospaced", Font.BOLD, 13));
		txtrCallMonday.setText("1-800-962-1413\r\n\r\nCALL\r\nMONDAY - FRIDAY\r\n9.00 am - 6.00 pm  EST\r\n\r\n");
		txtrCallMonday.setBounds(586, 213, 404, 97);
		txtrCallMonday.setEditable(false);
		frame.getContentPane().add(txtrCallMonday);
		
		JLabel lblNewLabel_3 = new JLabel("CONTACT  US  BY  EMAIL");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Century", Font.BOLD, 18));
		lblNewLabel_3.setBounds(586, 332, 264, 40);
		frame.getContentPane().add(lblNewLabel_3);
		
		JTextArea txtrChooseATopic = new JTextArea();
		txtrChooseATopic.setForeground(new Color(0, 0, 0));
		txtrChooseATopic.setEditable(false);
		txtrChooseATopic.setFont(new Font("Monospaced", Font.BOLD, 13));
		txtrChooseATopic.setText("Choose a topic below that most closely defines \r\nyour reason.  If ypu are contacting us from\r\na country outside of the US, please visit our \r\nwebsite in your region.\r\n1.General   2.Where to buy   3. Nutrition   4.Promotion\r\n5.Coupon Request   6.Product   7. Personel data\r\n\r\n\r\nEmail : kellog123@gmail.com\r\n");
		txtrChooseATopic.setBounds(586, 372, 375, 167);
		frame.getContentPane().add(txtrChooseATopic);
	}

	public void show() {
		// TODO Auto-generated method stub
		frame.setVisible(true);
		
	}

}
