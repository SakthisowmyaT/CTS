package cts;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class brandspage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					brandspage window = new brandspage();
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
	public brandspage() {
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
		panel.setBounds(0, 0, 1135, 81);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				customerpage a = new customerpage();
				a.show();
				frame.dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\bb.png"));
		btnNewButton.setBounds(24, 36, 32, 34);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("SEE OUR BRANDS");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(448, 36, 227, 34);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\PRINGLES.jpeg"));
		lblNewLabel_3.setBounds(697, 359, 100, 212);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\MORNING STARS.jpeg"));
		lblNewLabel_4.setBounds(413, 92, 295, 223);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\NUTRIGAIN1.jpeg"));
		lblNewLabel_5.setBounds(799, 92, 250, 223);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_1 = new JLabel("EGGO");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Monospaced", Font.BOLD, 12));
		lblNewLabel_1.setBounds(252, 290, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\EGGO.jpeg"));
		lblNewLabel_6.setBounds(37, 92, 261, 222);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_2 = new JLabel("CORN FLAKES");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_2.setBounds(298, 541, 85, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\CORNFLAKS.jpeg"));
		lblNewLabel_7.setBounds(217, 359, 282, 222);
		frame.getContentPane().add(lblNewLabel_7);
	}

	public void show() {
		// TODO Auto-generated method stub
		frame.setVisible(true);
		
	}
}
