package org.shopping.software;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;

import org.shopping.people.Customer;
import org.shopping.people.Employee;
import org.shopping.warehouse.Department;
import org.shopping.warehouse.Item;

import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InventoryCustomer {

	public JFrame frame;
	private JTextField txtWhatDoYou;
	private JTextField textField;
	public OnlineStore onlinestore;
	public ArrayList<String> displayVals = new ArrayList<String>();
	public JList testList = new JList();
	public Customer customer;
	/**
	 * Launch the application.
	 */



	/**
	 * Create the application.
	 */
	public InventoryCustomer(OnlineStore os, Customer c) {
		onlinestore = os;
		customer = c;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		boolean eBtn, fBtn, pBtn, phBtn;
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtWhatDoYou = new JTextField();
		txtWhatDoYou.setText("What do you want to BUY?");
		txtWhatDoYou.setBounds(111, 6, 175, 26);
		frame.getContentPane().add(txtWhatDoYou);
		txtWhatDoYou.setColumns(10);
		
		//listJ
		testList.setBounds(27, 79, 149, 162);
		frame.getContentPane().add(testList);
		
		JRadioButton rdbtnElectronics = new JRadioButton("Electronics");
		rdbtnElectronics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel listDisplay = new DefaultListModel();
				ArrayList<String> displayVals2 =jListFunction("electronics");
				if(rdbtnElectronics.isSelected()) {
					
					for (String s : displayVals2) {
						listDisplay.addElement(s);	
						
						}
					testList.setModel(listDisplay);
					}
				else if(!rdbtnElectronics.isSelected()) {
					
					displayVals2.clear();
					listDisplay.clear();
					testList.setModel(listDisplay);
				}
					
				
				}
				
				
		});
		
		rdbtnElectronics.setBounds(121, 44, 77, 23);
		frame.getContentPane().add(rdbtnElectronics);
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Food");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel listDisplay = new DefaultListModel();
				ArrayList<String> displayVals2 =jListFunction("food");
				
				
				if(rdbtnNewRadioButton.isSelected()) {
					for (String s : displayVals2) {
						listDisplay.addElement(s);	
						
						}
					testList.setModel(listDisplay);
					}else if(!rdbtnNewRadioButton.isSelected()) {
						
						displayVals2.clear();
						listDisplay.clear();
						testList.setModel(listDisplay);
					}
				}
				
				
				
		});
		
		rdbtnNewRadioButton.setBounds(17, 44, 71, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
	
		JRadioButton rdbtnProduce = new JRadioButton("Produce");
		rdbtnProduce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel listDisplay = new DefaultListModel();
				ArrayList<String> displayVals2 =jListFunction("produce");
			if(rdbtnProduce.isSelected()) {
				for (String s : displayVals2) {
					listDisplay.addElement(s);	
					
					}
				testList.setModel(listDisplay);
				}else if(!rdbtnProduce.isSelected()) {
					displayVals2.clear();
					listDisplay.clear();
					testList.setModel(listDisplay);
				}
			}
				
		});
		
		
		rdbtnProduce.setBounds(210, 44, 62, 23);
		frame.getContentPane().add(rdbtnProduce);
		
		JRadioButton rdbtnPharmacy = new JRadioButton("Pharmacy");
		rdbtnPharmacy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel listDisplay = new DefaultListModel();
				
				ArrayList<String> displayVals2 =jListFunction("pharmacy");
			if(rdbtnPharmacy.isSelected()) {
				for (String s : displayVals2) {
					listDisplay.addElement(s);	
					
					}
				testList.setModel(listDisplay);
				}else{
				displayVals2.clear();
				listDisplay.clear();
				testList.setModel(listDisplay);
				}
			}
		});
		
		
		rdbtnPharmacy.setBounds(296, 44, 62, 23);
		
		
		frame.getContentPane().add(rdbtnPharmacy);

		fBtn = rdbtnNewRadioButton.isSelected();
		pBtn = rdbtnProduce.isSelected();
		phBtn = rdbtnPharmacy.isSelected();
		
		textField = new JTextField();
		textField.setBounds(326, 105, 88, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextArea txtrAddQuantity = new JTextArea();
		txtrAddQuantity.setText("Add Quantity");
		txtrAddQuantity.setBounds(210, 110, 88, 26);
		frame.getContentPane().add(txtrAddQuantity);
		
		JButton btnAddToCart = new JButton("Add to Cart");		
		btnAddToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("addToCart Button Pressed");
				if(textField.getText().equals("")) {
					System.out.println("Please enter a Quantity");
					JOptionPane.showMessageDialog(null, "No Quantity Entered" , "EmptyQuantity", JOptionPane.ERROR_MESSAGE);
				}else if(testList.getSelectedValue()==null) {
					System.out.println("Please Select an item from a department");
					JOptionPane.showMessageDialog(null, "Please select an item from List" , "Empty selection", JOptionPane.ERROR_MESSAGE);
				}else {
					String itemName;
					itemName = (String) testList.getSelectedValue();
					Item selectedItem = new Item();
					Integer itemQuantity = 0;
					itemQuantity = Integer.parseInt(textField.getText());
					
					
					
					for(Department d : onlinestore.departmentList) {	
							for(Item i : d.getItemList()) {
								if(i.getName().equals(itemName)) {
									selectedItem = i;
								}
							}
					}
					
					System.out.println(customer.getName() );
					System.out.println("the selected item is ===="+ itemName + "---" + itemQuantity);
					customer.addToCart(selectedItem, itemQuantity);
					System.out.println("We have " + String.valueOf(selectedItem.getQuantity()) + " of item " +  selectedItem.getName() + " ");
					
					
				}
				
				
			}
		});
		btnAddToCart.setBounds(310, 187, 117, 29);
		frame.getContentPane().add(btnAddToCart);
		
		JButton btnCheckOut = new JButton("Check out");
		btnCheckOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buildCustomerCart(customer);
			}
		});
		btnCheckOut.setBounds(310, 228, 117, 29);
		frame.getContentPane().add(btnCheckOut);
		
		
		
	}
	
	public ArrayList<String> jListFunction(String department){
		
		
		for(Department d : onlinestore.departmentList) {

			if(d.getName().equals(department)) {
				for(Item i : d.getItemList()) {
					displayVals.add(i.getName());
					
				}
			}
		
	}
		return displayVals;
	}
	
	public void buildCustomerCart(Customer c){
		System.out.println("buildCustomerCart function");
		CartGui ns = new CartGui(c);
		
		ns.frame.setVisible(true);
		
	}
	
}	
	
//	public DefaultListModel<String> jListFunctionElectronics(Boolean eBtn){
//		System.out.println("Adding to JListFuction for Electronics");
//		
//		//DefaultListModel<String> listE = new DefaultListModel<>();  
//		
//		if(eBtn) {
//			for(Department d : onlinestore.departmentList) {
//				//System.out.println(d.getName());
//				if(d.getName().equals("electronics")) {
//					for(Item i : d.getItemList()) {
//						listE.addElement(i.getName()); // need to add quantity
//						System.out.println(i.getName());
//					}
//				}
//			}
//		}else {
//			listE.removeAllElements();
//		}
//		
//		
//		return listE;
//	}
//	
//	public DefaultListModel<String> jListFunctionFood(Boolean fBtn){
//		System.out.println("Adding to JListFuction for Food");
//		
//		//DefaultListModel<String> listF = new DefaultListModel<>();  
//		
//		if(fBtn) {
//			for(Department d : onlinestore.departmentList) {
//				//System.out.println(d.getName());
//				if(d.getName().equals("food")) {
//					for(Item i : d.getItemList()) {
//						listF.addElement(i.getName()); // need to add quantity
//						System.out.println(i.getName());
//					}
//				}
//			}
//		}else {
//			listF.removeAllElements();
//		}
//		
//		
//		return listF;
//	}
//	
//	public DefaultListModel<String> jListFunctionProduce(Boolean pBtn){
//		System.out.println("Adding to JListFuction for Produce");
//		
//		if(pBtn) {
//			for(Department d : onlinestore.departmentList) {
//				if(d.getName().equals("produce")) {
//					for(Item i : d.getItemList()) {
//						listP.addElement(i.getName());
//						System.out.println(i.getName());
//					}
//				}
//			}
//		}else {
//			listP.removeAllElements();
//		}
//		
//		return listP;
//	}
//	
//	public DefaultListModel<String> jListFunctionPharmacy(Boolean phBtn){
//		System.out.println("Adding to JListFuction for Pharmacy");
//		
//		if(phBtn) {
//			for(Department d : onlinestore.departmentList) {
//				if(d.getName().equals("pharmacy")) {
//					for(Item i : d.getItemList()) {
//						listPh.addElement(i.getName());
//						System.out.println(i.getName());
//					}
//				}
//			}
//		}else {
//			listPh.removeAllElements();;
//		}
//		
//		
//		return listPh;
//	}
	
