package org.shopping.software;
import java.util.*;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.shopping.people.Customer;
import org.shopping.people.Employee;

import javax.swing.JButton;
import javax.swing.JRadioButton;



public class CreateUser {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateUser window = new CreateUser();
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
	public CreateUser() {
		initialize();
		createUser();
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
		
		JTextArea txtrName = new JTextArea();
		txtrName.setText("Name");
		txtrName.setBounds(18, 102, 142, 27);
		frame.getContentPane().add(txtrName);
		
		JTextArea txtrUsername = new JTextArea();
		txtrUsername.setText("Username");
		txtrUsername.setBounds(18, 141, 142, 27);
		frame.getContentPane().add(txtrUsername);
		
		JTextArea txtrPassword = new JTextArea();
		txtrPassword.setText("Password");
		txtrPassword.setBounds(18, 180, 142, 27);
		frame.getContentPane().add(txtrPassword);
		
		textField = new JTextField();
		textField.setBounds(236, 103, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(236, 136, 130, 26);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(236, 181, 130, 26);
		frame.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("Create Account ");
		btnNewButton.setBounds(236, 227, 144, 29);
		frame.getContentPane().add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Employee");
		rdbtnNewRadioButton.setBounds(55, 72, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnUser = new JRadioButton("User");
		rdbtnUser.setBounds(225, 72, 141, 23);
		frame.getContentPane().add(rdbtnUser);
	}
	
	public void createUser(){

	}
}
