package designPrinciples.ProgramToAnInterface.SoftwareCompanyExample.After;

import java.util.List;

public class AgencyCompany extends Company {
		
	public AgencyCompany(String name, List<Employee> employees) {
		super(name, employees);
	}
	
	@Override
	public void addEmployees() {
		getEmployees().add(new Designer());
		getEmployees().add(new Programmer());
		getEmployees().add(new Tester());
	}
}
