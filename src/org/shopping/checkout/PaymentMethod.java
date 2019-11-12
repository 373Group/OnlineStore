package org.shopping.checkout;
import java.util.ArrayList;
import org.shopping.warehouse.*;

public class PaymentMethod {
	private ArrayList<String> PaymentType;
	public boolean CheckIfCorrect() {
		return false;
		
	}
	public Boolean IncorrectPayment(String CCNumber) {
		//for(String itr : CCNumber) {
		//	
		//}
		if(CCNumber.length() == 16) {
			return true;
		}
		else
		return true;
	}
	
	public void CheckOut() {
		
	}
}	