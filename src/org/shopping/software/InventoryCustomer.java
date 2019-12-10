package org.shopping.software;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class InventoryCustomer {

	private JFrame frame;
	private JTextField txtWhatDoYou;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InventoryCustomer window = new InventoryCustomer();
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
	public InventoryCustomer() {
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
		
		txtWhatDoYou = new JTextField();
		txtWhatDoYou.setText("What do you want to BUY?");
		txtWhatDoYou.setBounds(111, 6, 175, 26);
		frame.getContentPane().add(txtWhatDoYou);
		txtWhatDoYou.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Food");
		rdbtnNewRadioButton.setBounds(17, 44, 71, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnElectronics = new JRadioButton("Electronics");
		rdbtnElectronics.setBounds(121, 44, 77, 23);
		frame.getContentPane().add(rdbtnElectronics);
		
		JRadioButton rdbtnProduce = new JRadioButton("Produce");
		rdbtnProduce.setBounds(210, 44, 62, 23);
		frame.getContentPane().add(rdbtnProduce);
		
		JRadioButton rdbtnPharmacy = new JRadioButton("Pharmacy");
		rdbtnPharmacy.setBounds(296, 44, 62, 23);
		frame.getContentPane().add(rdbtnPharmacy);
		
		JList list = new JList();
		list.setBounds(27, 79, 149, 162);
		frame.getContentPane().add(list);
		
		textField = new JTextField();
		textField.setBounds(326, 105, 88, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextArea txtrAddQuantity = new JTextArea();
		txtrAddQuantity.setText("Add Quantity");
		txtrAddQuantity.setBounds(210, 110, 88, 26);
		frame.getContentPane().add(txtrAddQuantity);
		
		JButton btnAddToCart = new JButton("Add to Cart");
		btnAddToCart.setBounds(310, 187, 117, 29);
		frame.getContentPane().add(btnAddToCart);
		
		JButton btnCheckOut = new JButton("Check out");
		btnCheckOut.setBounds(310, 228, 117, 29);
		frame.getContentPane().add(btnCheckOut);
	}
}
