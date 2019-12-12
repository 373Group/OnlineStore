package org.shopping.software;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Bye {

	public JFrame frame;
	private JTextField txtHappyShoppingAnd;
	
	public Bye() {
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
		
		txtHappyShoppingAnd = new JTextField();
		txtHappyShoppingAnd.setText("Happy Shopping and give us an A please ");
		txtHappyShoppingAnd.setBounds(6, 51, 438, 183);
		frame.getContentPane().add(txtHappyShoppingAnd);
		txtHappyShoppingAnd.setColumns(10);
	}
}
