package org.shopping.checkout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.shopping.warehouse.*;

public class Cart {
	public ArrayList<Item> itemList;
	
	
	public Cart(){
		setItemList(new ArrayList<Item>());
		
	}
	
	public double getTotal() {
		
		double total = (double)0;
		
		for (Item i : itemList) {
			total += i.getPrice();
		}
		System.out.println(total + " Is customers bill");
		return total;
	}
	
	public boolean tooFewItems() {
		
		if(itemList.isEmpty())	{
			System.out.println("Add Something to your cart homie");
			return true;
		}
		
		return false;
	}
	
	public void printBill() { //  will print a cheque to console 
		Set<Item> hash_set = new HashSet<Item>(); 
		for (Item i : itemList) {
			hash_set.add(i);
		}
		for(Item i : hash_set){
			System.out.println(i.getCartQuantity() + " of " + i.getName() + " = " + (i.getCartQuantity()*i.getPrice()));
			}
	}

	public ArrayList<Item> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}
	
	public void addItem(Item aItem) {
		itemList.add(aItem);
	}
	
	public void removeItem(Item aItem) {
		itemList.remove(aItem);
	}

}
