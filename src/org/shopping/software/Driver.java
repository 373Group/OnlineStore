package org.shopping.software;

import org.shopping.people.Customer;
import org.shopping.people.Employee;
import org.shopping.warehouse.Department;
import org.shopping.warehouse.Inventory;
import org.shopping.warehouse.Item;

public class Driver {
	
	public static void main(String[] args) {
		
		Inventory warehouse = new Inventory();
		Department d1 = new Department();
		Department d2 = new Department();
		
		d1.setName("Electronics");
		d2.setName("Produce");
		
		warehouse.addDepartment(d1);
		warehouse.addDepartment(d2);
		
		Item i1 = new Item();
		Item i2 = new Item();
		Item i3 = new Item();
		Item i4 = new Item();
		
		
		i1.setName("PS4");
		i1.setPrice(400);
		i1.setQuantity(20);
		i1.setMaxQuantity(25);
		i1.setMinQuantity(5);
		i1.setDateOfPurchase(1);
		
		i2.setName("pixel");
		i2.setPrice(400);
		i2.setQuantity(40);
		i2.setMaxQuantity(50);
		i2.setMinQuantity(5);
		i2.setDateOfPurchase(2);
		
		i3.setName("apple");
		i3.setPrice(1);
		i3.setQuantity(100);
		i3.setMaxQuantity(150);
		i3.setMinQuantity(5);
		i3.setDateOfPurchase(3);
		
		i4.setName("peach");
		i4.setPrice(2);
		i4.setQuantity(101);
		i4.setMaxQuantity(160);
		i4.setMinQuantity(5);
		i4.setDateOfPurchase(4);
		
		//add items to department
		Employee e1 = new Employee();
		e1.setName("James Bond");
		e1.setUserID("12345");
		
		
		e1.AddToStock(d1, i1, 24);
		e1.AddToStock(d1, i2, 49);
		e1.AddToStock(d2, i3, 99);
		e1.AddToStock(d2, i4, 100);
		
		d1.printItemList();
		d2.printItemList();
		
		
		//customer stuff
		Customer c1 = new Customer();
		c1.setName("Rishab");
		c1.setUserID("54321");
		c1.addToCart(i1, 2);
		c1.addToCart(i3, 10);
		
		c1.getCart().getTotal();
		c1.removeFromCart(i1, 1);
		c1.getCart().getTotal();
		
		e1.ChangePrice(500, i1);
		c1.getCart().getTotal();
		
		
		//c1.addToCart(i1, 5000);
		//e1.AddToStock(d1, i1, 10000);
		
		c1.getCart().printBill();
		
	}
}
	

