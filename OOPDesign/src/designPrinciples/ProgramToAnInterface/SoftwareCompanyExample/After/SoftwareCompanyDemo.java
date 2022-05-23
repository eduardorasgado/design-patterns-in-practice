package designPrinciples.ProgramToAnInterface.SoftwareCompanyExample.After;

import java.util.ArrayList;

public class SoftwareCompanyDemo {
	public static void main(String[] args) {
		
		ArrayList<Company> companies = new ArrayList<>();
		
		companies.add(new AgencyCompany("Axolotl Software", new ArrayList<Employee>()));
		companies.add(new VideogamesCompany("BlackFist", new ArrayList<Employee>()));
		
		companies.forEach(comp -> {
			System.out.println("------------COMPANY: " + comp.getName() + "-----------");
			comp.createSoftware();
		});
	}
}
