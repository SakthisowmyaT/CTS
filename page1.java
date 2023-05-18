package cts;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTabbedPane;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.border.EtchedBorder;

public class page1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page1 window = new page1();
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
	public page1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1197, 704);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnRaisinBran_1 = new JTextPane();
		txtpnRaisinBran_1.setBounds(300, 337, 787, 181);
		txtpnRaisinBran_1.setText("       \" RAISIN BRAN \" , SALEM, ONE SPOT SOLUTION FOR ALL YOUR MODERNISTIC FOOD PRODUCTS IDEAS THAT COMES TRUE. OUR CITY IS WELL-KNOWN FOR ITS TRADITIONAL FOOD MADE WITH FRESH INGREDIENTS IS NOW BECOMING GLOBALIZED WITH MORE INNOVATIVE INDUSTRIAL PRODUCTS SNACK AND CRACKS.  RAISIN BRAN WAS STARTED A FEW YEARS BACK WITH A GARGANTUAN AMOUNT OF PASSION AND LOVE FOR OUR CUSTOMERS WHO ARE LOOKING TO MERGE MODERN FOOD INDUSTRY AND TRADITIONAL CROSS AND GRAINS. WE PRODUCE TEST QUALITY SELECTED CROPS SUCH AS CORN, MILLET, CEREALS, WHEAT, BARLEY, JOWAR, PEARLY MILLET ETC. RAISIN BRAN IS  ISO CERTIFIED.  WE ALSO PROVIDE MULTI PACKING SERVICES,RANGING FROM POUCH PACK OF 25 GRAMS TO 10KG BASED ON CUSTOMER NEED, HOWEVER NOT LIMITED TO THE SIXES.  WE ARE MANUFACTURING THESE PRODUCS USING MODERN AND LASTEST FOOD PEOCESSING EQUIPMENT AND MACHINERIES.");
		txtpnRaisinBran_1.setForeground(new Color(0, 0, 0));
		txtpnRaisinBran_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtpnRaisinBran_1.setEditable(false);
		frame.getContentPane().add(txtpnRaisinBran_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(112, 222, 211));
		panel.setBounds(0, 0, 1181, 291);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(-88, 48, 1269, 243);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\Arial_Kellogg.jpg"));
		
		JLabel lblRaisinBran = new JLabel("RAISIN BRAN");
		lblRaisinBran.setBackground(new Color(255, 255, 255));
		lblRaisinBran.setBounds(511, 11, 192, 37);
		panel.add(lblRaisinBran);
		lblRaisinBran.setFont(new Font("Shruti", Font.BOLD | Font.ITALIC, 30));
		lblRaisinBran.setForeground(new Color(255, 255, 255));
		
		JButton EMPLOYEE = new JButton("EMPLOYEE");
		EMPLOYEE.setBounds(1032, 25, 76, 23);
		panel.add(EMPLOYEE);
		EMPLOYEE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employeeshow k = new Employeeshow();
				k.show();
				frame.dispose();
			}
		});
		EMPLOYEE.setForeground(new Color(255, 255, 255));
		EMPLOYEE.setFont(new Font("Times New Roman", Font.BOLD, 12));
		EMPLOYEE.setBackground(new Color(112, 222, 211));
		EMPLOYEE.setBorder(null);
		
		JButton ADMISTRATOR = new JButton("ADMIN");
		ADMISTRATOR.setBounds(958, 25, 76, 23);
		panel.add(ADMISTRATOR);
		ADMISTRATOR.setForeground(new Color(255, 255, 255));
		ADMISTRATOR.setFont(new Font("Times New Roman", Font.BOLD, 12));
		ADMISTRATOR.setBackground(new Color(112, 222, 211));
		ADMISTRATOR.setBorder(null);
		
		JButton ABOUTUS = new JButton("ABOUT US");
		ABOUTUS.setBounds(1105, 24, 76, 23);
		panel.add(ABOUTUS);
		ABOUTUS.setFont(new Font("Times New Roman", Font.BOLD, 12));
		ABOUTUS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ABOUTUS a = new ABOUTUS();
				a.show();
				frame.dispose();
			
			}
					
				
		});
		ABOUTUS.setBackground(new Color(112, 222, 211));
		ABOUTUS.setForeground(new Color(255, 255, 255));
		ABOUTUS.setBorder(null);
		
		JButton btnNewButton_1 = new JButton("SIGN UP");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.setBackground(new Color(112, 222, 211));
		btnNewButton_1.setBounds(819, 25, 76, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("LOGIN");
		btnNewButton_2.setBorder(null);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_2.setBackground(new Color(112, 222, 211));
		btnNewButton_2.setBounds(897, 25, 66, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("OUR PRODUCTS");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_3.setBorder(null);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBackground(new Color(112, 222, 211));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBounds(10, 17, 98, 23);
		panel.add(btnNewButton_3);
		ADMISTRATOR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOGIN h = new LOGIN();
				h.show();
				frame.dispose();
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(112, 222, 211));
		panel_1.setBounds(0, 518, 1181, 98);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("CONNECT WITH RAISIN");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(500, 10, 189, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\GOOGLE.png"));
		lblNewLabel_3.setBounds(510, 35, 31, 32);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\linkedin.png"));
		lblNewLabel_4.setBounds(564, 35, 31, 32);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\twitter.png"));
		lblNewLabel_5.setBounds(621, 35, 38, 32);
		panel_1.add(lblNewLabel_5);
		
		
		
		
		JButton btnNewButton = new JButton("TERMS OF USE | CONTACT US | PRIVACY POLICY\r\n");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(112, 222, 211));
		btnNewButton.setBounds(858, 2, 313, 32);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("UNLEASHING OUR POTENTIAL");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(112, 222, 211));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(317, 302, 567, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\chef3.png"));
		lblNewLabel_6.setBounds(10, 302, 246, 282);
		frame.getContentPane().add(lblNewLabel_6);
	}

	public void show() {
		// TODO Auto-generated method stub
		frame.setVisible(true);
	}
}
