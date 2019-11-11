package org.shopping.warehouse;

import java.util.ArrayList;




public class Inventory {

	protected ArrayList<Department> departmentList;
	
	public Inventory() {	
		departmentList = new ArrayList<Department>();
	}
	
	
	public void addDepartment(Department aDepartment) {
		departmentList.add(aDepartment);
	}
	public void removeDepartment(Department aDepartment) {
		departmentList.remove(aDepartment);
	}
	
}
