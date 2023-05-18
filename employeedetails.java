package cts;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.*;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class employeedetails {

	private JFrame frame1;
	private JTextField empname;
	private JTextField empid;
	private JTextField dobirth;
	private JTextField phonenum;
	private JTextField age;
	private JTextField emailid;
	private JTextField qualification;
	private JTextField role;
	private JTextField basicpay;
	private JTextField week;
	private JTextField leave;
	private JTextField gender;
	//DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					employeedetails window = new employeedetails();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public employeedetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame1 = new JFrame();
		frame1.getContentPane().setBackground(new Color(255, 255, 255));
		frame1.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 572, 473);
		frame1.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EMPLOYEE NAME");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel.setForeground(new Color(47, 211, 225));
		lblNewLabel.setBounds(54, 74, 103, 20);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("EMPLOYEE ID");
		lblNewLabel_1.setForeground(new Color(47, 211, 225));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1.setBounds(54, 112, 89, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DOB");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_2.setForeground(new Color(47, 211, 225));
		lblNewLabel_2.setBounds(54, 143, 76, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("AGE");
		lblNewLabel_3.setForeground(new Color(47, 211, 225));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_3.setBounds(54, 171, 56, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("PHONE NUMBER");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_4.setForeground(new Color(47, 211, 225));
		lblNewLabel_4.setBounds(54, 204, 103, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("EMAIL ID");
		lblNewLabel_5.setForeground(new Color(47, 211, 225));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_5.setBounds(54, 237, 76, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("ADDRESS");
		lblNewLabel_6.setForeground(new Color(47, 211, 225));
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_6.setBounds(334, 237, 97, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("QUALIFICATION");
		lblNewLabel_7.setForeground(new Color(47, 211, 225));
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_7.setBounds(334, 77, 97, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("JOB ROLE");
		lblNewLabel_8.setForeground(new Color(47, 211, 225));
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_8.setBounds(334, 111, 76, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("BASIC PAY");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_9.setForeground(new Color(47, 211, 225));
		lblNewLabel_9.setBounds(334, 142, 76, 14);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("WEEK OFF");
		lblNewLabel_10.setForeground(new Color(47, 211, 225));
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_10.setBounds(334, 168, 76, 20);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("LEAVE");
		lblNewLabel_11.setForeground(new Color(47, 211, 225));
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_11.setBounds(334, 204, 51, 14);
		panel.add(lblNewLabel_11);
		
		empname = new JTextField();
		empname.setBounds(167, 74, 139, 14);
		//textField.addSeparator();
		empname.setBorder(null);
		panel.add(empname);
		empname.setColumns(10);
		
		empid = new JTextField();
		empid.setBounds(166, 105, 140, 14);
		empid.setBorder(null);
		panel.add(empid);
		empid.setColumns(10);
		
		dobirth = new JTextField();
		dobirth.setBounds(167, 133, 139, 14);
		dobirth.setBorder(null);
		panel.add(dobirth);
		dobirth.setColumns(10);
		
		phonenum = new JTextField();
		phonenum.setBorder(null);
		phonenum.setBounds(167, 201, 139, 14);
		panel.add(phonenum);
		phonenum.setColumns(10);
		
		age = new JTextField();
		age.setBounds(167, 165, 139, 14);
		panel.add(age);
		age.setBorder(null);
		age.setColumns(10);
		
		emailid = new JTextField();
		emailid.setBounds(167, 234, 139, 14);
		panel.add(emailid);
		emailid.setBorder(null);
		emailid.setColumns(10);
		
		qualification = new JTextField();
		qualification.setBounds(441, 74, 121, 14);
		panel.add(qualification);
		qualification.setBorder(null);
		qualification.setColumns(10);
		
		role = new JTextField();
		role.setBounds(441, 108, 121, 14);
		panel.add(role);
		role.setBorder(null);
		role.setColumns(10);
		
		basicpay = new JTextField();
		basicpay.setBounds(441, 133, 121, 14);
		panel.add(basicpay);
		basicpay.setBorder(null);
		basicpay.setColumns(10);
		
		week = new JTextField();
		week.setBounds(441, 165, 121, 14);
		panel.add(week);
		week.setBorder(null);
		week.setColumns(10);
		
		leave = new JTextField();
		leave.setBounds(441, 201, 121, 14);
		panel.add(leave);
		leave.setBorder(null);
		leave.setColumns(10);
		
		JTextArea address = new JTextArea();
		address.setWrapStyleWord(true);
	//	address.printBorder(true);
		address.setLineWrap(true);
		address.setBounds(441, 237, 121, 75);
		panel.add(address);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setBackground(new Color(47, 211, 225));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(empname.getText().equals("")||empid.getText().equals("")||dobirth.getText().equals("")||age.getText().equals("")||phonenum.getText().equals("")||emailid.getText().equals("")||gender.getText().equals("")||qualification.getText().equals("")||role.getText().equals("")||basicpay.getText().equals("")||week.getText().equals("")||leave.getText().equals("")||address.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please enter the information" );
				}
				else {
					columnTypes[0]=empname.getText();
					
				}
					try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedetails","root","Sowmi@3012");
					//Statement stmt=con.createStatement();
					String query = "insert into empdetail values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement ps = con.prepareStatement(query);
					ps.setString(1, empname.getText());
					ps.setString(2, empid.getText());
					ps.setString(3, dobirth.getText());
					ps.setInt(4, Integer.parseInt(age.getText()));
					ps.setString(5, phonenum.getText());
					 
					
					ps.setString(6, emailid.getText());
					ps.setString(7,gender.getText());
					ps.setString(8, qualification.getText());
					ps.setString(9, role.getText());
					ps.setInt(10, Integer.parseInt(basicpay.getText()));
					ps.setInt(11, Integer.parseInt(week.getText()));
					ps.setInt(12, Integer.parseInt(leave.getText()));
					ps.setString(13, address.getText());
					//ps.setString(13, query);
					
					int i = ps.executeUpdate();
					JOptionPane.showMessageDialog(frame1,i+"Data Recorded Successfully");
					ps.close();
					con.close();
					
					
					
					
				}
				catch(Exception ae) {
					System.out.println(ae);
					
				}
				
				
					
				}
			}
		);
		btnNewButton.setBounds(32, 340, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("REMOVE");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(47, 211, 225));
		btnNewButton_1.setBounds(186, 340, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("UPDATE");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(47, 211, 225));
		btnNewButton_2.setBounds(334, 340, 89, 23);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_12 = new JLabel("GENDER");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_12.setForeground(new Color(47, 211, 225));
		lblNewLabel_12.setBounds(54, 273, 46, 14);
		panel.add(lblNewLabel_12);
		
		JButton btnNewButton_3 = new JButton("CLEAR");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(47, 211, 225));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				empname.setText(null);
				empid.setText(null);
				gender.setText(null);
				dobirth.setText(null);
				phonenum.setText(null);
                age.setText(null);
                emailid.setText(null);
                qualification.setText(null);
                role.setText(null);
                basicpay.setText(null);
                week.setText(null);
                leave.setText(null);
                address.setText(null);
                
			}
		});
		btnNewButton_3.setBounds(473, 340, 89, 23);
		panel.add(btnNewButton_3);
		
		gender = new JTextField();
		gender.setBounds(167, 270, 139, 14);
		panel.add(gender);
		gender.setBorder(null);
		gender.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(47, 211, 225));
		panel_1.setBounds(0, 0, 572, 53);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("BACK");
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBounds(32, 19, 51, 23);
		panel_1.add(btnNewButton_4);
		btnNewButton_4.setBackground(new Color(47, 211, 225));
		btnNewButton_4.setBorder(null);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(47, 211, 225));
		separator.setBounds(167, 92, 139, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(47, 211, 225));
		separator_1.setBounds(167, 123, 139, 2);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(47, 211, 225));
		separator_2.setBounds(167, 150, 139, 2);
		panel.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(47, 211, 225));
		separator_3.setBounds(167, 180, 139, 2);
		panel.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(new Color(47, 211, 225));
		separator_4.setBounds(167, 216, 139, 2);
		panel.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(new Color(47, 211, 225));
		separator_5.setBounds(167, 249, 139, 2);
		panel.add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setForeground(new Color(47, 211, 225));
		separator_6.setBounds(167, 285, 139, 2);
		panel.add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setForeground(new Color(47, 211, 225));
		separator_7.setBounds(441, 92, 121, 2);
		panel.add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(451, 136, 1, 2);
		panel.add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setForeground(new Color(47, 211, 225));
		separator_9.setBounds(441, 123, 121, 2);
		panel.add(separator_9);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setForeground(new Color(47, 211, 225));
		separator_10.setBounds(441, 148, 121, 2);
		panel.add(separator_10);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setForeground(new Color(47, 211, 225));
		separator_11.setBounds(441, 180, 121, 2);
		panel.add(separator_11);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setForeground(new Color(47, 211, 225));
		separator_12.setBounds(441, 216, 121, 2);
		panel.add(separator_12);
		
		JSeparator separator_13 = new JSeparator();
		separator_13.setForeground(new Color(47, 211, 225));
		separator_13.setBounds(441, 315, 121, 2);
		panel.add(separator_13);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if(JOptionPane.showConfirmDialog(frame,"Confirm  if you want to back","Mysql"));
				Adminstrator1 a= new Adminstrator1();
				frame1.setVisible(true);
				frame1.dispose();
				
			}
		});
		frame1.setBounds(100, 100, 588, 512);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void show() {
		// TODO Auto-generated method stub
		frame1.setVisible(true);
		
	}
}
