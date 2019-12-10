package org.shopping.software;
import java.util.*;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.shopping.people.Customer;
import org.shopping.people.Employee;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class CreateUser {

	public JFrame frame;
	//private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public OnlineStore onlinestore;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					CreateUser window = new CreateUser();
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
	public CreateUser(OnlineStore os) {
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
		
		JTextArea txtrPleaseCreateAn = new JTextArea();
		txtrPleaseCreateAn.setText("Please create an account");
		txtrPleaseCreateAn.setBounds(114, 17, 220, 54);
		frame.getContentPane().add(txtrPleaseCreateAn);
		
//		JTextArea txtrName = new JTextArea();
//		txtrName.setText("Name");
//		txtrName.setBounds(18, 102, 142, 27);
//		frame.getContentPane().add(txtrName);
		
		JTextArea txtrUsername = new JTextArea();
		txtrUsername.setText("Username");
		txtrUsername.setBounds(18, 141, 142, 27);
		frame.getContentPane().add(txtrUsername);
		
		JTextArea txtrPassword = new JTextArea();
		txtrPassword.setText("Password");
		txtrPassword.setBounds(18, 180, 142, 27);
		frame.getContentPane().add(txtrPassword);
		
//		textField = new JTextField();
//		textField.setBounds(236, 103, 130, 26);
//		frame.getContentPane().add(textField);
//		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(236, 136, 130, 26);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(236, 181, 130, 26);
		frame.getContentPane().add(textField_2);
		
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Employee");
		rdbtnNewRadioButton.setBounds(55, 72, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnUser = new JRadioButton("User");
		rdbtnUser.setBounds(225, 72, 141, 23);
		frame.getContentPane().add(rdbtnUser);
		
		
		
		JButton btnNewButton = new JButton("Create Account");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame.dispose();
				
				String password = textField_2.getText();
				String name = textField_1.getText();
				Boolean userBtn = false;
				Boolean empBtn = false;
				
				if(rdbtnUser.isSelected()) {
					
					userBtn = true;
				}
				if(rdbtnNewRadioButton.isSelected()) {
					
					 empBtn = true;
				}
				createUser(name, password, userBtn, empBtn);
			}
			
		});
		btnNewButton.setBounds(236, 227, 144, 29);
		frame.getContentPane().add(btnNewButton);
		
	}
	
	public void createUser(String name, String password, Boolean uBtn, Boolean eBtn){
//		Employee e1 = null;
		
		if(eBtn) {
			if(password.equals("")) {
				System.out.println("Please enter Password");
				JOptionPane.showMessageDialog(null, "No password entered " , "Empty Password", JOptionPane.ERROR_MESSAGE);
			}else if(name.equals("")) {
				System.out.println("Please enter UserName");
				JOptionPane.showMessageDialog(null, "No UserName entered " , "Empty UserName", JOptionPane.ERROR_MESSAGE);
			}else {
				Employee e1 = new Employee(name);
//				e1.setName(name);
				
				onlinestore.employeeList.put(e1, password);
				System.out.println("New Employee Created, Please login");
				JOptionPane.showMessageDialog(null, "New Employee Created" , "new Employee", JOptionPane.PLAIN_MESSAGE);
			}
			
			
			
		}
		if(uBtn) {
			
			if(password.equals("")) {
				System.out.println("Please enter Password");
				JOptionPane.showMessageDialog(null, "No password entered " , "Empty Password", JOptionPane.ERROR_MESSAGE);
			}else if(name.equals("")) {
				System.out.println("Please enter UserName");
				JOptionPane.showMessageDialog(null, "No UserName entered " , "Empty UserName", JOptionPane.ERROR_MESSAGE);
			}else {
				System.out.println("User radio button pressed");
				Customer c1 = new Customer(name);
				//c1.setName(name);
				
				onlinestore.customerList.put(c1, password);
				//System.out.println("New Customer Created, Please Login");
				JOptionPane.showMessageDialog(null, "New Customer Created " , "new Customer", JOptionPane.PLAIN_MESSAGE);
			}
			
			
			
		}

	}
}
