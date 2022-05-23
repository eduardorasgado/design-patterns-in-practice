package designPrinciples.ProgramToAnInterface.SoftwareCompanyExample.After;

import java.util.List;

public class VideogamesCompany extends Company {
		
	public VideogamesCompany(String name, List<Employee> employees) {
		super(name, employees);
	}

	@Override
	protected void addEmployees() {
		getEmployees().add(new CampaignDesigner());
		getEmployees().add(new CharacterArtist());
		getEmployees().add(new VideogameProgrammer());
	}
}
