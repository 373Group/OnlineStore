package org.shopping.software;
import org.shopping.people.Customer;
import org.shopping.people.Employee;
import org.shopping.software.EmpLogin;
import org.shopping.warehouse.Inventory;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Color;

public class Test1 {

	public JFrame frame;
	public OnlineStore onlinestore;

	public Test1(OnlineStore os) {
		onlinestore = os;
		initialize();
	}

	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnEmployeeLogin = new JButton("Employee Login");
		btnEmployeeLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//frame.getContentPane().removeAll();
				frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame.dispose();
				//frame.repaint();
				buildEmployeeLoginGUI();	
				
				
			}
		});
		btnEmployeeLogin.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnEmployeeLogin.setBounds(80, 159, 138, 55);
		frame.getContentPane().add(btnEmployeeLogin);

		JButton btnCustomerLogin = new JButton("Customer Login");
		btnCustomerLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame.dispose();
				buildCustomerLoginGUI();	
			}
		});
		btnCustomerLogin.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnCustomerLogin.setBounds(228, 159, 138, 55);
		frame.getContentPane().add(btnCustomerLogin);

		JTextPane txtpnWelcomeToBaby = new JTextPane();
		txtpnWelcomeToBaby.setBackground(Color.CYAN);
		txtpnWelcomeToBaby.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtpnWelcomeToBaby.setText("Welcome to baby Amazon");
		txtpnWelcomeToBaby.setBounds(100, 60, 249, 55);
		frame.getContentPane().add(txtpnWelcomeToBaby);
		
		JButton btnNewUser = new JButton("New User?");
		btnNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame.dispose();
				buildNewUserLoginGUI();	
				
			}
		});
		btnNewUser.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewUser.setBounds(153, 217, 138, 55);
		frame.getContentPane().add(btnNewUser);
	}
	
	public void buildEmployeeLoginGUI() {
		
		System.out.println("buildEmpLogin function");
		EmpLogin ns = new EmpLogin(onlinestore);
		//secondFrame.frame.setVisible(true);
		ns.frame.setVisible(true);
		
	}
	public void buildCustomerLoginGUI() {
		
		System.out.println("buildCustLogin function");
		CustomerLogin ns = new CustomerLogin(onlinestore);
		//secondFrame.frame.setVisible(true);
		ns.frame.setVisible(true);
		
	}
	
	public void buildNewUserLoginGUI() {
			System.out.println("buildNewUserLoginGUI() function");
			CreateUser ns = new CreateUser(onlinestore);
			//secondFrame.frame.setVisible(true);
			ns.frame.setVisible(true);
			
		}
	
	
}


