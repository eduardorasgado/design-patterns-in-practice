package designPrinciples.EncapsulateWhatVaries.MethodLevel.PaymentExample;

public class Item {
	private int price;
	private int quantity;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
