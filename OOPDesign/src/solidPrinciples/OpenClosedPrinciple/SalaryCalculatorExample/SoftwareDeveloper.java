package solidPrinciples.OpenClosedPrinciple.SalaryCalculatorExample;

import java.util.List;

public class SoftwareDeveloper extends Employee  {
	private String computer;
	private List<String> technicalSkills;
	
	
	public SoftwareDeveloper(String name, EmployeeType type, String computer, List<String> technicalSkills) {
		super(name, type);
		this.computer = computer;
		this.technicalSkills = technicalSkills;
	}

	public String getComputer() {
		return computer;
	}

	public List<String> getTechnicalSkills() {
		return technicalSkills;
	}
}
