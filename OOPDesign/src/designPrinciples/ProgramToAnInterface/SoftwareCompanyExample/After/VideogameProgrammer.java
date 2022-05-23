package designPrinciples.ProgramToAnInterface.SoftwareCompanyExample.After;

public class VideogameProgrammer implements Employee {

	private void programmingEnemies() {
		System.out.println("The programmer is programming the enemies");
	}
	private void creatingBluePrints() {
		System.out.println("The programming is creating blueprints in unrealEngine");
	}
	@Override
	public void doWork() {
		programmingEnemies();
		creatingBluePrints();
	}

}
