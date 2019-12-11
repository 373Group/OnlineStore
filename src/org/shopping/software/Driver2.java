package org.shopping.software;
import org.shopping.checkout.*;
import org.shopping.people.*;
import org.shopping.warehouse.*;


public class Driver2 {
	public static void main(String[] args) {
		
		OnlineStore os = new OnlineStore();
		Test1 gui;
		
		
		Department produce = new Department();
		Department electronics = new Department();
		Department pharmacy = new Department();
		Department food = new Department();
		
		produce.setName("produce");
		electronics.setName("electronics");
		pharmacy.setName("pharmacy");
		food.setName("food");
		
		
		Item i1 = new Item();
		Item i2 = new Item();
		Item i3 = new Item();
		Item i4 = new Item();
		Item i5 = new Item();
		Item i6 = new Item();
		Item i7 = new Item();
		Item i8 = new Item();
		Item i9 = new Item();
		Item i10 = new Item();
		
		i1.setName("PS4");
		i2.setName("ibBrufin");
		i3.setName("apple");
		i4.setName("orange");
		i5.setName("Pizza");
		i6.setName("milk");
		
		i7.setName("ipad");
		i8.setName("tylenol");
		i9.setName("indianFood");
		i10.setName("cheese");
		
		i1.setMinQuantity(1);
		i2.setMinQuantity(1);
		i3.setMinQuantity(1);
		i4.setMinQuantity(1);
		i5.setMinQuantity(1);
		i6.setMinQuantity(1);
		i7.setMinQuantity(1);
		i8.setMinQuantity(1);
		i9.setMinQuantity(1);
		i10.setMinQuantity(1);
		
		i1.setMaxQuantity(25);
		i2.setMaxQuantity(25);
		i3.setMaxQuantity(25);
		i4.setMaxQuantity(25);
		i5.setMaxQuantity(25);
		i6.setMaxQuantity(25);
		i7.setMaxQuantity(25);
		i8.setMaxQuantity(25);
		i9.setMaxQuantity(25);
		i10.setMaxQuantity(25);
		
		i1.setQuantity(20);
		i2.setQuantity(20);
		i3.setQuantity(20);
		i4.setQuantity(20);
		i5.setQuantity(20);
		i6.setQuantity(20);
		i7.setQuantity(20);
		i8.setQuantity(20);
		i9.setQuantity(20);
		i10.setQuantity(20);
		
		i1.setPrice(400);
		i2.setPrice(2);
		i3.setPrice(1);
		i4.setPrice(1);
		i5.setPrice(10);
		i6.setPrice(4);
		i7.setPrice(500);
		i8.setPrice(2);
		i9.setPrice(20);
		i10.setPrice(3);
		
		produce.addItem(i3);
		produce.addItem(i4);
		
		electronics.addItem(i1);
		electronics.addItem(i7);
		
		pharmacy.addItem(i8);
		pharmacy.addItem(i2);
		
		food.addItem(i5);
		food.addItem(i6);
		food.addItem(i9);
		food.addItem(i10);
		
		
		os.addDepartment(produce);
		os.addDepartment(electronics);
		os.addDepartment(pharmacy);
		os.addDepartment(food);
		
		
		
		Employee e1 = new Employee("Rish");
		Customer c1 = new Customer("Ariel");
		
	
	//os.addCustomer(c1, "123");
	
		os.addCustomer(c1, "1234");
		os.addEmployee(e1, "12345");
		
		gui = new Test1(os);
		
		gui.frame.setVisible(true);
		
		
	}
}
