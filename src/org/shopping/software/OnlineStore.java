package org.shopping.software;

import java.util.ArrayList;
import java.util.HashMap;

import org.shopping.people.Customer;
import org.shopping.people.Employee;
import org.shopping.warehouse.Department;

public class OnlineStore {

	public HashMap <Employee, String> employeeList;
	public HashMap <Customer, String> customerList;
	public ArrayList<Department> departmentList;
	
	
	public OnlineStore() {
		employeeList = new HashMap <Employee, String>();
		customerList  = new HashMap <Customer, String>();
		departmentList = new ArrayList<Department>();
	}
	
	public HashMap <Employee, String> getEList() {
		
		return employeeList;
	}
	
	public HashMap <Customer, String> getCList() {
		
		return customerList;
	}
	
	public void addEmployee(Employee e, String password) {
		
		employeeList.put(e, password);
	}
	
	public void addCustomer(Customer c, String password) {
		
		customerList.put(c, password);
	}
	
	public void addDepartment(Department d) {
		departmentList.add(d);
	}
	
	
}
