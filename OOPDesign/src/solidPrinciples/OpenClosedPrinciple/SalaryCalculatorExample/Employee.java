package solidPrinciples.OpenClosedPrinciple.SalaryCalculatorExample;

public class Employee implements IEmployee {
	String name;
	private EmployeeType type;
	private double baseSalaryInMXPesos;

	public Employee(String name, EmployeeType type) {
		super();
		this.name = name;
		this.type = type;
		this.baseSalaryInMXPesos = 0;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public EmployeeType getType() {
		return type;
	}

	public double getBaseSalaryInMXPesos() {
		return baseSalaryInMXPesos;
	}

	public void setBaseSalaryInMXPesos(double baseSalaryInMXPesos) {
		this.baseSalaryInMXPesos = baseSalaryInMXPesos;
	}
}
