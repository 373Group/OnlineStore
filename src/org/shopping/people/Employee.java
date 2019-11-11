package org.shopping.people;
import org.shopping.warehouse.*;

public class Employee extends Person{
	
	public Employee() {
		this.name = "unknown";
		this.userId = "12345";
		
	}
	
	public void AddToStock(Department aDepartment, Item aItem, int aQuantity ) {
			if(aItem.getMinQuantity() > aItem.getQuantity()) {
				System.out.println("No need to add to stock because we already have enough");
			}else if((aQuantity + aItem.getQuantity()) > aItem.getMaxQuantity()) {
				System.out.println("Exceeding Max Quantity of " + aItem.getName());					
			}else{
				aItem.addQuantity(aQuantity);
				aDepartment.addItem(aItem);
			}
	}
	
	public void RemoveFromStock(Department aDepartment, Item aItem) {
		
		aDepartment.removeItem(aItem);
	}
	
	public void ChangePrice(double aPrice, Item aItem) {
		aItem.setPrice(aPrice);
	}
	
	public void addDepartment(Department aDepartment) { //adding a department
		this.inventory.addDepartment(aDepartment);
	}
	
	public void removeDepartment(Department aDepartment) {
		this.inventory.removeDepartment(aDepartment);
		
	}
}
