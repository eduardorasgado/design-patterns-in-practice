package designPrinciples.ProgramToAnInterface.SoftwareCompanyExample.After;

import java.util.ArrayList;
import java.util.List;

public abstract class Company {
	private String name;
	private List<Employee> employees;
	
	public Company(String name, List<Employee> employees) {
		this.employees = employees;
		this.name = name;
	}
	public void createSoftware() {
		addEmployees();
		employees.forEach(employee -> employee.doWork());
	}
	
	protected abstract void addEmployees();

	public List<Employee> getEmployees() {
		return employees;
	}
	public String getName() {
		return name;
	}
}
