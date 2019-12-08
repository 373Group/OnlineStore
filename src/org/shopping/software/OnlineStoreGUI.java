package org.shopping.software;
import org.shopping.warehouse.*;
import org.shopping.people.*;
import org.shopping.checkout.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class OnlineStoreGUI extends JFrame{
	private Inventory inventory;
	public OnlineStoreGUI(String title, Inventory inventory){
		super(title);
		this.inventory= inventory;
		add(new JLabel("<HTML><center>Welcome to the Online Shopping Cart." +
				"<BR>Login with your employee credentials, or login as a user.</center></HTML>"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 100);
		buildGUI();	
		setVisible(true);
	}
	public void buildGUI() {
		
	}

}
