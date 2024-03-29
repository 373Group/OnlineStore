package org.shopping.people;
import org.shopping.warehouse.*;

public class Employee extends Person{
	
	public Employee(String name) {
		this.name = name;
		this.userId = "12345";
		
	}
	
	public void AddToStock(Department aDepartment, Item aItem, int aQuantity ) {
			System.out.println("Add to stock employee");
			if(aItem.getMinQuantity() > aItem.getQuantity()) {
				System.out.println("No need to add to stock because we already have enough");
			}else if((aQuantity + aItem.getQuantity()) > aItem.getMaxQuantity()) {
				System.out.println("Exceeding Max Quantity of " + aItem.getName());					
			}else{
				System.out.println("aQuntity is working");
				aItem.addQuantity(aQuantity);
				System.out.println("aItem is working");
				aDepartment.addItem(aItem);
				System.out.println("This won't show");
			}
	}
	
	public void RemoveFromStock(Department aDepartment, Item aItem) {
		
		aDepartment.removeItem(aItem);
	}
	
	public void ChangePrice(double aPrice, Item aItem) {
		aItem.setPrice(aPrice);
	}
	public void setMax(Item aItem, Integer quantity) {
		aItem.setMaxQuantity(quantity);
	}
	
	public void addDepartment(Department aDepartment) { //adding a department
		this.inventory.addDepartment(aDepartment);
	}
	
	public void removeDepartment(Department aDepartment) {
		this.inventory.removeDepartment(aDepartment);
		
	}
}
