package org.shopping.software;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;

import org.shopping.people.Customer;
import org.shopping.people.Employee;
import org.shopping.warehouse.Department;
import org.shopping.warehouse.Item;

import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

public class InventoryEmployee {

	public JFrame frame;
	private JTextField txtWhatDoYou;
	private JTextField textField_1;
	private JTextField textField_2;
	public ArrayList<String> displayVals = new ArrayList<String>();
	public JList testList = new JList();
//	aprivate JScrollPane sp = new JScrollPane();
	public OnlineStore onlinestore;
	public Employee employee;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
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
	}*/

	/**
	 * Create the application.
	 */
	
	public InventoryEmployee(OnlineStore os, Employee emp) {
		onlinestore = os;
		employee = emp;
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
		
		testList.setBounds(27, 79, 149, 162);
//		/testList.setVisibleRowCount(10);
		//s.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		frame.getContentPane().add(testList);
		
		
		JRadioButton rdbtnFood = new JRadioButton("Food");
		rdbtnFood.setBounds(31, 57, 71, 23);
		frame.getContentPane().add(rdbtnFood);
		rdbtnFood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Food pressed");
				DefaultListModel listDisplay = new DefaultListModel();
				ArrayList<String> displayVals2 = jListFunction("food");
				if(rdbtnFood.isSelected()) {
					
					for (String s : displayVals2) {
						System.out.println(s);
						listDisplay.addElement(s);	
						
						}
//					sp = new JScrollPan);
					//sb = new JScrollBar(listDisplay)
					testList.setModel(listDisplay);
//					sp.setViewportView(testList);
					}
				else if(!rdbtnFood.isSelected()) {
					
					displayVals2.clear();
					listDisplay.clear();
					testList.setModel(listDisplay);
				}
					
				
				}
				
				
		});
		
		JRadioButton rdbtnElectronics = new JRadioButton("Electronics");
		rdbtnElectronics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Electronics pressed");
				DefaultListModel listDisplay = new DefaultListModel();
				ArrayList<String> displayVals2 = jListFunction("electronics");
				if(rdbtnElectronics.isSelected()) {
					
					for (String s : displayVals2) {
						System.out.println(s);
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
		rdbtnElectronics.setBounds(146, 56, 71, 23);
		frame.getContentPane().add(rdbtnElectronics);
		
		
		JRadioButton rdbtnProduce = new JRadioButton("Produce");
		rdbtnProduce.setBounds(240, 57, 71, 23);
		frame.getContentPane().add(rdbtnProduce);
		rdbtnProduce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Produce pressed");
				DefaultListModel listDisplay = new DefaultListModel();
				ArrayList<String> displayVals2 = jListFunction("produce");
				if(rdbtnProduce.isSelected()) {
					
					for (String s : displayVals2) {
						System.out.println(s);
						listDisplay.addElement(s);	
						
						}
					testList.setModel(listDisplay);
					}
				else if(!rdbtnProduce.isSelected()) {
					
					displayVals2.clear();
					listDisplay.clear();
					testList.setModel(listDisplay);
				}
					
				
				}
				
				
		});
		
		JRadioButton rdbtnPharmacy = new JRadioButton("Pharmacy");
		rdbtnPharmacy.setBounds(334, 57, 71, 23);
		frame.getContentPane().add(rdbtnPharmacy);
		rdbtnPharmacy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("pharmacy pressed");
				DefaultListModel listDisplay = new DefaultListModel();
				ArrayList<String> displayVals2 = jListFunction("pharmacy");
				if(rdbtnPharmacy.isSelected()) {
					
					for (String s : displayVals2) {
						System.out.println(s);
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
		
		JList list = new JList();
		list.setBounds(31, 86, 149, 162);
		frame.getContentPane().add(list);

		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rdbtnPharmacy);
		bgroup.add(rdbtnProduce);
		bgroup.add(rdbtnFood);
		bgroup.add(rdbtnElectronics);
		
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
		
		JTextField textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(311, 141, 94, 26);
		frame.getContentPane().add(textField_1);
		
		JTextField textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(311, 179, 94, 26);
		frame.getContentPane().add(textField_2);
		
		JTextArea txtrDisplayCurrentStock = new JTextArea();
		txtrDisplayCurrentStock.setText("Display current stock");
		txtrDisplayCurrentStock.setBounds(310, 103, 95, 26);
		frame.getContentPane().add(txtrDisplayCurrentStock);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Submit Button Pressed");
				if(textField_2.getText().equals("") && textField_1.getText().equals("")) {
					System.out.println("Please enter a quantity");
					JOptionPane.showMessageDialog(null, "No Quantity Entered" , "EmptyQuantity", JOptionPane.ERROR_MESSAGE);
				}
				else if(testList.getSelectedValue()==null) {
					System.out.println("Please Select an item from a department");
					JOptionPane.showMessageDialog(null, "Please select an item from List" , "Empty selection", JOptionPane.ERROR_MESSAGE);
				}
				else {
					
					
					if(!(textField_2.getText().equals("")) &&!(textField_1.getText().equals(""))){
						Integer itemQuantity; 
						itemQuantity = Integer.parseInt(textField_2.getText());
						Integer maxQuantity;
						maxQuantity = Integer.parseInt(textField_1.getText());
						String itemName;
						itemName = (String) testList.getSelectedValue();
						
						
						
						for(Department d : onlinestore.departmentList) {	
							
							for(Item i : d.getItemList()) {
								if(i.getName().equals(itemName)) {
									employee.setMax(i, maxQuantity);
									employee.AddToStock(d, i, itemQuantity);
									System.out.println(i.getQuantity());
									break;
								}
							}
						}
						
					}					
					
				}
				
				
			}
		});
		btnNewButton.setBounds(299, 229, 117, 29);
		frame.getContentPane().add(btnNewButton);
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

}
