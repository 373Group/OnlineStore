package org.shopping.people;

import org.shopping.checkout.Cart;
import org.shopping.warehouse.*;

public class Customer extends Person {

	private Cart cart;

	public Customer() {
		this.name = "unknown";
		this.userId = "12345";
		cart = new Cart();
	}

	private Boolean checkIfAvailable(Item aItem, int aQuantity) {
		// TODO Auto-generated method stub

		if (aItem.outOfStock()) {
			System.out.println("Item is out of stock homie");
			return false;
		} else if (aItem.getQuantity() >= aQuantity) {

			return true;
		}

		return false;
	}

	public void addToCart(Item aItem, int aQuantity) {
		Boolean flag = false;
		flag = checkIfAvailable(aItem, aQuantity);

		if (flag == true) {
			for (int i = 0; i < aQuantity; i++) {
				this.cart.addItem(aItem);

			}
			aItem.setCartQuantity(aQuantity);
			aItem.dropQuantity(aQuantity);
		} else {
			System.out.println("We do not have " + aQuantity + " " + aItem.getName() + "'s");
		}

	}

	public void removeFromCart(Item aItem, int aQuantity) { // error here check ??
		int quant = 0;

		for (Item i : cart.itemList) {
			if (i.getName() == aItem.getName()) {
				quant += 1;
			}
		}

		if (quant < aQuantity) {
			System.out.println("Item does not exist or trying to remove more than what you have ");
		} else {

			for (int i = 0; i < aQuantity; i++) {
				if (cart.itemList.get(i).getName() == aItem.getName()) {
					cart.removeItem(aItem);
					aItem.addQuantity(1);
				}

			}
			aItem.setCartQuantity((aItem.getCartQuantity() - aQuantity));
		}

	}
// Implemented in GUI
//	public Boolean isFinished() {
//		System.out.println();
//	}

	public Cart getCart() {
		return cart;
	}

}
