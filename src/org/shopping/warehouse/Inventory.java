package org.shopping.warehouse;

import java.util.ArrayList;




public abstract class Inventory {

	protected ArrayList<Department> departmentList;
	
	public Inventory() {	
		departmentList = new ArrayList<Department>();
	}
	
}
