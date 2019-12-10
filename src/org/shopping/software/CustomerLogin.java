package org.shopping.software;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CustomerLogin {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerLogin window = new CustomerLogin();
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
	public CustomerLogin() {
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
		
		JTextArea txtrCustomerLogin = new JTextArea();
		txtrCustomerLogin.setText("Customer Login");
		txtrCustomerLogin.setBounds(108, 6, 218, 58);
		frame.getContentPane().add(txtrCustomerLogin);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("UserName");
		textArea.setBounds(29, 129, 109, 26);
		frame.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText("Password");
		textArea_1.setBounds(29, 184, 109, 26);
		frame.getContentPane().add(textArea_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(215, 124, 130, 26);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(215, 179, 130, 26);
		frame.getContentPane().add(textField_1);
		
		JButton button = new JButton("Submit");
		button.setBounds(228, 224, 117, 29);
		frame.getContentPane().add(button);
	}

}
