package org.shopping.warehouse;
import java.util.ArrayList;



public class Department {
	
	private String name;
	private ArrayList<Item> itemList;
	
	public Department() {	
		setItemList(new ArrayList<Item>());
		setName("XXXXX");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Item> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}
	
	public void removeItem(Item aItem) {
		itemList.remove(aItem);
		//is this it??
	}

}
