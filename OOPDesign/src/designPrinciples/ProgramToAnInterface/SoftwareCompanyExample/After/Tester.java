package designPrinciples.ProgramToAnInterface.SoftwareCompanyExample.After;

public class Tester implements Employee {

	public void testSoftware() {
		System.out.println("Tester is testing the software");
	}

	@Override
	public void doWork() {
		testSoftware();
	}
}
