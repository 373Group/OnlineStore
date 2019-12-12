package org.shopping.software;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.shopping.people.Customer;
import org.shopping.people.Employee;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.SystemColor;

public class CustomerLogin {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	public OnlineStore onlinestore;
	public Customer customer;
	private JTextPane txtpnCustomerLogin;
	private JTextPane txtpnUserName;
	private JTextPane txtpnPassword;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					CustomerLogin window = new CustomerLogin();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public CustomerLogin(OnlineStore os) {
		onlinestore = os;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(140, 128, 130, 26);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(140, 186, 130, 26);
		frame.getContentPane().add(textField_1);
		
		JButton button = new JButton("Submit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame.dispose();
				String password = textField_1.getText();
				String name = textField.getText();
				checkLoginStatus(name, password);
			}
		});
		button.setBounds(140, 224, 117, 29);
		frame.getContentPane().add(button);
		
		txtpnCustomerLogin = new JTextPane();
		txtpnCustomerLogin.setContentType("text/html");
		txtpnCustomerLogin.setEditable(false);
		txtpnCustomerLogin.setBackground(Color.GREEN);
		txtpnCustomerLogin.setText("<html><center><b><font size=5><br>Customer Login</font></b></center></html>");
		txtpnCustomerLogin.setBounds(140, 25, 170, 54);
		frame.getContentPane().add(txtpnCustomerLogin);
		
		txtpnUserName = new JTextPane();
		txtpnUserName.setEditable(false);
		txtpnUserName.setBackground(SystemColor.window);
		txtpnUserName.setText("User Name:");
		txtpnUserName.setBounds(145, 107, 73, 16);
		frame.getContentPane().add(txtpnUserName);
		
		txtpnPassword = new JTextPane();
		txtpnPassword.setEditable(false);
		txtpnPassword.setBackground(SystemColor.window);
		txtpnPassword.setForeground(SystemColor.textText);
		txtpnPassword.setText("Password:");
		txtpnPassword.setBounds(145, 166, 73, 16);
		frame.getContentPane().add(txtpnPassword);
	}
	
	
	public void buildCustomerInventory(Customer c) {
			
			System.out.println("buildCustomerInventory function");
			InventoryCustomer ns = new InventoryCustomer(onlinestore, c);
			//secondFrame.frame.setVisible(true);
			ns.frame.setVisible(true);
		}
	
	
	public void checkLoginStatus(String name, String password) {
		Customer cTest1 = null;
		
		if(password.equals("")) {
			System.out.println("Please enter Password");
			JOptionPane.showMessageDialog(null, "No password entered " , "Empty Password", JOptionPane.ERROR_MESSAGE);
		}
		
		else if(name.equals("")) {
			System.out.println("Please enter UserName");
			JOptionPane.showMessageDialog(null, "No UserName entered " , "Empty UserName", JOptionPane.ERROR_MESSAGE);
		}
		else {
		for (Customer c : onlinestore.customerList.keySet()) { 
			//System.out.println(c.getName());
			System.out.println(password);
			if(c.getName().equals(name)) {
				
				cTest1 = c;
				break;
			}
		}
		if(cTest1 !=null) {
			if(onlinestore.customerList.get(cTest1).equals(password)){
				System.out.println("sucess");
				buildCustomerInventory(cTest1);
			}
			else {
				System.out.println("Incorrect password");
				JOptionPane.showMessageDialog(null, "Customer Password incorrect. Please try again." , "Password not correct", JOptionPane.WARNING_MESSAGE);
			}
		}
		else{
			System.out.println("UserName not found");
			//System.out.println(name);
			JOptionPane.showMessageDialog(null, "Customer UserName not found. Please create new ID." , "UserName not found", JOptionPane.ERROR_MESSAGE);
		}
	}
				
	}
}
