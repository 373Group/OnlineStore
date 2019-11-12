package org.shopping.checkout;

import java.util.Scanner;

//import java.util.ArrayList;
//import org.shopping.warehouse.*;

public class PaymentMethod {
	
	public Boolean IncorrectPayment() {
		//for(String itr : CCNumber) {
		//	
		//}
		Scanner console = new Scanner(System.in);
		boolean flag = false;
		while(flag == false) {
			System.out.println("Please enter your 16-digit card number: ");
			String ccnum = console.next();
			
			if(ccnum.length() == 16) {
				flag = true;
			}
			else {
				System.out.println("Your credit card is invalid. Please enter the number again.s");
				flag = false;
			}
			
		}
			
		return flag;
	}
	
	public void CheckOut() {
		if (IncorrectPayment()) {
			System.out.println("Thank you for shopping with us!");
		}
		
	}
}	