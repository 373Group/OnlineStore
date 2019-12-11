package org.shopping.software;

import java.awt.EventQueue;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JTextField;

import org.shopping.people.Customer;
import org.shopping.warehouse.Department;
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
	public JList list = new JList();
	private DefaultListModel listDisplay = new DefaultListModel();
	

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
		
		list.setBounds(19, 86, 123, 140);
		frame.getContentPane().add(list);
		
		
		
		//*********
		
		

		 Set<Item> hSet = new HashSet<Item>(); 
		 for (Item x : customer.getCart().itemList) 
			 hSet.add(x); 
		
		 for (Item x : hSet) 
			 listDisplay.addElement(x.getName() + " -- "+ String.valueOf(x.getCartQuantity()));
		 
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
		btnDeleteItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(list.getSelectedValue() != null) {
				String ItemName = (String) list.getSelectedValue(); //ItemName is has input format of "<NameOfItem> --- <Quantity>"
				String[] ItemNameSplit = ItemName.split(" ");
				ItemName = ItemNameSplit[0];
				int quantity = Integer.parseInt(ItemNameSplit[2]);
				System.out.println(quantity);
				Item aItem = new Item();
				for(Item item: customer.getCart().getItemList()) {
					if(item.getName().equals(ItemName)) {
						aItem = item;
						break;
					}
				}
				System.out.println("grabbing item from cart is working");
				customer.removeFromCart(aItem, quantity);
				listDisplay.clear();
				listDisplay = new DefaultListModel();
				listDisplay.addElement("");
				list.removeAll();
				
				for (Item x : customer.getCart().itemList) 
					 System.out.println(x.getName() + "Is still in the cart");//hSet.add(x); 
				
				 for (Item x : hSet) 
					 listDisplay.addElement(x.getName() + " -- "+ String.valueOf(x.getCartQuantity()));
					 
				System.out.println(listDisplay.contains(ItemName));
				list.setModel(listDisplay);
			}	
			//displayVals2.clear();
			
			}
		});
		
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
