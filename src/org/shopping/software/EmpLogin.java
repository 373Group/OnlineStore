package org.shopping.software;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

import org.shopping.people.Employee;

import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmpLogin {

	public JFrame frame;
	public OnlineStore onlinestore;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmpLogin window = new EmpLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public EmpLogin(OnlineStore os) {
		onlinestore = os;
		initialize();
	}

	public void display() {
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
		
		JTextArea txtrPleaseLogin = new JTextArea();
		txtrPleaseLogin.setFont(new Font("Times New Roman", Font.BOLD, 19));
		txtrPleaseLogin.setText("Employee Login");
		txtrPleaseLogin.setBounds(50, 69, 177, 63);
		frame.getContentPane().add(txtrPleaseLogin);
		
		textField = new JTextField();
		textField.setBounds(207, 162, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(207, 200, 130, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JTextArea txtrUsername = new JTextArea();
		txtrUsername.setText("UserName");
		txtrUsername.setBounds(50, 162, 109, 26);
		frame.getContentPane().add(txtrUsername);
		
		JTextArea txtrPassword = new JTextArea();
		txtrPassword.setText("Password");
		txtrPassword.setBounds(50, 205, 109, 26);
		frame.getContentPane().add(txtrPassword);
		
		
		
		
		
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame.dispose();
				String password = textField_1.getText();
				String name = textField.getText();
				checkLoginStatus(name, password);
				//buildEmployeeInventory();
				
			}
		});
		btnNewButton.setBounds(207, 238, 117, 29);
		frame.getContentPane().add(btnNewButton);
	}
	public void buildEmployeeInventory(Employee emp) {
		
		System.out.println("buildEmployeeInventory function");
		InventoryEmployee ns = new InventoryEmployee(onlinestore, emp);
		//secondFrame.frame.setVisible(true);
		ns.frame.setVisible(true);
	}
	
	
	public void checkLoginStatus(String name, String password) {
		Employee eTest1 = null;
		
		if(password.equals("")) {
			System.out.println("Please enter Password");
			JOptionPane.showMessageDialog(null, "No password entered " , "Empty Password", JOptionPane.ERROR_MESSAGE);
		}
		
		if(name.equals("")) {
			System.out.println("Please enter UserName");
			JOptionPane.showMessageDialog(null, "No UserName entered " , "Empty UserName", JOptionPane.ERROR_MESSAGE);
		}
		
		
		for (Employee e : onlinestore.employeeList.keySet()) { 
			//System.out.println(e.getName());
			System.out.println(password);
			if(e.getName().equals(name)) {
				
				eTest1 = e;
				break;
			}
		}
		if(eTest1 !=null) {
			if(onlinestore.employeeList.get(eTest1).equals(password)){
				System.out.println("sucess");
				buildEmployeeInventory(eTest1);
			}
			else {
				System.out.println("Incorrect password");
				JOptionPane.showMessageDialog(null, "Employee Password incorrect. Please try again." , "Password not correct", JOptionPane.ERROR_MESSAGE);
			}
		}
		else{
			System.out.println("UserName not found");
			//System.out.println(name);
			JOptionPane.showMessageDialog(null, "Employee UserName not found. Please create new ID." , "UserName not found", JOptionPane.ERROR_MESSAGE);
		}
		
		
		
		
	}
}
