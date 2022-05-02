package creational.FactoryMethod.FrameworkExample;

public class ApplicationOne implements Framework {

	@Override
	public Product makeProduct() {
		return new ProductOne();
	}
	
}
