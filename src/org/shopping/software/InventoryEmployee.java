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
import java.awt.SystemColor;
import javax.swing.JTextPane;

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
		frame.getContentPane().setBackground(SystemColor.window);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtWhatDoYou = new JTextField();
		txtWhatDoYou.setBackground(SystemColor.window);
		txtWhatDoYou.setEditable(false);
		txtWhatDoYou.setText("What would you like to add to inventory?");
		txtWhatDoYou.setColumns(10);
		txtWhatDoYou.setBounds(76, 18, 270, 26);
		frame.getContentPane().add(txtWhatDoYou);
		
		testList.setBounds(27, 79, 149, 162);
//		/testList.setVisibleRowCount(10);
		//s.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		frame.getContentPane().add(testList);
		
		
		JRadioButton rdbtnFood = new JRadioButton("Food");
		rdbtnFood.setBounds(27, 43, 71, 23);
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
		rdbtnElectronics.setBounds(114, 43, 114, 23);
		frame.getContentPane().add(rdbtnElectronics);
		
		
		JRadioButton rdbtnProduce = new JRadioButton("Produce");
		rdbtnProduce.setBounds(215, 43, 107, 23);
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
		rdbtnPharmacy.setBounds(311, 43, 93, 23);
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
		
		//JList list = new JList();
		//list.setBounds(31, 86, 149, 162);
		//frame.getContentPane().add(list);

		/*ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rdbtnPharmacy);
		bgroup.add(rdbtnProduce);
		bgroup.add(rdbtnFood);
		bgroup.add(rdbtnElectronics);*/
		
		JTextField textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(217, 110, 94, 26);
		frame.getContentPane().add(textField_1);
		
		JTextField textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(217, 168, 94, 26);
		frame.getContentPane().add(textField_2);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(6, 243, 117, 29);
		frame.getContentPane().add(btnLogout);
		
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
					JOptionPane.showMessageDialog(null, "The item "+ itemName + " has successfully been updated" , "Empty selection", JOptionPane.INFORMATION_MESSAGE);
					}	
					
				}
				
				//buildTest1();
			}
		});
		
		btnLogout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				buildTest1();
			}
		});
		btnNewButton.setBounds(327, 243, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JTextPane txtpnMaxQuantity = new JTextPane();
		txtpnMaxQuantity.setBackground(SystemColor.window);
		txtpnMaxQuantity.setText("Set max quantity:");
		txtpnMaxQuantity.setBounds(215, 92, 114, 16);
		frame.getContentPane().add(txtpnMaxQuantity);
		
		JTextPane txtpnAddQuantity = new JTextPane();
		txtpnAddQuantity.setBackground(SystemColor.window);
		txtpnAddQuantity.setText("Add quantity:");
		txtpnAddQuantity.setBounds(215, 151, 96, 16);
		frame.getContentPane().add(txtpnAddQuantity);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBackground(SystemColor.textHighlight);
		scrollBar.setBounds(161, 79, 15, 162);
		frame.getContentPane().add(scrollBar);
		
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
	
	public void buildTest1() {
			
			Test1 ns = new Test1(onlinestore);
			//secondFrame.frame.setVisible(true);
			ns.frame.setVisible(true);
			
	
	}
}
