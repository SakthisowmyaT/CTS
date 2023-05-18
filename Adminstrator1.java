package cts;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import javax.swing.JButton;
import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JLayeredPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;

public class Adminstrator1 {

	protected static final Window frame1 = null;
	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adminstrator1 window = new Adminstrator1();
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
	public Adminstrator1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//frame.setUndecorated(true);
		frame.setVisible(true);
		//frame.setSize(1920,1080);
		frame.setBounds(100, 100, 1151, 699);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//frame.show();
		
		table = new JTable();
		table.setBounds(0, 0, 0, 501);
		frame.getContentPane().add(table);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 0));
		panel.setBounds(0, 0, 1370, 68);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton botton = new JButton("LOGOUT");
		botton.setBounds(1271, 34, 89, 23);
		panel.add(botton);
		botton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botton.setFont(new Font("Arial", Font.BOLD, 11));
		botton.setBackground(new Color(74, 223, 216));
		botton.setForeground(new Color(255, 255, 255));
		botton.setBorder(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 0));
		panel_1.setBounds(0, 24, 127, 636);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(62, 5, 2, 2);
		panel_1.add(scrollPane);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Adminstrator1.class.getResource("/cts/ICONS/L2.png")));
		lblNewLabel_8.setBounds(31, 44, 60, 74);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_3 = new JLabel("UPDATE EMPLOYEE");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(297, 254, 116, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("UPDATE PRODUCT");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(565, 257, 116, 23);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedetails","root","Sowmi@3012");
					Statement st = con.createStatement();
					String query = "Select * from empdetail";
					ResultSet rs = st.executeQuery(query);
					ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					
					int cols = rsmd.getColumnCount();
					String[] colName = new String[cols];
					for(int i=0;i<cols;i++)
					{
						/*EMP NAME = rs.getString(1);
						EMP ID = rs.getString(2);
						DOB = rs.getString(3);
						EMP NAME = rs.getString(1);
						EMP NAME = rs.getString(1);
						EMP NAME = rs.getString(1);
						EMP NAME = rs.getString(1);
						EMP NAME = rs.getString(1);
						EMP NAME = rs.getString(1);
						EMP NAME = rs.getString(1);
						EMP NAME = rs.getString(1);
						EMP NAME = rs.getString(1);
						EMP NAME = rs.getString(1);*/
						colName[i]=rsmd.getColumnName(i+1);
						
					}
					model.setColumnIdentifiers(colName);
					String EmployeeName, EmployeeId, DOB, AGE, PhoneNumber, EmailId, Gender,Qualification, JobRole, BasicPay,WeekOff, Leave,Address;
					while(rs.next()) {
						EmployeeName = rs.getString(1);
						EmployeeId = rs.getString(2);
						DOB = rs.getString(3);
						AGE = rs.getString(4);
						PhoneNumber = rs.getString(5);
						EmailId = rs.getString(6);
						Gender = rs.getString(7);
						Qualification = rs.getString(8);
						JobRole = rs.getString(9);
						BasicPay = rs.getString(10);
						WeekOff = rs.getString(11);
						Leave = rs.getString(12);
						Address = rs.getString(13);
						String[] row = {EmployeeName, EmployeeId, DOB, AGE,PhoneNumber, EmailId, Gender, Qualification, JobRole, BasicPay, WeekOff, Leave, Address};
						model.addRow(row);
					}
					st.close();
					con.close();
				}
				catch(Exception ae){
					ae.getMessage();
					
				}
				EmployeeUpdate m = new EmployeeUpdate();
				m.show();
			    frame.dispose();
			    
			    
			
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon(Adminstrator1.class.getResource("/cts/ICONS/EMPLOYEEE.png")));
		btnNewButton.setBounds(297, 135, 116, 122);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table d = new table();
				d.show();
				frame.dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Adminstrator1.class.getResource("/cts/ICONS/PRODUCT.png")));
		btnNewButton_1.setBounds(565, 135, 116, 111);
		btnNewButton_1.setBorder(null);
		frame.getContentPane().add(btnNewButton_1);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(205, 153, 1, 1);
		frame.getContentPane().add(layeredPane);
		
		JButton btnNewButton_2 = new JButton("LOGOUT");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_2.setBounds(1036, 519, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//btnNewButton_2.setBounds(400,200,400,100);
				int u = JOptionPane.showConfirmDialog(btnNewButton_2,"Are you sure want to Exit?");
				//JOptionPane optionPane = new JOptionPane(new JLabel("Hello World",JLabel.CENTER));
				//btnNewButton_2.setBounds(400,200,400,100);
				//u.setBounds(400,200,400,100);
				//int u == JOptionPane(new JLabel("Hello World",JLabel.CENTER));
				if(u ==JOptionPane.YES_OPTION ) {
				   fpage g = new fpage();
				   g.show();
				   frame.dispose();
			}
				//btnNewButton_2.setBounds(1025, 34, 89, 23);
				//btnNewButton_2.setVisible(true);
				/*if(u==JOptionPane.NO_OPTION )
				{
					btnNewButton_2.setBounds(1025, 34, 89, 23);
					//btnNewButton_2.setVisible(true);
					frame.getContentPane().add(btnNewButton_2);
				}
				if(u == JOptionPane.CANCEL_OPTION) {
					btnNewButton_2.setBounds(1025,34,89,23);
					//frame.add(btnNewButton_2);
				}*/
			}
		});
		btnNewButton_2.setVisible(true);
		btnNewButton_2.setBackground(new Color(255, 0, 0));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBorder(null);
	}

	public void show() {
		// TODO Auto-generated method stub
		frame.setVisible(true);
		
	}
}
