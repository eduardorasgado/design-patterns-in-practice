package designPrinciples.EncapsulateWhatVaries.ClassLevel.PaymentExample;

public class PaymentProcess {
	private TaxCalculator taxCalculator;

	public PaymentProcess(TaxCalculator taxCalculator) {
		super();
		this.taxCalculator = taxCalculator;
	}

	public double getOrderTotal(Order order) {
		double total = 0;

		for (Item item : order.getLineItems()) {
			double subTotal = item.getPrice() * item.getQuantity();
			// encapsulate what varies: class level
			total += subTotal * taxCalculator.getTaxRate(order.getCountry(), order.getState(), item.getProduct(), "US");
		}

		return total;
	}
}
