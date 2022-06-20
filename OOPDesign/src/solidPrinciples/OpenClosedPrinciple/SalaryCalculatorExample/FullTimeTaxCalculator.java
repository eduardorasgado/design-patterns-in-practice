package solidPrinciples.OpenClosedPrinciple.SalaryCalculatorExample;

public class FullTimeTaxCalculator implements TaxCalculator {

	@Override
	public double calculateTax(Employee employee) {
		System.out.println("Calculating taxes for fulltime employee");
		return 0.16;
	}

}
