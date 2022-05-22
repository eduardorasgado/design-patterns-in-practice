package designPrinciples.EncapsulateWhatVaries.MethodLevel.PaymentExample;

import java.util.List;

public class Order {
	
	private String country;	
	private List<Item> lineItems;

	public List<Item> getLineItems() {
		return lineItems;
	}

	public String getCountry() {
		return country;
	}
}
