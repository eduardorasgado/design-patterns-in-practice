/**
 * 
 */
package solidPrinciples.OpenClosedPrinciple.SalaryCalculatorExample;

/**
 * @author cheetos
 *
 */
public class FreelanceTaxCalculator implements TaxCalculator {

	@Override
	public double calculateTax(Employee employee) {
		System.out.println("Calculating taxes for freelance employee");
		return 0.216;
	}
}
