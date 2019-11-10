package org.shopping.people;
import org.shopping.warehouse.*;

public abstract class Person {
	private Inventory inventory;
	protected String name;
	protected String userId;
	
	
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
}
