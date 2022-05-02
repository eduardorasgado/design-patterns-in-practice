package creational.FactoryMethod.FrameworkExample;

public class ApplicationTwo implements Framework {

	@Override
	public Product makeProduct() {
		return new ProductTwo();
	}

}
