package solidPrinciples.OpenClosedPrinciple.SalaryCalculatorExample;

public class SalaryCalculator {
	private TaxCalculator taxCalculator;
	
	public SalaryCalculator(TaxCalculator taxCalculator) {
		this.taxCalculator = taxCalculator;
	}

	public double calculateSalary(Employee employee) {
		return employee.getBaseSalaryInMXPesos() - (taxCalculator.calculateTax(employee) * employee.getBaseSalaryInMXPesos());
	}
	
}
