package org.shopping.warehouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

	public class Item {
		private String barcode;
		private String name;
		private Integer dateOfPurchase;
		private Integer quantity;
		private Integer maxQuantity;
		private Integer minQuantity;
		private Double price;
		private HashMap<String, String> freeItemDict; //somehting needs to be fixed here??
	
	
	@SuppressWarnings("serial")
	public Item() {	
		setBarcode("0000");
		setName("ZZZ");
		setDateOfPurchase(1234);
		setQuantity(0);
		setMaxQuantity(0);
		setMinQuantity(0);
		setPrice((double)0);
		setFreeItemDict(new HashMap<String, String>() {{
		    put("itemName","quant");
		}});//need to worry about this later.
		
	}


	public String getBarcode() {
		return barcode;
	}


	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}


	public String getName() {
		return name;
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


	public void setPrice(Double price) {
		this.price = price;
	}


	public HashMap<String, String> getFreeItemDict() {
		return freeItemDict;
	}


	public void setFreeItemDict(HashMap<String, String> freeItemDict) {
		this.freeItemDict = freeItemDict;
	}
	
	public Boolean outofStock() {
		boolean flag = false; 
		
		//needs work here
		return flag;
	}
	
	public Item giveFree() {
		//needs fixing
		return this;
	}
	
	public void setPrice(double aPrice) {
		this.price = aPrice;
	}
	

}
