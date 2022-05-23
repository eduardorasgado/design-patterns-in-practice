package designPrinciples.ProgramToAnInterface.SoftwareCompanyExample.After;

public class Programmer implements Employee {

	private void writeCode() {
		System.out.println("The programmer is coding the MVC pattern");
	}

	@Override
	public void doWork() {
		writeCode();
		
	}
}
