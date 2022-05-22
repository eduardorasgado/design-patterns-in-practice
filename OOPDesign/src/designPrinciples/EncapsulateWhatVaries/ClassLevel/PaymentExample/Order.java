package designPrinciples.EncapsulateWhatVaries.ClassLevel.PaymentExample;

import java.util.List;

public class Order {
	
	private String country;
	private String state;
	private List<Item> lineItems;

	public List<Item> getLineItems() {
		return lineItems;
	}

	public String getCountry() {
		return country;
	}
	
	public String getState() {
		return state;
	}
	
}
