package org.shopping.software;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class InventoryEmployee {

	public JFrame frame;
	private JTextField txtWhatDoYou;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InventoryEmployee window = new InventoryEmployee();
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
	public InventoryEmployee() {
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
		txtWhatDoYou.setText("What do you want to add?");
		txtWhatDoYou.setColumns(10);
		txtWhatDoYou.setBounds(136, 18, 175, 26);
		frame.getContentPane().add(txtWhatDoYou);
		
		JRadioButton radioButton = new JRadioButton("Food");
		radioButton.setBounds(31, 57, 71, 23);
		frame.getContentPane().add(radioButton);
		
		JRadioButton rdbtnElectronics = new JRadioButton("Electronics");
		rdbtnElectronics.setBounds(146, 56, 71, 23);
		frame.getContentPane().add(rdbtnElectronics);
		
		JRadioButton rdbtnProduce = new JRadioButton("Produce");
		rdbtnProduce.setBounds(240, 57, 71, 23);
		frame.getContentPane().add(rdbtnProduce);
		
		JRadioButton rdbtnPharmacy = new JRadioButton("Pharmacy");
		rdbtnPharmacy.setBounds(334, 57, 71, 23);
		frame.getContentPane().add(rdbtnPharmacy);
		
		JList list = new JList();
		list.setBounds(31, 86, 149, 162);
		frame.getContentPane().add(list);
		
		JTextArea txtrSetmax = new JTextArea();
		txtrSetmax.setText("Current amount");
		txtrSetmax.setBounds(192, 103, 107, 26);
		frame.getContentPane().add(txtrSetmax);
		
		JTextArea txtrMaxQuantity = new JTextArea();
		txtrMaxQuantity.setText("Max Quantity");
		txtrMaxQuantity.setBounds(192, 141, 107, 26);
		frame.getContentPane().add(txtrMaxQuantity);
		
		JTextArea txtrAddQuantity = new JTextArea();
		txtrAddQuantity.setText("Add Quantity");
		txtrAddQuantity.setBounds(192, 179, 107, 26);
		frame.getContentPane().add(txtrAddQuantity);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(311, 141, 94, 26);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(311, 179, 94, 26);
		frame.getContentPane().add(textField_2);
		
		JTextArea txtrDisplayCurrentStock = new JTextArea();
		txtrDisplayCurrentStock.setText("Display current stock");
		txtrDisplayCurrentStock.setBounds(310, 103, 95, 26);
		frame.getContentPane().add(txtrDisplayCurrentStock);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(299, 229, 117, 29);
		frame.getContentPane().add(btnNewButton);
	}

}
