package cts;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.Document;

//import com.lowagie.text.pdf.PdfTable;
//import com.lowagie.text.pdf.PdfWriter;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.OutputStream;

import javax.print.attribute.standard.MediaSize.NA;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.sql.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.text.Document;
public class EmployeeUpdate {

	private JFrame frame;
	DefaultTableModel model;
	private JTextField IDF;
	private JTextField FIRSTNAME_1;
	private JTextField LASTNAME_1;
	private JTextField DOB_1;
	private JTextField EMAILID_1;
	private JTextField CONTACT_1;
	private JTextField EXPERIENCE_1;
	private JTextField JOBROLE_1;
	private JTable table;
	private JTextField txt_search;
	private JTextField QUALIFICATION_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeUpdate window = new EmployeeUpdate();
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
	public EmployeeUpdate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(714, 160, 389, 272);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i=table.getSelectedRow();
				IDF.setText(model.getValueAt(i, 0).toString());
				FIRSTNAME_1.setText(model.getValueAt(i, 1).toString());
				LASTNAME_1.setText(model.getValueAt(i, 2).toString());
				DOB_1.setText(model.getValueAt(i, 3).toString());
				EMAILID_1.setText(model.getValueAt(i, 4).toString());
			    CONTACT_1.setText(model.getValueAt(i, 5).toString());
				QUALIFICATION_1.setText(model.getValueAt(i, 6).toString());
			    EXPERIENCE_1.setText(model.getValueAt(i, 7).toString());
			    JOBROLE_1.setText(model.getValueAt(i, 8).toString());
			}
		});
		
		frame.setBounds(100, 100, 1151, 699);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		model= new DefaultTableModel();
		Object[] column={"IDF","FIRSTNAME_1","LASTNAME_1","DOB_1","EMAILID_1","CONTACT_1","QUALIFICATION","EXPERIENCE","JOBROLE"};
		Object[] row = new Object[9];
		
		model.setColumnIdentifiers(column);
		table.setModel(model);
		
		
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setBounds(23, 479, 89, 23);
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(IDF.getText().equals("")||FIRSTNAME_1.getText().equals("")||LASTNAME_1.getText().equals("")||DOB_1.getText().equals("")||EMAILID_1.getText().equals("")||CONTACT_1.getText().equals("")||QUALIFICATION_1.getText().equals("")||EXPERIENCE_1.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Please Enter Complete Information");
				}
				else {
					row[0] = IDF.getText();
					row[1] = FIRSTNAME_1.getText();
					row[2] = LASTNAME_1.getText();
					row[3] = DOB_1.getText();
					row[4] = EMAILID_1.getText();
					row[5] = CONTACT_1.getText();
					row[6] = QUALIFICATION_1.getText();
					row[7] = EXPERIENCE_1.getText();
					row[8] = JOBROLE_1.getText();
					model.addRow(row);
				
				
				    try {
				    	
					    Class.forName("com.mysql.cj.jdbc.Driver");
					    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeinfo","root","Sowmi@3012");
					    Statement stmt=con.createStatement();
					    String query = "insert into emploopera values(?,?,?,?,?,?,?,?,?)";
					    PreparedStatement ps = con.prepareStatement(query);
					    ps.setInt(1, Integer.parseInt(IDF.getText()));
					    ps.setString(2, FIRSTNAME_1.getText());
					    ps.setString(3, LASTNAME_1.getText());
					    ps.setString(4, DOB_1.getText());
				    	ps.setString(5, EMAILID_1.getText());
					    ps.setString(6,CONTACT_1.getText());
					    ps.setString(7,  QUALIFICATION_1.getText());
					    ps.setInt(8,Integer.parseInt( EXPERIENCE_1.getText()));
					    ps.setString(9, JOBROLE_1.getText());
					    int i = ps.executeUpdate();
					    JOptionPane.showMessageDialog(frame,i+"Data Recorded Successfully");
					    ps.close();
					    con.close();
					
				   }
				        catch(Exception ae) {
					          JOptionPane.showMessageDialog(btnNewButton, "Data Already exists");
			    }
				}
				
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CLEAR");
		btnNewButton_1.setBounds(177, 479, 89, 23);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IDF.setText(null);
				FIRSTNAME_1.setText(null);
				LASTNAME_1.setText(null);
				DOB_1.setText(null);
				EMAILID_1.setText(null);
				CONTACT_1.setText(null);
				QUALIFICATION_1.setText(null);
				EXPERIENCE_1.setText(null);
				JOBROLE_1.setText(null);
				
				
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		

		
		JButton btnNewButton_3 = new JButton("REMOVE");
		btnNewButton_3.setBounds(500, 479, 89, 23);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(255, 0, 0));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();

				if(i>=0)
				{
					model.removeRow(i);
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeinfo","root","Sowmi@3012");
						Statement stmt=con.createStatement();
						String query = "DELETE FROM emploopera WHERE ID = ?";
						
						PreparedStatement ps = con.prepareStatement(query);
						ps.setString(1, IDF.getText());
						ps.executeUpdate();
						JOptionPane.showMessageDialog(null,"Delete Sucessfully");
					}
					catch(Exception x) {
						JOptionPane.showMessageDialog(null,x);
					}
					IDF.setText(null);
					FIRSTNAME_1.setText(null);
					LASTNAME_1.setText(null);
					DOB_1.setText(null);
					EMAILID_1.setText(null);
					CONTACT_1.setText(null);
					QUALIFICATION_1.setText(null);
					EXPERIENCE_1.setText(null);
					JOBROLE_1.setText(null);
					//JOptionPane.showMessageDialog(null,"Removed Successfully"); slooau one minute wait karooo naa onnu check panra now do design loosu i will update u when i do smt mmm okayy
				}
				else {
					JOptionPane.showMessageDialog(null,"Please Select a Row First");
			}
				/*try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeinfo","root","Sowmi@3012");
					Statement stmt=con.createStatement();
					String query = "DELETE FROM emploopera WHERE ID = ?";
					
					PreparedStatement ps = con.prepareStatement(query);
					ps.setString(1, IDF.getText());
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null,"Delete Sucessfully");
				}
				catch(Exception x) {
					JOptionPane.showMessageDialog(null,x);
				}*/
			   
			
			}
			
		
		
		});
		frame.getContentPane().add(btnNewButton_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1370, 71);
		panel.setBackground(new Color(255, 0, 0));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adminstrator1 x = new Adminstrator1();
				x.show();
				frame.dispose();
              
			}
		});
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\bb.png"));
		btnNewButton_4.setBounds(23, 28, 33, 32);
		btnNewButton_4.setBorder(null);
		panel.add(btnNewButton_4);
		
		JLabel lblNewLabel_12 = new JLabel("EMPLOYEES");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_12.setForeground(new Color(255, 255, 255));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBounds(510, 28, 145, 32);
		panel.add(lblNewLabel_12);
		
		JButton btnNewButton_5 = new JButton("DISPLAY");
		btnNewButton_5.setBounds(500, 106, 89, 23);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_5.setBackground(new Color(255, 0, 0));
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		frame.getContentPane().add(btnNewButton_5);
		
		JLabel ID = new JLabel("ID");
		ID.setFont(new Font("Times New Roman", Font.BOLD, 11));
		ID.setForeground(new Color(255, 0, 0));
		ID.setBounds(23, 160, 46, 14);
		frame.getContentPane().add(ID);
		
		JLabel QUALIFICATION = new JLabel("QUALIFICATION");
		QUALIFICATION.setFont(new Font("Times New Roman", Font.BOLD, 12));
		QUALIFICATION.setForeground(new Color(255, 0, 0));
		QUALIFICATION.setBounds(337, 195, 101, 23);
		frame.getContentPane().add(QUALIFICATION);
		
		JLabel FIRSTNAME = new JLabel("FIRSTNAME");
		FIRSTNAME.setFont(new Font("Times New Roman", Font.BOLD, 12));
		FIRSTNAME.setForeground(new Color(255, 0, 0));
		FIRSTNAME.setBounds(23, 199, 89, 14);
		frame.getContentPane().add(FIRSTNAME);
		
		JLabel LASTNAME = new JLabel("LASTNAME");
		LASTNAME.setForeground(new Color(255, 0, 0));
		LASTNAME.setFont(new Font("Times New Roman", Font.BOLD, 12));
		LASTNAME.setBounds(23, 241, 69, 14);
		frame.getContentPane().add(LASTNAME);
		
		JLabel DOB = new JLabel("DOB");
		DOB.setFont(new Font("Times New Roman", Font.BOLD, 12));
		DOB.setForeground(new Color(255, 0, 0));
		DOB.setBounds(23, 287, 46, 14);
		frame.getContentPane().add(DOB);
		
		JLabel EMAILID = new JLabel("EMAILID");
		EMAILID.setForeground(new Color(255, 0, 0));
		EMAILID.setBounds(23, 331, 46, 14);
		frame.getContentPane().add(EMAILID);
		
		JLabel CONTACT = new JLabel("CONTACT");
		CONTACT.setFont(new Font("Times New Roman", Font.BOLD, 12));
		CONTACT.setForeground(new Color(255, 0, 0));
		CONTACT.setBounds(337, 160, 82, 14);
		frame.getContentPane().add(CONTACT);
		
		JLabel EXPERIENCE = new JLabel("EXPERIENCE");
		EXPERIENCE.setForeground(new Color(255, 0, 0));
		EXPERIENCE.setFont(new Font("Times New Roman", Font.BOLD, 12));
		EXPERIENCE.setBounds(337, 241, 82, 14);
		frame.getContentPane().add(EXPERIENCE);
		
		JLabel JOBROLE = new JLabel("JOB ROLE");
		JOBROLE.setFont(new Font("Times New Roman", Font.BOLD, 12));
		JOBROLE.setForeground(new Color(255, 0, 0));
		JOBROLE.setBounds(335, 287, 103, 14);
		frame.getContentPane().add(JOBROLE);
		
		IDF = new JTextField();
		IDF.setBounds(111, 157, 139, 20);
		IDF.setBorder(null);
		frame.getContentPane().add(IDF);
		IDF.setColumns(10);
		
		FIRSTNAME_1 = new JTextField();
		FIRSTNAME_1.setBounds(111, 195, 139, 20);
		FIRSTNAME_1.setBorder(null);
		frame.getContentPane().add(FIRSTNAME_1);
		FIRSTNAME_1.setColumns(10);
		
		LASTNAME_1 = new JTextField();
		LASTNAME_1.setBounds(111, 238, 139, 20);
		frame.getContentPane().add(LASTNAME_1);
		LASTNAME_1.setBorder(null);
		LASTNAME_1.setColumns(10);
		
		DOB_1 = new JTextField();
		DOB_1.setBounds(111, 284, 139, 20);
		DOB_1.setBorder(null);
		frame.getContentPane().add(DOB_1);
		DOB_1.setColumns(10);
		
		EMAILID_1 = new JTextField();
		EMAILID_1.setBounds(111, 328, 139, 17);
		EMAILID_1.setBorder(null);
		frame.getContentPane().add(EMAILID_1);
		EMAILID_1.setColumns(10);
		
		CONTACT_1 = new JTextField();
		CONTACT_1.setBorder(null);
		CONTACT_1.setBounds(464, 157, 139, 20);
		frame.getContentPane().add(CONTACT_1);
		CONTACT_1.setColumns(10);
		
		QUALIFICATION_1 = new JTextField();
		QUALIFICATION_1.setBounds(464, 192, 139, 20);
		QUALIFICATION_1.setBounds(null);
		frame.getContentPane().add(QUALIFICATION_1);
		QUALIFICATION_1.setBorder(null);
		QUALIFICATION_1.setColumns(10);
		
		EXPERIENCE_1 = new JTextField();
		EXPERIENCE_1.setBounds(464, 238, 139, 20);
		EXPERIENCE_1.setBorder(null);
		frame.getContentPane().add(EXPERIENCE_1);
		EXPERIENCE_1.setColumns(10);
		
		JOBROLE_1 = new JTextField();
		JOBROLE_1.setBounds(466, 284, 137, 20);
		JOBROLE_1.setBorder(null);
		frame.getContentPane().add(JOBROLE_1);
		JOBROLE_1.setColumns(10);
		
		JButton btnNewButton_6 = new JButton("GID");
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_6.setForeground(new Color(255, 255, 255));
		btnNewButton_6.setBackground(new Color(255, 0, 0));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				java.util.Random d = new java.util.Random();
				int start = 1000;
				int end = 100000;
				int result = d.nextInt(end-start) + start;
				IDF.setText(String.valueOf(result));
			}
		});
		btnNewButton_6.setBounds(263, 154, 64, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 0, 0));
		separator.setBounds(111, 180, 139, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(255, 0, 0));
		separator_1.setBounds(111, 216, 139, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(255, 0, 0));
		separator_2.setBounds(111, 258, 139, 2);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(255, 0, 0));
		separator_3.setBounds(111, 304, 139, 2);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(new Color(255, 0, 0));
		separator_4.setBounds(111, 346, 139, 2);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(new Color(255, 0, 0));
		separator_5.setBounds(464, 180, 139, 2);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setForeground(new Color(255, 0, 0));
		separator_6.setBounds(464, 216, 139, 2);
		frame.getContentPane().add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setForeground(new Color(255, 0, 0));
		separator_7.setBounds(464, 258, 139, 2);
		frame.getContentPane().add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setForeground(new Color(255, 0, 0));
		separator_8.setBounds(464, 304, 139, 2);
		frame.getContentPane().add(separator_8);
		
		JLabel lblNewLabel = new JLabel("SEARCH");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(749, 110, 82, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txt_search = new JTextField();
		txt_search.setBorder(null);
		txt_search.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String searchstring = txt_search.getText();
				search(searchstring);
			}
		});
		txt_search.setBounds(841, 107, 174, 20);
		frame.getContentPane().add(txt_search);
		txt_search.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("GENERATE PDF");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setForeground(new Color(255, 0, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String path = "";
				JFileChooser n = new JFileChooser();
				n.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int x = n.showSaveDialog(frame);
				if(x==JFileChooser.APPROVE_OPTION) {
					path = n.getSelectedFile().getPath();
				}
				try {
			   // Document doc=new Document();
			   // PdfWriter.getInstance(doc, FileOutputStream(path="Employee.pdf"));
			   // doc.open();
			    
			   // PdfTable tb = new PdfTable(null, x, x, x);
			    
			    
			    
				}
				catch(Exception k) {
					
				}
			    
				
				
			}

			private OutputStream FileOutputStream(String string) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		btnNewButton_2.setBounds(244, 386, 152, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		QUALIFICATION_1 = new JTextField();
		QUALIFICATION_1.setBounds(463, 196, 140, 14);
		frame.getContentPane().add(QUALIFICATION_1);
		QUALIFICATION_1.setColumns(10);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setForeground(new Color(255, 0, 0));
		separator_9.setBounds(841, 128, 174, 1);
		frame.getContentPane().add(separator_9);
		
		/*JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(714, 160, 389, 272);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);*/
		
		
	}

	public void show() {
		// TODO Auto-generated method stub
		frame.show();
		
		
	}
	public void search(String str) {
		model = (DefaultTableModel) table.getModel();
		TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
		table.setRowSorter(trs);
		trs.setRowFilter(RowFilter.regexFilter(str));
		
	}
		}
