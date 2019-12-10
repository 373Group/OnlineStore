package org.shopping.software;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PaymentsMethod {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtCardnumber;
	private JTextField txtExpiry;
	private JTextField txtCvv;
	private JTextField txtPay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaymentsMethod window = new PaymentsMethod();
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
	public PaymentsMethod() {
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
		
		JTextArea txtrPayment = new JTextArea();
		txtrPayment.setText("Payment ");
		txtrPayment.setBounds(155, 6, 179, 39);
		frame.getContentPane().add(txtrPayment);
		
		textField = new JTextField();
		textField.setBounds(229, 57, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(229, 95, 130, 26);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(229, 133, 130, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		txtCardnumber = new JTextField();
		txtCardnumber.setText("cardNumber");
		txtCardnumber.setBounds(23, 57, 130, 26);
		frame.getContentPane().add(txtCardnumber);
		txtCardnumber.setColumns(10);
		
		txtExpiry = new JTextField();
		txtExpiry.setText("expiry");
		txtExpiry.setBounds(23, 95, 130, 26);
		frame.getContentPane().add(txtExpiry);
		txtExpiry.setColumns(10);
		
		txtCvv = new JTextField();
		txtCvv.setText("Cvv");
		txtCvv.setBounds(23, 133, 130, 26);
		frame.getContentPane().add(txtCvv);
		txtCvv.setColumns(10);
		
		txtPay = new JTextField();
		txtPay.setText("PAY!!");
		txtPay.setBounds(229, 210, 130, 26);
		frame.getContentPane().add(txtPay);
		txtPay.setColumns(10);
	}

}
