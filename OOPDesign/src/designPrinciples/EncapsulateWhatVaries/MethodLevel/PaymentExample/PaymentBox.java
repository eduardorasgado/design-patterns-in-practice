package designPrinciples.EncapsulateWhatVaries.MethodLevel.PaymentExample;

public class PaymentBox {
	
	public double getOrderTotal(Order order) {
		double total = 0;
		
		for(Item item : order.getLineItems()) {
			total += item.getPrice() * item.getQuantity();
		}
		
		
		total += total * getTaxRate(order.getCountry());
		
		return total;
	}
	
	// encapsulate what varies: method level
	public double getTaxRate(String country) {
		if(country == "US") {
			return 0.07; // US sales tax
		} else if(country == "EU") {
			return 0.20; // European VAT
		} else {
			return 0;
		}
	}
}
