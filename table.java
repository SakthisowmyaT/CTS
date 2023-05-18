package cts;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.sql.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class table {

	private JFrame frame;
	private JTextField product;
	private JTextField stock;
	private JTextField priceperkg;
	private JTextField BatchNumber;
	private JTextField export;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnADD;
	private JButton btnREMOVE;
	private JButton btnUPDATE;
	private JButton btnCLEAR;
	DefaultTableModel model;
	private JTextField txt_search;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					table window = new table();
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
	public table() {
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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 1135, 660);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PRODUCT");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(69, 218, 218));
		lblNewLabel.setBounds(83, 169, 74, 28);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("STOCK");
		lblNewLabel_1.setForeground(new Color(69, 218, 218));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(83, 226, 89, 21);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PRICE PER KG\r\n");
		lblNewLabel_2.setForeground(new Color(69, 218, 218));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(83, 273, 111, 28);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BATCH NUMBER");
		lblNewLabel_3.setForeground(new Color(69, 218, 218));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(83, 328, 111, 28);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("EXPORT");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setForeground(new Color(69, 218, 218));
		lblNewLabel_4.setBounds(83, 383, 89, 28);
		panel.add(lblNewLabel_4);
		
		product = new JTextField();
		product.setBounds(254, 171, 179, 21);
		panel.add(product);
		product.setBorder(null);
		product.setColumns(10);
		
		stock = new JTextField();
		stock.setColumns(10);
		stock.setBorder(null);
		stock.setBounds(254, 224, 179, 24);
		panel.add(stock);
		
		priceperkg = new JTextField();
		priceperkg.setColumns(10);
		priceperkg.setBorder(null);
		priceperkg.setBounds(254, 275, 179, 24);
		panel.add(priceperkg);
		
		BatchNumber = new JTextField();
		BatchNumber.setColumns(10);
		BatchNumber.setBounds(254, 330, 179, 24);
		BatchNumber.setBorder(null);
		panel.add(BatchNumber);
		
		export = new JTextField();
		export.setColumns(10);
		export.setBorder(null);
		export.setBounds(254, 387, 179, 24);
		panel.add(export);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(494, 132, 596, 446);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setForeground(new Color(0, 0, 0));
		table.setCellSelectionEnabled(true);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i=table.getSelectedRow();
				product.setText(model.getValueAt(i, 0).toString());
				stock.setText(model.getValueAt(i, 1).toString());
				priceperkg.setText(model.getValueAt(i, 2).toString());
				BatchNumber.setText(model.getValueAt(i, 3).toString());
				export.setText(model.getValueAt(i, 4).toString());
			}
		});
		table.setBackground(new Color(255, 255, 255));
		//table.setEnabled(false);
		model = new DefaultTableModel();
		//table.setDefaultEditor(, null);  
		Object[] column = {"Product","Stock","Price per kg","Quality","Export"};
		//table.setDefaultEditor(Object[], null);  
		final Object[] row = new Object[5];
		//table.setDefaultEditor(row[],null); 
		
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(69, 218, 218));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(product.getText().equals("")||stock.getText().equals("")||priceperkg.getText().equals("")||BatchNumber.getText().equals("")||product.getText().equals("export"))
				{
					JOptionPane.showMessageDialog(null,"Please Fill Complete Information");
				}
				else
				{
					row[0]=product.getText();
					row[1]=stock.getText();
					row[2]=priceperkg.getText();
					row[3]=BatchNumber.getText();
					row[4]=export.getText();
					model.addRow(row);
					
					/*product.setText("");
					stock.setText("");
					priceperkg.setText("");
					quality.setText("");
					export.setText("");
					JOptionPane.showMessageDialog(null,"Saved Successfully");*/
					
					 try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodetails","root","Sowmi@3012");
							//Statement stmt=con.createStatement();
							String query = "insert into showpro values(?,?,?,?,?)";
							PreparedStatement ps = con.prepareStatement(query);
							ps.setString(1, product.getText());
							ps.setInt(2, Integer.parseInt(stock.getText()));
							ps.setInt(3, Integer.parseInt(priceperkg.getText()));
							ps.setString(4, BatchNumber.getText());
							ps.setString(5, export.getText());
							
							int i = ps.executeUpdate();
							JOptionPane.showMessageDialog(frame,i+"Data Recorded Successfully");
							ps.close();
							con.close();
							
							
							
							
						}
						catch(Exception ae) {
							System.out.println(ae);
							
						}
				}

			}
		});
		btnNewButton.setBounds(61, 472, 118, 28);
		panel.add(btnNewButton);
		
		JButton btnRemove = new JButton("REMOVE");
		btnRemove.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnRemove.setForeground(new Color(255, 255, 255));
		btnRemove.setBorder(null);
		btnRemove.setBackground(new Color(69, 218, 218));
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=table.getSelectedRow();
				if(i>=0)
				{
					model.removeRow(i);
					JOptionPane.showMessageDialog(null,"Removed Successfully");
				}
				else
					JOptionPane.showMessageDialog(null,"Please Select a Row First");
				
			}
		});
		btnRemove.setBounds(304, 472, 118, 28);
		panel.add(btnRemove);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setForeground(new Color(255, 255, 255));
		btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnUpdate.setBackground(new Color(69, 218, 218));
        btnUpdate.setBorder(null);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=table.getSelectedRow();
				if(i>=0)
				{
					model.setValueAt(product.getText(), i, 0);
					model.setValueAt(stock.getText(), i, 1);
					model.setValueAt(priceperkg.getText(), i, 2);
					model.setValueAt(BatchNumber.getText(), i, 3);
					model.setValueAt(export.getText(), i, 4);
					JOptionPane.showMessageDialog(null,"Updated Successfully");
				}
				else
					JOptionPane.showMessageDialog(null,"Please Select a Row First");
				
			}
		});
		btnUpdate.setBounds(61, 530, 118, 28);
		panel.add(btnUpdate);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setForeground(new Color(255, 255, 255));
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnClear.setBackground(new Color(69, 218, 218));
		btnClear.setBorder(null);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				product.setText("");
				stock.setText("");
				priceperkg.setText("");
				BatchNumber.setText("");
				export.setText("");
			}
		});
		btnClear.setBounds(304, 530, 118, 28);
		panel.add(btnClear);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 0));
		panel_1.setBounds(0, 0, 1135, 72);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adminstrator1 f = new Adminstrator1();
				f.show();
				frame.dispose();
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\bb.png"));
		btnNewButton_1.setBounds(20, 23, 34, 28);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("PRODUCT DETAILS");
		lblNewLabel_5.setBounds(491, 47, 148, 14);
		panel_1.add(lblNewLabel_5);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(60, 203, 219));
		separator.setBounds(254, 195, 180, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(60, 203, 219));
		separator_1.setBounds(254, 249, 179, 2);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(60, 203, 219));
		separator_2.setBounds(254, 299, 179, 2);
		panel.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(60, 203, 219));
		separator_3.setBounds(254, 354, 179, 2);
		panel.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(254, 411, 179, 2);
		panel.add(separator_4);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\SALES.png"));
		lblNewLabel_6.setBounds(222, 83, 60, 67);
		panel.add(lblNewLabel_6);
		
		JButton btnNewButton_2 = new JButton("AVAILABLE PRODUCTS");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(82, 201, 207));
		btnNewButton_2.setBounds(323, 83, 189, 23);
		panel.add(btnNewButton_2);
		
		txt_search = new JTextField();
		txt_search.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String searchstring = txt_search.getText();
				search(searchstring);
			}
		});
		txt_search.setBounds(798, 83, 222, 20);
		panel.add(txt_search);
		txt_search.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("search here");
		lblNewLabel_7.setBounds(671, 87, 89, 14);
		panel.add(lblNewLabel_7);
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public JButton getBtnADD() {
		return btnADD;
	}

	public void setBtnADD(JButton btnADD) {
		this.btnADD = btnADD;
	}

	public JButton getBtnREMOVE() {
		return btnREMOVE;
	}

	public void setBtnREMOVE(JButton btnREMOVE) {
		this.btnREMOVE = btnREMOVE;
	}

	public JButton getBtnUPDATE() {
		return btnUPDATE;
	}

	public void setBtnUPDATE(JButton btnUPDATE) {
		this.btnUPDATE = btnUPDATE;
	}

	public JButton getBtnCLEAR() {
		return btnCLEAR;
	}

	public void setBtnCLEAR(JButton btnCLEAR) {
		this.btnCLEAR = btnCLEAR;
	}

	public void show() {
		// TODO Auto-generated method stub
		frame.setVisible(true);
		
		
	}
	public void search(String str) {
		model = (DefaultTableModel) table.getModel();
		TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
		table.setRowSorter(trs);
		trs.setRowFilter(RowFilter.regexFilter(str));
		
	}
}

