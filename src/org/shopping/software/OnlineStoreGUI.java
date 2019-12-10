package org.shopping.software;
import org.shopping.warehouse.*;
import org.shopping.people.*;
import org.shopping.checkout.*;

import java.awt.*;
import java.awt.event.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import javax.swing.*;

public class OnlineStoreGUI extends JFrame{
	private Inventory inventory;
	private JLabel messageLabel;
	private JButton employeeButton;
	private JButton submitButton;
	private JButton customerButton;
	public JFrame onlineStore;
	
	private JMenuBar menuBar;
	public OnlineStoreGUI(String title, Inventory inventory){
		onlineStore = new JFrame(title);
		//onlineStore.super(title);
		this.inventory= inventory;
		onlineStore.setLayout(null);
		messageLabel = new JLabel("<HTML><center>Welcome to the Online Shopping Cart." + "<BR>Login with your employee credentials, or login as a user.</center></HTML>");
		employeeButton = new JButton("Employee Login");
		customerButton = new JButton("Customer Login");
		employeeButton.setBounds(550, 350, 200, 25);
		employeeButton.addActionListener(new EmployeeLoginListener());
		customerButton.setBounds(800, 350, 200, 25);
		customerButton.addActionListener(new  CustomerLoginListener());
		messageLabel.setBounds(625, 300, 400, 50);
		onlineStore.add(messageLabel);
		onlineStore.add(employeeButton);
		onlineStore.add(customerButton);
		onlineStore.setSize(500, 500);
		
//		buildGUI();	
		onlineStore.setVisible(true);
	}
	
	private class EmployeeLoginListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			onlineStore.getContentPane().removeAll();
			onlineStore.repaint();
			buildEmployeeGUI();
		}
	}
	
	private class CustomerLoginListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			onlineStore.getContentPane().removeAll();
			onlineStore.repaint();
		}
	}
	
	public void buildEmployeeGUI() {
		messageLabel = new JLabel("<HTML><center>Employee ID: </center></HTML>");
		JTextField employeeID = new JTextField();
		submitButton = new JButton("Submit");
		onlineStore.add(messageLabel);
		onlineStore.add(submitButton);
		onlineStore.add(employeeID);
		onlineStore.repaint();
		onlineStore.setVisible(true);
	}
	
	
}
