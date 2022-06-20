package solidPrinciples.OpenClosedPrinciple.SalaryCalculatorExample;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class TaxCalculatorFactory {
	private Map<EmployeeType, Supplier<TaxCalculator>> calculatorMap;
	
	public TaxCalculatorFactory() {
		calculatorMap = new HashMap<>();
		calculatorMap.put(EmployeeType.FULL_TIME, () -> new FullTimeTaxCalculator());
		calculatorMap.put(EmployeeType.FREELANCE, () -> new FreelanceTaxCalculator());
	}

	public TaxCalculator getCalculator(EmployeeType employeeType) {
		return calculatorMap.get(employeeType).get();
	}
}
