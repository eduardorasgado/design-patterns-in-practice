package designPrinciples.ProgramToAnInterface.SoftwareCompanyExample.After;

public class Designer implements Employee {

	private void designArchitecture() {
		System.out.println("Designer is designing the architecture");
	}

	@Override
	public void doWork() {
		designArchitecture();
	}
}
