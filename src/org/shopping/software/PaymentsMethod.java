package org.shopping.software;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.shopping.people.Customer;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PaymentsMethod {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtCardnumber;
	private JTextField txtExpiry;
	private JTextField txtCvv;
	public Customer customer;

	/**
	 * Launch the application.
	 */
	
	

	/**
	 * Create the application.
	 */
	public PaymentsMethod(Customer c) {
		customer = c;
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
		
		JButton btnPay = new JButton("PAY!!!");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String cardNum ;
				cardNum = textField.getText();
				String expiry ;
				expiry = textField_1.getText();
				String cvv ;
				cvv = textField_2.getText();
				
				BuildByeGui();
				
				System.out.println("Button works");
				if(cardNum.equals("") && cardNum.length()!=16) {
					System.out.println("Please enter a valid card Number");
					JOptionPane.showMessageDialog(null, "Bad card Number " , "Bad card Number", JOptionPane.ERROR_MESSAGE);
				}else if(expiry.equals("")) {
					System.out.println("Bad Expiry");
					JOptionPane.showMessageDialog(null, "Bad Expiry" , "Bad Expiry", JOptionPane.ERROR_MESSAGE);
				}else if(cvv.equals("") && cvv.length()!=3) {
					System.out.println("Bad Cvv");
					JOptionPane.showMessageDialog(null, "Bad Cvv" , "Bad Cvv", JOptionPane.ERROR_MESSAGE);
				}else {
					System.out.println("12345");
					BuildByeGui();
				}
			}
		});
		btnPay.setBounds(229, 216, 117, 29);
		frame.getContentPane().add(btnPay);
	}
	public void BuildByeGui() {
		System.out.println("Bye");
		Bye ns = new Bye();
		ns.frame.setVisible(true);
	}
	
}
