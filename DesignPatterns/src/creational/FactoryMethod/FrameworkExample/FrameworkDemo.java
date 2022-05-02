package creational.FactoryMethod.FrameworkExample;

public class FrameworkDemo {
	public static void main(String[] args) {
		Framework f = new ApplicationOne();
		Product p = f.makeProduct();
		p.use();
	}
}
