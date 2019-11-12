package org.shopping.people;
import org.shopping.warehouse.*;

public abstract class Person {
	protected Inventory inventory;
	protected String name;
	protected String userId;
	
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
	public void setName(String aName) {
		name = aName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setUserID(String aID) {
		userId = aID;
	}
	
	public String getUserID() {
		return userId;
	}
	
	
}
