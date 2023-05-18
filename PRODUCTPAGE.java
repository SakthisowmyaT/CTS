package cts;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class PRODUCTPAGE {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PRODUCTPAGE window = new PRODUCTPAGE();
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
	public PRODUCTPAGE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1151, 699);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("CTS PRODUCT");
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 1135, 660);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(56, 206, 214));
		panel_1.setBounds(0, 0, 1135, 86);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page1 v = new page1();
				v.show();
				frame.dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\bb.png"));
		btnNewButton.setBounds(26, 46, 35, 29);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("RAISIN PRODUCTS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(488, 61, 166, 14);
		panel_1.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(237, 162, 664, 395);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setForeground(new Color(255, 255, 255));
		table.setBackground(new Color(82, 201, 207));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\pic 4.jpeg"));
		lblNewLabel_1.setBounds(37, 162, 163, 111);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\pic 2.jpeg"));
		lblNewLabel_2.setBounds(37, 284, 163, 132);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\pic1.jpeg"));
		lblNewLabel_3.setBounds(37, 438, 163, 152);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\pic 8.jpeg"));
		lblNewLabel_6.setBounds(953, 467, 138, 123);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\pic 7.jpeg"));
		lblNewLabel_7.setBounds(953, 284, 138, 132);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\pic 5.jpeg"));
		lblNewLabel_8.setBounds(953, 162, 138, 111);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_4 = new JLabel("AVAILABLE PRODUCTS");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_4.setForeground(new Color(0, 0, 160));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(237, 126, 664, 14);
		panel.add(lblNewLabel_4);
	}

	public void show() {
		// TODO Auto-generated method stub
		frame.setVisible(true);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodetails","root","Sowmi@3012");
			Statement st = con.createStatement();
			String query = "Select * from showpro";
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
			String PRODUCT, STOCK, PRICE, BATCHNUMBER,EXPORT ;
			while(rs.next()) {
				PRODUCT = rs.getString(1);
				STOCK = rs.getString(2);
				PRICE = rs.getString(3);
				BATCHNUMBER = rs.getString(4);
				EXPORT = rs.getString(5);
			
				String[] row = {PRODUCT, STOCK, PRICE, BATCHNUMBER, EXPORT};
				model.addRow(row);
			}
			st.close();
			con.close();
		}
		catch(Exception ae){
			ae.getMessage();
			
		}
		
	}
}
