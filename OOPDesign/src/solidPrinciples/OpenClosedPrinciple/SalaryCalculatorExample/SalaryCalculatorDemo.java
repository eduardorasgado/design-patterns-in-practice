package solidPrinciples.OpenClosedPrinciple.SalaryCalculatorExample;

import java.util.ArrayList;

public class SalaryCalculatorDemo {
	public static void main(String[] args) {
		ArrayList<String> skills = new ArrayList<>();
		skills.add("Java Development");
		skills.add("C# Development");
		skills.add("JS Development");

		Employee employee = new SoftwareDeveloper("Eduardo", EmployeeType.FULL_TIME, "HP OMEN 1	5", skills);
		employee.setBaseSalaryInMXPesos(30000);
		
		TaxCalculatorFactory taxCalculatorFactory = new TaxCalculatorFactory();
		TaxCalculator taxCalculator = taxCalculatorFactory.getCalculator(employee.getType());
		
		SalaryCalculator sCalculator = new SalaryCalculator(taxCalculator);
		System.out.println(sCalculator.calculateSalary(employee));
		
		employee = new SoftwareDeveloper("Mathias", EmployeeType.FREELANCE, "DELL", skills);
		employee.setBaseSalaryInMXPesos(25000);
		
		taxCalculator = taxCalculatorFactory.getCalculator(employee.getType());
		sCalculator = new SalaryCalculator(taxCalculator);
		System.out.println(sCalculator.calculateSalary(employee));
	}
}
