package org.shopping.software;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Cart {

	private JFrame frame;
	private JTextField txtYourCart;
	private JTextField txtYourItems;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cart window = new Cart();
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
	public Cart() {
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
		
		txtYourCart = new JTextField();
		txtYourCart.setText("Your Cart");
		txtYourCart.setBounds(157, 6, 130, 26);
		frame.getContentPane().add(txtYourCart);
		txtYourCart.setColumns(10);
		
		txtYourItems = new JTextField();
		txtYourItems.setText("Your Items");
		txtYourItems.setBounds(19, 48, 130, 26);
		frame.getContentPane().add(txtYourItems);
		txtYourItems.setColumns(10);
		
		JList list = new JList();
		list.setBounds(19, 86, 123, 140);
		frame.getContentPane().add(list);
		
		JButton btnDeleteItem = new JButton("Delete Item");
		btnDeleteItem.setBounds(229, 86, 117, 29);
		frame.getContentPane().add(btnDeleteItem);
		
		JButton btnGoToPayment = new JButton("Go to Payment");
		btnGoToPayment.setBounds(229, 197, 117, 29);
		frame.getContentPane().add(btnGoToPayment);
		
		JTextArea txtrYourBill = new JTextArea();
		txtrYourBill.setText("Total");
		txtrYourBill.setBounds(157, 129, 106, 29);
		frame.getContentPane().add(txtrYourBill);
		
		textField = new JTextField();
		textField.setBounds(277, 132, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
