package org.shopping.software;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class OnlineStoreGUI extends JFrame{
	public OnlinStoreGUI(String title, University university){
		super(title);
		this.university = university;
		
		add(new JLabel("<HTML><center>Welcome to the University." +
				"<BR>Choose an action from the above menus.</center></HTML>"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 100);
		buildGUI();	
		setVisible(true);
	}
}
