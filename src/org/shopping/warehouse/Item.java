package org.shopping.warehouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

	@SuppressWarnings("unused")
	public class Item {
		
		private String name;
		private Integer dateOfPurchase;
		private Integer quantity;
		private Integer maxQuantity;
		private Integer minQuantity;
		private Double price;
		private Integer cartQuantity; 
		
	@SuppressWarnings("serial")
	public Item() {	
		
		setName("ZZZ");
		setDateOfPurchase(1234);
		setQuantity(0);
		setMaxQuantity(0);
		setMinQuantity(0);
		setPrice((double)0);
		cartQuantity = 0;
		
	}

	public String getName() {
		return name;
	}
	public void setCartQuantity(Integer aCartQuantity) {
		cartQuantity = aCartQuantity;
	}
	public Integer getCartQuantity() {
		return cartQuantity;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getDateOfPurchase() {
		return dateOfPurchase;
	}


	public void setDateOfPurchase(Integer dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Integer getMaxQuantity() {
		return maxQuantity;
	}


	public void setMaxQuantity(Integer maxQuantity) {
		this.maxQuantity = maxQuantity;
	}


	public Integer getMinQuantity() {
		return minQuantity;
	}


	public void setMinQuantity(Integer minQuantity) {
		this.minQuantity = minQuantity;
	}


	public Double getPrice() {
		return price;
	}


	public void addQuantity(int aQuantity) {
		quantity += aQuantity;
	}
	
	public void dropQuantity(int aQuantity) {
		quantity -= aQuantity;
	}


	
	
	public Boolean outOfStock() {
		boolean flag = false; 
		
		if(this.quantity == 0) {
			return true;
		}
		return flag;
	}
	
	public Item giveFree() { 
		//Do this if we have time
		return this;
	}
	
	public void setPrice(double aPrice) {
		this.price = aPrice;
	}
	

}
