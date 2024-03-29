package org.shopping.software;
import java.util.*;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.shopping.people.Customer;
import org.shopping.people.Employee;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;



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
		txtrPleaseCreateAn.setBackground(SystemColor.window);
		txtrPleaseCreateAn.setText(" Please create an account to use baby Amazon");
		txtrPleaseCreateAn.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtrPleaseCreateAn.setBounds(77, 26, 311, 16);
		frame.getContentPane().add(txtrPleaseCreateAn);
		
//		JTextArea txtrName = new JTextArea();
//		txtrName.setText("Name");
//		txtrName.setBounds(18, 102, 142, 27);
//		frame.getContentPane().add(txtrName);
		
		JTextArea txtrUsername = new JTextArea();
		txtrUsername.setBackground(SystemColor.window);
		txtrUsername.setEditable(false);
		txtrUsername.setText("Username:");
		txtrUsername.setBounds(103, 108, 80, 16);
//		txtrUsername.setAlignmentX(Component.CENTER_ALIGNMENT);
		frame.getContentPane().add(txtrUsername);
		
		JTextArea txtrPassword = new JTextArea();
		txtrPassword.setBackground(SystemColor.window);
		txtrPassword.setEditable(false);
		txtrPassword.setText("Password:");
		txtrPassword.setBounds(103, 163, 78, 16);
//		txtrPassword.setAlignmentX(Component.CENTER_ALIGNMENT);
		frame.getContentPane().add(txtrPassword);
		
//		textField = new JTextField();
//		textField.setBounds(236, 103, 130, 26);
//		frame.getContentPane().add(textField);
//		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(103, 124, 164, 26);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(103, 179, 164, 26);
		frame.getContentPane().add(textField_2);
		
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Employee");
		rdbtnNewRadioButton.setBounds(103, 73, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnUser = new JRadioButton("User");
		rdbtnUser.setBounds(247, 72, 141, 23);
		frame.getContentPane().add(rdbtnUser);
		
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rdbtnNewRadioButton);
		bgroup.add(rdbtnUser);
		
		
		
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
		btnNewButton.setBounds(211, 217, 144, 29);
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
				JOptionPane.showMessageDialog(null, "New Employee Created. PLease Login Again" , "new Employee", JOptionPane.PLAIN_MESSAGE);
				
				buildEmployeeLoginGUI();
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
				JOptionPane.showMessageDialog(null, "New Customer Created. Please Login Again " , "new Customer", JOptionPane.PLAIN_MESSAGE);
				buildCustomerLoginGUI();
				
			}
			
			
			
		}

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
}
