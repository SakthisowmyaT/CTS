package cts;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.lang.*;
import java.awt.*;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LOGIN {

	private JFrame frame;
	private JTextField EMAIL;
	private JPasswordField PASSWORD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGIN window = new LOGIN();
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
	public LOGIN() {
	
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
		
		JLabel lblNewLabel_1 = new JLabel("ADMINISTRATOR");
		lblNewLabel_1.setBounds(771, 149, 287, 36);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(141, 94, 534, 477);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\FOOD.jpg"));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("EMAIL");
		lblNewLabel_2.setBounds(755, 236, 46, 14);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PASSWORD");
		lblNewLabel_3.setBounds(756, 331, 79, 14);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBounds(488, 359, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/boat","root","Sowmi@3012");
					Statement stmt=con.createStatement(); 
					String sql="Select * from elcot where EMAIL='"+EMAIL.getText()+"' and PASSWORD='"+PASSWORD.getText()+"'";
					ResultSet rs = stmt.executeQuery(sql);
					if(rs.next())
					{
						JOptionPane.showMessageDialog(null, "Login Successfully...");
						Adminstrator1 b = new Adminstrator1();
						b.show();
						
					}
					else {
						JOptionPane.showMessageDialog(null,  "Incorrect email and password");
					}
					con.close();
					//dispose();
				}
				catch(Exception ae)
				{
					System.out.print(ae);
				}
			
			    page1 a = new page1();
				//a.show();
				//dispose();*/
				
				
				

				
				

				
				
				
				
				}

			

			
		});
		btnNewButton.setBackground(new Color(56, 226, 226));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.setForeground(new Color(255, 255, 255));
 //.getContentPane().add(btnNewButton);
		
		//protected void dispose() {
		// TODO Auto-generated method stub
		
	//}
		JSeparator separator = new JSeparator();
		separator.setBounds(885, 248, 140, 2);
		separator.setForeground(new Color(255, 0, 0));
		frame.getContentPane().add(separator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(885, 343, 140, 2);
		separator_2.setForeground(new Color(255, 0, 0));
		frame.getContentPane().add(separator_2);
		
		EMAIL = new JTextField();
		EMAIL.setBounds(885, 220, 140, 23);
		EMAIL.setBorder(null);
		frame.getContentPane().add(EMAIL);
		EMAIL.setColumns(10);
		
		PASSWORD = new JPasswordField();
		PASSWORD.setBounds(885, 324, 140, 14);
		PASSWORD.setBorder(null);
		
		frame.getContentPane().add(PASSWORD);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1135, 83);
		panel.setBackground(new Color(255, 0, 0));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("LOGIN");
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/authorityaccess","root","Sowmi@3012");
					Statement stmt=con.createStatement(); 
					String sql="Select * from personnel where Email='"+EMAIL.getText()+"' and Password='"+PASSWORD.getText()+"'";
					ResultSet rs = stmt.executeQuery(sql);
					if(EMAIL.getText().equals("")||PASSWORD.getText().equals("")) {
						JOptionPane.showMessageDialog(null,"Please enter all the fields");
					}
					else if(rs.next())
					{
						JOptionPane.showMessageDialog(null, "Login Successfully...");
						Adminstrator1 b = new Adminstrator1();
						b.show();
						frame.dispose();
						
						
						//dispose()
					    
						
					}
					else {
						JOptionPane.showMessageDialog(null,  "Incorrect email and password");
					}
					con.close();
					//dispose();
				}
				catch(Exception ae)
				{
					System.out.print(ae);
				}
				//dispose();
				
			}
		});
		btnNewButton_1.setBounds(901, 414, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("HOME\r\n\r\n");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page1 p=new page1();
				p.show();
				frame.dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(255, 0, 0));
		btnNewButton_2.setBounds(901, 482, 89, 23);
		btnNewButton_2.setBorder(null);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel show = new JLabel("");
		show.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\eye open.jpg"));
		show.setBounds(1042, 314, 39, 31);
		frame.getContentPane().add(show);
		
		JLabel hide = new JLabel("");
		hide.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				show.setVisible(true);
				hide.setVisible(false);
				PASSWORD.setEchoChar((char)0);
				
			}
			//@Override
			public void mouseReleased(MouseEvent e) {
				show.setVisible(false);
				hide.setVisible(true);
				PASSWORD.setEchoChar('*');
			}
		});
		hide.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\eye close.jpg"));
		hide.setBounds(1040, 322, 41, 23);
		frame.getContentPane().add(hide);
			}

	public void show() {
		// TODO Auto-generated method stub
		frame.setVisible(true);
		
	}
}
	
