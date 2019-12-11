package org.shopping.software;

import java.awt.EventQueue;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JTextField;

import org.shopping.people.Customer;
import org.shopping.warehouse.Item;

import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CartGui {

	public JFrame frame;
	private JTextField txtYourCart;
	private JTextField txtYourItems;
	public Customer customer;
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public CartGui(Customer c) {
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
		
		
		
		//*********
		DefaultListModel listDisplay = new DefaultListModel();
		
		

		 Set<Item> hSet = new HashSet<Item>(); 
		 for (Item x : customer.getCart().itemList) 
			 hSet.add(x); 
		
		 for (Item x : hSet) 
			 listDisplay.addElement(x.getName() + "-- "+ String.valueOf(x.getCartQuantity()));
		 
//		for(Item i : customer.getCart().itemList) {
//			//System.out.println(i.getName());
//			if() {
//				listDisplay.addElement(i.getName() + "-- "+ String.valueOf(i.getCartQuantity()));
//				System.out.println(i.getCartQuantity());
//			}
//			
//		}
		list.setModel(listDisplay);
		
		//*********
		
		JButton btnDeleteItem = new JButton("Delete Item");
		btnDeleteItem.setBounds(229, 86, 117, 29);
		frame.getContentPane().add(btnDeleteItem);
		
		JButton btnGoToPayment = new JButton("Go to Payment");
		btnGoToPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BuildPaymentGui(customer);
				
			}
			
			
		});
		btnGoToPayment.setBounds(229, 197, 117, 29);
		frame.getContentPane().add(btnGoToPayment);
		
		JTextArea txtrYourBill = new JTextArea();
		txtrYourBill.setText("Total");
		txtrYourBill.setBounds(157, 129, 106, 29);
		frame.getContentPane().add(txtrYourBill);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(275, 127, 123, 35);
		frame.getContentPane().add(textArea);
		
		
		textArea.setText(String.valueOf("$ " + customer.getCart().getTotal()));
		
		
	}
	
	public void BuildPaymentGui(Customer customer) {
		System.out.println("buildPaymentGui function");
		PaymentsMethod ns = new PaymentsMethod(customer);
		ns.frame.setVisible(true);
	}
	
	
}
