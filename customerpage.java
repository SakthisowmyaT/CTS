package cts;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

public class customerpage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customerpage window = new customerpage();
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
	public customerpage() {
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
	    
	    JLabel lblNewLabel = new JLabel("We're one of the original plant-based wellbeing companies");
	    lblNewLabel.setBackground(new Color(255, 0, 0));
	    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel.setForeground(new Color(255, 255, 255));
	    lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
	    lblNewLabel.setBounds(98, 0, 932, 44);
	    panel.add(lblNewLabel);
	    
	    JButton btnNewButton = new JButton("ABOUT COMPANY");
	    btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
	    btnNewButton.setForeground(new Color(255, 255, 255));
	    btnNewButton.setBackground(new Color(255, 0, 0));
	    btnNewButton.setBorder(null);
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		aboutcomp a = new aboutcomp();
	    		a.show();
	    		frame.dispose();
	    	}
	    });
	    btnNewButton.setBounds(0, 55, 119, 23);
	    panel.add(btnNewButton);
	    
	    JButton btnNewButton_1 = new JButton("OUR FOODS");
	    btnNewButton_1.setForeground(new Color(255, 255, 255));
	    btnNewButton_1.setBorder(null);
	    btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
	    btnNewButton_1.setBackground(new Color(255, 0, 0));
	    btnNewButton_1.setBounds(119, 55, 119, 23);
	    panel.add(btnNewButton_1);
	    
	    JButton btnNewButton_2 = new JButton("ABOUT US");
	    btnNewButton_2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		ABOUTUS a = new ABOUTUS();
	    		a.show();
	    		frame.dispose();
	    		
	    	}
	    });
	    btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
	    btnNewButton_2.setForeground(new Color(255, 255, 255));
	    btnNewButton_2.setBorder(null);
	    btnNewButton_2.setBackground(new Color(255, 0, 0));
	    btnNewButton_2.setBounds(236, 55, 78, 23);
	    panel.add(btnNewButton_2);
	    
	    JButton btnNewButton_3 = new JButton("CONTACT US");
	    btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 13));
	    btnNewButton_3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		contact_us a = new contact_us();
	    		a.show();
	    		frame.dispose();
	    		}
	    });
	    btnNewButton_3.setForeground(new Color(255, 255, 255));
	    btnNewButton_3.setBackground(new Color(255, 0, 0));
	  
	    btnNewButton_3.setBounds(324, 55, 90, 23);
	    btnNewButton_3.setBorder(null);
	    panel.add(btnNewButton_3);
	    
	    JButton btnNewButton_4 = new JButton("SEE OUR BRANDS");
	    btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 13));
	    btnNewButton_4.setBorder(null);
	    btnNewButton_4.setForeground(new Color(255, 255, 255));
	    btnNewButton_4.setBackground(new Color(255, 0, 0));
	    btnNewButton_4.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		brandspage b = new brandspage();
	    		b.show();
	    		frame.dispose();
	    		}
	    });
	    btnNewButton_4.setBounds(424, 55, 119, 23);
	    panel.add(btnNewButton_4);
	    
	    JButton btnNewButton_5 = new JButton("");
	    btnNewButton_5.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    
	    	}
	    });
	    btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\bb.png"));
	    btnNewButton_5.setBounds(10, 11, 34, 27);
	    panel.add(btnNewButton_5);
	    
	    JLabel lblNewLabel_2 = new JLabel("");
	    lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\NUTRITION.jpeg"));
	    lblNewLabel_2.setBounds(501, 185, 328, 276);
	    frame.getContentPane().add(lblNewLabel_2);
	    
	    JLabel lblNewLabel_1 = new JLabel("");
	    lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\Kelloggs-1234.png"));
	    lblNewLabel_1.setBounds(367, 83, 292, 99);
	    frame.getContentPane().add(lblNewLabel_1);
	    
	    JLabel lblNewLabel_3 = new JLabel("");
	    lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\thiya\\Desktop\\CTS\\better days.jpeg"));
	    lblNewLabel_3.setBounds(52, 185, 414, 276);
	    frame.getContentPane().add(lblNewLabel_3);
	    
	    JLabel lblNewLabel_4 = new JLabel("Kellog's Better days");
	    lblNewLabel_4.setForeground(new Color(255, 0, 0));
	    lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
	    lblNewLabel_4.setBounds(52, 472, 141, 14);
	    frame.getContentPane().add(lblNewLabel_4);
	    
	    JTextArea txtrWeAreCommitted = new JTextArea();
	    txtrWeAreCommitted.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 13));
	    txtrWeAreCommitted.setText("We are committed to creating Better days for 3 \r\nbillion people by focusing on the interconnected \r\nissues of wellbring, hunger and climate resiliency\r\n");
	    txtrWeAreCommitted.setBounds(51, 497, 395, 81);
	    frame.getContentPane().add(txtrWeAreCommitted);
	    
	    JLabel lblNewLabel_5 = new JLabel("UNLEASHING OUR POTENTIAL");
	    lblNewLabel_5.setForeground(new Color(255, 0, 0));
	    lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
	    lblNewLabel_5.setBounds(501, 472, 249, 14);
	    frame.getContentPane().add(lblNewLabel_5);
	    
	    JTextArea txtrKellogIsTaking = new JTextArea();
	    txtrKellogIsTaking.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 13));
	    txtrKellogIsTaking.setText("Kellog is taking bold next  steps\r\non its portfolio transformation journey");
	    txtrKellogIsTaking.setBounds(501, 497, 328, 71);
	    frame.getContentPane().add(txtrKellogIsTaking);
	    
	    JLabel lblNewLabel_6 = new JLabel("KELLOG AROUND THE WORLD\r\n");
	    lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
	    lblNewLabel_6.setForeground(new Color(255, 0, 0));
	    lblNewLabel_6.setBounds(863, 185, 238, 14);
	    frame.getContentPane().add(lblNewLabel_6);
	    
	    JTextArea txtrNorthAmericaCentral = new JTextArea();
	    txtrNorthAmericaCentral.setFont(new Font("Monospaced", Font.BOLD, 20));
	    txtrNorthAmericaCentral.setText("NORTH AMERICA\r\nCENTRAL AMERICA\r\nLATIN & SOUTH AMERICA\r\nEUROPE & MIDDLE EAST\r\nAFRICA \r\nASIA\r\nOCEANIA\r\nGLOBAL\r\nU.S\r\n");
	    txtrNorthAmericaCentral.setBounds(863, 234, 262, 314);
	    frame.getContentPane().add(txtrNorthAmericaCentral);
	}

	public void show() {
		// TODO Auto-generated method stub
		frame.setVisible(true);
		
	}
}
